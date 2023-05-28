package com.chatapp.ui.register;

import ChatServer.ChatInterface;
import ChatServer.Message;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.time.zone.ZoneRulesProvider.refresh;
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


    private JTextField textField1;
    private JButton sendButton;
    private JButton logoutButton;
    private JTextArea textArea1;
    private JScrollPane userListTextArea;
    private JLabel nameLabel;


    private void execute() {
        textArea1.setLineWrap(true);
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


    private void displayUserList() throws RemoteException {
        textArea1.setText("");
        users = chat.getAllUsers();
        for (String u : users) {
            if (!u.equals(username)) {
                textArea1.append(" " + u + "\n");
            }
        }
    }

//    public void refresh() {
//        try {
//            displayChatList();
//            displayUserList();
//        } catch (RemoteException ex) {
//            Logger.getLogger(ChatView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

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
