package com.Main.Interface;

import com.Main.database.Database;
import com.Main.ChatServer.User;
import entity.GroupsEntity;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserPanel extends JFrame {
    private JButton subscribeButton;
    private JButton unsubscribeButton;
    private JTable groupsTable;
    private JPanel grouppanel;
    private JButton profileButton;
    private JPanel subgrouppanel;

    public Database db = new Database();

    private DefaultTableModel defaultTableModel;


    public UserPanel(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400, 600);
        this.setContentPane(grouppanel);
        this.pack();

        defaultTableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Description"}, 0);
        groupsTable.setModel(defaultTableModel);

        List<GroupsEntity> chatrooms = db.getRooms();

        defaultTableModel.setRowCount(0); // Clear existing data

        for (GroupsEntity chatroom : chatrooms) {
            if(chatroom.getStatus()==1){
                Object[] rowData = {chatroom.getId(), chatroom.getName(), chatroom.getDescription()};
                defaultTableModel.addRow(rowData);
            }

        }
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                UserPanel.super.dispose();
//                JFrame frame6 = new UserProfile();
//                frame6.setVisible(true);
//                frame6.setSize(400, 500);
            }
        });
        subscribeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get selected table value
                int selectedRow = groupsTable.getSelectedRow();

                if (selectedRow != -1) {
                    // Get the data from the selected row
                    Object id = defaultTableModel.getValueAt(selectedRow, 0);
                    Object name = defaultTableModel.getValueAt(selectedRow, 1);
                    Object description = defaultTableModel.getValueAt(selectedRow, 2);

                    // Assign the values to variables
                    int selectedId = Integer.parseInt(id.toString());
                    String selectedName = name.toString(); // Assuming Name is of type String
                    String selectedDescription = description.toString(); // Assuming Description is of type String

                    // Use the variables as needed
                    System.out.println("Selected ID: " + selectedId);
                    System.out.println("Selected Name: " + selectedName);
                    System.out.println("Selected Description: " + selectedDescription);


                    User.setGroupId(selectedId);
                    User.setGroupName(selectedName);

                    String umane = User.getUsername();
                    String nicname = User.getNickname();
                    System.out.println("Current user: - "+ umane);


                    SwingUtilities.invokeLater(ChatWall::new);



                } else {
                    System.out.println("No row selected.");
                }


            }
        });
    }


}
