package ChatClient;

import ChatClient.chat.ChatInterface;
import ChatServer.chat.Message;

import javax.swing.*;
import java.awt.event.*;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static jdk.javadoc.internal.tool.Main.execute;

public class ChatView extends javax.swing.JFrame implements MouseListener, KeyListener {

    String username;
    ChatInterface chat;
    List<Message> msgs=new ArrayList<>();
    List<String> users=new ArrayList<>();


    public ChatView(ChatInterface chat,String username)throws RemoteException {
        this.chat = chat;
        this.username = username;
        chat.login(username);
        execute();
    }


    public ChatView(){
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    sendNewMessage();
            }
        });
    }




    private JTextField textField1;
    private JButton sendButton;
    private JButton logoutButton;
    private JTextArea textArea1;
    private JScrollPane userListTextArea;
    private JLabel nameLabel;
    private JTextArea textArea2;


    private void execute() {
        textArea2.setLineWrap(true);
        setTitle("Public Chat");
        this.nameLabel.setText(username);
        this.setVisible(true);
        setLocationRelativeTo(null);            // to visible the GUI in the middle of the screen
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    refresh();                  // this thread is used to refresh the chat window by every second
                    try {                       // to display whole chat list
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        t1.start();
    }

    public void displayChatList() throws RemoteException {
        textArea1.setText("");
        msgs = chat.getAllMessages();
        String doc = "<html><body><table>";
        for (Message m : msgs) {
            if (!((m.getUsername().equals(username)) && (m.getType().equals("join")))) {
                String smileyName = m.getSmiley();
                Date date = m.getDate();
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String a = dateFormat.format(date);
                SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
                try {
                    Date time = parseFormat.parse(a);
                    if (smileyName == null) {
                        doc += "<tr><td>"
                                + printFormat.format(time)
                                + "</td><td><font color='rgb(55,178,204)'><b>"
                                + m.getUsername()
                                + "</b></font></td><td> "
                                + m.getMsg()
                                + "</td></tr>";
                    } else {
                        doc += "<tr><td>"
                                + printFormat.format(time)
                                + "</td><td><font color='rgb(55,178,204)'><b>"
                                + m.getUsername()
                                + "</b></font></td><td><img src= '"
                                + this.getClass().getResource("/images/"+smileyName)
                                + "' width=50 height=50 /> </td></tr>";
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        doc += "</table></body></html>";
        textArea1.setText(doc);
    }


    private void displayUserList() throws RemoteException {
        textArea1.setText("");
        users = chat.getAllUsers();
        for (String u : users) {
            if (!u.equals(username)) {
                textArea1.append(" " + u + "\n");
            }
        }
    }

    public void refresh() {
        try {
//            displayChatList();
            displayUserList();
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void sendNewMessage() {
        String inputMessage = textField1.getText();
        textField1.setText("");
        Message message = new Message();
        message.setUsername(username);
        message.setMsg(inputMessage);
        message.setType("client");
        message.setDate(new Date());
        try {
            chat.sendMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }



}
