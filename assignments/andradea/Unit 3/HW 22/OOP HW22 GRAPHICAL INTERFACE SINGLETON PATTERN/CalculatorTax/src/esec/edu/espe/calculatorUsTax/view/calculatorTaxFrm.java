
package esec.edu.espe.calculatorUsTax.view;

import esec.edu.espe.calculatorUsTax.model.GeorgiaTax;
import java.util.Scanner;

/**
 *
 * @author darling.cruz
 */
public class calculatorTaxFrm extends javax.swing.JFrame {

    /**
     * Creates new form calculatorTaxFrm
     */
    public calculatorTaxFrm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValueCalculator = new javax.swing.JTextField();
        txtInsertTax = new javax.swing.JTextField();
        lblTax = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTaxCalculator = new javax.swing.JLabel();
        lblresult = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtValueCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueCalculatorActionPerformed(evt);
            }
        });

        txtInsertTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsertTaxActionPerformed(evt);
            }
        });

        lblTax.setText("Enter the Value for Sale");

        jLabel2.setText("Enter Tax");

        lblTaxCalculator.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTaxCalculator.setText("Tax Calculator System ANDRADE");

        btnCalculate.setText("Generate data");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaxCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtValueCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInsertTax, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblresult))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTaxCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValueCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(lblresult)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtInsertTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValueCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueCalculatorActionPerformed

    }//GEN-LAST:event_txtValueCalculatorActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
          GeorgiaTax tax = GeorgiaTax.getInstance();
          
        Float value = Float.parseFloat(txtValueCalculator.getText());
        float taxes = Float.parseFloat(txtInsertTax.getText());
        taxes = taxes/100;
   
        float result = tax.salesTotal(value, taxes);

        String text = String.valueOf(result);
        lblresult.setText(text);
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtInsertTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsertTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsertTaxActionPerformed

    public float salesTotal(){
           
        float TaxesIncluded;
        float ProductTaxes;
        final float taxValueInOregon = (float) 0.099;
        float sale;
       
        Scanner input = new Scanner (System.in);
        System.out.print("Introduce de amount of your sale: ");
        sale = input.nextFloat();  
       
        ProductTaxes = sale * taxValueInOregon;
        TaxesIncluded = sale + ProductTaxes;
        
        System.out.println("Value included tax is: " + TaxesIncluded + " dollars.");
        return 0;
    }
    

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
            java.util.logging.Logger.getLogger(calculatorTaxFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorTaxFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorTaxFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorTaxFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorTaxFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTaxCalculator;
    private javax.swing.JLabel lblresult;
    private javax.swing.JTextField txtInsertTax;
    private javax.swing.JTextField txtValueCalculator;
    // End of variables declaration//GEN-END:variables
}
