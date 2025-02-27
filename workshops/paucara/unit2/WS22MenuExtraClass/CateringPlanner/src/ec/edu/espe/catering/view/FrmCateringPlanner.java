/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.catering.view;

/**
 *
 * @author javie
 */
public class FrmCateringPlanner extends javax.swing.JFrame {

    /**
     * Creates new form FrmCateringPlanner
     */
    public FrmCateringPlanner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ItmExit = new javax.swing.JMenu();
        ItmAbout = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MnuNew = new javax.swing.JMenu();
        ItmReservations = new javax.swing.JMenuItem();
        ItmEvents = new javax.swing.JMenuItem();
        MnuResources = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CATERING PLANNER");

        ItmExit.setText("Catering Planner");

        ItmAbout.setText("About");
        ItmExit.add(ItmAbout);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ItmExit.add(jMenuItem2);

        jMenuBar1.add(ItmExit);

        MnuNew.setText("New");

        ItmReservations.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        ItmReservations.setText("Reservations");
        ItmReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmReservationsActionPerformed(evt);
            }
        });
        MnuNew.add(ItmReservations);

        ItmEvents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        ItmEvents.setText("Events");
        ItmEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmEventsActionPerformed(evt);
            }
        });
        MnuNew.add(ItmEvents);

        jMenuBar1.add(MnuNew);

        MnuResources.setText("Resources");
        jMenuBar1.add(MnuResources);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean alreadyDisposed = false;
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (this.isDisplayable()) {
            alreadyDisposed = true;
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ItmReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmReservationsActionPerformed
        FrmReservation frmReservation = new FrmReservation();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ItmReservationsActionPerformed

    private void ItmEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmEventsActionPerformed
        FrmEvents frmEvents = new FrmEvents();
        frmEvents.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ItmEventsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCateringPlanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCateringPlanner().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmAbout;
    private javax.swing.JMenuItem ItmEvents;
    private javax.swing.JMenu ItmExit;
    private javax.swing.JMenuItem ItmReservations;
    private javax.swing.JMenu MnuNew;
    private javax.swing.JMenu MnuResources;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
