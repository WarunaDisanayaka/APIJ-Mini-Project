package ChatClient;

import ChatClient.chat.ChatInterface;
import ChatServer.chat.Message;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Home extends javax.swing.JFrame implements KeyListener {

    String username;
//    ChatInterface chat;
    List<String> users = new ArrayList<>();

    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;

    ChatInterface chat= new ChatInterface() {
        @Override
        public boolean login(String username) throws RemoteException {
            return false;
        }

        @Override
        public void logout(String username) throws RemoteException {

        }

        @Override
        public void sendMessage(Message message) throws RemoteException {

        }

        @Override
        public List<Message> getAllMessages() throws RemoteException {
            return null;
        }

        @Override
        public List<String> getAllUsers() throws RemoteException {
            return null;
        }
    };


    public Home(ChatInterface chat){
        this.chat=chat;
        textField1.addKeyListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public Home(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userLogin();
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void userLogin() {
        username = textField1.getText();
        try {
            users = chat.getAllUsers();
        } catch (RemoteException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (users != null && users.contains(username)) {
            JOptionPane.showMessageDialog(null, "This user already exists");
            System.exit(0);
        } else {
            try {
                new ChatView(chat, username);   // pass the reference "chat" and the logged user's name
            } catch (RemoteException ex) {      // and create a new ChatView
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Home");
        Home home=new Home();
        frame.setContentPane(home.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500); // Set the desired size here (width, height)
        frame.setVisible(true);
    }
}
