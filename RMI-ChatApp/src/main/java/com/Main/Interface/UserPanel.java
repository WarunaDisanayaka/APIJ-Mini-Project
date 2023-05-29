package com.Main.Interface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UserPanel extends JFrame {
    private JButton subscribeButton;
    private JButton unsubscribeButton;
    private JTable groups;
    private JPanel grouppanel;

    private DefaultTableModel defaultTableModel;


    public UserPanel(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(grouppanel);
        this.pack();


    }


}
