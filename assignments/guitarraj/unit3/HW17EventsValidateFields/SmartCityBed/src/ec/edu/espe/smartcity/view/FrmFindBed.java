package ec.edu.espe.smartcity.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.smartcity.model.Bed;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;

/**
 *
 * @author jhona
 */
public class FrmFindBed extends javax.swing.JFrame {

    MongoCollection<Document> ListBed = new Connection().obtenerDB().getCollection("SmartBed");
    DefaultTableModel table = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private Bed bed;

    public FrmFindBed() {
        initComponents();
        table.addColumn("ID Cloud");
        table.addColumn("Price");
        table.addColumn("N° of Serie");
        table.addColumn("Mattress Type");
        table.addColumn("Frames");
        table.addColumn("Materials");
        table.addColumn("Plazas");
        table.addColumn("Personalized");
        tblSmartBed.setModel(table);
    }

    FrmFindBed(FrmBed aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblSmartBed = new javax.swing.JTable();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnDelet = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        tblSmartBed.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblSmartBed);

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        btnFind.setText("Find Serie");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnShowAll.setText("Show all");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnDelet.setForeground(new java.awt.Color(255, 0, 0));
        btnDelet.setText("Delet");
        btnDelet.setEnabled(false);
        btnDelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.setEnabled(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelet, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(btnMenu)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnShowAll)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnShowAll)
                    .addComponent(btnMenu)
                    .addComponent(btnRefresh))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        FindBed();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        passToWindow();
        btnDelet.setEnabled(false);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletActionPerformed
       int option;
       option = JOptionPane.showConfirmDialog(this,"are you sure you want to eliminate whit Serie :"+tblSmartBed.getValueAt(tblSmartBed.getSelectedRow(),2).toString());
       if(option == 0){
            Delete();
       }if(option == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(this,"Series :" + tblSmartBed.getValueAt(tblSmartBed.getSelectedRow(),2).toString()+", not deleted");
       }
       btnDelet.setEnabled(false);
       btnUpdate.setEnabled(false);
       btnDelet.setEnabled(true);
       view();
    }//GEN-LAST:event_btnDeletActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        view();
        btnDelet.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnShowAll.setEnabled(false);
        btnRefresh.setEnabled(true);
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Bed bed = new Bed(0,0,"","","","","");
        FrmBed ven = new FrmBed(bed);
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        view();
        btnDelet.setEnabled(true);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void passToWindow() {
        try {
            int select = tblSmartBed.getSelectedRow();
            float price = Float.parseFloat(tblSmartBed.getValueAt(select, 1).toString());
            int Serial = Integer.parseInt(tblSmartBed.getValueAt(select, 2).toString());
            String mattressType = tblSmartBed.getValueAt(select, 3).toString();
            String frames = tblSmartBed.getValueAt(select, 4).toString();
            String materials = tblSmartBed.getValueAt(select, 5).toString();
            String plazas = tblSmartBed.getValueAt(select, 6).toString();
            String personalized = tblSmartBed.getValueAt(select, 7).toString();
            Bed bed = new Bed(price, Serial, mattressType, frames, materials, plazas,personalized);
            FrmBed ven = new FrmBed(bed);
            ven.setVisible(true);
            this.setVisible(false);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }

    public void FindBed() {
        try {
            int total = table.getRowCount();
            for (int i = 0; i < total; i++) {
            table.removeRow(0);
            }
            Document documento = new Document();
            documento.put("Serie", Integer.parseInt(txtFind.getText()));
            MongoCursor<Document> search = ListBed.find(documento).iterator();
            while (search.hasNext()) {
                ArrayList<Object> found = new ArrayList<Object>(search.next().values());
                table.addRow(found.toArray());
                btnDelet.setEnabled(true);
                btnUpdate.setEnabled(true);
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }

    public boolean Delete() {
        try {
            String id = tblSmartBed.getValueAt(tblSmartBed.getSelectedRow(), 0).toString();
            DeleteResult answer = ListBed.deleteOne(new Document("_id", new ObjectId(id)));
            JOptionPane.showMessageDialog(this, "Successfully Removed:" + id);
            return true;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
            return false;
        }
    }

    public void view() {
        try {
            MongoCursor<Document> contact = ListBed.find().iterator();
            int total = table.getRowCount();
            for (int i = 0; i < total; i++) {
                table.removeRow(0);
            }
            while (contact.hasNext()) {
                ArrayList<Object> document = new ArrayList<Object>(contact.next().values());
                table.addRow(document.toArray());
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFindBed().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelet;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSmartBed;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
