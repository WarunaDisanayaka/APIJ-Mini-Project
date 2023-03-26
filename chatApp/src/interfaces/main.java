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
        Register = new javax.swing.JPanel();
        ChatArea = new javax.swing.JPanel();
        ChatList = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(470, 640));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.add(Log);
        Log.setBounds(0, 0, 440, 480);
        jLayeredPane1.add(Register);
        Register.setBounds(0, 0, 440, 480);
        jLayeredPane1.add(ChatArea);
        ChatArea.setBounds(0, 0, 440, 480);
        jLayeredPane1.add(ChatList);
        ChatList.setBounds(0, 0, 100, 100);
        jLayeredPane1.add(Settings);
        Settings.setBounds(0, 0, 100, 100);
        jLayeredPane1.add(Admin);
        Admin.setBounds(0, 0, 100, 100);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    

    

   

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
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
