
package ec.edu.espe.house.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import java.awt.Color;
import utils.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmAddUser extends javax.swing.JFrame {         
      
    MongoCollection<Document> User = new Connection().getDB().getCollection("User");
    DefaultTableModel table = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };
           
    public FrmAddUser(){         
        
        initComponents(); 
        
        JtableUser.setModel(table);
        
        table.addColumn("ID Cloud");
        table.addColumn("Name");  
        table.addColumn("Last Name");
        table.addColumn("CI");
        table.addColumn("Cellphone");
        table.addColumn("Gender");
        
        view();
        
    }
      
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnAddNewUser = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblCi = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        TxtCi = new javax.swing.JTextField();
        lblCellphone = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        lblAddNewUser = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        TxtLastName = new javax.swing.JTextField();
        BtnReturn = new javax.swing.JButton();
        lblAddUserImages = new javax.swing.JLabel();
        BtnShowUsers = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JtableUser = new javax.swing.JTable();
        jpnGender = new javax.swing.JPanel();
        rbtFemale = new javax.swing.JRadioButton();
        rbtMale = new javax.swing.JRadioButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorLastName = new javax.swing.JLabel();
        lblErrorCi = new javax.swing.JLabel();
        lblErrorCellphone = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name:");

        lblCi.setText("C.I.:");

        jLabel3.setText("Cellphone:");

        TxtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNameKeyTyped(evt);
            }
        });

        TxtCi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCiKeyTyped(evt);
            }
        });

        lblCellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblCellphoneKeyTyped(evt);
            }
        });

        BtnAdd.setBackground(new java.awt.Color(255, 255, 102));
        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(255, 255, 102));
        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 153, 153));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        lblAddNewUser.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        lblAddNewUser.setForeground(new java.awt.Color(51, 51, 255));
        lblAddNewUser.setText("Add New User");

        lblLastName.setText("Last Name:");

        TxtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLastNameKeyTyped(evt);
            }
        });

        BtnReturn.setBackground(new java.awt.Color(102, 204, 255));
        BtnReturn.setText("Return");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        lblAddUserImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N

        BtnShowUsers.setBackground(new java.awt.Color(255, 255, 102));
        BtnShowUsers.setText("Show Users");
        BtnShowUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnShowUsersActionPerformed(evt);
            }
        });

        JtableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        jScrollPane4.setViewportView(JtableUser);

        jpnGender.setBorder(javax.swing.BorderFactory.createTitledBorder("Gender"));

        buttonGroup1.add(rbtFemale);
        rbtFemale.setText("Female");

        buttonGroup1.add(rbtMale);
        rbtMale.setText("Male");

        javax.swing.GroupLayout jpnGenderLayout = new javax.swing.GroupLayout(jpnGender);
        jpnGender.setLayout(jpnGenderLayout);
        jpnGenderLayout.setHorizontalGroup(
            jpnGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGenderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rbtFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(rbtMale, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jpnGenderLayout.setVerticalGroup(
            jpnGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGenderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnGenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFemale)
                    .addComponent(rbtMale))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnAddNewUserLayout = new javax.swing.GroupLayout(jpnAddNewUser);
        jpnAddNewUser.setLayout(jpnAddNewUserLayout);
        jpnAddNewUserLayout.setHorizontalGroup(
            jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAddNewUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BtnAdd)
                        .addGap(99, 99, 99)
                        .addComponent(BtnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnShowUsers)
                        .addGap(82, 82, 82)
                        .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BtnExit)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnAddNewUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAddNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                                        .addComponent(lblAddUserImages)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCi, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLastName)
                                            .addComponent(lblName))))
                                .addGap(41, 41, 41)
                                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(89, 89, 89)
                                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorCi, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jpnGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        jpnAddNewUserLayout.setVerticalGroup(
            jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblAddNewUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddUserImages))
                    .addGroup(jpnAddNewUserLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(TxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCi)
                            .addComponent(TxtCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorCi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrorCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jpnGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jpnAddNewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnDelete)
                    .addComponent(BtnShowUsers)
                    .addComponent(BtnReturn)
                    .addComponent(BtnExit))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnAddNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnAddNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        
        try {                          
            Document data = new Document();
                       
            data.put("Name", TxtName.getText());
            data.put("Last Name", TxtLastName.getText());
             data.put("CI", Integer.parseInt(TxtCi.getText()));
            data.put("Cellphone", Integer.parseInt(lblCellphone.getText()));
            
            if (rbtFemale.isSelected()){
                data.put("Gender",("Female"));
            }
                    
            else if(rbtMale.isSelected()){
                data.put("Gender",("Male"));
            }
            
                      
            User.insertOne(data);    
            
            JOptionPane.showMessageDialog(this, "Succesfull user login");
           
        } catch(Exception err){
            JOptionPane.showMessageDialog(this, "There was an error adding the User");
          }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        this.setVisible(false); 
        new FrmWelcome().setVisible(true);

    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        int renglon = JtableUser.getSelectedRow();
        if(renglon == -1){
            JOptionPane.showMessageDialog(this, "Error, Select the user to delete");
            return;
        }
        String idRemove = JtableUser.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Are you shure to delete the user?");
        if(respuesta == JOptionPane.OK_OPTION){
            boolean answerDelete = Delete(idRemove);
            if(answerDelete==true){
                view();
                JOptionPane.showMessageDialog(this, "The user was successfully deleted");
            }else{
                JOptionPane.showMessageDialog(this, "The user could not been deleted");
            }
        }     
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnShowUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnShowUsersActionPerformed
        view(); 
    }//GEN-LAST:event_BtnShowUsersActionPerformed

    private void TxtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNameKeyTyped
        int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean aiou = (key >= 160 && key <= 163);
        boolean e = (key == 130);
        boolean A = (key == 181);
        boolean E = (key == 144);
        boolean I = (key == 214);
        boolean O = (key == 224);
        boolean U = (key == 233);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr || aiou || e || A || E || I || O || U)) {
            lblErrorName.setForeground(new Color(0,153,0));
            lblErrorName.setText("Name format is OK");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled with uppercase and lowercase letters");
            lblErrorName.setForeground(new Color(255,0,0));
            lblErrorName.setText("Error !! Enter only letters");
            evt.consume();

        }
    }//GEN-LAST:event_TxtNameKeyTyped

    private void TxtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLastNameKeyTyped
                int key = evt.getKeyChar();
        boolean uper = (key >= 65 && key <= 90);
        boolean lower = (key >= 97 && key <= 122);
        boolean aiou = (key >= 160 && key <= 163);
        boolean e = (key == 130);
        boolean A = (key == 181);
        boolean E = (key == 144);
        boolean I = (key == 214);
        boolean O = (key == 224);
        boolean U = (key == 233);
        boolean espace = (key == 32);
        boolean supr = (key == 8);

        if ((uper || lower || espace || supr || aiou || e || A || E || I || O || U)) {
            lblErrorLastName.setForeground(new Color(0,153,0));
            lblErrorLastName.setText("Last Name format is OK");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled with uppercase and lowercase letters");
            lblErrorLastName.setForeground(new Color(255,0,0));
            lblErrorLastName.setText("Error !! Enter only letters");
            evt.consume();

        }
    }//GEN-LAST:event_TxtLastNameKeyTyped

    private void TxtCiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCiKeyTyped
         int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorCi.setForeground(new Color(0,153,0));
            lblErrorCi.setText("CI format is OK.");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled only with float numbers from 0 to 9, using the separator <.>");
            lblErrorCi.setForeground(new Color(255,0,0));
            lblErrorCi.setText("Error !! Enter only float numbers from 0 to 9, use .");
            evt.consume();

        }
    }//GEN-LAST:event_TxtCiKeyTyped

    private void lblCellphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCellphoneKeyTyped
                 int key = evt.getKeyChar();
        boolean numbers = (key >= 48 && key <= 57);
        boolean dat = (key == 46);
        boolean supr = (key == 8);

        if (numbers || dat || supr) {
            lblErrorCellphone.setForeground(new Color(0,153,0));
            lblErrorCellphone.setText("Cellphone format is OK.");

        }else{

            JOptionPane.showMessageDialog(this, "This field must be filled only with float numbers from 0 to 9, using the separator <.>");
            lblErrorCellphone.setForeground(new Color(255,0,0));
            lblErrorCellphone.setText("Error !! Enter only float numbers from 0 to 9, use .");
            evt.consume();

        }
    }//GEN-LAST:event_lblCellphoneKeyTyped
    
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
            java.util.logging.Logger.getLogger(FrmAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddUser().setVisible(true);
            }
        });
    }
    
    public boolean Delete(String id){
        DeleteResult answer = User.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
    }
    
    public void view(){
        
        MongoCursor<Document> query = User.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(query.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(query.next().values());
            table.addRow(doc.toArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnShowUsers;
    private javax.swing.JTable JtableUser;
    private javax.swing.JTextField TxtCi;
    private javax.swing.JTextField TxtLastName;
    private javax.swing.JTextField TxtName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpnAddNewUser;
    private javax.swing.JPanel jpnGender;
    private javax.swing.JLabel lblAddNewUser;
    private javax.swing.JLabel lblAddUserImages;
    private javax.swing.JTextField lblCellphone;
    private javax.swing.JLabel lblCi;
    private javax.swing.JLabel lblErrorCellphone;
    private javax.swing.JLabel lblErrorCi;
    private javax.swing.JLabel lblErrorLastName;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.JRadioButton rbtMale;
    // End of variables declaration//GEN-END:variables

    

}
