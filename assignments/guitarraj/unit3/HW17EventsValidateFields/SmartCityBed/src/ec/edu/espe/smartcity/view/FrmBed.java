package ec.edu.espe.smartcity.view;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.smartcity.model.Bed;
import utils.Connection;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Guitarra Jhon
 * 
 */

public class FrmBed extends javax.swing.JFrame {
    
    MongoCollection<Document> ListBed = new Connection().obtenerDB().getCollection("SmartBed");
    private Bed bed;
    public FrmBed(Bed newBed) {
        initComponents();
        this.bed = newBed;
        UpdateBed();
        btnUpdate.setEnabled(true);
    }

    private FrmBed() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbmgAvailability = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtPrice = new javax.swing.JTextField();
        cbnMattressType = new javax.swing.JComboBox<>();
        cbnMaterials = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbnFrames = new javax.swing.JComboBox<>();
        cbnPlazas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNoSerie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPersonalizedBed = new javax.swing.JTextField();
        lblErrortxtSeries = new javax.swing.JLabel();
        lblErrortxtPrice = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnListContacts = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        cbnMattressType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR FOAM MATTRESS", "VISCOELASTIC MATTRESS", "(HR+VISCOELASTIC)", "LATEX MATTRESS", "POCKET SPRING MATTRESS", "BONELL SPRING MATTRESS" }));
        cbnMattressType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnMattressTypeActionPerformed(evt);
            }
        });

        cbnMaterials.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chilean Pine", "MDF", "Water-repellent MDF", "Fine woods" }));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel2.setText("GUITARRA BED");

        jLabel4.setText("Price");

        jLabel5.setText("Mattress Type");

        jLabel6.setText("Frames");

        jLabel7.setText("Materials");

        jLabel8.setText("Plazas");

        cbnFrames.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guest beds", "Divan", "ttomans", "Bunk beds", "Studio bunk bed", "Bunk beds and mezzanine", "Nest", "Bookstore", "Platform", "Captain's bed", "Poster", "Extra Long" }));

        cbnPlazas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1 and 1/2", "Twin", "2", "2 and 1/2", "Queen", "King" }));

        jLabel3.setText("No   Serie");

        txtNoSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoSerieActionPerformed(evt);
            }
        });
        txtNoSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoSerieKeyTyped(evt);
            }
        });

        jLabel1.setText("Personalized name of the bed");

        txtPersonalizedBed.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        txtPersonalizedBed.setForeground(new java.awt.Color(102, 102, 255));

        lblErrortxtSeries.setForeground(new java.awt.Color(255, 0, 51));
        lblErrortxtSeries.setEnabled(false);

        lblErrortxtPrice.setForeground(new java.awt.Color(255, 0, 51));
        lblErrortxtPrice.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbnMaterials, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(cbnMattressType, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                            .addComponent(cbnFrames, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbnPlazas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNoSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrortxtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrortxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPersonalizedBed))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtNoSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrortxtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbnMattressType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbnFrames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbnMaterials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbnPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPersonalizedBed, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblErrortxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListContacts, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnListContacts))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnUpdate))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        InsertNewBed();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListContactsActionPerformed
        opentable();
    }//GEN-LAST:event_btnListContactsActionPerformed

    private void cbnMattressTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnMattressTypeActionPerformed

    }//GEN-LAST:event_cbnMattressTypeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed

    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtNoSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoSerieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        FrmFindBed ven =new FrmFindBed();
        ven.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Update();
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        String temp = "";
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            lblErrortxtPrice.setEnabled(false);
        }else{
            lblErrortxtPrice.setEnabled(true);
            System.out.println(txtPrice.getText());
            lblErrortxtPrice.setText("Only Numbers");
            temp = txtPrice.getText().replaceFirst(".$","");
            txtPrice.setText(temp);
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtNoSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoSerieKeyTyped
        String temp = "";
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            lblErrortxtSeries.setEnabled(false);
        }else{
            lblErrortxtSeries.setEnabled(true);
            System.out.println(txtNoSerie.getText());
            lblErrortxtSeries.setText("Only Numbers");
            temp = txtPrice.getText().replaceFirst(".$","");
            txtPrice.setText(temp);
        }
    }//GEN-LAST:event_txtNoSerieKeyTyped
     
    public void InsertNewBed(){
        try{

            Document data = new Document();
            data.put("Price of bed", Float.parseFloat(txtPrice.getText()));
            data.put("Serie", Integer.parseInt(txtNoSerie.getText()));
            data.put("Mattress Type", cbnMattressType.getSelectedItem().toString());
            data.put("Frames of Bed", cbnFrames.getSelectedItem().toString());
            data.put("Materials of Bed",cbnMaterials.getSelectedItem().toString());   
            data.put("Plazas",cbnPlazas.getSelectedItem().toString());
            data.put("PersonalizedBed",txtPersonalizedBed.getText());
            ListBed.insertOne(data);

            JOptionPane.showMessageDialog(this, "Successfully Insert Serie:" + Integer.parseInt(txtNoSerie.getText()) );

            }catch(Exception err){

                JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());

            }
    }
    public void Update(){
        try{
            Document documento = new Document();
            documento.put("Serie", Integer.parseInt(txtNoSerie.getText()));
            MongoCursor<Document> search = ListBed.find(documento).iterator();
            
            Document data = new Document();
            data.put("Price of bed", Float.parseFloat(txtPrice.getText()));
            data.put("Serie", Integer.parseInt(txtNoSerie.getText()));
            data.put("Mattress Type", cbnMattressType.getSelectedItem().toString());
            data.put("Frames of Bed", cbnFrames.getSelectedItem().toString());
            data.put("Materials of Bed",cbnMaterials.getSelectedItem().toString());   
            data.put("Plazas",cbnPlazas.getSelectedItem().toString());
            data.put("PersonalizedBed",txtPersonalizedBed.getText());
            
            while (search.hasNext()) {
                ArrayList<Object> found = new ArrayList<Object>(search.next().values());
                System.out.println(found);
                JOptionPane.showMessageDialog(this,"The Serie :"+txtNoSerie.getText()+"was updated successfully");
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "ERROR: " + err.getMessage());
        }
    }
    public void opentable(){
        FrmShowList ven =new FrmShowList();
            ven.setVisible(true);
    }
    public void UpdateBed(){
        txtPrice.setText(String.valueOf(bed.getPrice()));
        txtNoSerie.setText(String.valueOf(bed.getSerial()));
        txtPersonalizedBed.setText(bed.getPersonalizedBed());
        
        if (bed.getMattressType().toString().equals("HR FOAM MATTRESS")){
            this.cbnMattressType.setSelectedItem("HR FOAM MATTRESS");
        }else if(bed.getMattressType().toString().equals("VISCOELASTIC MATTRESS")){
            this.cbnMattressType.setSelectedItem("VISCOELASTIC MATTRESS");
        }else if(bed.getMattressType().toString().equals("(HR+VISCOELASTIC)")){
            this.cbnMattressType.setSelectedItem("(HR+VISCOELASTIC)");
        }else if(bed.getMattressType().toString().equals("LATEX MATTRESS")){
            this.cbnMattressType.setSelectedItem("LATEX MATTRESS");
        }else if(bed.getMattressType().toString().equals("POCKET SPRING MATTRESS")){
            this.cbnMattressType.setSelectedItem("POCKET SPRING MATTRESS");
        }else if(bed.getMattressType().toString().equals("POCKET SPRING MATTRESS")){
            this.cbnMattressType.setSelectedItem("POCKET SPRING MATTRESS");
        }
        if (bed.getFrames().toString().equals("Guest beds")){
            this.cbnFrames.setSelectedItem("Guest beds");
        }else if(bed.getFrames().toString().equals("Divan")){
            this.cbnFrames.setSelectedItem("Divan");
        }else if(bed.getFrames().toString().equals("ttomans")){
            this.cbnFrames.setSelectedItem("ttomans");
        }else if(bed.getFrames().toString().equals("Bunk beds")){
            this.cbnFrames.setSelectedItem("Bunk beds");
        }else if(bed.getFrames().toString().equals("Studio bunk bed")){
            this.cbnFrames.setSelectedItem("Studio bunk bed");
        }else if(bed.getFrames().toString().equals("Bunk beds and mezzanine")){
            this.cbnFrames.setSelectedItem("Bunk beds and mezzanine");
        }else if(bed.getFrames().toString().equals("Nest")){
            this.cbnFrames.setSelectedItem("Nest");
        }else if(bed.getFrames().toString().equals("Bookstore")){
            this.cbnFrames.setSelectedItem("Bookstore");
        }else if(bed.getFrames().toString().equals("Platform")){
            this.cbnFrames.setSelectedItem("Platform");
        }else if(bed.getFrames().toString().equals("Captain's bed")){
            this.cbnFrames.setSelectedItem("Captain's bed");
        }else if(bed.getFrames().toString().equals("Poster")){
            this.cbnFrames.setSelectedItem("Poster");
        }else if(bed.getFrames().toString().equals("Extra Long")){
            this.cbnFrames.setSelectedItem("Extra Long");
        }
        if(bed.getMaterials().toString().equals("Chilean Pine")){
            this.cbnMaterials.setSelectedItem("Chilean Pine");
        }else if(bed.getMaterials().toString().equals("MDF")){
            this.cbnMaterials.setSelectedItem("MDF");
        }else if(bed.getMaterials().toString().equals("Water-repellent MDF")){
            this.cbnMaterials.setSelectedItem("Water-repellent MDF");
        }else if(bed.getMaterials().toString().equals("Fine woods")){
            this.cbnMaterials.setSelectedItem("Fine woods");
        }
        if(bed.getPlazas().toString().equals("1")){
            this.cbnPlazas.setSelectedItem("1");
        }else if(bed.getPlazas().toString().equals("1 and 1/2")){
            this.cbnPlazas.setSelectedItem("1 and 1/2");
        }else if(bed.getPlazas().toString().equals("Twin")){
            this.cbnPlazas.setSelectedItem("Twin");
        }else if(bed.getPlazas().toString().equals("2")){
            this.cbnPlazas.setSelectedItem("2");
        }else if(bed.getPlazas().toString().equals("2 and 1/2")){
            this.cbnPlazas.setSelectedItem("2 and 1/2");
        }else if(bed.getPlazas().toString().equals("Queen")){
            this.cbnPlazas.setSelectedItem("Queen");
        }else if(bed.getPlazas().toString().equals("King")){
            this.cbnPlazas.setSelectedItem("King");
        }
    }
   
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBed().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnListContacts;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbnFrames;
    private javax.swing.JComboBox<String> cbnMaterials;
    private javax.swing.JComboBox<String> cbnMattressType;
    private javax.swing.JComboBox<String> cbnPlazas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jbmgAvailability;
    private javax.swing.JLabel lblErrortxtPrice;
    private javax.swing.JLabel lblErrortxtSeries;
    private javax.swing.JTextField txtNoSerie;
    private javax.swing.JTextField txtPersonalizedBed;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}