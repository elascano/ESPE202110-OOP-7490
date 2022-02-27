
package ec.edu.espe.tire.view;
/**
 *
 * @author Kerly Correa- Sebastián Caisatoa
 */
public class FrmInventoryStart extends javax.swing.JFrame {

    /**
     * Creates new form FrmInventoryStart
     */
    public FrmInventoryStart() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItmProduct = new javax.swing.JMenuItem();
        ItmProductSold = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItmModifySale = new javax.swing.JMenuItem();
        ItmModifyProduct = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ItmShowProduct = new javax.swing.JMenuItem();
        ItmShowSales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/tire/images/Grupo Tire Experts.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME TO INVENTORY TIRE STORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 310));

        jMenuBar1.setBackground(new java.awt.Color(255, 0, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setText("Add");
        jMenu1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        ItmProduct.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmProduct.setText("  Products");
        ItmProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmProductActionPerformed(evt);
            }
        });
        jMenu1.add(ItmProduct);

        ItmProductSold.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmProductSold.setText("Products Sold");
        ItmProductSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmProductSoldActionPerformed(evt);
            }
        });
        jMenu1.add(ItmProductSold);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modify");
        jMenu2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        ItmModifySale.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmModifySale.setText("Product");
        ItmModifySale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmModifySaleActionPerformed(evt);
            }
        });
        jMenu2.add(ItmModifySale);

        ItmModifyProduct.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmModifyProduct.setText("Sale");
        ItmModifyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmModifyProductActionPerformed(evt);
            }
        });
        jMenu2.add(ItmModifyProduct);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Show");
        jMenu4.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N

        ItmShowProduct.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmShowProduct.setText("Products");
        ItmShowProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmShowProductActionPerformed(evt);
            }
        });
        jMenu4.add(ItmShowProduct);

        ItmShowSales.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        ItmShowSales.setText("Sales");
        ItmShowSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmShowSalesActionPerformed(evt);
            }
        });
        jMenu4.add(ItmShowSales);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItmProductSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmProductSoldActionPerformed
        RegisterSale frmReservation =new RegisterSale();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ItmProductSoldActionPerformed

    private void ItmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmProductActionPerformed
        FrmInventory frmProduct =new FrmInventory();
        frmProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ItmProductActionPerformed

    private void ItmModifySaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmModifySaleActionPerformed
        ModifyProduct obj = new ModifyProduct();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ItmModifySaleActionPerformed

    private void ItmModifyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmModifyProductActionPerformed
        ModifySale obj = new ModifySale();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();        
    }//GEN-LAST:event_ItmModifyProductActionPerformed

    private void ItmShowProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmShowProductActionPerformed
        AllProduct obj = new AllProduct();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ItmShowProductActionPerformed

    private void ItmShowSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmShowSalesActionPerformed
        AllSales obj = new AllSales();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ItmShowSalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInventoryStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventoryStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventoryStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventoryStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventoryStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItmModifyProduct;
    private javax.swing.JMenuItem ItmModifySale;
    private javax.swing.JMenuItem ItmProduct;
    private javax.swing.JMenuItem ItmProductSold;
    private javax.swing.JMenuItem ItmShowProduct;
    private javax.swing.JMenuItem ItmShowSales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
