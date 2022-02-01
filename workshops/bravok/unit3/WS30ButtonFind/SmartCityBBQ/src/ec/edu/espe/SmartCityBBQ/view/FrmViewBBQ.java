package ec.edu.espe.SmartCityBBQ.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.SmartCityBBQ.model.BBQ;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author Katherin Bravo
 */
public class FrmViewBBQ extends javax.swing.JFrame {
        
    MongoCollection<Document> ListBBQ = new Connection().obtenerDB().getCollection("SmartBBQ");
    DefaultTableModel table = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
    
    private BBQ BBQ;
    
    public FrmViewBBQ() {
        initComponents();
        table.addColumn("ID Cloud");
        table.addColumn("Price");
        table.addColumn("Quantity");
        table.addColumn("Types");
        table.addColumn("Dressing");
        table.addColumn("Color");
        table.addColumn("Offer");
        tblSmartBBQ.setModel(table);  
        
    }


    FrmViewBBQ(FrmBBQ aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblSmartBBQ = new javax.swing.JTable();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblSmartBBQ.setBackground(new java.awt.Color(204, 255, 204));
        tblSmartBBQ.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblSmartBBQ);

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(0, 102, 102));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jButton1.setText("Menu");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       FindBBQ();
    }//GEN-LAST:event_btnFindActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        passToWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void passToWindow(){ 
        
        int select = tblSmartBBQ.getSelectedRow();
        float price = Float.parseFloat(tblSmartBBQ.getValueAt(select,1).toString());
        int Quantity = Integer.parseInt(tblSmartBBQ.getValueAt(select,2).toString());
        String Types = tblSmartBBQ.getValueAt(select,3).toString();
        String dressing = tblSmartBBQ.getValueAt(select,4).toString();
        String color = tblSmartBBQ.getValueAt(select,5).toString();
        String offer = tblSmartBBQ.getValueAt(select,6).toString();
        BBQ bbq = new BBQ(price,Quantity,Types,dressing,color,offer);
        System.out.println(bbq.getoffer());
        FrmBBQ ven =new FrmBBQ(bbq);
        ven.setVisible(true);
    } 
    
   
    public void FindBBQ(){    
    try{
        Document documento = new Document();
        documento.put("Quantity",Integer.parseInt(txtFind.getText()));    
        MongoCursor<Document> search = ListBbq.find(documento).iterator();
        while(search.hasNext()){
            ArrayList<Object> found = new ArrayList<Object>(search.next().values());
                table.addRow(found.toArray());
        }

        }catch(Exception err){

            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmViewBBQ().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSmartBBQ;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
    }
