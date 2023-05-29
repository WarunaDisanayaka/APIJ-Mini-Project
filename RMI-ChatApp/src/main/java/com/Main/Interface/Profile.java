package com.Main.Interface;

import com.Main.ChatServer.User;
import com.Main.database.Database;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame{
    private JTextField textID;
    private JTextField textName;
    private JTextField textEmail;
    private JPanel uprofile;
    private JButton button1;

    public Profile(){
        setContentPane(uprofile);
        setTitle("Profile");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        textID.setText(String.valueOf(User.getId()));
        textName.setText(User.getUsername());
        textEmail.setText(User.getEmail());
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new UserPanel();
                frame.setVisible(true);
                frame.setSize(400, 600);
                Profile.super.dispose();
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
