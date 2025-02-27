package view;

import utils.DBConnection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;

public class frmRegistro extends javax.swing.JFrame {
MongoCollection<Document> MongoConnection = new DBConnection().obtenerDB().getCollection("Users");
    String id;
    String lastName;
    String Name;
    String DateofBirth;
    String Salary;

    /**
     * Creates new form frmRegistro
     */
    public frmRegistro() {
        initComponents();

        lblWarning.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDateofBirth = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblErrorId = new javax.swing.JLabel();
        btnValidate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblWarning = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identification card:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of birth:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salary:");

        txtid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtidFocusLost(evt);
            }
        });
        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });

        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        txtDateofBirth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateofBirthFocusLost(evt);
            }
        });

        txtSalary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalaryFocusLost(evt);
            }
        });

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_find_client_user_16693.png"))); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setActionCommand("");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cloudrefresh_icon-icons.com_54403.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setActionCommand("");
        btnUpdate.setEnabled(false);

        lblErrorId.setForeground(new java.awt.Color(255, 0, 0));

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_accounts_15362.png"))); // NOI18N

        lblWarning.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setText("ALL FIELDS ARE MANDATORY (*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastName))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(449, 449, 449))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorId, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSalary))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnFind))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(btnValidate)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(204, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
        //JOptionPane.showMessageDialog(this, "validating" +txtid.getText());
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            //do nothing
        } else {
            JOptionPane.showMessageDialog(this, "this field must be filled with digits");
            lblErrorId.setText("id must be only digits");
            //read from input field ina a temporal variable
            //remove the last character
            //setText with that information
        }

    }//GEN-LAST:event_txtidKeyTyped

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        id = txtid.getText();
        int option;
        option = JOptionPane.showConfirmDialog(this, "Are you sure want to register" + id);
        lastName = txtLastName.getText();
        option = JOptionPane.showConfirmDialog(this, "Are you sure want to register" + lastName);
        Name = txtName.getText();
        option = JOptionPane.showConfirmDialog(this, "Are you sure want to register" + Name);
        DateofBirth= txtDateofBirth.getText();
        option = JOptionPane.showConfirmDialog(this, "Are you sure want to register" + DateofBirth);
        Salary= txtSalary.getText();
        option = JOptionPane.showConfirmDialog(this, "Are you sure want to register" + Salary);
        if (option == 0) {
            JOptionPane.showMessageDialog(this, "Registering" + readInputs());
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, readInputs() + "was not registered");
        }
       try {
            org.bson.Document data = new org.bson.Document();

            data.put("id", Integer.parseInt(txtid.getText()));
            data.put("LastName", txtLastName.getText());
            data.put("Name", txtName.getText());
            data.put("Date of Birth", txtDateofBirth.getText());
            data.put("Salary", txtSalary.getText());
            

            MongoConnection.insertOne(data);
            view();
            JOptionPane.showMessageDialog(this, "The data was added correctly");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    
    public void view() {
    MongoCursor<Document> consult = MongoConnection.find().iterator();

    }    
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        id = JOptionPane.showInputDialog("Enter your id");
        txtid.setText(id);
        //if(data is found in the database 
        btnDelete.setEnabled(true);
        txtLastName.setText("Espejo");
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int option;
        option = JOptionPane.showConfirmDialog(this, "Are you sure you want to eliminate" + readInputs());
        //JOptionPane.showMessageDialog(this, option);
        if (option == 0) {
            //code to eliminate from database

            JOptionPane.showMessageDialog(this, lastName + "Was removed");
            emptyFields();
            btnDelete.setEnabled(false);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        if (txtid.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "please fill in the required fields", "Error", JOptionPane.WARNING_MESSAGE);
            lblWarning.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "data filled out correctly ", "Warning", JOptionPane.INFORMATION_MESSAGE);
            lblWarning.setVisible(false);
        }
        if (txtLastName.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "please fill in the required fields", "Error", JOptionPane.WARNING_MESSAGE);
            lblWarning.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "data filled out correctly ", "Warning", JOptionPane.INFORMATION_MESSAGE);
            lblWarning.setVisible(false);
        }
        if (txtName.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "please fill in the required fields", "Error", JOptionPane.WARNING_MESSAGE);
            lblWarning.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "data filled out correctly ", "Warning", JOptionPane.INFORMATION_MESSAGE);
            lblWarning.setVisible(false);
        }
        
        if (txtDateofBirth.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }
        if (txtSalary.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }
    }//GEN-LAST:event_btnValidateActionPerformed

    private void txtidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtidFocusLost
        if (txtid.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
            
        } else {

            lblWarning.setVisible(false);

        }
    }//GEN-LAST:event_txtidFocusLost

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
        if (txtLastName.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtDateofBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateofBirthFocusLost
        if (txtDateofBirth.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }
    }//GEN-LAST:event_txtDateofBirthFocusLost

    private void txtSalaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalaryFocusLost
        if (txtSalary.getText().trim().isEmpty()) {
            lblWarning.setVisible(true);
        } else {

            lblWarning.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryFocusLost

    public String readInputs() {

        id = txtid.getText();
        lastName = txtLastName.getText();
        Name = txtName.getText();
        DateofBirth = txtDateofBirth.getText();
        Salary = txtSalary.getText();

        String data;
        data = id + "\n" + lastName + "\n";
        return data;
    }

    public void emptyFields() {
        txtid.setText("");
        txtLastName.setText("");
        txtName.setText("");
        txtDateofBirth.setText("");
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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
