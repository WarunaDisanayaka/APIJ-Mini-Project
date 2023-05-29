package com.Main.Interface;

import com.Main.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Register extends JFrame{

    private JTextField uname;
    private JPanel mainPanel;
    private JTextField nickname;
    private JTextField email;
    private JButton registerButton;
    private JPasswordField pwd;

    public Database database=new Database();

    public Register() {
        setContentPane(mainPanel);
        setTitle("Register");
        setSize(400,600);
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
                userEntity.setPassword(password);
                userEntity.setNickname(usernickname);
                userEntity.setEmail(useremail);
                userEntity.setIsDeleted(0);
                userEntity.setRoleId(2);

                File file=new File("E:\\user.png");
                byte[] imageData;

                try {
                    imageData=Files.readAllBytes(file.toPath());


                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
                userEntity.setAvatar(imageData);
                database.insert(userEntity);
                JOptionPane.showMessageDialog(null,"User Registration success!");
                uname.setText("");
                pwd.setText("");
                nickname.setText("");
                email.setText("");
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
