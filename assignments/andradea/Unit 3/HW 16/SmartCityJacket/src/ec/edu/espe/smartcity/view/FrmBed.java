package ec.edu.espe.smartcity.view;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.smartcity.model.Bed;
import utils.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Guitarra Jhon
 * 
 */

public class FrmBed extends javax.swing.JFrame {
    
    MongoCollection<Document> ListBed = new Connection().obtenerDB().getCollection("SmartBed");
    private Bed bed;
    public FrmBed(Bed newBed) {
        initComponents();
        this.bed = newBed;
    }

    private FrmBed() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmgAvailability = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        jcbmMattressType = new javax.swing.JComboBox<>();
        jcbmMaterials = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbmFrames = new javax.swing.JComboBox<>();
        jcbmPlazas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNoSerie = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnListContacts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jcbmMattressType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR FOAM MATTRESS", "VISCOELASTIC MATTRESS", "+(HR+VISCOELASTIC)", "LATEX MATTRESS", "POCKET SPRING MATTRESS", "BONELL SPRING MATTRESS" }));
        jcbmMattressType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmMattressTypeActionPerformed(evt);
            }
        });

        jcbmMaterials.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chilean Pine", "MDF", "Water-repellent MDF", "Fine woods" }));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("REGISTRATION ANDRADE");

        jLabel4.setText("Price Jacket");

        jLabel5.setText("Cloths Type");

        jLabel6.setText("Frames Jacket");

        jLabel7.setText("Materials");

        jLabel8.setText("Size");

        jcbmFrames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guest beds", "Divan", "ttomans", "Bunk beds", "Studio bunk bed", "Bunk beds and mezzanine", "Nest", "Bookstore", "Platform", "Captain's bed", "Poster", "Extra Long" }));

        jcbmPlazas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1 and 1/2", "Twin", "2", "2 and 1/2", "Queen", "King" }));

        jLabel3.setText("Model");

        txtNoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoSerieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbmMaterials, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(jcbmMattressType, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                    .addComponent(jcbmFrames, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbmPlazas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoSerie))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbmMattressType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbmFrames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jcbmMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbmPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnAdd))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        btnListContacts.setText("List");
        btnListContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListContactsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnListContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListContacts))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        InsertNewBed();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListContactsActionPerformed
        opentable();
    }//GEN-LAST:event_btnListContactsActionPerformed

    private void jcbmMattressTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmMattressTypeActionPerformed

    }//GEN-LAST:event_jcbmMattressTypeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtNoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoSerieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        FrmViewBed ven =new FrmViewBed();
        ven.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public boolean Delete(String id){
       try{
            DeleteResult answer = ListBed.deleteOne(new Document("_id", new ObjectId(id)));
            JOptionPane.showMessageDialog(this, "Successfully Removed");
            return true;

            }catch(Exception err){
                
                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
                return false;
            }
    }    
    
    public void InsertNewBed(){
        try{

            Document data = new Document();
            data.put("Price of jacket", Float.parseFloat(txtPrice.getText()));
            data.put("Model", Integer.parseInt(txtNoSerie.getText()));
            data.put("Cloths Type", jcbmMattressType.getSelectedItem().toString());
            data.put("Frames of jacket", jcbmFrames.getSelectedItem().toString());
            data.put("Materials",jcbmMaterials.getSelectedItem().toString());   
            data.put("Size",jcbmPlazas.getSelectedItem().toString());
            ListBed.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully Insert");

            }catch(Exception err){

                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

            }
    }

    public void opentable(){
        FrmBedFind ven =new FrmBedFind();
            ven.setVisible(true);
        }
    
   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBed().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnListContacts;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jbmgAvailability;
    private javax.swing.JComboBox<String> jcbmFrames;
    private javax.swing.JComboBox<String> jcbmMaterials;
    private javax.swing.JComboBox<String> jcbmMattressType;
    private javax.swing.JComboBox<String> jcbmPlazas;
    private javax.swing.JTextField txtNoSerie;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}