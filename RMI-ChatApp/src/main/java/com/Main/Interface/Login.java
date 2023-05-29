package com.Main.Interface;

import com.Main.ChatServer.User;
import com.Main.database.Database;
import entity.UserEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends JFrame{
    private JTextField uname;
    private JPasswordField pwd;
    private JButton loginButton;
    private JPanel loginPanel;

    public Database database=new Database();

    public Login(){
        setContentPane(loginPanel);
        setTitle("Login");
        setSize(400,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=uname.getText().trim();
                String password=pwd.getText().trim();

                UserEntity userEntity=database.login(username);

                if (userEntity !=null){
                    String role=String.valueOf(userEntity.getRoleId());
                    if (Objects.equals(userEntity.getPassword(),password)){
                        User.setUser(userEntity);
                        if (Objects.equals(role,"1")){
                                JFrame chatGroup=new ChatGroup();
                                chatGroup.setVisible(true);
                                chatGroup.setSize(400,600);
                        }else if(Objects.equals(role,"2")){
                            JFrame userPanel=new UserPanel();
                            userPanel.setVisible(true);
                            userPanel.setSize(400,600);

                            JButton button = (JButton) e.getSource();
                            JFrame welcome = (JFrame) SwingUtilities.getWindowAncestor(button);
                            welcome.dispose();

                        }
                    }
                    JOptionPane.showMessageDialog(null,"Login successful!");
                }else {
                    JOptionPane.showMessageDialog(null,"Nor users available!");
                }

            }
        });
    }

    public static void main(String[] args) {
        Login login=new Login();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - login.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - login.getHeight()) / 2);
        login.setLocation(x, y);
    }

    
}
