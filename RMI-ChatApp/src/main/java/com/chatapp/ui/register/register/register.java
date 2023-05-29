package com.chatapp.ui.register.register;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import com.chatapp.database.Database;
import com.chatapp.ui.register.login;
import com.chatapp.ui.register.welcome;
import entity.UserEntity;

public class register extends JFrame {
    public JPanel reg;
    private JTextField textField1;
    private JTextField textField2;
    private JButton registerButton;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel backbtn;

    public Database db = new Database();

    public register() {
//        Dimension preferredSize = new Dimension(1080, 1920);
//        setPreferredSize(preferredSize);
        setMinimumSize(new Dimension(400, 600));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(reg);
        this.pack();

        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                        String uname = textField1.getText().trim();
                        String password = textField2.getText().trim();
                        String nickname = textField3.getText().trim();
                        String email = textField4.getText().trim();

                        // Create a UserEntity instance and set the values
                        UserEntity user = new UserEntity();
                        user.setUsername(uname);
                        user.setPassword(password);
                        user.setNickname(nickname);
                        user.setEmail(email);
                        user.setIsDeleted(0);
                        user.setRoleId(2);
                        File file = new File("E:\\user.png");
                byte[] imageData;
                try {
                    imageData = Files.readAllBytes(file.toPath());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                System.out.println("------------------"+uname+"-----------------------------");
                if(uname.isEmpty()){

                }
                else {
                    user.setAvatar(imageData);
                    db.insert(user);
        //            JOptionPane.showMessageDialog(null,"User registered successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("User registered successfully!");

                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");

                    login newFrame = new login();
                    newFrame.setVisible(true);
                    newFrame.setSize(400, 600);
                    // dispose the current frame
//                    JButton button = (JButton) e.getSource();
//                    JFrame regis = (JFrame) SwingUtilities.getWindowAncestor(button);
//                    regis.dispose();


                }

            }

        });


        backbtn.addComponentListener(new ComponentAdapter() {
        });
        backbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);

                welcome frame5 = new welcome();
                frame5.setVisible(true);
                frame5.setSize(400, 600);

                // dispose the current frame
                JButton button = (JButton) e.getSource();
                JFrame regis = (JFrame) SwingUtilities.getWindowAncestor(button);
                regis.dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        register reg = new register();
//        frame.setContentPane(new register().reg);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 600); // Set the desired size here (width, height)
////        frame.pack();
//        frame.setVisible(true);
    }
}
