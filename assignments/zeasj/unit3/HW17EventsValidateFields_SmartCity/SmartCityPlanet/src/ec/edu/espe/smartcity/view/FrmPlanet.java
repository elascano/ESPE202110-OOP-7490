package ec.edu.espe.smartcity.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.smartcity.model.Planet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.bson.Document;
import utils.DBManager;

/**
 *
 * @author Joel Zeas 
 */
public class FrmPlanet extends javax.swing.JFrame {

    MongoCollection<Document> Planet = new DBManager().data().getCollection("Planet List");
    public static LinkedList planet = new LinkedList();
    public int find; 
    
    /**
     * Creates new form FrmPlanet
     */
    public FrmPlanet() {
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGravity = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        cmbDiameter = new javax.swing.JComboBox<>();
        cmbSatellites = new javax.swing.JComboBox<>();
        cmbTemperature = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblCorrectTemperature = new javax.swing.JLabel();
        lblCorrectDiameter = new javax.swing.JLabel();
        lblCorrectSatellites = new javax.swing.JLabel();
        lblCorrectName = new javax.swing.JLabel();
        lblCorrectGravity = new javax.swing.JLabel();
        lblCorrectType = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Insert Planet");

        jLabel2.setText("Planet name:");

        jLabel3.setText("Gravity:");

        jLabel4.setText("Type:");

        jLabel6.setText("Diameter:");

        jLabel7.setText("Satellites:");

        jLabel8.setText("Temperature:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtGravity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGravityKeyTyped(evt);
            }
        });

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTypeKeyTyped(evt);
            }
        });

        cmbDiameter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "4880 km", "12104 km", "12756 km", "6794 km", "142984 km", "120536 km", "51118 km", "49532 km", "2370 km" }));
        cmbDiameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDiameterMouseClicked(evt);
            }
        });

        cmbSatellites.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "0", "0", "1", "2", "63", "62", "27", "14", "5" }));
        cmbSatellites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbSatellitesMouseClicked(evt);
            }
        });

        cmbTemperature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "430ºC ; -180ºC", "480ºC ; 470ºC", "15ºC ; 10ºC", "-60ºC", "-153ºC", "-185ºC", "-200ºC", "-185ºC", "-200ºC", "-225ºC", "-220ºC", " " }));
        cmbTemperature.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTemperatureMouseClicked(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 255, 51));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(255, 255, 51));
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 102, 0));
        btnView.setText("View Table");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(102, 153, 255));
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 153, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblCorrectTemperature.setForeground(new java.awt.Color(0, 0, 255));

        lblCorrectDiameter.setForeground(new java.awt.Color(0, 0, 255));

        lblCorrectSatellites.setForeground(new java.awt.Color(0, 0, 255));

        lblCorrectName.setForeground(new java.awt.Color(0, 0, 255));

        lblCorrectGravity.setForeground(new java.awt.Color(255, 0, 0));

        lblCorrectType.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(txtGravity)
                        .addComponent(txtType))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCorrectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorrectGravity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorrectType, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSatellites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnFind)
                        .addGap(56, 56, 56)
                        .addComponent(btnUpdate)
                        .addGap(53, 53, 53)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCorrectSatellites, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addComponent(lblCorrectDiameter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCorrectTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnReturn))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtGravity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSatellites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectSatellites, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectGravity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorrectType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnFind)
                    .addComponent(btnView)
                    .addComponent(btnReturn)
                    .addComponent(btnUpdate))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String name = txtName.getText();
        String gravity = txtGravity.getText();
        String type = (String) txtType.getText();
        String diameter = (String) cmbDiameter.getSelectedItem();
        String satellites = (String) cmbSatellites.getSelectedItem();
        String temperature = (String) cmbTemperature.getSelectedItem();

        
        if (txtName.getText().isEmpty() || txtType.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete in all the fields!");

        } else {
            Planet system = new Planet(name, gravity, type, diameter, satellites, temperature);
            planet.add(system);
            JOptionPane.showMessageDialog(this, "Successful register -->" + name);
            btnDelete.setEnabled(true);
            btnFind.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnView.setEnabled(true);

            Document data = new org.bson.Document();
            data.put("Name", txtName.getText());
            data.put("Gravity", txtGravity.getText());
            data.put("Type", txtType.getText());
            data.put("Diameter", cmbDiameter.getSelectedItem());
            data.put("Satellites", cmbSatellites.getSelectedItem());
            data.put("Temperature", cmbTemperature.getSelectedItem());
            Planet.insertOne(data);
            txtName.setText("");
            txtGravity.setText("");
            txtType.setText("");
            cmbDiameter.setSelectedItem("Select Option");
            cmbSatellites.setSelectedItem("Select Option");
            cmbTemperature.setSelectedItem("Select Option");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        FrmListPlanet show = new FrmListPlanet();
        show.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name;
        Planet system;
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnView.setEnabled(true);
        name = JOptionPane.showInputDialog("Please, enter Name planet");
        for (int i = 0; i < planet.size(); i++) {
            system = (Planet) planet.get(i);
            if (name.equalsIgnoreCase(system.getName())) {
                txtName.setText(system.getName());
                txtGravity.setText(system.getGravity());
                txtType.setText(system.getType());
                cmbDiameter.setSelectedItem(system.getDiameter());
                cmbSatellites.setSelectedItem(system.getSatellites());
                cmbTemperature.setSelectedItem(system.getTemperature());
                find = 1;
                break;
            }
            btnAdd.setEnabled(true);
            btnDelete.setEnabled(true);
            btnUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmPresentation show = new FrmPresentation();
        show.setVisible(true);
        this.setVisible (false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        JOptionPane.showMessageDialog(this, "Delete Successfully");
        planet.remove(find);
        txtName.setText("");
        txtGravity.setText("");
        txtType.setText("");
        cmbDiameter.setSelectedItem("Select Option");
        cmbSatellites.setSelectedItem("Select Option");
        cmbTemperature.setSelectedItem("Select Option");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        String gravity = txtGravity.getText();
        String type = txtType.getText();
        String diameter = (String) cmbDiameter.getSelectedItem();
        String satellites = (String) cmbSatellites.getSelectedItem();
        String temperature = (String) cmbTemperature.getSelectedItem();
        Planet system;

        system = new Planet(name, gravity, type, diameter, satellites, temperature);
        planet.set(find, system);
        txtName.setText("");
        txtGravity.setText("");
        txtType.setText("");
        cmbDiameter.setSelectedItem("Select Option");
        cmbSatellites.setSelectedItem("Select Option");
        cmbTemperature.setSelectedItem("Select Option");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
       char press = evt.getKeyChar();
        if ((press < '0' || press > '9')) {
            lblCorrectName.setText("Correct");
            String name = txtName.getText().trim();
            Planet system;
            for (int i = 0; i < planet.size(); i++) {
                system = (Planet) planet.get(i);
                if (name.equalsIgnoreCase(system.getName())) {
                    btnAdd.setEnabled(false);
                    btnDelete.setEnabled(true);
                    btnUpdate.setEnabled(true);
                    btnView.setEnabled(true);
                    btnFind.setEnabled(true);
                    txtName.setText(system.getName());
                    txtGravity.setText(system.getGravity());
                    txtType.setText(system.getType());
                    cmbDiameter.setSelectedItem(system.getDiameter());
                    cmbSatellites.setSelectedItem(system.getSatellites());
                    cmbTemperature.setSelectedItem(system.getTemperature());
                    find = i;
                    break;
                }
            }
        } else {
            lblCorrectName.setText("Only letters");

        }                        
    }//GEN-LAST:event_txtNameKeyTyped

    private void cmbDiameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDiameterMouseClicked
        String diameter = (String) cmbDiameter.getSelectedItem();
        if (diameter.equals(cmbDiameter.getSelectedItem())) {
        lblCorrectDiameter.setText("Correct");
        }
    }//GEN-LAST:event_cmbDiameterMouseClicked

    private void cmbSatellitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbSatellitesMouseClicked
        String satellites = (String) cmbSatellites.getSelectedItem();
        if (satellites.equals(cmbSatellites.getSelectedItem())) {
        lblCorrectSatellites.setText("Correct");
        }
    }//GEN-LAST:event_cmbSatellitesMouseClicked

    private void cmbTemperatureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTemperatureMouseClicked
        String temperature = (String) cmbTemperature.getSelectedItem();
        if (temperature.equals(cmbTemperature.getSelectedItem())) {
        lblCorrectTemperature.setText("Correct");
        }
    }//GEN-LAST:event_cmbTemperatureMouseClicked

    private void txtTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyTyped
        char press = evt.getKeyChar();
        if ((press < '0' || press > '9')) {
            lblCorrectType.setText("Correct");
            String type = txtType.getText().trim();
            Planet system;
            for (int i = 0; i < planet.size(); i++) {
                system = (Planet) planet.get(i);
                if (type.equalsIgnoreCase(system.getName())) {
                    btnAdd.setEnabled(false);
                    btnDelete.setEnabled(true);
                    btnUpdate.setEnabled(true);
                    btnView.setEnabled(true);
                    btnFind.setEnabled(true);
                    txtName.setText(system.getName());
                    txtGravity.setText(system.getGravity());
                    txtType.setText(system.getType());
                    cmbDiameter.setSelectedItem(system.getDiameter());
                    cmbSatellites.setSelectedItem(system.getSatellites());
                    cmbTemperature.setSelectedItem(system.getTemperature());
                    find = i;
                    break;
                }
            }
        } else {
            lblCorrectName.setText("Only letters");

        }                        
    }//GEN-LAST:event_txtTypeKeyTyped

    private void txtGravityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGravityKeyTyped
                char press = evt.getKeyChar();
        if ((press < 'a' || press > 'z')) {
            lblCorrectGravity.setText("Correct");
        } else {
            lblCorrectGravity.setText("Only numbers");

        }
    }//GEN-LAST:event_txtGravityKeyTyped

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPlanet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbDiameter;
    private javax.swing.JComboBox<String> cmbSatellites;
    private javax.swing.JComboBox<String> cmbTemperature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorrectDiameter;
    private javax.swing.JLabel lblCorrectGravity;
    private javax.swing.JLabel lblCorrectName;
    private javax.swing.JLabel lblCorrectSatellites;
    private javax.swing.JLabel lblCorrectTemperature;
    private javax.swing.JLabel lblCorrectType;
    private javax.swing.JTextField txtGravity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
