
package ec.espe.edu.View;

import java.util.Scanner;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class CalculadorTax extends javax.swing.JFrame {
    double iva;
    
    /**
     * Creates new form CalculadorTax
     */
    public CalculadorTax() {
        initComponents();
        iva = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        Value = new javax.swing.JLabel();
        TextValue = new javax.swing.JTextField();
        Impues = new javax.swing.JLabel();
        TextImpuest = new javax.swing.JTextField();
        btncalculate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setText("CalculatorTax");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, 103, 41));

        Value.setText("Value");
        getContentPane().add(Value, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 92, 46, -1));

        TextValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValueActionPerformed(evt);
            }
        });
        getContentPane().add(TextValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 89, 101, -1));

        Impues.setText("Impuest");
        getContentPane().add(Impues, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 167, 59, -1));
        getContentPane().add(TextImpuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 161, 101, -1));

        btncalculate.setText("Calculate");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btncalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 256, -1, -1));

        jButton2.setText("COMFIGURATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 256, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValueActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        double value;
        double totalapagar;
        double cant_iva;
        
        value = Double.parseDouble(TextValue.getText());
        cant_iva = iva*100;
        totalapagar= value + cant_iva;    
        btncalculate.setText(""+totalapagar);
        
    }//GEN-LAST:event_btncalculateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setSize(250,200);
        jButton2.setLocation(100,100);
        jButton2.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadorTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadorTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadorTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadorTax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadorTax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Impues;
    private javax.swing.JTextField TextImpuest;
    private javax.swing.JTextField TextValue;
    private javax.swing.JLabel Value;
    private javax.swing.JButton btncalculate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
