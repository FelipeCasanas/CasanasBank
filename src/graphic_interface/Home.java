
package graphic_interface;

import main.Client;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    private int mouseX, mouseY;
    private int screenX, screenY;
    
    public Home() {
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
        bankingActionsLabel = new javax.swing.JLabel();
        addMoney = new javax.swing.JPanel();
        addMoneyText = new javax.swing.JLabel();
        withdrawMoney = new javax.swing.JPanel();
        withdrawMoneyText = new javax.swing.JLabel();
        seeBalance = new javax.swing.JPanel();
        seeBalanceText = new javax.swing.JLabel();
        requestLoan = new javax.swing.JPanel();
        requestLoanButtonText = new javax.swing.JLabel();
        userActionsLabel = new javax.swing.JLabel();
        getUsrID = new javax.swing.JPanel();
        getUsrIDText = new javax.swing.JLabel();
        getUsrName = new javax.swing.JPanel();
        getUsrNameText = new javax.swing.JLabel();
        setUsrName = new javax.swing.JPanel();
        setUsrNameText = new javax.swing.JLabel();
        getCellphoneNumber = new javax.swing.JPanel();
        getCellphoneNumberText = new javax.swing.JLabel();
        setPassword = new javax.swing.JPanel();
        setPasswordText = new javax.swing.JLabel();
        closeSesion = new javax.swing.JPanel();
        closeSesionIcon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("HomeFrame"); // NOI18N
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
                .addGap(0, 545, Short.MAX_VALUE))
        );
        actionsBarLayout.setVerticalGroup(
            actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeProgram)
                .addComponent(minimizeProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(actionsBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 25));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smallLogo.png"))); // NOI18N
        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        companyName.setFont(new java.awt.Font("Signika Negative Light", 1, 36)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyName.setText("CASANASBANK");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        bankingActionsLabel.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        bankingActionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        bankingActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankingActionsLabel.setText("ACCIONES BANCARIAS");
        mainPanel.add(bankingActionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 600, -1));

        addMoney.setBackground(new java.awt.Color(255, 255, 255));

        addMoneyText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        addMoneyText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addMoneyText.setText("DEPOSITAR");
        addMoneyText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMoneyText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMoneyTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addMoneyLayout = new javax.swing.GroupLayout(addMoney);
        addMoney.setLayout(addMoneyLayout);
        addMoneyLayout.setHorizontalGroup(
            addMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMoneyLayout.createSequentialGroup()
                .addComponent(addMoneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addMoneyLayout.setVerticalGroup(
            addMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMoneyLayout.createSequentialGroup()
                .addComponent(addMoneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(addMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 35));

        withdrawMoney.setBackground(new java.awt.Color(255, 255, 255));

        withdrawMoneyText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        withdrawMoneyText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        withdrawMoneyText.setText("RETIRAR");
        withdrawMoneyText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawMoneyText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMoneyTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout withdrawMoneyLayout = new javax.swing.GroupLayout(withdrawMoney);
        withdrawMoney.setLayout(withdrawMoneyLayout);
        withdrawMoneyLayout.setHorizontalGroup(
            withdrawMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawMoneyLayout.createSequentialGroup()
                .addComponent(withdrawMoneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        withdrawMoneyLayout.setVerticalGroup(
            withdrawMoneyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawMoneyLayout.createSequentialGroup()
                .addComponent(withdrawMoneyText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(withdrawMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 35));

        seeBalance.setBackground(new java.awt.Color(255, 255, 255));

        seeBalanceText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        seeBalanceText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seeBalanceText.setText("VER BALANCE");
        seeBalanceText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seeBalanceText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeBalanceTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout seeBalanceLayout = new javax.swing.GroupLayout(seeBalance);
        seeBalance.setLayout(seeBalanceLayout);
        seeBalanceLayout.setHorizontalGroup(
            seeBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeBalanceLayout.createSequentialGroup()
                .addComponent(seeBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        seeBalanceLayout.setVerticalGroup(
            seeBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeBalanceLayout.createSequentialGroup()
                .addComponent(seeBalanceText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(seeBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 35));

        requestLoan.setBackground(new java.awt.Color(255, 255, 255));

        requestLoanButtonText.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        requestLoanButtonText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requestLoanButtonText.setText("PRESTAMO");
        requestLoanButtonText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestLoanButtonText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestLoanButtonTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout requestLoanLayout = new javax.swing.GroupLayout(requestLoan);
        requestLoan.setLayout(requestLoanLayout);
        requestLoanLayout.setHorizontalGroup(
            requestLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestLoanLayout.createSequentialGroup()
                .addComponent(requestLoanButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        requestLoanLayout.setVerticalGroup(
            requestLoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestLoanLayout.createSequentialGroup()
                .addComponent(requestLoanButtonText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(requestLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 130, 35));

        userActionsLabel.setFont(new java.awt.Font("Signika Negative Light", 1, 24)); // NOI18N
        userActionsLabel.setForeground(new java.awt.Color(255, 255, 255));
        userActionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userActionsLabel.setText("ACCIONES DE USUARIO");
        mainPanel.add(userActionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 600, -1));

        getUsrID.setBackground(new java.awt.Color(255, 255, 255));

        getUsrIDText.setFont(new java.awt.Font("Signika Negative Light", 0, 14)); // NOI18N
        getUsrIDText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getUsrIDText.setText("OBTENER CEDULA");
        getUsrIDText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getUsrIDText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getUsrIDTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout getUsrIDLayout = new javax.swing.GroupLayout(getUsrID);
        getUsrID.setLayout(getUsrIDLayout);
        getUsrIDLayout.setHorizontalGroup(
            getUsrIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getUsrIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        getUsrIDLayout.setVerticalGroup(
            getUsrIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getUsrIDLayout.createSequentialGroup()
                .addComponent(getUsrIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(getUsrID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 35));

        getUsrName.setBackground(new java.awt.Color(255, 255, 255));

        getUsrNameText.setFont(new java.awt.Font("Signika Negative Light", 0, 14)); // NOI18N
        getUsrNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getUsrNameText.setText("OBTENER TITULAR");
        getUsrNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getUsrNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getUsrNameTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout getUsrNameLayout = new javax.swing.GroupLayout(getUsrName);
        getUsrName.setLayout(getUsrNameLayout);
        getUsrNameLayout.setHorizontalGroup(
            getUsrNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getUsrNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        getUsrNameLayout.setVerticalGroup(
            getUsrNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getUsrNameLayout.createSequentialGroup()
                .addComponent(getUsrNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(getUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 170, 35));

        setUsrName.setBackground(new java.awt.Color(255, 255, 255));

        setUsrNameText.setFont(new java.awt.Font("Signika Negative Light", 0, 14)); // NOI18N
        setUsrNameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setUsrNameText.setText("CAMBIAR MI NOMBRE");
        setUsrNameText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUsrNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setUsrNameTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout setUsrNameLayout = new javax.swing.GroupLayout(setUsrName);
        setUsrName.setLayout(setUsrNameLayout);
        setUsrNameLayout.setHorizontalGroup(
            setUsrNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setUsrNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        setUsrNameLayout.setVerticalGroup(
            setUsrNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setUsrNameLayout.createSequentialGroup()
                .addComponent(setUsrNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(setUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 180, 35));

        getCellphoneNumber.setBackground(new java.awt.Color(255, 255, 255));

        getCellphoneNumberText.setFont(new java.awt.Font("Signika Negative Light", 0, 14)); // NOI18N
        getCellphoneNumberText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getCellphoneNumberText.setText("OBTENER NUMERO CELULAR");
        getCellphoneNumberText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getCellphoneNumberText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getCellphoneNumberTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout getCellphoneNumberLayout = new javax.swing.GroupLayout(getCellphoneNumber);
        getCellphoneNumber.setLayout(getCellphoneNumberLayout);
        getCellphoneNumberLayout.setHorizontalGroup(
            getCellphoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getCellphoneNumberText, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        getCellphoneNumberLayout.setVerticalGroup(
            getCellphoneNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getCellphoneNumberLayout.createSequentialGroup()
                .addComponent(getCellphoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(getCellphoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 35));

        setPassword.setBackground(new java.awt.Color(255, 255, 255));

        setPasswordText.setFont(new java.awt.Font("Signika Negative Light", 0, 14)); // NOI18N
        setPasswordText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPasswordText.setText("ACTUALIZAR CONTRASEÑA");
        setPasswordText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPasswordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setPasswordTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout setPasswordLayout = new javax.swing.GroupLayout(setPassword);
        setPassword.setLayout(setPasswordLayout);
        setPasswordLayout.setHorizontalGroup(
            setPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setPasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setPasswordLayout.setVerticalGroup(
            setPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setPasswordLayout.createSequentialGroup()
                .addComponent(setPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(setPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 240, 35));

        closeSesion.setBackground(new java.awt.Color(244, 67, 54));

        closeSesionIcon.setFont(new java.awt.Font("Signika Negative Light", 0, 18)); // NOI18N
        closeSesionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeSesionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown (1).png"))); // NOI18N
        closeSesionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeSesionIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeSesionIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout closeSesionLayout = new javax.swing.GroupLayout(closeSesion);
        closeSesion.setLayout(closeSesionLayout);
        closeSesionLayout.setHorizontalGroup(
            closeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeSesionIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        closeSesionLayout.setVerticalGroup(
            closeSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeSesionLayout.createSequentialGroup()
                .addComponent(closeSesionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(closeSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 390, 50, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeBackground.png"))); // NOI18N
        mainPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 20, 640, 430));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeProgramMouseClicked

    private void addMoneyTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMoneyTextMouseClicked
        try {
            Client.addMoney(Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto desea depositar?")));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_addMoneyTextMouseClicked

    private void withdrawMoneyTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMoneyTextMouseClicked
        try {
            Client.withdrawMoney(Double.parseDouble(JOptionPane.showInputDialog("¿Cuanto desea retirar?")));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_withdrawMoneyTextMouseClicked

    private void seeBalanceTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBalanceTextMouseClicked
        Client client = new Client();
        JOptionPane.showMessageDialog(null, "El saldo de la cuenta es: " + client.seeBalance());
    }//GEN-LAST:event_seeBalanceTextMouseClicked

    private void requestLoanButtonTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestLoanButtonTextMouseClicked
        Client client = new Client();
        double toRequest = 0;

        try {
            if (client.getActiveLoan() == 0) {
                toRequest = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuanto desea pedir prestado?"));
            }
            Client.requestLoan(client.seeBalance(), toRequest);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_requestLoanButtonTextMouseClicked

    private void getUsrIDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getUsrIDTextMouseClicked
        Client client = new Client();
        JOptionPane.showMessageDialog(null, client.getUsrID());
    }//GEN-LAST:event_getUsrIDTextMouseClicked

    private void getUsrNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getUsrNameTextMouseClicked
        Client client = new Client();
        JOptionPane.showMessageDialog(null, client.getUsrName().toUpperCase() + " " + client.getUsrLastName().toUpperCase());
    }//GEN-LAST:event_getUsrNameTextMouseClicked

    private void getCellphoneNumberTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getCellphoneNumberTextMouseClicked
        Client client = new Client();
        JOptionPane.showMessageDialog(null, client.getCellphoneNumber());
    }//GEN-LAST:event_getCellphoneNumberTextMouseClicked

    private void setUsrNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setUsrNameTextMouseClicked
        Client client = new Client();
        try {
            client.setUsrName(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_setUsrNameTextMouseClicked

    private void setPasswordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setPasswordTextMouseClicked
        Client client = new Client();
        try {
            client.updatePassword(JOptionPane.showInputDialog("Ingrese la nueva contraseña"), JOptionPane.showInputDialog("Confirme la contraseña"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_setPasswordTextMouseClicked

    private void closeSesionIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeSesionIconMouseClicked
        Client client = new Client();
        try {
            client.closeSesion();
            this.setVisible(false);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_closeSesionIconMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsBar;
    private javax.swing.JPanel addMoney;
    private javax.swing.JLabel addMoneyText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bankingActionsLabel;
    private javax.swing.JLabel closeProgram;
    private javax.swing.JPanel closeSesion;
    private javax.swing.JLabel closeSesionIcon;
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel getCellphoneNumber;
    private javax.swing.JLabel getCellphoneNumberText;
    private javax.swing.JPanel getUsrID;
    private javax.swing.JLabel getUsrIDText;
    private javax.swing.JPanel getUsrName;
    private javax.swing.JLabel getUsrNameText;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeProgram;
    private javax.swing.JPanel requestLoan;
    private javax.swing.JLabel requestLoanButtonText;
    private javax.swing.JPanel seeBalance;
    private javax.swing.JLabel seeBalanceText;
    private javax.swing.JPanel setPassword;
    private javax.swing.JLabel setPasswordText;
    private javax.swing.JPanel setUsrName;
    private javax.swing.JLabel setUsrNameText;
    private javax.swing.JLabel userActionsLabel;
    private javax.swing.JPanel withdrawMoney;
    private javax.swing.JLabel withdrawMoneyText;
    // End of variables declaration//GEN-END:variables
}
