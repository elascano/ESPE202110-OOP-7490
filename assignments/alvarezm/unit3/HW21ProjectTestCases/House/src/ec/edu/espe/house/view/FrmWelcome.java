
package ec.edu.espe.house.view;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class FrmWelcome extends javax.swing.JFrame {

  
    public FrmWelcome() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRegister = new javax.swing.JPanel();
        BtnAddUser = new javax.swing.JButton();
        lblChooseUser = new javax.swing.JLabel();
        lblRegisterUser = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblControlTheHouse = new javax.swing.JLabel();
        jpnControl = new javax.swing.JPanel();
        BtnAddUser1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAddUser.setBackground(new java.awt.Color(153, 255, 204));
        BtnAddUser.setText("Add User");
        BtnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddUserActionPerformed(evt);
            }
        });

        lblChooseUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChooseUser.setText("Choose these option to create a Data Base of House's users");

        javax.swing.GroupLayout jpnRegisterLayout = new javax.swing.GroupLayout(jpnRegister);
        jpnRegister.setLayout(jpnRegisterLayout);
        jpnRegisterLayout.setHorizontalGroup(
            jpnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChooseUser)
                .addGap(81, 81, 81)
                .addComponent(BtnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRegisterLayout.setVerticalGroup(
            jpnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseUser)
                    .addComponent(BtnAddUser))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblRegisterUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegisterUser.setForeground(new java.awt.Color(0, 153, 153));
        lblRegisterUser.setText("REGISTER TO NEW USERS");

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(51, 0, 255));
        lblWelcome.setText("WELCOME");

        lblControlTheHouse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblControlTheHouse.setForeground(new java.awt.Color(0, 204, 0));
        lblControlTheHouse.setText("CONTROL THE HOUSE");

        BtnAddUser1.setBackground(new java.awt.Color(0, 204, 0));
        BtnAddUser1.setText("Control");
        BtnAddUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddUser1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Choose these option to control the devices and rooms of the house");

        javax.swing.GroupLayout jpnControlLayout = new javax.swing.GroupLayout(jpnControl);
        jpnControl.setLayout(jpnControlLayout);
        jpnControlLayout.setHorizontalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(64, 64, 64)
                .addComponent(BtnAddUser1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnControlLayout.setVerticalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(BtnAddUser1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnExit.setBackground(new java.awt.Color(255, 153, 153));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnReturn.setBackground(new java.awt.Color(102, 204, 255));
        BtnReturn.setText("Return");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegisterUser)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblWelcome))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblControlTheHouse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome)
                .addGap(32, 32, 32)
                .addComponent(lblRegisterUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lblControlTheHouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExit)
                    .addComponent(BtnReturn))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddUserActionPerformed

        this.setVisible(false);
        new FrmAddUser().setVisible(true);
    }//GEN-LAST:event_BtnAddUserActionPerformed

    private void BtnAddUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddUser1ActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        this.setVisible(false);
        new FrmUser().setVisible(true);
    }//GEN-LAST:event_BtnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmWelcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddUser;
    private javax.swing.JButton BtnAddUser1;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jpnControl;
    private javax.swing.JPanel jpnRegister;
    private javax.swing.JLabel lblChooseUser;
    private javax.swing.JLabel lblControlTheHouse;
    private javax.swing.JLabel lblRegisterUser;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
