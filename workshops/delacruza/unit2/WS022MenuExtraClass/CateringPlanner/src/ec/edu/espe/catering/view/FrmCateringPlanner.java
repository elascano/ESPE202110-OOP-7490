package ec.edu.espe.catering.view;

/**
 *
 * @author ALEJANDRO DE LACRUZ
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
        MnuCateringPlanner = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        MnuNew = new javax.swing.JMenu();
        itmReservations = new javax.swing.JMenuItem();
        itmEvents = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CATERING PLANNER");

        MnuCateringPlanner.setText("Catering Planner");

        itmAbout.setText("About");
        MnuCateringPlanner.add(itmAbout);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        MnuCateringPlanner.add(itmExit);

        jMenuBar1.add(MnuCateringPlanner);

        MnuNew.setText("New");

        itmReservations.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmReservations.setText("Reservations");
        itmReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReservationsActionPerformed(evt);
            }
        });
        MnuNew.add(itmReservations);

        itmEvents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEvents.setText("Events");
        itmEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEventsActionPerformed(evt);
            }
        });
        MnuNew.add(itmEvents);

        jMenuBar1.add(MnuNew);

        jMenu1.setText("Resources");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    boolean alreadyDisposed=false;
    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        if(this.isDisplayable()){
            alreadyDisposed=true;
            this.dispose();
        }
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReservationsActionPerformed
        FrmReservation frmReservation = new FrmReservation();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmReservationsActionPerformed

    private void itmEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEventsActionPerformed
        FrmEvents frmEvents = new FrmEvents();
        frmEvents.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmEventsActionPerformed

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
    private javax.swing.JMenu MnuCateringPlanner;
    private javax.swing.JMenu MnuNew;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmEvents;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmReservations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
