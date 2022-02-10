
package ec.edu.espe.registration.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.DBManager;

/**
 *
 * @author mealvarez
 */
public class frmRegistration extends javax.swing.JFrame {
    
    String idNumber;
    String lastName; 
    String name;
    String dateOfBirth;
    String salary;   
    
    MongoCollection<Document> PersonalData = new DBManager().obtenerDB().getCollection("Person");
    DefaultTableModel table = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
 
    public frmRegistration() {
        initComponents();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtIdNumber = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        calDateOfBirth = new com.toedter.calendar.JDateChooser();
        lblDateOfBirth = new javax.swing.JLabel();
        lblErrorLastName = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorSalary = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblErrorLastN = new javax.swing.JLabel();
        lblErrorId = new javax.swing.JLabel();
        lblErrorSalar = new javax.swing.JLabel();
        lblErrorNam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("REGISTRATION");

        lblNumber.setText("Id Number:");

        lblLastName.setText("Last Name:");

        lblName.setText("Name:");

        lblSalary.setText("Salary:");

        txtIdNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdNumberKeyTyped(evt);
            }
        });

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        lblDateOfBirth.setText("Date of Birth:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNumber)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblLastName)
                            .addComponent(lblSalary)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDateOfBirth)
                        .addGap(1, 1, 1)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalary))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(lblErrorSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorLastName))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorSalary))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateOfBirth))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(153, 255, 204));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(153, 255, 204));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setText("Exit");

        btnDelete.setBackground(new java.awt.Color(153, 255, 204));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 255, 204));
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnFind))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblErrorLastN.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblErrorId.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblErrorSalar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblErrorNam.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorLastN, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorSalar, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorNam, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblErrorLastN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblErrorNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblErrorSalar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        int option;
        
        lastName = txtLastName.getText();
        name = txtName.getText();
        option = JOptionPane.showConfirmDialog(this, "Are you sure you want to register " + lastName + " " + name +" ?");
        
        if(option==0){
                      
                Document data = new Document();

                data.put("Id Number", Integer.parseInt(txtIdNumber.getText()));
                data.put("Last Name", txtLastName.getText());
                data.put("Name", txtName.getText());
                data.put("Date of Birth", calDateOfBirth.getDate().toString());
                data.put("Salary", Float.parseFloat(txtSalary.getText()));

                PersonalData.insertOne(data);

                JOptionPane.showMessageDialog(this, "Registering:\n" + readInputs());

        }else if(option==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, lastName + " " + name + " was not registered");
        }       
        
        clearFields();
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
     
        this.setVisible(false);
        new frmFind().setVisible(true); 
       
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
       int option;
       option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete: \n " + readInputs());
       
       if(option==0){
           
           //delete(String id);         
           
           JOptionPane.showMessageDialog(this, lastName + " " + name + " was deleted.");
           
           clearFields();

       }
    }
       
 
      public String readInputs(){
          
          idNumber = txtIdNumber.getText();
          lastName = txtLastName.getText();
          name = txtName.getText();
          dateOfBirth = calDateOfBirth.getDate().toString();
          salary = txtSalary.getText();
          
          
          String information;
          information = ("Id Number: " +idNumber + "\n" + lastName + " " + name + "\nBirthDate: " + dateOfBirth + "\nSalary: " + salary);
          
          return information;
          
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr)) {
            lblErrorLastN.setForeground(new Color(0,153,0));
            lblErrorLastN.setText("Last Name format is OK");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled with uppercase and lowercase letters");
            lblErrorLastN.setForeground(new Color(255,0,0));
            lblErrorLastN.setText("Error !! Enter only letters");
            evt.consume();

        }
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtIdNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdNumberKeyTyped

        int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean supr = (key == 8);

        if (numbers || supr) {
            lblErrorId.setForeground(new Color(0,153,0));
            lblErrorId.setText("Id Number format is OK.");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled only with numbers from 0 to 9");
            lblErrorId.setForeground(new Color(255,0,0));
            lblErrorId.setText("Error !! Enter only numbers from 0 to 9");
            evt.consume();

        }
    }//GEN-LAST:event_txtIdNumberKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr)) {
            lblErrorNam.setForeground(new Color(0,153,0));
            lblErrorNam.setText("Name format is OK");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled with uppercase and lowercase letters");
            lblErrorNam.setForeground(new Color(255,0,0));
            lblErrorNam.setText("Error !! Enter only letters");
            evt.consume();

        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorSalar.setForeground(new Color(0,153,0));
            lblErrorSalar.setText("Salary format is OK.");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled only with float numbers from 0 to 9, using the separator <.>");
            lblErrorSalar.setForeground(new Color(255,0,0));
            lblErrorSalar.setText("Error !! Enter only float numbers from 0 to 9, use .");
            evt.consume();

        }
    }//GEN-LAST:event_txtSalaryKeyTyped

    
    
    public void clearFields (){
        txtIdNumber.setText("");
        txtLastName.setText("");
        txtName.setText("");
        calDateOfBirth.setCalendar(null);
        txtSalary.setText(""); 
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
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistration().setVisible(true);
            }
        });
    }

   
    public boolean delete(String id){
        DeleteResult answer = PersonalData.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private static com.toedter.calendar.JDateChooser calDateOfBirth;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorLastN;
    private javax.swing.JLabel lblErrorLastName;
    private javax.swing.JLabel lblErrorNam;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorSalar;
    private javax.swing.JLabel lblErrorSalary;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
