package graphic_interface;

public class MainActions extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int screenX, screenY;
    
    public MainActions() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        actionsBar = new javax.swing.JPanel();
        closeProgram = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        minimizeProgram = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        loginButton = new javax.swing.JPanel();
        loginButtonText = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerButtonText = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainActionsFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actionsBar.setBackground(new java.awt.Color(153, 204, 255));
        actionsBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                actionsBarMouseDragged(evt);
            }
        });
        actionsBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                actionsBarMousePressed(evt);
            }
        });
        actionsBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeProgram.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        closeProgram.setForeground(java.awt.Color.red);
        closeProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeProgram.setText("X");
        closeProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramMouseClicked(evt);
            }
        });
        actionsBar.add(closeProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, -1, -1));

        goBack.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        goBack.setForeground(new java.awt.Color(0, 204, 0));
        goBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeIcon.png"))); // NOI18N
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        actionsBar.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2, 30, 20));

        minimizeProgram.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        minimizeProgram.setForeground(new java.awt.Color(102, 102, 102));
        minimizeProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeProgram.setText("-");
        actionsBar.add(minimizeProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 23, -1));

        mainPanel.add(actionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 25));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 150));

        companyName.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyName.setText("CASANASBANK");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 30));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));

        loginButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        loginButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButtonText.setText("LOGIN");
        loginButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginButtonLayout = new javax.swing.GroupLayout(loginButton);
        loginButton.setLayout(loginButtonLayout);
        loginButtonLayout.setHorizontalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginButtonLayout.createSequentialGroup()
                .addComponent(loginButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginButtonLayout.setVerticalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginButtonLayout.createSequentialGroup()
                .addComponent(loginButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 150, 35));

        registerButton.setBackground(new java.awt.Color(255, 255, 255));

        registerButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        registerButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButtonText.setText("REGISTRARME");
        registerButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registerButtonLayout = new javax.swing.GroupLayout(registerButton);
        registerButton.setLayout(registerButtonLayout);
        registerButtonLayout.setHorizontalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerButtonText, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        registerButtonLayout.setVerticalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerButtonLayout.createSequentialGroup()
                .addComponent(registerButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 150, 35));

        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        mainPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 410));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonTextMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonTextMouseClicked

    private void registerButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonTextMouseClicked
        CreateUser createUser = new CreateUser();
        createUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerButtonTextMouseClicked

    private void closeProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeProgramMouseClicked

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        CoverPage coverPage = new CoverPage();
        coverPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goBackMouseClicked

    private void actionsBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionsBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_actionsBarMousePressed

    private void actionsBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionsBarMouseDragged
        screenX = evt.getXOnScreen();
        screenY = evt.getYOnScreen();
        this.setLocation(screenX - mouseX, screenY - mouseY);
    }//GEN-LAST:event_actionsBarMouseDragged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainActions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsBar;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel closeProgram;
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel loginButton;
    private javax.swing.JLabel loginButtonText;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeProgram;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerButtonText;
    // End of variables declaration//GEN-END:variables
}
