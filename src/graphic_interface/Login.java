package graphic_interface;

import main.Client;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int screenX, screenY;
    
    public Login() {
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
        usrIDInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JTextField();
        loginButton = new javax.swing.JPanel();
        loginButtonText = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("LoginFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
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

        goBack.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        goBack.setForeground(new java.awt.Color(0, 204, 0));
        goBack.setText("<");
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
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
                .addComponent(goBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 214, Short.MAX_VALUE))
        );
        actionsBarLayout.setVerticalGroup(
            actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeProgram)
                .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(actionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 25));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 150));

        companyName.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyName.setText("CASANASBANK");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 30));

        usrIDInput.setBackground(new java.awt.Color(51, 153, 255));
        usrIDInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        usrIDInput.setForeground(new java.awt.Color(255, 255, 255));
        usrIDInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usrIDInput.setText("INGRESE SU CEDULA");
        usrIDInput.setBorder(null);
        usrIDInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usrIDInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usrIDInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usrIDInputMouseExited(evt);
            }
        });
        mainPanel.add(usrIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 170, 30));

        passwordInput.setBackground(new java.awt.Color(51, 153, 255));
        passwordInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        passwordInput.setForeground(new java.awt.Color(255, 255, 255));
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setText("INGRESE SU CONTRASEÑA");
        passwordInput.setBorder(null);
        passwordInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordInputMouseExited(evt);
            }
        });
        mainPanel.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 170, 30));

        loginButton.setBackground(new java.awt.Color(51, 153, 255));

        loginButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        loginButtonText.setForeground(new java.awt.Color(255, 255, 255));
        loginButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButtonText.setText("INICIAR");
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
            .addComponent(loginButtonText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        loginButtonLayout.setVerticalGroup(
            loginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginButtonText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        mainPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 170, 30));

        backgroundImage.setBackground(new java.awt.Color(255, 255, 255));
        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        mainPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 290, 200));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonTextMouseClicked

        /* Se llama al metodo "validateCredentials" de la clase "Customer". El metodo evalua si lo 
               ingresado es igual al registro en la base de datos, de ser asi el metodo retorna un "1" (EN STRING) 
               y la condicional cambia el setVisible a false para ocultar la ventana "Login".
            
               En caso de que el retorno sea diferente a "1" (EN STRING) se imprime el mensaje "Correo y/o contraseña incorrectos".
         */
        String validationReturn = "";
        Client client = new Client();
        try {
            validationReturn = client.validateCredentials(usrIDInput.getText().trim(), passwordInput.getText().trim());
            if (!validationReturn.equals("1")) {
                JOptionPane.showMessageDialog(null, validationReturn);
            } else {
                this.setVisible(false);
            }
        } catch (SQLException sqle) {
            sqle.getMessage();
        }
    }//GEN-LAST:event_loginButtonTextMouseClicked

    private void usrIDInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrIDInputMouseClicked
        if (usrIDInput.getText().equals("INGRESE SU CEDULA")) {
            usrIDInput.setText("");
        }
    }//GEN-LAST:event_usrIDInputMouseClicked

    private void passwordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordInputMouseClicked
        if (passwordInput.getText().equals("INGRESE SU CONTRASEÑA")) {
            passwordInput.setText("");
        }
    }//GEN-LAST:event_passwordInputMouseClicked

    private void usrIDInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrIDInputMouseExited
        if (usrIDInput.getText().length() < 1) {
            usrIDInput.setText("INGRESE SU CEDULA");
        }
    }//GEN-LAST:event_usrIDInputMouseExited

    private void passwordInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordInputMouseExited
        if (passwordInput.getText().length() < 1) {
            passwordInput.setText("INGRESE SU CONTRASEÑA");
        }
    }//GEN-LAST:event_passwordInputMouseExited

    private void closeProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeProgramMouseClicked

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        MainActions mainActions = new MainActions();
        mainActions.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
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
    private javax.swing.JTextField passwordInput;
    private javax.swing.JTextField usrIDInput;
    // End of variables declaration//GEN-END:variables
}
