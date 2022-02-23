package ec.edu.espe.practicalTestUnit3.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.practicalTestUnit3.control.SimbolSelect;
import ec.edu.espe.practicalTestUnit3.model.SortingContext;
import java.util.ArrayList;
import org.bson.Document;
import utils.Connection;

/**
 *
 * @author GUITARRA JHON, DEEE-ESPE
 */
public class SortApp extends javax.swing.JFrame {

    MongoCollection<Document> ListNumbers = new Connection().obtenerDB().getCollection("ListOfNumbers");

    public SortApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumbers = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrderedNumbers = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSortAlgorithmUsed = new javax.swing.JTextField();
        btnOrderedNumber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the numbers to order separated by a comma");

        jLabel2.setText("Exma 3 Guitarra Jhon");

        jLabel3.setText("Ordered numbers");

        jLabel4.setText("Sort Algorithm used");

        txtSortAlgorithmUsed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSortAlgorithmUsedActionPerformed(evt);
            }
        });

        btnOrderedNumber.setText("I'm gonna get lucky");
        btnOrderedNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderedNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnOrderedNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(txtSortAlgorithmUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel4)))
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumbers)
                            .addComponent(txtOrderedNumbers, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrderedNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtOrderedNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addComponent(txtSortAlgorithmUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderedNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderedNumberActionPerformed
        OrderNumber();
    }//GEN-LAST:event_btnOrderedNumberActionPerformed

    private void txtSortAlgorithmUsedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSortAlgorithmUsedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSortAlgorithmUsedActionPerformed
    public void OrderNumber() {
        Document data = new Document();
        String number = txtNumbers.getText();
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        
        SimbolSelect Selected = new SimbolSelect();
        numbers = Selected.simbolSelect(number);

        list = numbers;
        SortingContext sortNumber = new SortingContext();
        sortNumber.setSortStrategy(list.size(), list);

        String algorit;
        if (list.size() <= 3) {
            algorit = "Bubble sort";
        } else if (list.size() > 3 && list.size() <= 7) {
            algorit = "Insertion Sort";
        } else {
            algorit = "Quick Sort";
        }

        String numUnOrder = "";
        for (int i = 0; i < numbers.size(); i++) {
            numUnOrder += numbers.get(i) + " ";
        }
        String numOrder = "";
        for (int i = 0; i < list.size(); i++) {
            numOrder += list.get(i) + " ";
        }
        data.put("Unordered Numbers", numUnOrder);
        data.put("size", list.size());
        data.put("the chosen algorithm", algorit);
        data.put("Ordered numbers", numOrder.toString());

        ListNumbers.insertOne(data);
        txtOrderedNumbers.setText(numOrder.toString());
        txtSortAlgorithmUsed.setText(algorit);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderedNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNumbers;
    private javax.swing.JTextField txtOrderedNumbers;
    private javax.swing.JTextField txtSortAlgorithmUsed;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Integer> SimbolSelect(String number) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
