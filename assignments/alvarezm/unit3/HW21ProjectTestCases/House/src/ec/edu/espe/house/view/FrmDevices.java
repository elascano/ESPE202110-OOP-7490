
package ec.edu.espe.house.view;

import javax.swing.JOptionPane;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmDevices extends javax.swing.JFrame {

    /**
     * Creates new form FrmRoom
     */
    public FrmDevices() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        lblDevices = new javax.swing.JLabel();
        BtnExitDevice = new javax.swing.JButton();
        BtnReturnDevice = new javax.swing.JButton();
        BtnTelevision = new javax.swing.JButton();
        BtnSoundSystem = new javax.swing.JButton();
        lblTelevisionImage = new javax.swing.JLabel();
        lblSoundSystemImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDevices.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        lblDevices.setForeground(new java.awt.Color(51, 51, 255));
        lblDevices.setText("DEVICES");

        BtnExitDevice.setBackground(new java.awt.Color(255, 153, 153));
        BtnExitDevice.setText("Exit");
        BtnExitDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitDeviceActionPerformed(evt);
            }
        });

        BtnReturnDevice.setBackground(new java.awt.Color(102, 204, 255));
        BtnReturnDevice.setText("Return");
        BtnReturnDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnDeviceActionPerformed(evt);
            }
        });

        BtnTelevision.setBackground(new java.awt.Color(255, 255, 153));
        BtnTelevision.setText("Television");
        BtnTelevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTelevisionActionPerformed(evt);
            }
        });

        BtnSoundSystem.setBackground(new java.awt.Color(255, 255, 153));
        BtnSoundSystem.setText("Sound System");
        BtnSoundSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSoundSystemActionPerformed(evt);
            }
        });

        lblTelevisionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImgTelevision.png"))); // NOI18N

        lblSoundSystemImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1-14_icon-icons.com_69173.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnReturnDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(BtnExitDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblTelevisionImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnTelevision, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSoundSystemImage)
                                .addGap(42, 42, 42)
                                .addComponent(BtnSoundSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblTelevisionImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDevices)
                        .addGap(31, 31, 31)
                        .addComponent(BtnTelevision)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSoundSystemImage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BtnSoundSystem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExitDevice)
                    .addComponent(BtnReturnDevice))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnDeviceActionPerformed
        this.setVisible(false); 
        new FrmController().setVisible(true);
    }//GEN-LAST:event_BtnReturnDeviceActionPerformed

    private void BtnTelevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTelevisionActionPerformed
          this.setVisible(false); 
          new FrmTelevision().setVisible(true);
    }//GEN-LAST:event_BtnTelevisionActionPerformed

    private void BtnExitDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitDeviceActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitDeviceActionPerformed

    private void BtnSoundSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSoundSystemActionPerformed
     FrmWelcome FrmWelcome = new FrmWelcome();
     int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the  Sound System?");        //Pregunta
        
        if (result == 0){
              JOptionPane.showMessageDialog(this, "You have turn on the Sound System");   //Mensaje en YES
        }    
        else if (result == 1)

            JOptionPane.showMessageDialog(this, "You have turn off the Sound System");    //Mensaje en NO

    }//GEN-LAST:event_BtnSoundSystemActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmDevices().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExitDevice;
    private javax.swing.JButton BtnReturnDevice;
    private javax.swing.JButton BtnSoundSystem;
    private javax.swing.JButton BtnTelevision;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel lblDevices;
    private javax.swing.JLabel lblSoundSystemImage;
    private javax.swing.JLabel lblTelevisionImage;
    // End of variables declaration//GEN-END:variables
}