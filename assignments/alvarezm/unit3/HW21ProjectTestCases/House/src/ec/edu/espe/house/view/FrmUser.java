
package ec.edu.espe.house.view;

import javax.swing.JOptionPane;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmUser extends javax.swing.JFrame {

 
    public FrmUser() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnEnterToTheSystem = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        TxtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        PswPassword = new javax.swing.JPasswordField();
        lblEnterToTheSystem = new javax.swing.JLabel();
        lblHouseSystem = new javax.swing.JLabel();
        lblHouseImage = new javax.swing.JLabel();
        mnuHouse = new javax.swing.JMenuBar();
        MnuHouseSystem = new javax.swing.JMenu();
        ItmAbout = new javax.swing.JMenuItem();
        ItmExit = new javax.swing.JMenuItem();
        MnuGroup1 = new javax.swing.JMenu();
        ItmStudents = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUser.setText("User:");

        BtnLogin.setBackground(new java.awt.Color(255, 255, 0));
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 153, 153));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        TxtUserName.setBackground(new java.awt.Color(255, 255, 204));

        lblPassword.setText("Password:");

        PswPassword.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPassword)
                            .addComponent(lblUser))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtUserName)
                            .addComponent(PswPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(TxtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(PswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogin)
                    .addComponent(BtnExit))
                .addContainerGap())
        );

        lblEnterToTheSystem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnterToTheSystem.setText("ENTER TO THE SYSTEM");

        javax.swing.GroupLayout jpnEnterToTheSystemLayout = new javax.swing.GroupLayout(jpnEnterToTheSystem);
        jpnEnterToTheSystem.setLayout(jpnEnterToTheSystemLayout);
        jpnEnterToTheSystemLayout.setHorizontalGroup(
            jpnEnterToTheSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEnterToTheSystemLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jpnEnterToTheSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEnterToTheSystemLayout.createSequentialGroup()
                        .addComponent(lblEnterToTheSystem)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEnterToTheSystemLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jpnEnterToTheSystemLayout.setVerticalGroup(
            jpnEnterToTheSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEnterToTheSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnterToTheSystem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHouseSystem.setBackground(new java.awt.Color(51, 51, 255));
        lblHouseSystem.setFont(new java.awt.Font("Wide Latin", 2, 18)); // NOI18N
        lblHouseSystem.setForeground(new java.awt.Color(51, 51, 255));
        lblHouseSystem.setText("HOUSE SYSTEM");

        lblHouseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_house_10811.png"))); // NOI18N

        MnuHouseSystem.setText("House System");

        ItmAbout.setText("About");
        ItmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAboutActionPerformed(evt);
            }
        });
        MnuHouseSystem.add(ItmAbout);

        ItmExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ItmExit.setText("Exit");
        ItmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmExitActionPerformed(evt);
            }
        });
        MnuHouseSystem.add(ItmExit);

        mnuHouse.add(MnuHouseSystem);

        MnuGroup1.setText("Group1");
        MnuGroup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuGroup1ActionPerformed(evt);
            }
        });

        ItmStudents.setText("Students");
        ItmStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmStudentsActionPerformed(evt);
            }
        });
        MnuGroup1.add(ItmStudents);

        mnuHouse.add(MnuGroup1);

        setJMenuBar(mnuHouse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHouseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHouseSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpnEnterToTheSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHouseSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHouseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnEnterToTheSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean alreadyDisposed=false;
    private void ItmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmExitActionPerformed
        if(this.isDisplayable()){
         alreadyDisposed = true;
         this.dispose();
     }
    }//GEN-LAST:event_ItmExitActionPerformed

    private void MnuGroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuGroup1ActionPerformed

    }//GEN-LAST:event_MnuGroup1ActionPerformed

    private void ItmStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmStudentsActionPerformed
        JOptionPane.showMessageDialog(this, "***STUDENTS LIST***\nAlmache Litardo Anderson Moises\n" +
        "Altamirano Benalcazar Cristhian Alexander\n" +
        "Alvarez Ramirez Michelle Estefania\n" +
        "Andrade Carate Alan Damian\n" +
        "Andrango Espinosa Alex Paul");
    }//GEN-LAST:event_ItmStudentsActionPerformed

    private void ItmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAboutActionPerformed
        JOptionPane.showMessageDialog(this, "The main house functions that can be controlled are the following:\n\n" + 
        "Open and close the doors\n" +
        "Turn on and off the lights in each room\n" +
        "Turn on and off the television\n" +
        "Turn on and off the sound system\n" +
        "Activate and deactivate an alarm signal in emergencies");
    
    }//GEN-LAST:event_ItmAboutActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        String User = "group1";
        String Password = "group1";

        String Pass = new String(PswPassword.getPassword());          

        if(TxtUserName.getText().equals(User)&&Pass.equals(Password)){    
            FrmWelcome C1 = new FrmWelcome();                   
            C1.setVisible(true);
            dispose();

        }else{
            JOptionPane.showMessageDialog(this, "User or Password incorrect. Please Try again.");
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JMenuItem ItmAbout;
    private javax.swing.JMenuItem ItmExit;
    private javax.swing.JMenuItem ItmStudents;
    private javax.swing.JMenu MnuGroup1;
    private javax.swing.JMenu MnuHouseSystem;
    private javax.swing.JPasswordField PswPassword;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpnEnterToTheSystem;
    private javax.swing.JLabel lblEnterToTheSystem;
    private javax.swing.JLabel lblHouseImage;
    private javax.swing.JLabel lblHouseSystem;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar mnuHouse;
    // End of variables declaration//GEN-END:variables
}
