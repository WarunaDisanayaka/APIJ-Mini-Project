package com.Main.Interface;

import com.Main.database.Database;
import com.Main.ChatServer.User;
import entity.GroupsEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class ChatGroup extends JFrame{
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton createGroupButton;
    private JButton showAvailableGroupsButton;
    private JPanel grouppanel;


    public Database db = new Database();

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChatGroup");
        frame.setContentPane(new ChatGroup().grouppanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


public ChatGroup() {
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setContentPane(grouppanel);
    this.pack();

    System.out.println(User.getNickname());
    createGroupButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String roomname = textField1.getText().trim();
            String discription = textArea1.getText();
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();
            String currentTimeString = currentTime.toString();


            GroupsEntity grope = new GroupsEntity();
            grope.setName(roomname);
            grope.setDescription(discription);
            grope.setIcon(null);
            grope.setStatus(0);
            grope.setIsDeleted(0);
            grope.setCreatedDate(Date.valueOf(currentDate));
            grope.setCreatedTime(String.valueOf(currentDate));


            db.insertroom(grope); // Close the session

            System.out.println("Room added successfully");

            textArea1.setText("");
            textField1.setText("");
        }
    });
    showAvailableGroupsButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ChatGroup.super.dispose();
            JFrame frame8 = new Chatstart();
            frame8.setVisible(true);
            frame8.setSize(400, 500);
        }
    });
}
}
