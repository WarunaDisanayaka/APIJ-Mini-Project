package interfaces;

import dbmanager.DBManager;
import java.awt.Color;
import pojos.Groups;
import pojos.User;
import services.Chat;
import services.ChatService;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;

public class main extends javax.swing.JFrame {

    Registry reg;
    Chat chat;

    static int x, yy;
   
    int id;
    chatUser u;

    public main() {
        initComponents();

     

        //start
       

       
    }
    
    public void startServer(int g_id) {
        try {
            Chat chat = new ChatService(g_id);
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);

            System.out.println("Chat server is running.!");

        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        }
    }
    
    
    
    public void chataction(int chatId, JLabel gAction) {

        File btnIcon = new File("");
        String abspath = btnIcon.getAbsolutePath();

        if (DBManager.getDBM().isOnline(chatId)) {
            DBManager.getDBM().putOffline(chatId);
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\start.png");
            gAction.setIcon(icon);
        } else if (DBManager.getDBM().putOnline(chatId)) {
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\end.png");
            gAction.setIcon(icon);
            
            startServer(chatId); //start chat server and nofify observers

        }
    }
    
    
    
    
    
    int y = 13;
//    Chat group loading 
    public void loadGroup(boolean isSignin) {
        y = 13;
        List groups = DBManager.getDBM().getChats();

//        groupPanel.removeAll();

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (isSignin) {
                DBManager.getDBM().putOffline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 62));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel chataction = new javax.swing.JLabel();

            if (DBManager.getDBM().isOnline(next.getId())) {
                chataction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/end.png")));
            } else {
                chataction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/start.png")));
            }

            chataction.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    chataction(next.getId(), chataction);
                 

                }
            });

            JLabel groupDesc = new javax.swing.JLabel();
            groupDesc.setForeground(new java.awt.Color(255, 255, 255));
            groupDesc.setText("<html>" + next.getDescription() + "</html>");

            JLabel groupName = new javax.swing.JLabel();
            groupName.setFont(new java.awt.Font("Tahoma", 1, 13));
            groupName.setForeground(new java.awt.Color(255, 255, 255));
            groupName.setText(next.getName());
            group.add(chataction, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 29));
            group.add(groupDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(groupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
//            groupPanel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 325, 90));

            y += 110;
        }

    }
    
    
    
    
    
    
    public ArrayList<String> validatelogin(String username, String password) {
        ArrayList<String> errors = new ArrayList<String>();

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        return errors;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Log = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Register = new javax.swing.JPanel();
        signup_profile_pic = new javax.swing.JLabel();
        signup_email = new javax.swing.JTextField();
        signup_username = new javax.swing.JTextField();
        signup_username_line = new javax.swing.JLabel();
        signup_password = new javax.swing.JPasswordField();
        signup_eye_open_icon = new javax.swing.JLabel();
        signup_eye_close_icon = new javax.swing.JLabel();
        signup_password_line = new javax.swing.JLabel();
        signup_nickname_line = new javax.swing.JLabel();
        signup_btn = new javax.swing.JLabel();
        signup_nickname = new javax.swing.JTextField();
        ChatArea = new javax.swing.JPanel();
        ChatList = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 640));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("USERNAME");

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log);
        Log.setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Log);
        Log.setBounds(0, 0, 440, 480);

        Register.setBackground(new java.awt.Color(242, 244, 246));
        Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signup_profile_pic.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signup_profile_pic.setForeground(new java.awt.Color(111, 117, 124));
        signup_profile_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_profile_pic.setText("Profile Picture");
        signup_profile_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        signup_profile_pic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_profile_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_profile_picMouseClicked(evt);
            }
        });
        Register.add(signup_profile_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 120));

        signup_email.setBackground(new java.awt.Color(156, 172, 174));
        signup_email.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_email.setForeground(new java.awt.Color(111, 117, 124));
        signup_email.setText("Email");
        signup_email.setAutoscrolls(false);
        signup_email.setBorder(null);
        signup_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_emailFocusLost(evt);
            }
        });
        signup_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_emailMouseClicked(evt);
            }
        });
        Register.add(signup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 20));

        signup_username.setBackground(new java.awt.Color(156, 172, 174));
        signup_username.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_username.setForeground(new java.awt.Color(111, 117, 124));
        signup_username.setText("Username");
        signup_username.setAutoscrolls(false);
        signup_username.setBorder(null);
        signup_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_usernameFocusLost(evt);
            }
        });
        signup_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_usernameMouseClicked(evt);
            }
        });
        signup_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_usernameActionPerformed(evt);
            }
        });
        Register.add(signup_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 20));

        signup_username_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Register.add(signup_username_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 10));

        signup_password.setBackground(new java.awt.Color(156, 172, 174));
        signup_password.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_password.setForeground(new java.awt.Color(111, 117, 124));
        signup_password.setText("Password");
        signup_password.setBorder(null);
        signup_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_passwordFocusLost(evt);
            }
        });
        signup_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_passwordMouseClicked(evt);
            }
        });
        Register.add(signup_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 20));

        signup_eye_open_icon.setBackground(new java.awt.Color(153, 153, 255));
        signup_eye_open_icon.setForeground(new java.awt.Color(0, 0, 255));
        signup_eye_open_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_close.png"))); // NOI18N
        signup_eye_open_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_open_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_open_iconMouseClicked(evt);
            }
        });
        Register.add(signup_eye_open_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        signup_eye_close_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_eye_close_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_eye_close_iconMouseClicked(evt);
            }
        });
        Register.add(signup_eye_close_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        signup_password_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Register.add(signup_password_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 10));

        signup_nickname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Register.add(signup_nickname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 10));

        signup_btn.setBackground(new java.awt.Color(80, 181, 207));
        signup_btn.setForeground(new java.awt.Color(80, 181, 207));
        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_btnMouseClicked(evt);
            }
        });
        Register.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 200, 30));

        signup_nickname.setBackground(new java.awt.Color(156, 172, 174));
        signup_nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        signup_nickname.setForeground(new java.awt.Color(111, 117, 124));
        signup_nickname.setText("Nick name");
        signup_nickname.setAutoscrolls(false);
        signup_nickname.setBorder(null);
        signup_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                signup_nicknameFocusLost(evt);
            }
        });
        signup_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signup_nicknameMouseClicked(evt);
            }
        });
        Register.add(signup_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 20));

        jLayeredPane1.add(Register);
        Register.setBounds(0, 0, 440, 480);
        jLayeredPane1.add(ChatArea);
        ChatArea.setBounds(0, 0, 440, 480);
        jLayeredPane1.add(ChatList);
        ChatList.setBounds(0, 0, 10, 10);
        jLayeredPane1.add(Settings);
        Settings.setBounds(0, 0, 10, 10);
        jLayeredPane1.add(Admin);
        Admin.setBounds(0, 0, 10, 10);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_profile_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_profile_picMouseClicked
        JFileChooser chooser = new JFileChooser(); //open image file file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"); //set image type filter
        chooser.setFileFilter(filter); //filter
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) { //if image selected
            File file = chooser.getSelectedFile(); //get selected file
            String strfilepath = file.getAbsolutePath(); //get abs path
            //            System.out.println(strfilepath);
            try {
                ImageIcon icon = new ImageIcon(strfilepath); //string image path open as a image icon
                ImageIcon iconresized = new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)); //resize image icon fit for profile icon label
                signup_profile_pic.setText(null); // remove label text
                signup_profile_pic.setIcon(iconresized); //set seleted image to profile icon label

                //               String img = this.encodeToString(this.ImageIconToBufferedImage(iconresized),"jpg");
                //               BufferedImage bimg = this.decodeToImage(img);
                //
                //               signup_profile_pic.setIcon(new ImageIcon(bimg));
            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_signup_profile_picMouseClicked

    private void signup_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_emailFocusLost
        if (signup_email.getText().trim().equalsIgnoreCase("")) {
            signup_email.setText("Email");
        }
    }//GEN-LAST:event_signup_emailFocusLost

    private void signup_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_emailMouseClicked
        if (signup_email.getText().trim().equalsIgnoreCase("email")) {
            signup_email.setText(null);
        }
    }//GEN-LAST:event_signup_emailMouseClicked

    private void signup_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_usernameFocusLost
        if (signup_username.getText().trim().equalsIgnoreCase("")) {
            signup_username.setText("Username");
        }
    }//GEN-LAST:event_signup_usernameFocusLost

    private void signup_usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_usernameMouseClicked
        if (signup_username.getText().trim().equalsIgnoreCase("username")) {
            signup_username.setText(null);
        }
    }//GEN-LAST:event_signup_usernameMouseClicked

    private void signup_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_passwordFocusLost
        if (signup_password.getText().trim().equalsIgnoreCase("")) {
            signup_password.setText("Password");
            signup_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signup_passwordFocusLost

    private void signup_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_passwordMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {
            signup_password.setText(null);
            signup_password.setEchoChar('●');
        }
    }//GEN-LAST:event_signup_passwordMouseClicked

    private void signup_eye_open_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_open_iconMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_close_icon.setVisible(true);
            signup_eye_open_icon.setVisible(false);
            signup_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_signup_eye_open_iconMouseClicked

    private void signup_eye_close_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_eye_close_iconMouseClicked
        if (signup_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            signup_eye_open_icon.setVisible(true);
            signup_eye_close_icon.setVisible(false);
            signup_password.setEchoChar('●');
        }
    }//GEN-LAST:event_signup_eye_close_iconMouseClicked

    private void signup_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_signup_nicknameFocusLost
        if (signup_nickname.getText().trim().equalsIgnoreCase("")) {
            signup_nickname.setText("Nick name");
        }
    }//GEN-LAST:event_signup_nicknameFocusLost

    private void signup_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_nicknameMouseClicked
        if (signup_nickname.getText().trim().equalsIgnoreCase("nick name")) {
            signup_nickname.setText(null);
        }
    }//GEN-LAST:event_signup_nicknameMouseClicked

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signup_btnMouseClicked
        signup_default();

        //get data from text boxes
        String email = signup_email.getText();
        String username = signup_username.getText();
        String nickname = signup_nickname.getText();
        String password = signup_password.getText();

        //error array
        ArrayList<String> error = validateform(email, username, nickname, password);

        if (error.isEmpty() == false) {
            signup_error.setText(error.get(0));
        } else {
            signup_error.setText(null);
            //intsert details
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) signup_profile_pic.getIcon();
            if (avatar != null) {
                try {
                    //                img = this.encodeToString(this.ImageIconToBufferedImage(avatar),"jpg");
                    BufferedImage bImage = ImageIconToBufferedImage(avatar);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    ImageIO.write(bImage, "jpg", bos);
                    img = bos.toByteArray();

                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (DBManager.getDBM().insert(img, email, username, nickname, password)) {
                signin_default();
                signup_error.setText("User created!");
            }

        }

    }//GEN-LAST:event_signup_btnMouseClicked

    private void signup_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup_usernameActionPerformed


    

    

   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private javax.swing.JPanel ChatArea;
    private javax.swing.JPanel ChatList;
    private javax.swing.JPanel Log;
    private javax.swing.JPanel Register;
    private javax.swing.JPanel Settings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel signup_btn;
    private javax.swing.JTextField signup_email;
    private javax.swing.JLabel signup_eye_close_icon;
    private javax.swing.JLabel signup_eye_open_icon;
    private javax.swing.JTextField signup_nickname;
    private javax.swing.JLabel signup_nickname_line;
    private javax.swing.JPasswordField signup_password;
    private javax.swing.JLabel signup_password_line;
    private javax.swing.JLabel signup_profile_pic;
    private javax.swing.JTextField signup_username;
    private javax.swing.JLabel signup_username_line;
    // End of variables declaration//GEN-END:variables
}
