
package ec.edu.espe.house.view;

import javax.swing.JOptionPane;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmController extends javax.swing.JFrame {


    public FrmController() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnControl = new javax.swing.JPanel();
        BtnDevices = new javax.swing.JButton();
        lblTelevision = new javax.swing.JLabel();
        lblSoundSystem = new javax.swing.JLabel();
        lblKitchen = new javax.swing.JLabel();
        lblLivingRooms = new javax.swing.JLabel();
        lblBedrooms = new javax.swing.JLabel();
        lblBathrooms = new javax.swing.JLabel();
        lblTelevisionImage = new javax.swing.JLabel();
        lblSoundSystemImage = new javax.swing.JLabel();
        BtnRooms = new javax.swing.JButton();
        BtnAlarmSignal = new javax.swing.JButton();
        lblAlarmSignal = new javax.swing.JLabel();
        lblDevices = new javax.swing.JLabel();
        lblRooms = new javax.swing.JLabel();
        lblRoomImage = new javax.swing.JLabel();
        lblLighImage = new javax.swing.JLabel();
        lblWhatDoYouWantToControl = new javax.swing.JLabel();
        btnReturnPrincipalMenu = new javax.swing.JButton();
        BtnExitPrincipalMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnDevices.setBackground(new java.awt.Color(153, 255, 204));
        BtnDevices.setText("Devices");
        BtnDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDevicesActionPerformed(evt);
            }
        });

        lblTelevision.setText("Television");

        lblSoundSystem.setText("Sound System");

        lblKitchen.setText("Kitchen");

        lblLivingRooms.setText("Living Room");

        lblBedrooms.setText("Bedrooms");

        lblBathrooms.setText("Bathroom");

        lblTelevisionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImgTelevision.png"))); // NOI18N

        lblSoundSystemImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon stereo.png"))); // NOI18N

        BtnRooms.setBackground(new java.awt.Color(153, 255, 204));
        BtnRooms.setText("Rooms");
        BtnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRoomsActionPerformed(evt);
            }
        });

        BtnAlarmSignal.setBackground(new java.awt.Color(153, 255, 204));
        BtnAlarmSignal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alarm icon.png"))); // NOI18N
        BtnAlarmSignal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlarmSignalActionPerformed(evt);
            }
        });

        lblAlarmSignal.setText("Alarm Signal");

        lblDevices.setText("Choose this option if you want to controll those devices");

        lblRooms.setText("Choose this option if you want to Turn on / Turn off the light or controlling the doors");

        lblRoomImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImgDoor.png"))); // NOI18N

        lblLighImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bulb_icon-icons.com_74600.png"))); // NOI18N

        javax.swing.GroupLayout jpnControlLayout = new javax.swing.GroupLayout(jpnControl);
        jpnControl.setLayout(jpnControlLayout);
        jpnControlLayout.setHorizontalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addComponent(lblSoundSystem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addComponent(lblSoundSystemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnControlLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(BtnDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(180, 180, 180))
                            .addGroup(jpnControlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLivingRooms)
                                    .addComponent(lblBedrooms))
                                .addGap(33, 33, 33)
                                .addComponent(lblLighImage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKitchen)
                                    .addComponent(lblBathrooms))
                                .addGap(42, 42, 42))))))
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDevices)
                        .addGap(72, 72, 72)
                        .addComponent(lblRooms, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelevision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelevisionImage))
                        .addGap(18, 18, 18)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnControlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblAlarmSignal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnControlLayout.createSequentialGroup()
                                .addComponent(BtnAlarmSignal)
                                .addGap(123, 123, 123)
                                .addComponent(lblRoomImage, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnControlLayout.setVerticalGroup(
            jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDevices)
                    .addComponent(BtnRooms))
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDevices)
                            .addComponent(lblRooms))
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnControlLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblRoomImage, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLighImage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnControlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSoundSystemImage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnAlarmSignal)
                                .addComponent(lblTelevisionImage))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnControlLayout.createSequentialGroup()
                                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblKitchen)
                                    .addComponent(lblLivingRooms))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBedrooms)
                                    .addComponent(lblBathrooms))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSoundSystem)
                    .addGroup(jpnControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAlarmSignal)
                        .addComponent(lblTelevision)))
                .addGap(41, 41, 41))
        );

        lblWhatDoYouWantToControl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblWhatDoYouWantToControl.setText("What do you want to controll ?");

        btnReturnPrincipalMenu.setBackground(new java.awt.Color(102, 204, 255));
        btnReturnPrincipalMenu.setText("Return");
        btnReturnPrincipalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnPrincipalMenuActionPerformed(evt);
            }
        });

        BtnExitPrincipalMenu.setBackground(new java.awt.Color(255, 153, 153));
        BtnExitPrincipalMenu.setText("Exit");
        BtnExitPrincipalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitPrincipalMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnReturnPrincipalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(BtnExitPrincipalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(lblWhatDoYouWantToControl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWhatDoYouWantToControl)
                .addGap(18, 18, 18)
                .addComponent(jpnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnPrincipalMenu)
                    .addComponent(BtnExitPrincipalMenu))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDevicesActionPerformed
          this.setVisible(false); 
          new FrmDevices().setVisible(true);
    }//GEN-LAST:event_BtnDevicesActionPerformed
                                   

    private void BtnRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRoomsActionPerformed
        this.setVisible(false);     
        new FrmRooms().setVisible(true);
    }//GEN-LAST:event_BtnRoomsActionPerformed

    private void BtnAlarmSignalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlarmSignalActionPerformed
     FrmWelcome FrmWelcome = new FrmWelcome();
     int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the  Alarm Signal?");        //Pregunta
        
        if (result == 0){
              JOptionPane.showMessageDialog(this, "You have turn on the Alarm Signal");   //Mensaje en YES
        }    
        else if (result == 1)

            JOptionPane.showMessageDialog(this, "You have turn off the Alarm Signal");    //Mensaje en NO

    }//GEN-LAST:event_BtnAlarmSignalActionPerformed

    private void btnReturnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnPrincipalMenuActionPerformed
        this.setVisible(false); 
        new FrmWelcome().setVisible(true);

    }//GEN-LAST:event_btnReturnPrincipalMenuActionPerformed

    private void BtnExitPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitPrincipalMenuActionPerformed
        System.exit(0);

    }//GEN-LAST:event_BtnExitPrincipalMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlarmSignal;
    private javax.swing.JButton BtnDevices;
    private javax.swing.JButton BtnExitPrincipalMenu;
    private javax.swing.JButton BtnRooms;
    private javax.swing.JButton btnReturnPrincipalMenu;
    private javax.swing.JPanel jpnControl;
    private javax.swing.JLabel lblAlarmSignal;
    private javax.swing.JLabel lblBathrooms;
    private javax.swing.JLabel lblBedrooms;
    private javax.swing.JLabel lblDevices;
    private javax.swing.JLabel lblKitchen;
    private javax.swing.JLabel lblLighImage;
    private javax.swing.JLabel lblLivingRooms;
    private javax.swing.JLabel lblRoomImage;
    private javax.swing.JLabel lblRooms;
    private javax.swing.JLabel lblSoundSystem;
    private javax.swing.JLabel lblSoundSystemImage;
    private javax.swing.JLabel lblTelevision;
    private javax.swing.JLabel lblTelevisionImage;
    private javax.swing.JLabel lblWhatDoYouWantToControl;
    // End of variables declaration//GEN-END:variables
}
