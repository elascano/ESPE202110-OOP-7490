
package ec.edu.espe.house.view;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.house.controller.TelevisionDimensions;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.types.ObjectId;
import utils.Connection;

/**
 *
 * @author Alvarez Michelle DEEL-ESPE
 */
public class FrmTelevision extends javax.swing.JFrame {
    
    MongoCollection<Document> Television = new Connection().getDB().getCollection("Television");
    DefaultTableModel table = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; 
        }
    };

    public FrmTelevision() {
        initComponents();
        
        tblTelevision.setModel(table);

        table.addColumn("ID Cloud");
        table.addColumn("Id");
        table.addColumn("Brand");
        table.addColumn("Model");
        table.addColumn("Room");   
        table.addColumn("Size");
        table.addColumn("EnergySave");
        table.addColumn("Status");
        table.addColumn("Volumen");
        
        read();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSaveEnergy = new javax.swing.ButtonGroup();
        btnGroupStatus = new javax.swing.ButtonGroup();
        jpnTelevision = new javax.swing.JPanel();
        lblTelevision = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        lblRoom = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        cmbSelectRoom = new javax.swing.JComboBox<>();
        cmbSize = new javax.swing.JComboBox<>();
        lblVolume = new javax.swing.JLabel();
        jpnSaveEnergy = new javax.swing.JPanel();
        rbtSaveYes = new javax.swing.JRadioButton();
        rbtSaveNo = new javax.swing.JRadioButton();
        jpnStatus = new javax.swing.JPanel();
        rbtStatusOn = new javax.swing.JRadioButton();
        rbtStatusOff = new javax.swing.JRadioButton();
        jpnButtons = new javax.swing.JPanel();
        BtnAdd = new javax.swing.JButton();
        BtnShowTVList = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTelevision = new javax.swing.JTable();
        btnCalulateTVDimensiions = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTelevisionImage = new javax.swing.JLabel();
        sldVolume = new javax.swing.JSlider();
        lblVolumeValue = new javax.swing.JLabel();
        BtnReturn = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelevision.setBackground(new java.awt.Color(153, 255, 153));
        lblTelevision.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        lblTelevision.setForeground(new java.awt.Color(0, 204, 204));
        lblTelevision.setText("TELEVISION");

        lblId.setText("Id:");

        lblBrand.setText("Brand:");

        lblModel.setText("Model:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        lblRoom.setText("Room:");

        lblSize.setText("Size (Inches) :");

        cmbSelectRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LivingRoom", "Bedroom 1", "Bedroom 2", "Bedroom 3" }));

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "32", "40", "42", "50", "55", "65", "70" }));

        lblVolume.setText("Volume:");

        jpnSaveEnergy.setBorder(javax.swing.BorderFactory.createTitledBorder("Save Energy"));

        btnGroupSaveEnergy.add(rbtSaveYes);
        rbtSaveYes.setText("Yes");

        btnGroupSaveEnergy.add(rbtSaveNo);
        rbtSaveNo.setText("No");

        javax.swing.GroupLayout jpnSaveEnergyLayout = new javax.swing.GroupLayout(jpnSaveEnergy);
        jpnSaveEnergy.setLayout(jpnSaveEnergyLayout);
        jpnSaveEnergyLayout.setHorizontalGroup(
            jpnSaveEnergyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSaveEnergyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rbtSaveYes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtSaveNo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpnSaveEnergyLayout.setVerticalGroup(
            jpnSaveEnergyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSaveEnergyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnSaveEnergyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtSaveYes)
                    .addComponent(rbtSaveNo))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jpnStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        btnGroupStatus.add(rbtStatusOn);
        rbtStatusOn.setText("On");

        btnGroupStatus.add(rbtStatusOff);
        rbtStatusOff.setText("Off");

        javax.swing.GroupLayout jpnStatusLayout = new javax.swing.GroupLayout(jpnStatus);
        jpnStatus.setLayout(jpnStatusLayout);
        jpnStatusLayout.setHorizontalGroup(
            jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatusLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(rbtStatusOn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtStatusOff, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jpnStatusLayout.setVerticalGroup(
            jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtStatusOn)
                    .addComponent(rbtStatusOff))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        BtnAdd.setBackground(new java.awt.Color(153, 255, 153));
        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        BtnShowTVList.setBackground(new java.awt.Color(153, 255, 153));
        BtnShowTVList.setText("Show TV List");
        BtnShowTVList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnShowTVListActionPerformed(evt);
            }
        });

        BtnRemove.setBackground(new java.awt.Color(153, 255, 153));
        BtnRemove.setText("Remove");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });

        tblTelevision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(tblTelevision);

        btnCalulateTVDimensiions.setBackground(new java.awt.Color(102, 255, 255));
        btnCalulateTVDimensiions.setText("Calculate TV Dimensions");
        btnCalulateTVDimensiions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalulateTVDimensiionsActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Select a TV to calculate its dimensions:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jpnButtonsLayout = new javax.swing.GroupLayout(jpnButtons);
        jpnButtons.setLayout(jpnButtonsLayout);
        jpnButtonsLayout.setHorizontalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonsLayout.createSequentialGroup()
                        .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(BtnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(BtnShowTVList)
                        .addGap(68, 68, 68)
                        .addComponent(btnCalulateTVDimensiions, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnButtonsLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jpnButtonsLayout.setVerticalGroup(
            jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnButtonsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdd)
                    .addComponent(BtnShowTVList)
                    .addComponent(BtnRemove)
                    .addComponent(btnCalulateTVDimensiions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTelevisionImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImgTelevision.png"))); // NOI18N

        sldVolume.setMajorTickSpacing(10);
        sldVolume.setPaintLabels(true);
        sldVolume.setPaintTicks(true);
        sldVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldVolumeStateChanged(evt);
            }
        });

        BtnReturn.setBackground(new java.awt.Color(102, 204, 255));
        BtnReturn.setText("Return");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 153, 153));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTelevisionLayout = new javax.swing.GroupLayout(jpnTelevision);
        jpnTelevision.setLayout(jpnTelevisionLayout);
        jpnTelevisionLayout.setHorizontalGroup(
            jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                    .addComponent(lblRoom)
                    .addComponent(lblSize)
                    .addComponent(lblVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnSaveEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                                .addComponent(lblVolumeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(cmbSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(BtnReturn)
                .addGap(116, 116, 116)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTelevisionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTelevisionImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTelevision, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        jpnTelevisionLayout.setVerticalGroup(
            jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelevisionImage)
                    .addComponent(lblTelevision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addComponent(jpnSaveEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBrand)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnTelevisionLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblRoom)
                                .addGap(18, 18, 18)
                                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSize)
                                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbSelectRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVolumeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVolume)))
                    .addGroup(jpnTelevisionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sldVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jpnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jpnTelevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReturn)
                    .addComponent(BtnExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTelevision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTelevision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
        int renglon = tblTelevision.getSelectedRow();
        if (renglon == -1) {
            JOptionPane.showMessageDialog(this, "Error, Select the Television to delete");
            return;
        }
        String idRemove = tblTelevision.getValueAt(renglon, 0).toString();
        int respuesta = JOptionPane.showConfirmDialog(this, "Are you shure to delete the Television");
        boolean answerDelete = Delete(idRemove);
        if (answerDelete == true) {
            read();
            JOptionPane.showMessageDialog(this, "The Television was successfully deleted");
        } else {
            JOptionPane.showMessageDialog(this, "The Television could not been deleted");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void BtnShowTVListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnShowTVListActionPerformed
        read();

        // TODO add your handling code here:
    }//GEN-LAST:event_BtnShowTVListActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed

        try {
            Document data = new Document();

            data.put("Id", Integer.parseInt(txtId.getText()));
            data.put("Brand", txtBrand.getText());
            data.put("Model", txtModel.getText());
            data.put("Room", cmbSelectRoom.getSelectedItem().toString());
            data.put("Size", cmbSize.getSelectedItem().toString());

            //Radio buton Save Energy
            if (rbtSaveYes.isSelected()){
                data.put("EnergySave",("Yes"));
            }

            else if(rbtSaveNo.isSelected()){
                data.put("EnergySave",("No"));
            }

            //Radio buton Status
            if (rbtStatusOn.isSelected()){
                data.put("Status",("On"));
            }

            else if(rbtStatusOff.isSelected()){
                data.put("Status",("Off"));
            }
            
            data.put("Volumen", lblVolumeValue.getText());


            Television.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully");

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "There was an error");
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void sldVolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldVolumeStateChanged
        lblVolumeValue.setText(String.valueOf(sldVolume.getValue()));
    }//GEN-LAST:event_sldVolumeStateChanged

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        this.setVisible(false);
        new FrmDevices().setVisible(true);
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void btnCalulateTVDimensiionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalulateTVDimensiionsActionPerformed
     
        calculateDimensionsOfTv();
        
    }//GEN-LAST:event_btnCalulateTVDimensiionsActionPerformed

    public float calculateDimensionsOfTv(){
        
        DefaultTableModel tm = (DefaultTableModel) tblTelevision.getModel();
        String TelevisionSize = String.valueOf(tm.getValueAt(tblTelevision.getSelectedRow(),5));
        
        int TelevisionSizeInt = Integer.parseInt(TelevisionSize);
        
        int diagonalSize = TelevisionSizeInt;
        double high;
        double width;
 
        high = diagonalSize*2.21;
        BigDecimal bdhigh = new BigDecimal(high).setScale(2, RoundingMode.HALF_UP);
        double highRounded = bdhigh.doubleValue();
        
        width = (diagonalSize*1.245);
        BigDecimal bdwidth = new BigDecimal(width).setScale(2, RoundingMode.HALF_UP);
        double widthRounded = bdwidth.doubleValue();
        
        JOptionPane.showMessageDialog(this, "The TV High is: " + highRounded + " centimeters, and the TV width is " + widthRounded + " centimeters.");
        return 0;

        }
    
    
     public void read(){
        
        MongoCursor<Document> consulta = Television.find().iterator();
        
        int total = table.getRowCount();
        for(int i = 0; i<total; i++){
            table.removeRow(0);
        }
        while(consulta.hasNext()){
            ArrayList<Object> doc = new ArrayList<Object>(consulta.next().values());
            table.addRow(doc.toArray());
          
        }
    }

    public boolean Delete(String id){
        DeleteResult answer = Television.deleteOne(new Document("_id", new ObjectId(id)));
        if(answer.getDeletedCount()==1){
            return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(FrmTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelevision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnShowTVList;
    private javax.swing.JButton btnCalulateTVDimensiions;
    private javax.swing.ButtonGroup btnGroupSaveEnergy;
    private javax.swing.ButtonGroup btnGroupStatus;
    private javax.swing.JComboBox<String> cmbSelectRoom;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnButtons;
    private javax.swing.JPanel jpnSaveEnergy;
    private javax.swing.JPanel jpnStatus;
    private javax.swing.JPanel jpnTelevision;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTelevision;
    private javax.swing.JLabel lblTelevisionImage;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JLabel lblVolumeValue;
    private javax.swing.JRadioButton rbtSaveNo;
    private javax.swing.JRadioButton rbtSaveYes;
    private javax.swing.JRadioButton rbtStatusOff;
    private javax.swing.JRadioButton rbtStatusOn;
    private javax.swing.JSlider sldVolume;
    private javax.swing.JTable tblTelevision;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables

    private void calculateHighOfTv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
