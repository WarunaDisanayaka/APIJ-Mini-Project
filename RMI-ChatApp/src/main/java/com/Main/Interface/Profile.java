package com.Main.Interface;

import com.Main.ChatServer.User;
import com.Main.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame{
    private JTextField textID;
    private JTextField textName;
    private JTextField textEmail;
    private JPanel uprofile;
    private JButton button1;
    private JButton updateProfileButton;
    private JTextField password;
    private JTextField textNick;

    public Database database=new Database();

    public Profile(){
        setContentPane(uprofile);
        setTitle("Profile");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        textID.setText(String.valueOf(User.getId()));
        textID.setEditable(false);
        textName.setText(User.getUsername());
        textEmail.setText(User.getEmail());
        password.setText(User.getPassword());
        textNick.setText(User.getNickname());
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new UserPanel();
                frame.setVisible(true);
                frame.setSize(400, 600);
                Profile.super.dispose();
            }
        });
        updateProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textName.getText().trim();
                String pwd = password.getText().trim();
                String useremail = textEmail.getText().trim();
                String nickname = textNick.getText().trim();

                UserEntity userEntity = new UserEntity();
                userEntity.setNickname(nickname);
                userEntity.setUsername(username);
                userEntity.setPassword(pwd);
                userEntity.setEmail(useremail);
                userEntity.setIsDeleted(0);
                userEntity.setRoleId(2);
                


            }
        });
    }

    public static void run() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("User Profile");
            frame.setContentPane(new Profile().uprofile);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
