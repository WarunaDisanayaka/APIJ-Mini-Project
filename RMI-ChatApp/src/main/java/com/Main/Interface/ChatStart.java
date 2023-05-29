package com.Main.Interface;

import com.Main.database.Database;
import entity.GroupsEntity;
import com.Main.ChatServer.server.server;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class ChatStart extends JFrame {
    private JTable rooms;
    private JButton startButton;
    private JButton stopButton;
    private JPanel chatstart;

    private DefaultTableModel defaultTableModel;

    public Database database=new Database();



public ChatStart() {

    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setContentPane(chatstart);
    this.setSize(400, 600);
    this.pack();


    defaultTableModel=new DefaultTableModel(new Object[]{"id","Name","Description","Status"},0);
    rooms.setModel(defaultTableModel);

    List<GroupsEntity> chatrooms = database.getRooms();

    defaultTableModel.setRowCount(0);

    for (GroupsEntity chatroom:chatrooms){
        String status;
        if (chatroom.getStatus()==1){
            status="Running";
        }else {
            status = "Stopped";
        }
        Object[] rowData={chatroom.getId(),chatroom.getName(),chatroom.getDescription(),status};
        defaultTableModel.addRow(rowData);
    }


    startButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = rooms.getSelectedRow();

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


                GroupsEntity groupsEntity = new GroupsEntity();
                groupsEntity.setId(selectedId);
                groupsEntity.setStatus(1);



                server sc = new server();
                sc.runServer(selectedName,selectedId);

                int online = database.setOnline(groupsEntity);

                System.out.println(online);

//                    new Server().runServer(selectedName);

            } else {
               JOptionPane.showMessageDialog(null,"Please select row!");
            }
        }
    });
}
}
