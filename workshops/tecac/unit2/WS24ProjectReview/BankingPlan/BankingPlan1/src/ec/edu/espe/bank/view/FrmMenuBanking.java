
package ec.edu.espe.bank.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.bank.model.Connection;
import ec.edu.espe.bank.model.FrmAccount;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author DARK
 */
public class FrmMenuBanking extends javax.swing.JFrame {
        MongoCollection<Document> Account = new Connection().obtenerDB().getCollection("Account");
        MongoCollection<Document> Profile = new Connection().obtenerDB().getCollection("Profile");
        private ImageIcon image;
        private Icon icon;
        DefaultTableModel table = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
        
    };
    /**
     * Creates new form FrmProfile
     */
    public FrmMenuBanking() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.Image(this.lblMenu, "src/Imagenes/si.jpg");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNameUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtGuide = new javax.swing.JMenu();
        txtInformation = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Age :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Id:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        txtNameUser.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 103, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 102));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Welcome To Banking Plan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        txtId.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 59, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name User:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 102));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 102));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 70, -1));

        lblMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMenu.setName(""); // NOI18N
        lblMenu.setOpaque(true);
        getContentPane().add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 320));

        txtGuide.setText("Guide");

        txtInformation.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        txtInformation.setText("Information ");
        txtInformation.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtInformationAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformationActionPerformed(evt);
            }
        });
        txtGuide.add(txtInformation);

        jMenuBar1.add(txtGuide);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Image(JLabel lbl, String ruta){
        this.image = new ImageIcon(ruta);
        this.icon = new ImageIcon(this.image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT));
        lbl.setIcon(this.icon);
        this.repaint();
        
        
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtNameUser.setText("");
        txtId.setText("");
        txtAge.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
      try {
            Document data = new org.bson.Document();
            data.put("User", txtNameUser.getText());
            data.put("Id", Integer.parseInt(txtId.getText()));
            data.put("Age", txtAge.getText());
            data.put("Password", txtPassword.getText());
            
            Profile.insertOne(data);
            JOptionPane.showMessageDialog(this, "Successful Register");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }        // TODO add your handling code here:
    
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        FrmAccount abrir = new FrmAccount ();
        abrir.setVisible(true);
        this.setVisible (false);
            Document data = new org.bson.Document();
            data.put("User", txtNameUser.getText());
            data.put("Id", Integer.parseInt(txtId.getText()));
            data.put("Age", txtAge.getText());
            data.put("Password", txtPassword.getText());
            Account.insertOne(data);     
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformationActionPerformed
        FrmInformation frmReservation = new FrmInformation();
        frmReservation.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtInformationActionPerformed

    private void txtInformationAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtInformationAncestorAdded
      
    }//GEN-LAST:event_txtInformationAncestorAdded

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
            java.util.logging.Logger.getLogger(FrmMenuBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuBanking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTextField txtAge;
    private javax.swing.JMenu txtGuide;
    private javax.swing.JTextField txtId;
    private javax.swing.JMenuItem txtInformation;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}