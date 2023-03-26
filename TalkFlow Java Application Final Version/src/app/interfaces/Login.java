package app.interfaces;

import app.dbmanager.DBManager;
import app.pojos.Groups;
import app.pojos.User;
import app.services.Chat;
import app.services.ChatService;
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

public class Login extends javax.swing.JFrame {

    Registry reg;
    Chat chat;

    static int xx, yy;
    static Chat_ball chat_ball;
    int id;
    ChatClient me;

    public Login() {
        initComponents();

        Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screen_size.width - 425, getY());

        //when app on
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);

        signin_default();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layered_pane = new javax.swing.JLayeredPane();
        title_panel = new javax.swing.JPanel();
        topbar = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        signin_panel = new javax.swing.JPanel();
        AppLogo = new javax.swing.JLabel();
        uname_icon = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        uname_line = new javax.swing.JLabel();
        pwd_icon = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        pwd_line = new javax.swing.JLabel();
        openEye_icon = new javax.swing.JLabel();
        closeEye_icon = new javax.swing.JLabel();
        signin_bttn = new javax.swing.JLabel();
        signin_errorMsg = new javax.swing.JLabel();
        forgot_pass = new javax.swing.JTextField();
        forgot_pass_hover = new javax.swing.JTextField();
        login_signup = new javax.swing.JTextField();
        login_signup_hover = new javax.swing.JTextField();
        signin_copyrights = new javax.swing.JLabel();
        signin_footer = new javax.swing.JLabel();
        signup_panel = new javax.swing.JPanel();
        user_profilePic = new javax.swing.JLabel();
        register_email = new javax.swing.JTextField();
        register_email_line = new javax.swing.JLabel();
        register_uname = new javax.swing.JTextField();
        register_uname_line = new javax.swing.JLabel();
        register_password = new javax.swing.JPasswordField();
        reg_OpenEye = new javax.swing.JLabel();
        reg_closeEye = new javax.swing.JLabel();
        reg_password_line = new javax.swing.JLabel();
        reg_nickname_line = new javax.swing.JLabel();
        reg_nickname = new javax.swing.JTextField();
        Register_bttn = new javax.swing.JLabel();
        reg_error = new javax.swing.JLabel();
        register_signIn = new javax.swing.JTextField();
        register_signIn_hover = new javax.swing.JTextField();
        register_copyrights = new javax.swing.JLabel();
        register_footer = new javax.swing.JLabel();
        forgot_password_panel = new javax.swing.JPanel();
        fpwd_logo = new javax.swing.JLabel();
        resendCode_Bttn = new javax.swing.JLabel();
        fpwd_des = new javax.swing.JLabel();
        fpwd_recoveryCode = new javax.swing.JTextField();
        fpwd_recoveryCodeLine = new javax.swing.JLabel();
        fpwd_confirmBttn = new javax.swing.JLabel();
        fpwd_error = new javax.swing.JLabel();
        fpwd_signin = new javax.swing.JTextField();
        fpwd_signin_link_hover = new javax.swing.JTextField();
        fpwd_copyrights = new javax.swing.JLabel();
        fpwd_footer = new javax.swing.JLabel();
        chat_body_panel = new javax.swing.JPanel();
        chatlists_title = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        clients_logout = new javax.swing.JLabel();
        msgWall = new javax.swing.JScrollPane();
        chat_bg = new javax.swing.JPanel();
        typer = new javax.swing.JTextField();
        send_icon = new javax.swing.JLabel();
        uline = new javax.swing.JLabel();
        chat_list_panel = new javax.swing.JPanel();
        chatlist_title = new javax.swing.JLabel();
        chatlist_setting = new javax.swing.JLabel();
        client_logout1 = new javax.swing.JLabel();
        chat_list_wall = new javax.swing.JScrollPane();
        client_groups_panel = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        setting_lable = new javax.swing.JLabel();
        setting_ico = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        update_pwd_panel = new javax.swing.JPanel();
        new_pwd = new javax.swing.JTextField();
        signup_email_line1 = new javax.swing.JLabel();
        confirm_pwd = new javax.swing.JTextField();
        register_username_line1 = new javax.swing.JLabel();
        register_nick_line1 = new javax.swing.JLabel();
        old_pwd = new javax.swing.JTextField();
        successMsg = new javax.swing.JLabel();
        home_link_hover1 = new javax.swing.JTextField();
        _copyrights1 = new javax.swing.JLabel();
        updatePwd_footer1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        update_panel = new javax.swing.JPanel();
        update_profillePic = new javax.swing.JLabel();
        updateMail = new javax.swing.JTextField();
        u_line2 = new javax.swing.JLabel();
        und_line2 = new javax.swing.JLabel();
        updateNickName = new javax.swing.JTextField();
        success_msg1 = new javax.swing.JLabel();
        update_copyrights2 = new javax.swing.JLabel();
        update_footer2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        changePwd = new javax.swing.JLabel();
        UpdateSuccess_msg = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        admin_panel = new javax.swing.JPanel();
        admin_errorMsg = new javax.swing.JLabel();
        _copyrights3 = new javax.swing.JLabel();
        adminFoo = new javax.swing.JLabel();
        createChatBttn = new javax.swing.JLabel();
        groupWall = new javax.swing.JScrollPane();
        group_panel = new javax.swing.JPanel();
        logout3 = new javax.swing.JLabel();
        group_create_panel = new javax.swing.JPanel();
        grpName_text = new javax.swing.JTextField();
        uname_line1 = new javax.swing.JLabel();
        create_grp_bttn = new javax.swing.JLabel();
        copyrights4 = new javax.swing.JLabel();
        signup_footer3 = new javax.swing.JLabel();
        grpDes = new javax.swing.JLabel();
        grp_states = new javax.swing.JLabel();
        grpName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        g_dec_textArea = new javax.swing.JTextArea();
        logout4 = new javax.swing.JLabel();
        back2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layered_pane.setBackground(new java.awt.Color(28, 36, 47));

        title_panel.setBackground(new java.awt.Color(242, 244, 246));

        topbar.setBackground(new java.awt.Color(242, 244, 246));
        topbar.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        topbar.setForeground(new java.awt.Color(111, 117, 124));
        topbar.setText("  TalkFlow");
        topbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbarMouseDragged(evt);
            }
        });
        topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbarMousePressed(evt);
            }
        });

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/minimize.png"))); // NOI18N
        minimize.setToolTipText("Minimize");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/close.png"))); // NOI18N
        close.setToolTipText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout title_panelLayout = new javax.swing.GroupLayout(title_panel);
        title_panel.setLayout(title_panelLayout);
        title_panelLayout.setHorizontalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_panelLayout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(minimize)
                .addGap(0, 0, 0)
                .addComponent(close))
        );
        title_panelLayout.setVerticalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        signin_panel.setBackground(new java.awt.Color(242, 244, 246));
        signin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/snapchat_150px.png"))); // NOI18N
        signin_panel.add(AppLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 140, 120));

        uname_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/username.png"))); // NOI18N
        signin_panel.add(uname_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 20, 20));

        uname.setBackground(new java.awt.Color(242, 244, 246));
        uname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        uname.setForeground(new java.awt.Color(111, 117, 124));
        uname.setAutoscrolls(false);
        uname.setBorder(null);
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unameMouseClicked(evt);
            }
        });
        signin_panel.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 240, 20));

        uname_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        uname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signin_panel.add(uname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, 10));

        pwd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/password.png"))); // NOI18N
        signin_panel.add(pwd_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 20, 20));

        password.setBackground(new java.awt.Color(242, 244, 246));
        password.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        password.setForeground(new java.awt.Color(111, 117, 124));
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        signin_panel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 20));

        pwd_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        pwd_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signin_panel.add(pwd_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 10));

        openEye_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        openEye_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openEye_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openEye_iconMouseClicked(evt);
            }
        });
        signin_panel.add(openEye_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 20, 20));

        closeEye_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        closeEye_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeEye_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeEye_iconMouseClicked(evt);
            }
        });
        signin_panel.add(closeEye_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 20, 20));

        signin_bttn.setText("                    Sign In");
        signin_bttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signin_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signin_bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signin_bttnMouseClicked(evt);
            }
        });
        signin_panel.add(signin_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 200, 30));

        signin_errorMsg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signin_errorMsg.setForeground(new java.awt.Color(206, 47, 131));
        signin_errorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_panel.add(signin_errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, 20));

        forgot_pass.setBackground(new java.awt.Color(242, 244, 246));
        forgot_pass.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        forgot_pass.setForeground(new java.awt.Color(111, 117, 124));
        forgot_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_pass.setText("Forgot Password ?");
        forgot_pass.setBorder(null);
        forgot_pass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgot_passMouseEntered(evt);
            }
        });
        signin_panel.add(forgot_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 20));

        forgot_pass_hover.setEditable(false);
        forgot_pass_hover.setBackground(new java.awt.Color(28, 36, 47));
        forgot_pass_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        forgot_pass_hover.setForeground(new java.awt.Color(206, 47, 131));
        forgot_pass_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        forgot_pass_hover.setText("Forgot Password ?");
        forgot_pass_hover.setBorder(null);
        forgot_pass_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_pass_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_pass_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgot_pass_hoverMouseExited(evt);
            }
        });
        forgot_pass_hover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_pass_hoverActionPerformed(evt);
            }
        });
        signin_panel.add(forgot_pass_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, 20));

        login_signup.setBackground(new java.awt.Color(156, 172, 174));
        login_signup.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        login_signup.setForeground(new java.awt.Color(0, 102, 102));
        login_signup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_signup.setText("Sign Up");
        login_signup.setBorder(null);
        login_signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_signupMouseEntered(evt);
            }
        });
        login_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_signupActionPerformed(evt);
            }
        });
        signin_panel.add(login_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, 20));

        login_signup_hover.setEditable(false);
        login_signup_hover.setBackground(new java.awt.Color(156, 172, 174));
        login_signup_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        login_signup_hover.setForeground(new java.awt.Color(49, 39, 32));
        login_signup_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_signup_hover.setText("Sign Up");
        login_signup_hover.setBorder(null);
        login_signup_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_signup_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_signup_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_signup_hoverMouseExited(evt);
            }
        });
        signin_panel.add(login_signup_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 60, 20));

        signin_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        signin_copyrights.setForeground(new java.awt.Color(49, 39, 32));
        signin_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signin_copyrights.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        signin_panel.add(signin_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signin_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        signin_panel.add(signin_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        signup_panel.setBackground(new java.awt.Color(242, 244, 246));
        signup_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_profilePic.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        user_profilePic.setForeground(new java.awt.Color(111, 117, 124));
        user_profilePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_profilePic.setText("Profile Picture");
        user_profilePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        user_profilePic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_profilePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_profilePicMouseClicked(evt);
            }
        });
        signup_panel.add(user_profilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 120));

        register_email.setBackground(new java.awt.Color(242, 244, 246));
        register_email.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        register_email.setForeground(new java.awt.Color(111, 117, 124));
        register_email.setText("Email");
        register_email.setAutoscrolls(false);
        register_email.setBorder(null);
        register_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                register_emailFocusLost(evt);
            }
        });
        register_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_emailMouseClicked(evt);
            }
        });
        signup_panel.add(register_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 20));

        register_email_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        register_email_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(register_email_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, 10));

        register_uname.setBackground(new java.awt.Color(242, 244, 246));
        register_uname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        register_uname.setForeground(new java.awt.Color(111, 117, 124));
        register_uname.setText("Username");
        register_uname.setAutoscrolls(false);
        register_uname.setBorder(null);
        register_uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                register_unameFocusLost(evt);
            }
        });
        register_uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_unameMouseClicked(evt);
            }
        });
        register_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_unameActionPerformed(evt);
            }
        });
        signup_panel.add(register_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 20));

        register_uname_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        register_uname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(register_uname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 10));

        register_password.setBackground(new java.awt.Color(242, 244, 246));
        register_password.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        register_password.setForeground(new java.awt.Color(111, 117, 124));
        register_password.setText("Password");
        register_password.setBorder(null);
        register_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                register_passwordFocusLost(evt);
            }
        });
        register_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_passwordMouseClicked(evt);
            }
        });
        register_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_passwordActionPerformed(evt);
            }
        });
        signup_panel.add(register_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 220, 20));

        reg_OpenEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_open.png"))); // NOI18N
        reg_OpenEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reg_OpenEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_OpenEyeMouseClicked(evt);
            }
        });
        signup_panel.add(reg_OpenEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        reg_closeEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/eye_close.png"))); // NOI18N
        reg_closeEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reg_closeEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_closeEyeMouseClicked(evt);
            }
        });
        signup_panel.add(reg_closeEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 20, 20));

        reg_password_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        reg_password_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(reg_password_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 10));

        reg_nickname_line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        reg_nickname_line.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signup_panel.add(reg_nickname_line, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 10));

        reg_nickname.setBackground(new java.awt.Color(242, 244, 246));
        reg_nickname.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        reg_nickname.setForeground(new java.awt.Color(111, 117, 124));
        reg_nickname.setText("Nick name");
        reg_nickname.setAutoscrolls(false);
        reg_nickname.setBorder(null);
        reg_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                reg_nicknameFocusLost(evt);
            }
        });
        reg_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg_nicknameMouseClicked(evt);
            }
        });
        signup_panel.add(reg_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 20));

        Register_bttn.setText("                   Sign Up");
        Register_bttn.setBorder(new javax.swing.border.MatteBorder(null));
        Register_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register_bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_bttnMouseClicked(evt);
            }
        });
        signup_panel.add(Register_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 200, 30));

        reg_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        reg_error.setForeground(new java.awt.Color(204, 0, 51));
        reg_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup_panel.add(reg_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 20));

        register_signIn.setBackground(new java.awt.Color(156, 172, 174));
        register_signIn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        register_signIn.setForeground(new java.awt.Color(0, 102, 102));
        register_signIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        register_signIn.setText("Sign In");
        register_signIn.setBorder(null);
        register_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_signInMouseEntered(evt);
            }
        });
        register_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_signInActionPerformed(evt);
            }
        });
        signup_panel.add(register_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 50, 20));

        register_signIn_hover.setEditable(false);
        register_signIn_hover.setBackground(new java.awt.Color(28, 36, 47));
        register_signIn_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        register_signIn_hover.setForeground(new java.awt.Color(206, 47, 131));
        register_signIn_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        register_signIn_hover.setText("Sign In");
        register_signIn_hover.setBorder(null);
        register_signIn_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_signIn_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_signIn_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_signIn_hoverMouseExited(evt);
            }
        });
        signup_panel.add(register_signIn_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 50, 20));

        register_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        register_copyrights.setForeground(new java.awt.Color(49, 39, 32));
        register_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_copyrights.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        signup_panel.add(register_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        register_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        signup_panel.add(register_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        forgot_password_panel.setBackground(new java.awt.Color(242, 244, 246));
        forgot_password_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpwd_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/snapchat_150px.png"))); // NOI18N
        forgot_password_panel.add(fpwd_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 140, 120));

        resendCode_Bttn.setFont(new java.awt.Font("Bookman Old Style", 1, 11)); // NOI18N
        resendCode_Bttn.setForeground(new java.awt.Color(102, 0, 153));
        resendCode_Bttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resendCode_Bttn.setText("resend code.");
        resendCode_Bttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resendCode_Bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(resendCode_Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 20));

        fpwd_des.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        fpwd_des.setForeground(new java.awt.Color(49, 39, 32));
        fpwd_des.setText("<html>We have sent a recovery code to your email.<br> Please check your inbox and enter the code on our website to reset your password. If you haven't received the code yet, please check your spam folder. You can also request us to resend the code by clicking the \"Resend Code\" button below. Thank you!</html>");
        forgot_password_panel.add(fpwd_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 280, 120));

        fpwd_recoveryCode.setEditable(false);
        fpwd_recoveryCode.setBackground(new java.awt.Color(156, 172, 174));
        fpwd_recoveryCode.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        fpwd_recoveryCode.setForeground(new java.awt.Color(111, 117, 124));
        fpwd_recoveryCode.setText("Recovery code");
        fpwd_recoveryCode.setAutoscrolls(false);
        fpwd_recoveryCode.setBorder(null);
        fpwd_recoveryCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fpwd_recoveryCodeFocusLost(evt);
            }
        });
        fpwd_recoveryCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpwd_recoveryCodeMouseClicked(evt);
            }
        });
        fpwd_recoveryCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpwd_recoveryCodeActionPerformed(evt);
            }
        });
        forgot_password_panel.add(fpwd_recoveryCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 240, 20));

        fpwd_recoveryCodeLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        fpwd_recoveryCodeLine.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        forgot_password_panel.add(fpwd_recoveryCodeLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 10));

        fpwd_confirmBttn.setText("                  Confirm");
        fpwd_confirmBttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fpwd_confirmBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_panel.add(fpwd_confirmBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, 30));

        fpwd_error.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fpwd_error.setForeground(new java.awt.Color(204, 0, 0));
        fpwd_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpwd_error.setText("username and password are required");
        forgot_password_panel.add(fpwd_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 310, -1));

        fpwd_signin.setBackground(new java.awt.Color(156, 172, 174));
        fpwd_signin.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fpwd_signin.setForeground(new java.awt.Color(0, 102, 102));
        fpwd_signin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fpwd_signin.setText("Sign In");
        fpwd_signin.setBorder(null);
        fpwd_signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpwd_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpwd_signinMouseEntered(evt);
            }
        });
        forgot_password_panel.add(fpwd_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        fpwd_signin_link_hover.setEditable(false);
        fpwd_signin_link_hover.setBackground(new java.awt.Color(28, 36, 47));
        fpwd_signin_link_hover.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        fpwd_signin_link_hover.setForeground(new java.awt.Color(206, 47, 131));
        fpwd_signin_link_hover.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fpwd_signin_link_hover.setText("Sign In");
        fpwd_signin_link_hover.setBorder(null);
        fpwd_signin_link_hover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpwd_signin_link_hover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fpwd_signin_link_hoverMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fpwd_signin_link_hoverMouseExited(evt);
            }
        });
        forgot_password_panel.add(fpwd_signin_link_hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 50, 20));

        fpwd_copyrights.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        fpwd_copyrights.setForeground(new java.awt.Color(49, 39, 32));
        fpwd_copyrights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpwd_copyrights.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        forgot_password_panel.add(fpwd_copyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        fpwd_footer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        forgot_password_panel.add(fpwd_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        chat_body_panel.setBackground(new java.awt.Color(242, 244, 246));
        chat_body_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_body_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlists_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlists_title.setText("  Chats");
        chat_body_panel.add(chatlists_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/settings_26px.png"))); // NOI18N
        setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
        });
        chat_body_panel.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        clients_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/Logout_26px.png"))); // NOI18N
        clients_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clients_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clients_logoutMouseClicked(evt);
            }
        });
        chat_body_panel.add(clients_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        chat_bg.setBackground(new java.awt.Color(156, 172, 174));
        chat_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        msgWall.setViewportView(chat_bg);

        chat_body_panel.add(msgWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, 340, 350));

        typer.setBackground(new java.awt.Color(156, 172, 174));
        typer.setForeground(new java.awt.Color(255, 255, 255));
        typer.setBorder(null);
        typer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typerKeyPressed(evt);
            }
        });
        chat_body_panel.add(typer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 290, 30));

        send_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/Email Send_36px.png"))); // NOI18N
        send_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                send_iconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                send_iconMouseEntered(evt);
            }
        });
        chat_body_panel.add(send_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 40, 40));

        uline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrlinelong.png"))); // NOI18N
        chat_body_panel.add(uline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 290, 10));

        chat_list_panel.setBackground(new java.awt.Color(242, 244, 246));
        chat_list_panel.setPreferredSize(new java.awt.Dimension(375, 500));
        chat_list_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chatlist_title.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        chatlist_title.setText("  Chats");
        chat_list_panel.add(chatlist_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        chatlist_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/settings_26px.png"))); // NOI18N
        chatlist_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chatlist_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatlist_settingMouseClicked(evt);
            }
        });
        chat_list_panel.add(chatlist_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        client_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/Logout_26px.png"))); // NOI18N
        client_logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                client_logout1MouseClicked(evt);
            }
        });
        chat_list_panel.add(client_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        chat_list_wall.setBackground(new java.awt.Color(28, 36, 47));

        client_groups_panel.setBackground(new java.awt.Color(156, 172, 174));
        client_groups_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        chat_list_wall.setViewportView(client_groups_panel);

        chat_list_panel.add(chat_list_wall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 410));

        setting_panel.setBackground(new java.awt.Color(242, 244, 246));
        setting_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setting_lable.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        setting_lable.setForeground(new java.awt.Color(49, 39, 32));
        setting_lable.setText("  Setting");
        setting_panel.add(setting_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        setting_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/settings_26px.png"))); // NOI18N
        setting_ico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_ico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_icoMouseClicked(evt);
            }
        });
        setting_panel.add(setting_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

        role.setForeground(new java.awt.Color(49, 39, 32));
        role.setText("Admin");
        setting_panel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        update_pwd_panel.setBackground(new java.awt.Color(242, 244, 246));
        update_pwd_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_pwd.setBackground(new java.awt.Color(242, 244, 246));
        new_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        new_pwd.setForeground(new java.awt.Color(111, 117, 124));
        new_pwd.setText("New Passowrd");
        new_pwd.setAutoscrolls(false);
        new_pwd.setBorder(null);
        new_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pwdFocusLost(evt);
            }
        });
        new_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(new_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, 20));

        signup_email_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        signup_email_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(signup_email_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 10));

        confirm_pwd.setBackground(new java.awt.Color(242, 244, 246));
        confirm_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        confirm_pwd.setForeground(new java.awt.Color(111, 117, 124));
        confirm_pwd.setText("New Corfirm Password");
        confirm_pwd.setAutoscrolls(false);
        confirm_pwd.setBorder(null);
        confirm_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_pwdFocusLost(evt);
            }
        });
        confirm_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(confirm_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 20));

        register_username_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        register_username_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(register_username_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 10));

        register_nick_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        register_nick_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_pwd_panel.add(register_nick_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 10));

        old_pwd.setBackground(new java.awt.Color(242, 244, 246));
        old_pwd.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        old_pwd.setForeground(new java.awt.Color(111, 117, 124));
        old_pwd.setText("Current Password");
        old_pwd.setAutoscrolls(false);
        old_pwd.setBorder(null);
        old_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                old_pwdFocusLost(evt);
            }
        });
        old_pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                old_pwdMouseClicked(evt);
            }
        });
        update_pwd_panel.add(old_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 240, 20));

        successMsg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        successMsg.setForeground(new java.awt.Color(206, 47, 131));
        successMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_pwd_panel.add(successMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 20));

        home_link_hover1.setEditable(false);
        home_link_hover1.setBackground(new java.awt.Color(156, 172, 174));
        home_link_hover1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        home_link_hover1.setForeground(new java.awt.Color(0, 102, 102));
        home_link_hover1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        home_link_hover1.setText("Home");
        home_link_hover1.setBorder(null);
        home_link_hover1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_link_hover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_link_hover1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_link_hover1MouseExited(evt);
            }
        });
        home_link_hover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_link_hover1ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(home_link_hover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, 20));

        _copyrights1.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        _copyrights1.setForeground(new java.awt.Color(49, 39, 32));
        _copyrights1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _copyrights1.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        update_pwd_panel.add(_copyrights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        updatePwd_footer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        update_pwd_panel.add(updatePwd_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        jButton3.setText("Change Password");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        update_pwd_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        update_panel.setBackground(new java.awt.Color(242, 244, 246));
        update_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_profillePic.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        update_profillePic.setForeground(new java.awt.Color(111, 117, 124));
        update_profillePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_profillePic.setText("Profile Picture");
        update_profillePic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 117, 124), 2));
        update_profillePic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_profillePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_profillePicMouseClicked(evt);
            }
        });
        update_panel.add(update_profillePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 120, 120));

        updateMail.setBackground(new java.awt.Color(242, 244, 246));
        updateMail.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        updateMail.setForeground(new java.awt.Color(111, 117, 124));
        updateMail.setText("Email");
        updateMail.setAutoscrolls(false);
        updateMail.setBorder(null);
        updateMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                updateMailFocusLost(evt);
            }
        });
        updateMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMailMouseClicked(evt);
            }
        });
        updateMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMailActionPerformed(evt);
            }
        });
        update_panel.add(updateMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 240, 20));

        u_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        u_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(u_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 10));

        und_line2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        und_line2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        update_panel.add(und_line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 10));

        updateNickName.setBackground(new java.awt.Color(242, 244, 246));
        updateNickName.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        updateNickName.setForeground(new java.awt.Color(111, 117, 124));
        updateNickName.setText("Nick name");
        updateNickName.setAutoscrolls(false);
        updateNickName.setBorder(null);
        updateNickName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                updateNickNameFocusLost(evt);
            }
        });
        updateNickName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateNickNameMouseClicked(evt);
            }
        });
        update_panel.add(updateNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 240, 20));

        success_msg1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        success_msg1.setForeground(new java.awt.Color(206, 47, 131));
        success_msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(success_msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 280, 20));

        update_copyrights2.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        update_copyrights2.setForeground(new java.awt.Color(49, 39, 32));
        update_copyrights2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_copyrights2.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        update_panel.add(update_copyrights2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        update_footer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        update_panel.add(update_footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        jLabel1.setBackground(new java.awt.Color(156, 172, 174));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("  Home ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        update_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, 20));

        changePwd.setForeground(new java.awt.Color(0, 102, 102));
        changePwd.setText("Change Password");
        changePwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePwdMouseClicked(evt);
            }
        });
        update_panel.add(changePwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        UpdateSuccess_msg.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        UpdateSuccess_msg.setForeground(new java.awt.Color(204, 0, 102));
        UpdateSuccess_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_panel.add(UpdateSuccess_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 210, 20));

        update.setText("                    Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update_panel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 30));

        admin_panel.setBackground(new java.awt.Color(242, 244, 246));
        admin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_errorMsg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        admin_errorMsg.setForeground(new java.awt.Color(206, 47, 131));
        admin_errorMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_panel.add(admin_errorMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 310, 20));

        _copyrights3.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        _copyrights3.setForeground(new java.awt.Color(49, 39, 32));
        _copyrights3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _copyrights3.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        admin_panel.add(_copyrights3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        adminFoo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        admin_panel.add(adminFoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        createChatBttn.setText("       Create New Chat");
        createChatBttn.setBorder(new javax.swing.border.MatteBorder(null));
        createChatBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createChatBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createChatBttnMouseClicked(evt);
            }
        });
        admin_panel.add(createChatBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 30));

        groupWall.setBorder(null);

        group_panel.setBackground(new java.awt.Color(156, 172, 174));
        group_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        groupWall.setViewportView(group_panel);

        admin_panel.add(groupWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, 290));

        logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/Logout_26px.png"))); // NOI18N
        logout3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout3MouseClicked(evt);
            }
        });
        admin_panel.add(logout3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 30));

        group_create_panel.setBackground(new java.awt.Color(242, 244, 246));
        group_create_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grpName_text.setBackground(new java.awt.Color(242, 244, 246));
        grpName_text.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        grpName_text.setForeground(new java.awt.Color(111, 117, 124));
        grpName_text.setAutoscrolls(false);
        grpName_text.setBorder(null);
        grpName_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                grpName_textFocusLost(evt);
            }
        });
        grpName_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grpName_textMouseClicked(evt);
            }
        });
        group_create_panel.add(grpName_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 240, 20));

        uname_line1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/hrline.png"))); // NOI18N
        uname_line1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        group_create_panel.add(uname_line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 10));

        create_grp_bttn.setText("                    Create");
        create_grp_bttn.setToolTipText("");
        create_grp_bttn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        create_grp_bttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_grp_bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_grp_bttnMouseClicked(evt);
            }
        });
        group_create_panel.add(create_grp_bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 30));

        copyrights4.setFont(new java.awt.Font("Bookman Old Style", 0, 10)); // NOI18N
        copyrights4.setForeground(new java.awt.Color(49, 39, 32));
        copyrights4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrights4.setText("<html><center>Copyrights &copy; 2023<br>All rights reserved</center></html>");
        group_create_panel.add(copyrights4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 360, 30));

        signup_footer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/blue Footer.png"))); // NOI18N
        group_create_panel.add(signup_footer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 375, 130));

        grpDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpDes.setForeground(new java.awt.Color(49, 39, 32));
        grpDes.setText("Group Description");
        group_create_panel.add(grpDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        grp_states.setForeground(new java.awt.Color(255, 0, 102));
        grp_states.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        group_create_panel.add(grp_states, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 220, 20));

        grpName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpName.setForeground(new java.awt.Color(49, 39, 32));
        grpName.setText("Group name");
        group_create_panel.add(grpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        g_dec_textArea.setBackground(new java.awt.Color(242, 244, 246));
        g_dec_textArea.setColumns(20);
        g_dec_textArea.setForeground(new java.awt.Color(255, 255, 255));
        g_dec_textArea.setRows(5);
        jScrollPane3.setViewportView(g_dec_textArea);

        group_create_panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 240, 60));

        logout4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/Logout_26px.png"))); // NOI18N
        logout4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout4MouseClicked(evt);
            }
        });
        group_create_panel.add(logout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 30));

        back2.setForeground(new java.awt.Color(49, 39, 32));
        back2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back2.setText("back");
        back2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back2MouseClicked(evt);
            }
        });
        group_create_panel.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 50, 20));

        javax.swing.GroupLayout layered_paneLayout = new javax.swing.GroupLayout(layered_pane);
        layered_pane.setLayout(layered_paneLayout);
        layered_paneLayout.setHorizontalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layered_paneLayout.createSequentialGroup()
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(setting_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(update_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(admin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(group_create_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layered_paneLayout.createSequentialGroup()
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layered_paneLayout.setVerticalGroup(
            layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                .addComponent(title_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(signup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(forgot_password_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(chat_list_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(setting_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(update_pwd_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(admin_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(group_create_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_paneLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(chat_body_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layered_pane.setLayer(title_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(signup_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(forgot_password_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_body_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(chat_list_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(setting_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_pwd_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(update_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(admin_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_pane.setLayer(group_create_panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(layered_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 375, 525));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        Chat_ball chat_ball1 = new Chat_ball(this);
        chat_ball1.setVisible(true);
        this.setVisible(false);
        //this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void forgot_pass_hoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_pass_hoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgot_pass_hoverActionPerformed

    private void forgot_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_passMouseEntered
        forgot_pass.setVisible(false);
        forgot_pass_hover.setVisible(true);
    }//GEN-LAST:event_forgot_passMouseEntered

    private void forgot_pass_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_pass_hoverMouseExited
        forgot_pass_hover.setVisible(false);
        forgot_pass.setVisible(true);
    }//GEN-LAST:event_forgot_pass_hoverMouseExited

    private void login_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_signupMouseEntered
        login_signup.setVisible(false);
        login_signup_hover.setVisible(true);
    }//GEN-LAST:event_login_signupMouseEntered

    private void login_signup_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_signup_hoverMouseExited
        login_signup_hover.setVisible(false);
        login_signup.setVisible(true);
    }//GEN-LAST:event_login_signup_hoverMouseExited

    private void openEye_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openEye_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            closeEye_icon.setVisible(true);
            openEye_icon.setVisible(false);
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_openEye_iconMouseClicked

    private void closeEye_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeEye_iconMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            openEye_icon.setVisible(true);
            closeEye_icon.setVisible(false);
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_closeEye_iconMouseClicked

    private void unameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameMouseClicked
        if (uname.getText().trim().equalsIgnoreCase("username")) {
            uname.setText(null);
        }
    }//GEN-LAST:event_unameMouseClicked

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        if (uname.getText().trim().equalsIgnoreCase("")) {
            uname.setText("Username");
        }
    }//GEN-LAST:event_unameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().trim().equalsIgnoreCase("")) {
            password.setText("Password");
            password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        if (password.getText().trim().equalsIgnoreCase("password")) {
            password.setText(null);
            password.setEchoChar('●');
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void register_unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_unameFocusLost
        if (register_uname.getText().trim().equalsIgnoreCase("")) {
            register_uname.setText("Username");
        }
    }//GEN-LAST:event_register_unameFocusLost

    private void register_unameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_unameMouseClicked
        if (register_uname.getText().trim().equalsIgnoreCase("username")) {
            register_uname.setText(null);
        }
    }//GEN-LAST:event_register_unameMouseClicked

    private void register_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_passwordFocusLost
        if (register_password.getText().trim().equalsIgnoreCase("")) {
            register_password.setText("Password");
            register_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_register_passwordFocusLost

    private void register_passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_passwordMouseClicked
        if (register_password.getText().trim().equalsIgnoreCase("password")) {
            register_password.setText(null);
            register_password.setEchoChar('●');
        }
    }//GEN-LAST:event_register_passwordMouseClicked

    private void reg_OpenEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_OpenEyeMouseClicked
        if (register_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            reg_closeEye.setVisible(true);
            reg_OpenEye.setVisible(false);
            register_password.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_reg_OpenEyeMouseClicked

    private void reg_closeEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_closeEyeMouseClicked
        if (register_password.getText().trim().equalsIgnoreCase("password")) {

        } else {
            reg_OpenEye.setVisible(true);
            reg_closeEye.setVisible(false);
            register_password.setEchoChar('●');
        }
    }//GEN-LAST:event_reg_closeEyeMouseClicked

    private void register_signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_signInMouseEntered
        register_signIn.setVisible(false);
        register_signIn_hover.setVisible(true);
    }//GEN-LAST:event_register_signInMouseEntered

    private void register_signIn_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_signIn_hoverMouseExited
        register_signIn_hover.setVisible(false);
        register_signIn.setVisible(true);
    }//GEN-LAST:event_register_signIn_hoverMouseExited

    private void register_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_signInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_signInActionPerformed

    private void login_signup_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_signup_hoverMouseClicked
        signup_default();
    }//GEN-LAST:event_login_signup_hoverMouseClicked

    private void register_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_emailFocusLost
        if (register_email.getText().trim().equalsIgnoreCase("")) {
            register_email.setText("Email");
        }
    }//GEN-LAST:event_register_emailFocusLost

    private void register_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_emailMouseClicked
        if (register_email.getText().trim().equalsIgnoreCase("email")) {
            register_email.setText(null);
        }
    }//GEN-LAST:event_register_emailMouseClicked

    private void reg_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reg_nicknameFocusLost
        if (reg_nickname.getText().trim().equalsIgnoreCase("")) {
            reg_nickname.setText("Nick name");
        }
    }//GEN-LAST:event_reg_nicknameFocusLost

    private void reg_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg_nicknameMouseClicked
        if (reg_nickname.getText().trim().equalsIgnoreCase("nick name")) {
            reg_nickname.setText(null);
        }
    }//GEN-LAST:event_reg_nicknameMouseClicked

    private void register_signIn_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_signIn_hoverMouseClicked
        signin_default();
    }//GEN-LAST:event_register_signIn_hoverMouseClicked

    private void user_profilePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_profilePicMouseClicked
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
                user_profilePic.setText(null); // remove label text
                user_profilePic.setIcon(iconresized); //set seleted image to profile icon label 

//               String img = this.encodeToString(this.ImageIconToBufferedImage(iconresized),"jpg"); 
//               BufferedImage bimg = this.decodeToImage(img);
//               
//               signup_profile_pic.setIcon(new ImageIcon(bimg));
            } catch (Exception e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_user_profilePicMouseClicked

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_topbarMousePressed


    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_topbarMouseDragged

    private void fpwd_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpwd_signinMouseEntered
        fpwd_signin.setVisible(false);
        fpwd_signin_link_hover.setVisible(true);
    }//GEN-LAST:event_fpwd_signinMouseEntered

    private void fpwd_signin_link_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpwd_signin_link_hoverMouseClicked
        signin_default();
    }//GEN-LAST:event_fpwd_signin_link_hoverMouseClicked

    private void fpwd_signin_link_hoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpwd_signin_link_hoverMouseExited
        fpwd_signin_link_hover.setVisible(false);
        fpwd_signin.setVisible(true);
    }//GEN-LAST:event_fpwd_signin_link_hoverMouseExited

    private void fpwd_recoveryCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fpwd_recoveryCodeFocusLost
        if (fpwd_recoveryCode.getText().trim().equalsIgnoreCase("")) {
            fpwd_recoveryCode.setText("Recovery code");
        }
    }//GEN-LAST:event_fpwd_recoveryCodeFocusLost

    private void fpwd_recoveryCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpwd_recoveryCodeMouseClicked
        if (fpwd_recoveryCode.getText().trim().equalsIgnoreCase("recovery code")) {
            fpwd_recoveryCode.setText(null);
        }
    }//GEN-LAST:event_fpwd_recoveryCodeMouseClicked

    private void forgot_pass_hoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_pass_hoverMouseClicked
        forgot_password_default();
    }//GEN-LAST:event_forgot_pass_hoverMouseClicked

    private void new_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdFocusLost

    private void new_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pwdMouseClicked

    private void confirm_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_pwdFocusLost

    private void confirm_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_pwdMouseClicked

    private void old_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_old_pwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_old_pwdFocusLost

    private void old_pwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_old_pwdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_old_pwdMouseClicked

    private void home_link_hover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_link_hover1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_home_link_hover1MouseClicked

    private void home_link_hover1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_link_hover1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_home_link_hover1MouseExited

    int y = 13;

    public void load_group(boolean is_called_signin) {
        y = 13;
        List groups = DBManager.getDBM().get_chats();

        group_panel.removeAll();
        //group_panel.repaint();
        //group_panel.revalidate();

        for (Iterator iterator = groups.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            if (is_called_signin) {
                //put all chats offline before login admin
                DBManager.getDBM().put_offline(next.getId());
            }

            JPanel group = new javax.swing.JPanel();
            group.setBackground(new java.awt.Color(44, 47, 62));
            group.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            JLabel g_action = new javax.swing.JLabel();

            if (DBManager.getDBM().is_online(next.getId())) {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/end.png"))); // NOI18N
            } else {
                g_action.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/start.png"))); // NOI18N
            }

            g_action.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    group_action(next.getId(), g_action);

                }
            });

            JLabel g_des = new javax.swing.JLabel();
            g_des.setForeground(new java.awt.Color(255, 255, 255));
            g_des.setText("<html>" + next.getDescription() + "</html>");

            JLabel g_name = new javax.swing.JLabel();
            g_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            g_name.setForeground(new java.awt.Color(255, 255, 255));
            g_name.setText(next.getName());
            group.add(g_action, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 29));
            group.add(g_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 163, 33));
            group.add(g_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            group_panel.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y, 294, 90));

            y += 110;
        }

    }

    public void group_action(int chat_id, JLabel g_action) {

        File btn_icon = new File("");
        String abspath = btn_icon.getAbsolutePath();

        if (DBManager.getDBM().is_online(chat_id)) {
            DBManager.getDBM().put_offline(chat_id);
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\start.png");
            g_action.setIcon(icon);
        } else if (DBManager.getDBM().put_online(chat_id)) {
            ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\end.png");
            g_action.setIcon(icon);

            //start chat server and nofify observers
            start_server(chat_id);

        }
    }

    int y1 = 13;

    public void load_client_groups() {

        List chats = DBManager.getDBM().get_chats();

        client_groups_panel.removeAll();

        for (Iterator iterator = chats.iterator(); iterator.hasNext();) {
            Groups next = (Groups) iterator.next();

            JPanel client_grp_panel = new javax.swing.JPanel();
            client_grp_panel.setBackground(new java.awt.Color(39, 51, 67));
            client_grp_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            client_grp_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            client_grp_panel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    enter_to_chat(next.getId());

                }
            });

            boolean is_sub = false;
//            try {
//                is_sub = chat.is_subscribed(me.getId());
//                System.out.println(is_sub);
//            } catch (RemoteException ex) {
//                System.out.println(ex);
//            }

            JLabel subscribe = new javax.swing.JLabel();

            if (is_sub) {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/unsubscribe.png"))); // NOI18N
            } else {
                subscribe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/subscribe.png"))); // NOI18N
            }

            if (next.getStatus() == 1) {
                subscribe.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        subscribe_action(next.getId(), subscribe);

                    }
                });

            } else {
                subscribe.setEnabled(false);
                subscribe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }

            JLabel grp_dec = new javax.swing.JLabel();
            grp_dec.setForeground(new java.awt.Color(255, 255, 255));
            grp_dec.setText(next.getDescription());

            JLabel statuts_txt = new javax.swing.JLabel();
            statuts_txt.setBackground(new java.awt.Color(28, 36, 47));
            statuts_txt.setForeground(new java.awt.Color(255, 255, 255));

            JLabel statuts_icon = new javax.swing.JLabel();

            if (next.getStatus() == 1) {
                statuts_txt.setText("online");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/online.png")));
            } else {
                statuts_txt.setText("offline");
                statuts_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/offline.png")));
            }

            JLabel grp_name = new javax.swing.JLabel();
            grp_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            grp_name.setForeground(new java.awt.Color(255, 255, 255));
            grp_name.setText(next.getName());

            client_grp_panel.add(subscribe, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 42, 99, 35));
            client_grp_panel.add(grp_dec, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 160, 35));
            client_grp_panel.add(statuts_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 13, 51, -1));
            client_grp_panel.add(statuts_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 13, 18, 16));
            client_grp_panel.add(grp_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 160, -1));
            client_groups_panel.add(client_grp_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, y1, 299, 96));

            y1 += 110;

        }

    }

    public void subscribe_action(int grp_id, JLabel sub_btn) {
        try {
            File btn_icon = new File("");
            String abspath = btn_icon.getAbsolutePath();

            if (chat.is_subscribed(me.getId())) {
                chat.unsubscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\subscribe.png");
                sub_btn.setIcon(icon);
            } else {
                chat.subscribre(grp_id, me);
                ImageIcon icon = new ImageIcon(abspath + "\\src\\app\\images\\unsubscribe.png");
                sub_btn.setIcon(icon);
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }

    static int enterd_grup_id;
    public void enter_to_chat(int grup_id) {
        try {
            if (chat.is_subscribed(me.getId())) {
                chat_body_default();
                enterd_grup_id = grup_id;
                retrivemsg.start();
            }

        } catch (RemoteException ex) {
            System.out.println(ex);
        }
    }


    private void signin_bttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signin_bttnMouseClicked

        String user_name = uname.getText();
        String user_pwd = password.getText();

        ArrayList<String> error = validatelogin(user_name, user_pwd);

        if (error.isEmpty() == false) {
            signin_errorMsg.setText(error.get(0));
        } else {

            List data = DBManager.getDBM().login(user_name, user_pwd);
            Iterator i = data.iterator();
            if (i.hasNext()) {
                User user = (User) i.next();
                if (user.getRoleId() == 1) {
                    //admin
                    System.out.println(user.getUsername());
                    //setting_default();

                    load_group(true);
                    admin_default();

                } else {
                    //client
                    chat_list_default();

                    //read client image
//                BufferedImage Imgavatar;
//                ImageIcon avatar = null;
//
//                try {
//                    ByteArrayInputStream bis = new ByteArrayInputStream(user.getAvatar());
//                    Imgavatar = ImageIO.read(bis);
//                    if (Imgavatar!= null) {
//                        avatar = new ImageIcon(Imgavatar);
//                    }
//                } catch (IOException ex) {
//                    System.out.println(ex);
//                }
                    me = new ChatClient(user.getId(), user.getUsername(), user.getNickname(), user.getEmail());
                    //start client
                    load_client_groups();
                    this.start_client();
                }

                this.id = user.getId();
                updateNickName.setText(user.getNickname());
                updateMail.setText(user.getEmail());
//           update_profile_pic.setText(user.getAvatar());

            } else {
                System.out.println("Username or Password Incorrect");
                signin_errorMsg.setText("Username or Password Incorrect");
            }

        }


    }//GEN-LAST:event_signin_bttnMouseClicked


    private void Register_bttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_bttnMouseClicked
        signup_default();

        //get data from text boxes
        String email = register_email.getText();
        String username = register_uname.getText();
        String nickname = reg_nickname.getText();
        String password = register_password.getText();

        //error array
        ArrayList<String> error = validateform(email, username, nickname, password);

        if (error.isEmpty() == false) {
            reg_error.setText(error.get(0));
        } else {
            reg_error.setText(null);
            //intsert details
            byte[] img = null;
            ImageIcon avatar = (ImageIcon) user_profilePic.getIcon();
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
                reg_error.setText("User created!");
            }

        }


    }//GEN-LAST:event_Register_bttnMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void setting_icoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_icoMouseClicked
        update_default();
    }//GEN-LAST:event_setting_icoMouseClicked

    private void chatlist_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatlist_settingMouseClicked
        update_default();
    }//GEN-LAST:event_chatlist_settingMouseClicked

    private void home_link_hover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_link_hover1ActionPerformed

    }//GEN-LAST:event_home_link_hover1ActionPerformed

    private void update_profillePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_profillePicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_profillePicMouseClicked

    private void updateMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateMailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMailFocusLost

    private void updateMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMailMouseClicked

    private void updateNickNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateNickNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNickNameFocusLost

    private void updateNickNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateNickNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNickNameMouseClicked

    private void register_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_signInMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_register_signInMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        chatlist_default();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void changePwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePwdMouseClicked
        chang_password_default();
    }//GEN-LAST:event_changePwdMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String current_password = old_pwd.getText().trim();
        DBManager.getDBM().chang_pwd(current_password);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        String email = updateMail.getText().trim();
        String nickname = updateNickName.getText().trim();
        byte[] update_img = null;

        DBManager.getDBM().update(update_img, email, nickname, id);
        UpdateSuccess_msg.setText("Successful update!");
    }//GEN-LAST:event_updateMouseClicked

    private void createChatBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createChatBttnMouseClicked
        group_create_default();
    }//GEN-LAST:event_createChatBttnMouseClicked

    private void grpName_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grpName_textFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_grpName_textFocusLost

    private void grpName_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grpName_textMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_grpName_textMouseClicked

    private void create_grp_bttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_grp_bttnMouseClicked
        String gname = grpName_text.getText();
        String gdec = g_dec_textArea.getText();

        if (DBManager.getDBM().create_chat(gname, gdec)) {
            grp_states.setText("Chat Group created!");
        } else {
            grp_states.setText("Could not create!");
        }


    }//GEN-LAST:event_create_grp_bttnMouseClicked

    private void logout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout3MouseClicked
        signin_default();
    }//GEN-LAST:event_logout3MouseClicked

    private void logout4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout4MouseClicked
        signin_default();
    }//GEN-LAST:event_logout4MouseClicked

    private void client_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_client_logout1MouseClicked
        signin_default();
    }//GEN-LAST:event_client_logout1MouseClicked

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        signin_default();
    }//GEN-LAST:event_settingMouseClicked

    private void clients_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clients_logoutMouseClicked
        signin_default();
    }//GEN-LAST:event_clients_logoutMouseClicked

    private void back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseClicked
        load_group(false);
        admin_default();
    }//GEN-LAST:event_back2MouseClicked

    private void send_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_iconMouseClicked
        this.sender();

    }//GEN-LAST:event_send_iconMouseClicked

    private void typerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.sender();
        }

    }//GEN-LAST:event_typerKeyPressed

    private void send_iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_send_iconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_send_iconMouseEntered

    private void login_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_signupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_signupActionPerformed

    private void register_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_unameActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_register_unameActionPerformed

    private void fpwd_recoveryCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpwd_recoveryCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpwd_recoveryCodeActionPerformed

    private void updateMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMailActionPerformed

    private void register_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_passwordActionPerformed

    public void sender() {
        String m = typer.getText();
        if (m.equalsIgnoreCase("bye")) {
            signin_default();
        } else {

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String time_now = myDateObj.format(myFormatObj);

            Message msg = new Message();
            msg.setGroup_id(enterd_grup_id);
            msg.setMsgid(msg.hashCode());
            msg.setUserid(me.getId());
            msg.setName(me.getUsername());
            msg.setMessage(m);
            msg.setDate_time(time_now);

            try {
                chat.send_message(msg);
                typer.setText("");
            } catch (RemoteException ex) {
                System.out.println(ex);
            }
        }

    }

    public void signin_default() {
        signin_panel.setVisible(true);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        password.setEchoChar((char) 0);
        openEye_icon.setVisible(true);
        closeEye_icon.setVisible(false);

    }

    public void signup_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(true);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);

        register_password.setEchoChar((char) 0);
        reg_OpenEye.setVisible(true);
        reg_closeEye.setVisible(false);

    }

    public void forgot_password_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        forgot_password_panel.setVisible(true);
    }

    public void chang_password_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_pwd_panel.setVisible(true);
    }

    public void chat_list_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void chat_body_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(true);
    }

//    public void setting_default() {
//        signin_panel.setVisible(false);
//        signup_panel.setVisible(false);
//        forgot_password_panel.setVisible(false);
//        chat_list_panel.setVisible(false);
//        chat_body_panel.setVisible(false);
//        update_pwd_panel.setVisible(false);
//        update_panel.setVisible(false);
//        admin_panel.setVisible(false);
//        setting_panel.setVisible(true);
//    }
    public void update_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        update_panel.setVisible(true);
    }

    public void chatlist_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        chat_list_panel.setVisible(true);
    }

    public void admin_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        group_create_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        admin_panel.setVisible(true);
    }

    public void group_create_default() {
        signin_panel.setVisible(false);
        signup_panel.setVisible(false);
        forgot_password_panel.setVisible(false);
        chat_list_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        setting_panel.setVisible(false);
        update_pwd_panel.setVisible(false);
        update_panel.setVisible(false);
        admin_panel.setVisible(false);
        chat_body_panel.setVisible(false);
        group_create_panel.setVisible(true);
    }

    public ArrayList<String> validateform(String email, String username, String nickname, String password) {

        ArrayList<String> errors = new ArrayList<String>();

        if (email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$") == false) {
            errors.add("Invalid email");
        }

        if ("Username".equals(username) || "".equals(username)) {
            errors.add("Username is requird");
        }

        if ("Password".equals(password) || "".equals(password)) {
            errors.add("Password is requird");
        }

        if (password.length() < 7) {
            errors.add("Password must contain more than 8 characters");
        }

        if ("Nick name".equals(nickname) || "".equals(nickname)) {
            errors.add("Nickname is requird");
        }

        return errors;
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

    public BufferedImage ImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return bi;
    }

    public ImageIcon toImageIcon(byte[] img) {
        BufferedImage Imgavatar;
        ImageIcon avatar = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(img);
            Imgavatar = ImageIO.read(bis);
            if (Imgavatar != null) {
                avatar = new ImageIcon(Imgavatar);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return avatar;
    }

    public void start_client() {

        try {
            reg = LocateRegistry.getRegistry("localhost", 2123);
            chat = (Chat) reg.lookup("ChatAdmin");

        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex);
        }

    }

    int y2 = 210;

    public void recive_msg_handler(Message msg) {

        chat_bg.repaint();
        chat_bg.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(28, 36, 47));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();

        msg_layer.setBackground(
                new java.awt.Color(54, 63, 77));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(
                new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));
        msg_layer.add(msg_name,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 210, -1));
        msg_layer.add(msg_dp,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 35, 35));

//        chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_bg.add(msg_layer,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        chat_bg.repaint();
        chat_bg.revalidate();

        JScrollBar sb = msgWall.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        y2 += 120;

    }

    public void send_msg_handler(Message msg) {

        chat_bg.repaint();
        chat_bg.revalidate();

        JLabel msg_content = new javax.swing.JLabel();
        msg_content.setForeground(new java.awt.Color(255, 255, 255));
        msg_content.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_content.setText("<html>" + msg.getMessage() + "</html>");

        JLabel msg_time = new javax.swing.JLabel();
        msg_time.setForeground(new java.awt.Color(255, 255, 255));
        msg_time.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_time.setText(msg.getDate_time());

        JLabel msg_name = new javax.swing.JLabel();
        msg_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg_name.setForeground(new java.awt.Color(255, 255, 255));
        msg_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        msg_name.setText(msg.getName());

        JLabel msg_dp = new javax.swing.JLabel();
        msg_dp.setBackground(new java.awt.Color(54, 63, 77));

        List data = DBManager.getDBM().get_avatart(msg.getUserid());
        Iterator i = data.iterator();
        if (i.hasNext()) {
            User user = (User) i.next();
            ImageIcon iconresized = new ImageIcon(toImageIcon(user.getAvatar()).getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
            msg_dp.setIcon(iconresized);
        }

        JPanel msg_layer = new javax.swing.JPanel();
        msg_layer.setBackground(new java.awt.Color(42, 50, 61));
        msg_layer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        msg_layer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_layer.add(msg_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, 40));
        msg_layer.add(msg_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));
        msg_layer.add(msg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));
        msg_layer.add(msg_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 35, 35));

        //chat_background.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, 110));
        chat_bg.add(msg_layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, y2, 280, 110));

        JScrollBar sb = msgWall.getVerticalScrollBar();
        sb.setValue(sb.getMaximum());

        chat_bg.repaint();
        chat_bg.revalidate();

        y2 += 120;
    }

    Thread retrivemsg = new Thread() {
        public void run() {

            int preiv = 0;

            while (true) {
                try {

                    Message nmsg = chat.broadcast();
                    if (nmsg != null) {
                        if (preiv != nmsg.getMsgid()) {
                            //System.out.println(nmsg.getDate_time() + "\t" + nmsg.getName() + " : " + nmsg.getMessage() + "\n");

                            System.out.println(nmsg.getMsgid() + "-" + me.getId());
                            if (nmsg.getUserid() == me.getId()) {
                                send_msg_handler(nmsg);
                            } else {
                                recive_msg_handler(nmsg);
                            }

                            preiv = nmsg.getMsgid();
                        }
                    }

//                    if(newmsg!=preiv){
//                        System.out.println(chat.broadcast().getMessage());
//                        preiv = newmsg;
//                    }
                    Thread.sleep(100);
                } catch (RemoteException | NullPointerException ex) {
                    System.out.println(ex);
                } catch (InterruptedException ex) {

                }
            }

        }
    };

    public void start_server(int g_id) {
        try {
            Chat chat = new ChatService(g_id);
            Registry reg = LocateRegistry.createRegistry(2123);
            reg.bind("ChatAdmin", chat);

            System.out.println("Chat server is running...");

        } catch (RemoteException | AlreadyBoundException e) {
            System.out.println("Exception ocured : " + e.getMessage());
        }
    }

//    public static String encodeToString(BufferedImage image, String type) {
//        String imageString = null;
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//
//        try {
//            ImageIO.write(image, type, bos);
//            byte[] imageBytes = bos.toByteArray();
//
//            BASE64Encoder encoder = new BASE64Encoder();
//            imageString = encoder.encode(imageBytes);
//
//            bos.close();
//        } catch (IOException e) {
//
//        }
//        return imageString;
//    }
//    public static BufferedImage decodeToImage(String imageString) {
//
//        BufferedImage image = null;
//        byte[] imageByte;
//        try {
//            BASE64Decoder decoder = new BASE64Decoder();
//            imageByte = decoder.decodeBuffer(imageString);
//            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
//            image = ImageIO.read(bis);
//            bis.close();
//        } catch (Exception e) {
//
//        }
//        return image;
//    }
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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppLogo;
    private javax.swing.JLabel Register_bttn;
    private javax.swing.JLabel UpdateSuccess_msg;
    private javax.swing.JLabel _copyrights1;
    private javax.swing.JLabel _copyrights3;
    private javax.swing.JLabel adminFoo;
    private javax.swing.JLabel admin_errorMsg;
    private javax.swing.JPanel admin_panel;
    private javax.swing.JLabel back2;
    private javax.swing.JLabel changePwd;
    private javax.swing.JPanel chat_bg;
    private javax.swing.JPanel chat_body_panel;
    private javax.swing.JPanel chat_list_panel;
    private javax.swing.JScrollPane chat_list_wall;
    private javax.swing.JLabel chatlist_setting;
    private javax.swing.JLabel chatlist_title;
    private javax.swing.JLabel chatlists_title;
    private javax.swing.JPanel client_groups_panel;
    private javax.swing.JLabel client_logout1;
    private javax.swing.JLabel clients_logout;
    private javax.swing.JLabel close;
    private javax.swing.JLabel closeEye_icon;
    private javax.swing.JTextField confirm_pwd;
    private javax.swing.JLabel copyrights4;
    private javax.swing.JLabel createChatBttn;
    private javax.swing.JLabel create_grp_bttn;
    private javax.swing.JTextField forgot_pass;
    private javax.swing.JTextField forgot_pass_hover;
    private javax.swing.JPanel forgot_password_panel;
    private javax.swing.JLabel fpwd_confirmBttn;
    private javax.swing.JLabel fpwd_copyrights;
    private javax.swing.JLabel fpwd_des;
    private javax.swing.JLabel fpwd_error;
    private javax.swing.JLabel fpwd_footer;
    private javax.swing.JLabel fpwd_logo;
    private javax.swing.JTextField fpwd_recoveryCode;
    private javax.swing.JLabel fpwd_recoveryCodeLine;
    private javax.swing.JTextField fpwd_signin;
    private javax.swing.JTextField fpwd_signin_link_hover;
    private javax.swing.JTextArea g_dec_textArea;
    private javax.swing.JScrollPane groupWall;
    private javax.swing.JPanel group_create_panel;
    private javax.swing.JPanel group_panel;
    private javax.swing.JLabel grpDes;
    private javax.swing.JLabel grpName;
    private javax.swing.JTextField grpName_text;
    private javax.swing.JLabel grp_states;
    private javax.swing.JTextField home_link_hover1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLayeredPane layered_pane;
    private javax.swing.JTextField login_signup;
    private javax.swing.JTextField login_signup_hover;
    private javax.swing.JLabel logout3;
    private javax.swing.JLabel logout4;
    private javax.swing.JLabel minimize;
    private javax.swing.JScrollPane msgWall;
    private javax.swing.JTextField new_pwd;
    private javax.swing.JTextField old_pwd;
    private javax.swing.JLabel openEye_icon;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel pwd_icon;
    private javax.swing.JLabel pwd_line;
    private javax.swing.JLabel reg_OpenEye;
    private javax.swing.JLabel reg_closeEye;
    private javax.swing.JLabel reg_error;
    private javax.swing.JTextField reg_nickname;
    private javax.swing.JLabel reg_nickname_line;
    private javax.swing.JLabel reg_password_line;
    private javax.swing.JLabel register_copyrights;
    private javax.swing.JTextField register_email;
    private javax.swing.JLabel register_email_line;
    private javax.swing.JLabel register_footer;
    private javax.swing.JLabel register_nick_line1;
    private javax.swing.JPasswordField register_password;
    private javax.swing.JTextField register_signIn;
    private javax.swing.JTextField register_signIn_hover;
    private javax.swing.JTextField register_uname;
    private javax.swing.JLabel register_uname_line;
    private javax.swing.JLabel register_username_line1;
    private javax.swing.JLabel resendCode_Bttn;
    private javax.swing.JLabel role;
    private javax.swing.JLabel send_icon;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel setting_ico;
    private javax.swing.JLabel setting_lable;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel signin_bttn;
    private javax.swing.JLabel signin_copyrights;
    private javax.swing.JLabel signin_errorMsg;
    private javax.swing.JLabel signin_footer;
    private javax.swing.JPanel signin_panel;
    private javax.swing.JLabel signup_email_line1;
    private javax.swing.JLabel signup_footer3;
    private javax.swing.JPanel signup_panel;
    private javax.swing.JLabel successMsg;
    private javax.swing.JLabel success_msg1;
    private javax.swing.JPanel title_panel;
    private javax.swing.JLabel topbar;
    private javax.swing.JTextField typer;
    private javax.swing.JLabel u_line2;
    private javax.swing.JLabel uline;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel uname_icon;
    private javax.swing.JLabel uname_line;
    private javax.swing.JLabel uname_line1;
    private javax.swing.JLabel und_line2;
    private javax.swing.JLabel update;
    private javax.swing.JTextField updateMail;
    private javax.swing.JTextField updateNickName;
    private javax.swing.JLabel updatePwd_footer1;
    private javax.swing.JLabel update_copyrights2;
    private javax.swing.JLabel update_footer2;
    private javax.swing.JPanel update_panel;
    private javax.swing.JLabel update_profillePic;
    private javax.swing.JPanel update_pwd_panel;
    private javax.swing.JLabel user_profilePic;
    // End of variables declaration//GEN-END:variables
}
