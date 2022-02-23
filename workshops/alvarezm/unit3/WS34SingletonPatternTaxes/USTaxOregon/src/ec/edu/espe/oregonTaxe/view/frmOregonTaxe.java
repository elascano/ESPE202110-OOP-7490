
package ec.edu.espe.oregonTaxe.view;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class frmOregonTaxe extends javax.swing.JFrame {


    public frmOregonTaxe() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnOregonTaxe = new javax.swing.JPanel();
        lblOregonTaxe = new javax.swing.JLabel();
        jpnIntroduceData = new javax.swing.JPanel();
        lblIntroduceAmountOfSale = new javax.swing.JLabel();
        txtAmountOfSale = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTaxeValueInOregon = new javax.swing.JTextField();
        jpnButtonCalculate = new javax.swing.JPanel();
        btnCalculateTheTotalValueToPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnOregonTaxe.setBackground(new java.awt.Color(204, 255, 204));
        jpnOregonTaxe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblOregonTaxe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOregonTaxe.setText("OREGON TAXE CALCULATOR");

        javax.swing.GroupLayout jpnOregonTaxeLayout = new javax.swing.GroupLayout(jpnOregonTaxe);
        jpnOregonTaxe.setLayout(jpnOregonTaxeLayout);
        jpnOregonTaxeLayout.setHorizontalGroup(
            jpnOregonTaxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnOregonTaxeLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(lblOregonTaxe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnOregonTaxeLayout.setVerticalGroup(
            jpnOregonTaxeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnOregonTaxeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOregonTaxe)
                .addContainerGap())
        );

        jpnIntroduceData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        lblIntroduceAmountOfSale.setText("Introduce the amount of the sale:");

        txtAmountOfSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountOfSaleActionPerformed(evt);
            }
        });

        jLabel1.setText("Introduce the taxe value aplied in Oregon: ");

        javax.swing.GroupLayout jpnIntroduceDataLayout = new javax.swing.GroupLayout(jpnIntroduceData);
        jpnIntroduceData.setLayout(jpnIntroduceDataLayout);
        jpnIntroduceDataLayout.setHorizontalGroup(
            jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnIntroduceDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIntroduceAmountOfSale)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTaxeValueInOregon, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(txtAmountOfSale))
                .addContainerGap())
        );
        jpnIntroduceDataLayout.setVerticalGroup(
            jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnIntroduceDataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIntroduceAmountOfSale)
                    .addComponent(txtAmountOfSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpnIntroduceDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTaxeValueInOregon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnCalculateTheTotalValueToPay.setBackground(new java.awt.Color(153, 255, 204));
        btnCalculateTheTotalValueToPay.setText("Calculate the total value to pay");
        btnCalculateTheTotalValueToPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTheTotalValueToPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnButtonCalculateLayout = new javax.swing.GroupLayout(jpnButtonCalculate);
        jpnButtonCalculate.setLayout(jpnButtonCalculateLayout);
        jpnButtonCalculateLayout.setHorizontalGroup(
            jpnButtonCalculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonCalculateLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(btnCalculateTheTotalValueToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jpnButtonCalculateLayout.setVerticalGroup(
            jpnButtonCalculateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonCalculateLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnCalculateTheTotalValueToPay)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnOregonTaxe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnIntroduceData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jpnButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnOregonTaxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnIntroduceData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAmountOfSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountOfSaleActionPerformed
    
        
    }//GEN-LAST:event_txtAmountOfSaleActionPerformed

    private void btnCalculateTheTotalValueToPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTheTotalValueToPayActionPerformed
         
        String amountOfSale = txtAmountOfSale.getText();
        String taxeValueInOregon = txtTaxeValueInOregon.getText();
        float taxeApliedToSale;
        float totalValueToPay;
        
        float amountOfSaleFloat = Float.parseFloat(amountOfSale);
        float taxeValueInOregonFloat = Float.parseFloat(taxeValueInOregon);
        
        totalValueToPay = 
                
        taxeApliedToSale = amountOfSaleFloat * taxeValueInOregonFloat/100;
        totalValueToPay = amountOfSaleFloat + taxeApliedToSale;
        
        JOptionPane.showMessageDialog(this, "The taxe aplied in Oregon State is " + taxeApliedToSale + 
                                            " %.\nThe value of the sale without the taxe is " + amountOfSaleFloat +  
                                            " dollars.\nThe total amount to pay including the taxe is " + totalValueToPay + " dollars.");
        
    }//GEN-LAST:event_btnCalculateTheTotalValueToPayActionPerformed

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
            java.util.logging.Logger.getLogger(frmOregonTaxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOregonTaxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOregonTaxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOregonTaxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOregonTaxe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateTheTotalValueToPay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnButtonCalculate;
    private javax.swing.JPanel jpnIntroduceData;
    private javax.swing.JPanel jpnOregonTaxe;
    private javax.swing.JLabel lblIntroduceAmountOfSale;
    private javax.swing.JLabel lblOregonTaxe;
    private javax.swing.JTextField txtAmountOfSale;
    private javax.swing.JTextField txtTaxeValueInOregon;
    // End of variables declaration//GEN-END:variables
}


