package com.Main.Interface;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel loginPanel;


    public Login(){
        setContentPane(loginPanel);
        setTitle("Login");
        setSize(450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login login=new Login();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - login.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - login.getHeight()) / 2);
        login.setLocation(x, y);
    }

    
}
