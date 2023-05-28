package com.Main.Interface;

import entity.UserEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{

    private JTextField uname;
    private JPanel mainPanel;
    private JTextField nickname;
    private JTextField email;
    private JButton registerButton;
    private JPasswordField pwd;


    public Register() {
        setContentPane(mainPanel);
        setTitle("Register");
        setSize(450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= uname.getText().trim();
                String password=pwd.getText().trim();
                String usernickname=nickname.getText().trim();
                String useremail=email.getText().trim();

                UserEntity userEntity=new UserEntity();
                userEntity.setUsername(username);

            }
        });
    }

    public static void main(String[] args) {
        Register register=new Register();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - register.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - register.getHeight()) / 2);
        register.setLocation(x, y);
    }


}
