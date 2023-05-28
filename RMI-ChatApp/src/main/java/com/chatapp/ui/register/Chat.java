package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat {
    private JPanel panel1;
    private JButton sendButton;
    private JTextField txttype;
    private JTextField txtuser;
    private JButton logoutButton;

    private Database db = new Database();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat");
        frame.setContentPane(new Chat().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Chat() {
    sendButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


        }
    });
    logoutButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
