
package ec.edu.espe.sortApp.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import utils.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class SortAppClient extends javax.swing.JFrame {

    MongoCollection<Document> SortApp = new Connection().getDB().getCollection("SortApp");
    DefaultTableModel table = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
    
    public SortAppClient() {
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

        lblSortApp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumbers = new javax.swing.JTextArea();
        btnDisorder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrderedNumbers = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtHowMany = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSortApp.setText("Sort App");

        jLabel1.setText("Insert numbers to order:");

        txtNumbers.setColumns(20);
        txtNumbers.setRows(5);
        jScrollPane1.setViewportView(txtNumbers);

        btnDisorder.setText("Disorder numbers");
        btnDisorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisorderActionPerformed(evt);
            }
        });

        txtOrderedNumbers.setColumns(20);
        txtOrderedNumbers.setRows(5);
        jScrollPane2.setViewportView(txtOrderedNumbers);

        jLabel2.setText("How many numbers are you going to order:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lblSortApp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnDisorder, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHowMany, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSortApp)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHowMany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDisorder)
                        .addGap(34, 34, 34)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisorderActionPerformed
        
        try {
            Document data = new Document();

            data.put("Numbers", Integer.parseInt(txtNumbers.getText()));

            SortApp.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully added");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "There was an error");
        }
        
        clearFields();
    }//GEN-LAST:event_btnDisorderActionPerformed

    public void clearFields (){
        txtNumbers.setText(" ");

    }
    
    public ArrayList<Numbers> returnNumbers(){
        
        ArrayList<Numbers> numbers;
        numbers = new ArrayList<>();
        MongoCursor<Document> query = SortApp.find().iterator();
        
        while(query.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            
            int id1 = Integer.parseInt(doc.get(1).toString());
            int id2 = Integer.parseInt(doc.get(2).toString());
            int id3 = Integer.parseInt(doc.get(3).toString());
            int id4 = Integer.parseInt(doc.get(4).toString());
            int id5 = Integer.parseInt(doc.get(5).toString());

            Numbers numbers = new Sock(id1, id2, id3, id4. id5);
            
            numbers.add(number);
        }
        return numbers;
    }
    
    
    public void read(){       
        MongoCursor<Document> consulta = SortApp.find().iterator();
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            table.addRow(doc.toArray());
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
            java.util.logging.Logger.getLogger(SortAppClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortAppClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortAppClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortAppClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortAppClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSortApp;
    private javax.swing.JTextField txtHowMany;
    private javax.swing.JTextArea txtNumbers;
    private javax.swing.JTextArea txtOrderedNumbers;
    // End of variables declaration//GEN-END:variables
}
