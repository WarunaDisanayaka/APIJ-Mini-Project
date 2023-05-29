package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame{

    public JPanel Chat;
    private JPanel panel1;
    private JButton sendButton;
    private JTextField txttype;
    private JTextField txtuser;
    private JButton logoutButton;
    private JTextArea textArea1;

    private Database db = new Database();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat");
        frame.setContentPane(new Chat().Chat);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Chat() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(Chat);
        this.pack();
    sendButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String send = txtuser.getText().trim();
            String name = txttype.getText().trim();




        }
    });
    logoutButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                String username = txtuser.getText().trim();

                db.logout(username);
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }
    });
}
}
