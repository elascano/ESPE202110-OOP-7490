package ec.edu.espe.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
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
public class FrmHoterl extends javax.swing.JFrame {
    
    MongoCollection<Document> ListHotel = new Connection().obtenerDB().getCollection("HotelInsert");
    DefaultTableModel tabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
        
        
    };
    
    public FrmHoterl() {
        
        initComponents();
        tabla.addColumn("ID Cloud");tabla.addColumn("Name Hotel");tabla.addColumn("Bedrooms");
        tabla.addColumn("Address");tabla.addColumn("Price");
        tabla.addColumn("Availability");
        tblContacts.setModel(tabla);
        view();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmgAvailability = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNameHotel = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jcbmBedrooms = new javax.swing.JComboBox<>();
        jcbmPrice = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jrbmAvailability = new javax.swing.JRadioButton();
        jrbmNoAvailability = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnListContacts = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N

        txtNameHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameHotelActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jcbmBedrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Departments", "5 Departments", "10 Departments", "15 Departments", "20 Departments", "25 Departments", "50 Departments", "55 Departments", "60 Departments", "65 Departments", "70 Departments", "75 Departments", "100 Departments" }));
        jcbmBedrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmBedroomsActionPerformed(evt);
            }
        });

        jcbmPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Room", "2 Room ", "3 Room ", "4 Room ", "1 Suit", "2 suit plus " }));

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jbmgAvailability.add(jrbmAvailability);
        jrbmAvailability.setText("Availability");
        jrbmAvailability.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbmAvailabilityMouseClicked(evt);
            }
        });
        jrbmAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmAvailabilityActionPerformed(evt);
            }
        });

        jbmgAvailability.add(jrbmNoAvailability);
        jrbmNoAvailability.setText("Not available");
        jrbmNoAvailability.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jrbmNoAvailabilityMouseDragged(evt);
            }
        });
        jrbmNoAvailability.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbmNoAvailabilityMouseClicked(evt);
            }
        });
        jrbmNoAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbmNoAvailabilityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbmAvailability)
                .addGap(18, 18, 18)
                .addComponent(jrbmNoAvailability)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbmAvailability)
                    .addComponent(jrbmNoAvailability))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Russo One", 1, 18)); // NOI18N
        jLabel2.setText("Guitarra Hotel´s");

        jLabel4.setText("Name");

        jLabel5.setText("Number of departments");

        jLabel6.setText("Address of Hotel");

        jLabel7.setText("Room");

        jLabel8.setText("Availability");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAddress)
                        .addComponent(txtNameHotel)
                        .addComponent(jcbmPrice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbmBedrooms, 0, 150, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbmBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addComponent(jcbmPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33))))
        );

        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblContacts);

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btnListContacts.setText("List");
        btnListContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListContactsActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnListContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnListContacts))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

      String availability = "";

            if(jrbmAvailability.isSelected()){
                availability = "Availability";
            }
            else if(jrbmNoAvailability.isSelected()){
                 availability = "Not Availability";
            }
        InsertHotel(txtNameHotel.getText(), jcbmBedrooms.getSelectedItem().toString(), txtAddress.getText(), jcbmPrice.getSelectedItem().toString(), availability);
        view();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListContactsActionPerformed
        view();
    }//GEN-LAST:event_btnListContactsActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtNameHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameHotelActionPerformed

    private void jcbmBedroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmBedroomsActionPerformed

    }//GEN-LAST:event_jcbmBedroomsActionPerformed

    private void jrbmAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbmAvailabilityActionPerformed

    private void jrbmNoAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbmNoAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbmNoAvailabilityActionPerformed

    private void jrbmAvailabilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbmAvailabilityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbmAvailabilityMouseClicked

    private void jrbmNoAvailabilityMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbmNoAvailabilityMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbmNoAvailabilityMouseDragged

    private void jrbmNoAvailabilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbmNoAvailabilityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbmNoAvailabilityMouseClicked

    public boolean Delete(String id){
       try{
            DeleteResult answer = ListHotel.deleteOne(new Document("_id", new ObjectId(id)));
            JOptionPane.showMessageDialog(this, "Successfully Removed");
            return true;

            }catch(Exception err){
                
                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
                return false;
            }
    }    
    
    public void InsertHotel(String nameHotel,String bedrooms,String address, String price, String availability){
        try{

            Document data = new Document();
            data.put("Nane of Hotel", nameHotel);
            data.put("Number of Departments", bedrooms);
            data.put("Address of Hotel", address);
            data.put("Price per room",price);            
            data.put("Availability",availability);
            ListHotel.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully Insert");

            }catch(Exception err){

                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

            }
    }
    
        public void UpdateHotel(String id){
        try{
            
            String nameHotel = txtNameHotel.getText();
            String bedrooms = jcbmBedrooms.getSelectedItem().toString();
            String address = txtAddress.getText();
            String price = jcbmPrice.getSelectedItem().toString();
            String availability = "";
            
            if(jrbmAvailability.isSelected()){
                availability = "Availability";
            }
            else if(jrbmNoAvailability.isSelected()){
                 availability = "Not Availability";
            }

            Document data = new Document("_id", new ObjectId(id));
            System.out.println(data);
            Document update = new Document();
            update.put("_id", id);
            System.out.println(update);
            update.put("Nane of Hotel", nameHotel);
            System.out.println(update);
            update.put("Number of Departments", bedrooms);
            update.put("Address of Hotel", address);
            update.put("Price per room",price);            
            update.put("Availability",availability);
            System.out.println(update);
            ListHotel.findOneAndUpdate(data, update);
            

            JOptionPane.showMessageDialog(this, "Successfully Updated");

            }catch(Exception err){

                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

            }
    }
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
            java.util.logging.Logger.getLogger(FrmHoterl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHoterl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHoterl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHoterl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHoterl().setVisible(true);
            }
        });
    }
    public void view(){
        
        MongoCursor<Document> contact = ListHotel.find().iterator();
        
        int total = tabla.getRowCount();
        for(int i = 0; i<total; i++){
            tabla.removeRow(0);
        }
        while(contact.hasNext()){
            ArrayList<Object> document = new ArrayList<Object>(contact.next().values());
            tabla.addRow(document.toArray());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnListContacts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jbmgAvailability;
    private javax.swing.JComboBox<String> jcbmBedrooms;
    private javax.swing.JComboBox<String> jcbmPrice;
    private javax.swing.JRadioButton jrbmAvailability;
    private javax.swing.JRadioButton jrbmNoAvailability;
    private javax.swing.JTable tblContacts;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtNameHotel;
    // End of variables declaration//GEN-END:variables
}