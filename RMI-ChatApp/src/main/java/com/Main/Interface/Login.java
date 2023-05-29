package com.Main.Interface;

import com.Main.ChatServer.User;
import com.Main.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends JFrame{
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;
    private JPanel loginPanel;

    public Database database=new Database();

    public Login(){
        setContentPane(loginPanel);
        setTitle("Login");
        setSize(450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname=username.getText().trim();
                String pwd=password.getText().trim();

                UserEntity userEntity=new UserEntity();

                if (userEntity!=null){
                    String role=String.valueOf(userEntity.getRoleId());
                    if (Objects.equals(userEntity.getPassword(),pwd));
                    User.setUser(userEntity);
                    if (Objects.equals(role,1)){

                    }

                }

            }
        });
    }


}
