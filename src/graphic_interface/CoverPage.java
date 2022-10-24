package graphic_interface;

import java.awt.event.ActionEvent;

public class CoverPage extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int screenX, screenY;
    
    public CoverPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        actionsBar = new javax.swing.JPanel();
        closeProgram = new javax.swing.JLabel();
        minimizeProgram = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        nextButton = new javax.swing.JPanel();
        loginButtonText = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setName("CoverPageFrame"); // NOI18N
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

        closeProgram.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        closeProgram.setForeground(java.awt.Color.red);
        closeProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeProgram.setText("X");
        closeProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeProgramMouseClicked(evt);
            }
        });

        minimizeProgram.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        minimizeProgram.setForeground(new java.awt.Color(102, 102, 102));
        minimizeProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeProgram.setText("-");

        javax.swing.GroupLayout actionsBarLayout = new javax.swing.GroupLayout(actionsBar);
        actionsBar.setLayout(actionsBarLayout);
        actionsBarLayout.setHorizontalGroup(
            actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsBarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(closeProgram)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );
        actionsBarLayout.setVerticalGroup(
            actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeProgram)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(actionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 25));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 150));

        companyName.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyName.setText("CASANASBANK");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 290, -1));

        nextButton.setBackground(new java.awt.Color(255, 255, 255));

        loginButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        loginButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButtonText.setText("CONTINUAR");
        loginButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nextButtonLayout = new javax.swing.GroupLayout(nextButton);
        nextButton.setLayout(nextButtonLayout);
        nextButtonLayout.setHorizontalGroup(
            nextButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextButtonLayout.createSequentialGroup()
                .addComponent(loginButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nextButtonLayout.setVerticalGroup(
            nextButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nextButtonLayout.createSequentialGroup()
                .addComponent(loginButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, 35));

        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        mainPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 350));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonTextMouseClicked
        MainActions mainActions = new MainActions();
        mainActions.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonTextMouseClicked

    private void closeProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeProgramMouseClicked

    private void actionsBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionsBarMouseDragged
        screenX = evt.getXOnScreen();
        screenY = evt.getYOnScreen();
        this.setLocation(screenX - mouseX, screenY - mouseY);
    }//GEN-LAST:event_actionsBarMouseDragged

    private void actionsBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actionsBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_actionsBarMousePressed

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
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoverPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoverPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsBar;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel closeProgram;
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel loginButtonText;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeProgram;
    private javax.swing.JPanel nextButton;
    // End of variables declaration//GEN-END:variables
}
