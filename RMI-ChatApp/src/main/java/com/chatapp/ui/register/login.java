package com.chatapp.ui.register;

import com.chatapp.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JTextField username,te;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel login;
    private JPasswordField passwordField1;

    public Database db = new Database();

    public login() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(login);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = login.this.username.getText().trim();
                String password = new String(passwordField1.getPassword()).trim();


                // Query the database for user with the provided username and password
                UserEntity user = db.getUserByUsernameAndPassword(username, password);


                if (user != null) {
                    // User exists and login is successful
                    System.out.println("Login successful!");
                    JFrame chatusers=new ChatUsers();
                    chatusers.setVisible(true);
                } else {
                    // User does not exist or invalid credentials
                    System.out.println("Invalid username or password!");
                }
            }
        });
    }
}
