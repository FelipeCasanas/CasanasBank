package graphic_interface;

import main.Client;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreateUser extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int screenX, screenY;
    
    public CreateUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionsBar = new javax.swing.JPanel();
        closeProgram = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        minimizeProgram = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        termsAndConditions = new javax.swing.JCheckBox();
        backgroundImage = new javax.swing.JLabel();
        eventsPanel = new javax.swing.JPanel();
        usrIDInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        cellphoneNumberInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JPasswordField();
        userErrorLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JPanel();
        registerButtonText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("CreateUserFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 524, Short.MAX_VALUE))
        );
        actionsBarLayout.setVerticalGroup(
            actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeProgram)
                .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(actionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 220, 150));

        companyName.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyName.setText("CASANASBANK");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 30));

        termsAndConditions.setFont(new java.awt.Font("Signika Negative Light", 1, 14)); // NOI18N
        termsAndConditions.setForeground(new java.awt.Color(255, 255, 255));
        termsAndConditions.setText("Yo, acepto TYC");
        termsAndConditions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        termsAndConditions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termsAndConditionsMouseClicked(evt);
            }
        });
        mainPanel.add(termsAndConditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 220, 20));
        termsAndConditions.getAccessibleContext().setAccessibleParent(this);

        backgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N
        mainPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 430));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        eventsPanel.setBackground(new java.awt.Color(255, 255, 255));
        eventsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        eventsPanel.add(usrIDInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 30));

        nameInput.setBackground(new java.awt.Color(51, 153, 255));
        nameInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        nameInput.setForeground(new java.awt.Color(255, 255, 255));
        nameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameInput.setText("INGRESE SU NOMBRE");
        nameInput.setBorder(null);
        nameInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nameInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameInputMouseExited(evt);
            }
        });
        eventsPanel.add(nameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 30));

        lastNameInput.setBackground(new java.awt.Color(51, 153, 255));
        lastNameInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        lastNameInput.setForeground(new java.awt.Color(255, 255, 255));
        lastNameInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameInput.setText("INGRESE SU APELLIDO");
        lastNameInput.setBorder(null);
        lastNameInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lastNameInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastNameInputMouseExited(evt);
            }
        });
        eventsPanel.add(lastNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));

        cellphoneNumberInput.setBackground(new java.awt.Color(51, 153, 255));
        cellphoneNumberInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        cellphoneNumberInput.setForeground(new java.awt.Color(255, 255, 255));
        cellphoneNumberInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cellphoneNumberInput.setText("INGRESE SU # CELULAR");
        cellphoneNumberInput.setBorder(null);
        cellphoneNumberInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cellphoneNumberInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellphoneNumberInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cellphoneNumberInputMouseExited(evt);
            }
        });
        eventsPanel.add(cellphoneNumberInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 30));

        emailInput.setBackground(new java.awt.Color(51, 153, 255));
        emailInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        emailInput.setForeground(new java.awt.Color(255, 255, 255));
        emailInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailInput.setText("INGRESE SU CORREO");
        emailInput.setBorder(null);
        emailInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emailInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailInputMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailInputMouseExited(evt);
            }
        });
        eventsPanel.add(emailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 170, 30));

        passwordInput.setBackground(new java.awt.Color(51, 153, 255));
        passwordInput.setFont(new java.awt.Font("Signika Negative Light", 0, 12)); // NOI18N
        passwordInput.setForeground(new java.awt.Color(255, 255, 255));
        passwordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordInput.setText("jPasswordField1");
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
        eventsPanel.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 170, 30));

        userErrorLabel.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        userErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventsPanel.add(userErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 50, -1));

        registerButton.setBackground(new java.awt.Color(51, 153, 255));

        registerButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        registerButtonText.setForeground(new java.awt.Color(255, 255, 255));
        registerButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButtonText.setText("CREAR USUARIO");
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
            .addComponent(registerButtonText, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        registerButtonLayout.setVerticalGroup(
            registerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerButtonText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        eventsPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 170, 30));

        getContentPane().add(eventsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 380, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonTextMouseClicked
        boolean isOk = true;
        Client client = new Client();
        String name = nameInput.getText().toLowerCase().trim();
        String lastName = lastNameInput.getText().toLowerCase().trim();
        String usrID = usrIDInput.getText().toLowerCase().trim();
        String cellphone = cellphoneNumberInput.getText().toLowerCase().trim();
        String email = emailInput.getText().toLowerCase().trim();
        String password = passwordInput.getText().toLowerCase().trim();

        if (name.equals("INGRESE SU NOMBRE")) {
            userErrorLabel.setText("por favor, ingrese su nombre");
            isOk = false;
        }
        if (lastName.equals("INGRESE SU APELLIDO")) {
            userErrorLabel.setText("por favor, ingrese su apellido");
            isOk = false;
        }
        if (usrID.equals("INGRESE SU CEDULA")) {
            userErrorLabel.setText("por favor, ingrese su cedula");
            isOk = false;
        }
        if (cellphone.equals("INGRESE SU # CELULAR")) {
            userErrorLabel.setText("por favor, ingrese su # celular");
            isOk = false;
        }
        if (email.equals("INGRESE SU CORREO")) {
            userErrorLabel.setText("por favor, ingrese su correo");
            isOk = false;
        }
        if (password.equals("INGRESE SU CONTRASEÑA")) {
            userErrorLabel.setText("por favor, ingrese su contraseña");
            isOk = false;
        }

        if (isOk == true) {
            try {
                client.newUser(name, lastName, usrID, cellphone, email, password);
                MainActions mainActions = new MainActions();
                mainActions.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al enviar a cliente");
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            isOk = true;
        }
    }//GEN-LAST:event_registerButtonTextMouseClicked

    private void usrIDInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrIDInputMouseClicked
        if (usrIDInput.getText().equals("INGRESE SU CEDULA")) {
            usrIDInput.setText("");
        }
    }//GEN-LAST:event_usrIDInputMouseClicked

    private void nameInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameInputMouseClicked
        if (nameInput.getText().equals("INGRESE SU NOMBRE")) {
            nameInput.setText("");
        }
    }//GEN-LAST:event_nameInputMouseClicked

    private void lastNameInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameInputMouseClicked
        if (lastNameInput.getText().equals("INGRESE SU APELLIDO")) {
            lastNameInput.setText("");
        }
    }//GEN-LAST:event_lastNameInputMouseClicked

    private void cellphoneNumberInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellphoneNumberInputMouseClicked
        if (cellphoneNumberInput.getText().equals("INGRESE SU # CELULAR")) {
            cellphoneNumberInput.setText("");
        }
    }//GEN-LAST:event_cellphoneNumberInputMouseClicked

    private void emailInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailInputMouseClicked
        if (emailInput.getText().equals("INGRESE SU CORREO")) {
            emailInput.setText("");
        }
    }//GEN-LAST:event_emailInputMouseClicked

    private void usrIDInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrIDInputMouseExited
        if (usrIDInput.getText().length() < 1) {
            usrIDInput.setText("INGRESE SU CEDULA");
        }
    }//GEN-LAST:event_usrIDInputMouseExited

    private void nameInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameInputMouseExited
        if (nameInput.getText().length() < 1) {
            nameInput.setText("INGRESE SU NOMBRE");
        }
    }//GEN-LAST:event_nameInputMouseExited

    private void lastNameInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameInputMouseExited
        if (lastNameInput.getText().length() < 1) {
            lastNameInput.setText("INGRESE SU APELLIDO");
        }
    }//GEN-LAST:event_lastNameInputMouseExited

    private void cellphoneNumberInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellphoneNumberInputMouseExited
        if (cellphoneNumberInput.getText().length() < 1) {
            cellphoneNumberInput.setText("INGRESE SU # CELULAR");
        }
    }//GEN-LAST:event_cellphoneNumberInputMouseExited

    private void emailInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailInputMouseExited
        if (emailInput.getText().length() < 1) {
            emailInput.setText("INGRESE SU CORREO");
        }
    }//GEN-LAST:event_emailInputMouseExited

    private void passwordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordInputMouseClicked
        if (passwordInput.getText().equals("jPasswordField1")) {
            passwordInput.setText("");
        }
    }//GEN-LAST:event_passwordInputMouseClicked

    private void passwordInputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordInputMouseExited
        if (passwordInput.getText().length() < 1) {
            passwordInput.setText("jPasswordField1");
        }
    }//GEN-LAST:event_passwordInputMouseExited

    private void termsAndConditionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termsAndConditionsMouseClicked
        if (termsAndConditions.isSelected()) {
            termsAndConditions.setText("Yo, " + nameInput.getText() + " acepto TYC");
            registerButtonText.setEnabled(true);
        } else {
            termsAndConditions.setText("Yo, acepto TYC");
            registerButtonText.setEnabled(false);
        }
    }//GEN-LAST:event_termsAndConditionsMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsBar;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField cellphoneNumberInput;
    private javax.swing.JLabel closeProgram;
    private javax.swing.JLabel companyName;
    private javax.swing.JTextField emailInput;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JLabel goBack;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeProgram;
    private javax.swing.JTextField nameInput;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JPanel registerButton;
    private javax.swing.JLabel registerButtonText;
    private javax.swing.JCheckBox termsAndConditions;
    private javax.swing.JLabel userErrorLabel;
    private javax.swing.JTextField usrIDInput;
    // End of variables declaration//GEN-END:variables
}
