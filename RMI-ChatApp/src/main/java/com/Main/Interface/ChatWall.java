package com.Main.Interface;

import com.Main.ChatServer.*;
import com.Main.ChatServer.server.client;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

public class ChatWall extends JFrame {
    private JPanel userchatwall;

    client client = new client();
    Chat chatClient = null;

    private String lastms = "";

    JFrame frame = new JFrame("userchatwall");
    JList<Message> list = new JList<>();
    DefaultListModel<Message> model = new DefaultListModel<>();

    JLabel label = new JLabel();
    JPanel panel = new JPanel();

    JTextField textField = new JTextField(20);
    JButton button = new JButton("Send");

    public ChatWall() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(userchatwall);
        this.pack();
        setSize(650, 500);
        client.runClient(User.getGroupName(), User.getGroupId());

        try {
            chatClient = client.chatInterface;
            Message stms = new Message();
            stms.setMessage("chat Starting...");
            chatClient.sendMessage(stms);

            list.setModel(model);
            list.setCellRenderer(new MessageListRenderer());

            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.NORTH);
            panel.add(textField, BorderLayout.CENTER);
            textField.setBackground(Color.lightGray);
            label.setForeground(Color.RED);
            label.setBackground(Color.YELLOW);
            panel.add(button, BorderLayout.EAST);
            panel.setBackground(Color.YELLOW);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String messagebox = textField.getText();
                    Message message = new Message();
                    message.setMessage(textField.getText());
                    message.setUserId(10);
                    message.setNickname(User.getNickname());
                    message.setAvatar(User.getAvatar());
                    try {
                        chatClient.sendMessage(message);
                    } catch (RemoteException ex) {
                        ex.printStackTrace();
                    }
                    textField.setText("");
                }
            });

            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.add(new JScrollPane(list), BorderLayout.CENTER);
            frame.add(panel, BorderLayout.SOUTH);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setSize(400,600);
            frame.setVisible(true);

            Thread updateMessagesThread = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Message message = chatClient.broadcast();
                            if (lastms.equals(message.getMessage())) {
                                continue;
                            } else {
                                lastms = message.getMessage();
                                SwingUtilities.invokeLater(() -> model.addElement(message));
                            }
                            Thread.sleep(100);
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            updateMessagesThread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatWall::new);
    }

    private class MessageListRenderer extends JPanel implements ListCellRenderer<Message> {
        private JLabel nicknameLabel;
        private JLabel messageLabel;
        private JLabel avatarLabel;

        public MessageListRenderer() {
            setOpaque(true);
            setBorder(new EmptyBorder(5, 5, 5, 5));
            setLayout(new BorderLayout());

            avatarLabel = new JLabel();
            nicknameLabel = new JLabel();
            messageLabel = new JLabel();

            JPanel textPanel = new JPanel(new BorderLayout());
            textPanel.add(nicknameLabel, BorderLayout.NORTH);
            textPanel.add(messageLabel, BorderLayout.CENTER);

            JPanel leftPanel = new JPanel(new BorderLayout());
            leftPanel.add(avatarLabel, BorderLayout.WEST);
            leftPanel.add(textPanel, BorderLayout.CENTER);

            add(leftPanel, BorderLayout.WEST);
        }

        public Component getListCellRendererComponent(JList<? extends Message> list, Message message, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            nicknameLabel.setText(message.getNickname());
            messageLabel.setText(message.getMessage());

            if (message.getAvatar() != null) {
                ImageIcon avatarIcon = new ImageIcon(message.getAvatar());
                Image scaledAvatar = avatarIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                avatarIcon = new ImageIcon(scaledAvatar);
                avatarLabel.setIcon(avatarIcon);
            } else {
                // Set a default avatar image if no avatar is available
                ImageIcon defaultAvatarIcon = new ImageIcon("com/chatapp/image/user.png");
                avatarLabel.setIcon(defaultAvatarIcon);
            }

            if (message.getUserId() == 10) { // Assuming 10 is the ID of the current user
                setAlignmentX(RIGHT_ALIGNMENT);
                setBackground(new Color(200, 220, 255)); // Set background color for sent messages
            } else {
                setAlignmentX(LEFT_ALIGNMENT);
                setBackground(list.getBackground());
            }

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }
}
