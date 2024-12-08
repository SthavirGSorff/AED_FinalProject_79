/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HealthRole;

import userinterface.HealthRole.*;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HealthOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthDoctorWorkRequest;
import Business.WorkQueue.HealthPharmacyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author poojaraghu
 */
public class RequestPharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPharmacyJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private String prescription=null;
    
    public RequestPharmacyJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        populateTable();
    }
    
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMedicines.getModel();
        dtm.setRowCount(0);  
        if(userAccount.getMedicineList().isEmpty())
            return;
        
        for(Medicine medicine: userAccount.getMedicineList()){
            Object[] row = new Object[2];
            row[0] = medicine;
            row[1] = medicine.getQuantity();
            dtm.addRow(row);
        }
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
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicines = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        txtFieldPin = new javax.swing.JTextField();
        btnRequestMedicine = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFieldState = new javax.swing.JTextField();
        txtFieldCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFieldArea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldStreet = new javax.swing.JTextField();
        labelPicture = new javax.swing.JLabel();
        txtFieldQuantity = new javax.swing.JTextField();
        txtFieldMedicineName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(921, 970));

        jLabel7.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("State:");

        btnDelete.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Contact Number:");

        txtNumber.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        tblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicinesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicines);

        btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Street:");

        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("New Pharmacy Request");

        backJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        txtFieldPin.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        btnRequestMedicine.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnRequestMedicine.setText("Request Medicine");
        btnRequestMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestMedicineActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Pincode:");

        txtFieldState.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        txtFieldCity.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("City:");

        txtFieldArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Area:");

        txtFieldStreet.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        labelPicture.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        labelPicture.setText("No image uploaded");

        txtFieldQuantity.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        txtFieldMedicineName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setText("Medicine Name:");

        btnUpload.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setText("Prescription:");

        btnModify.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldPin, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRequestMedicine)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(labelPicture)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFieldQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(txtFieldMedicineName, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addComponent(btnRequestMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicines.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete this medicine?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Medicine medicine = (Medicine) tblMedicines.getValueAt(selectedRow, 0);
                userAccount.getMedicineList().remove(medicine);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtFieldMedicineName.getText();
        String quantityText = txtFieldQuantity.getText();
        if(name==null || name.equals("") || quantityText.equals("") || quantityText==null){
            JOptionPane.showMessageDialog(null,"Please enter medicine details to add one.");
            return;
        }

        try {
            Integer.parseInt(txtFieldQuantity.getText());
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type in a number for Quantity");
            return;
        }
        int quantity = Integer.parseInt(quantityText);
        if(quantity<=0){
            JOptionPane.showMessageDialog(null, "Please type in a valid quantity, should be greater than 0.");
            return;
        }
        if(!(userAccount.getMedicineList()==null)){
            for(Medicine medicine:userAccount.getMedicineList()){
                if(medicine.getName().equalsIgnoreCase(name)){
                    JOptionPane.showMessageDialog(null,"This medicine is already entered in the cart. You can change the quantity of the medicine by selecting it and clicking the MODIFY button");
                    return;
                }
            }
        }

        LocalDate date = LocalDate.now();
        Medicine med = new Medicine(name, quantity,date);
        userAccount.getMedicineList().add(med);
        txtFieldMedicineName.setText("");
        txtFieldQuantity.setText("");
        populateTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void tblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicinesMouseClicked
        // TODO add your handling code here:
        //        int selectedRow = tblMedicines.getSelectedRow();
        //        Medicine medicine = (Medicine) tblMedicines.getValueAt(selectedRow, 0);
        //        txtFieldMedicineName.setText(medicine.getName());
        //        txtFieldQuantity.setText(medicine.getQuantity()+"");
    }//GEN-LAST:event_tblMedicinesMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int selectedRow = tblMedicines.getSelectedRow();
        Medicine medicine = (Medicine) tblMedicines.getValueAt(selectedRow, 0);

        String name = txtFieldMedicineName.getText();
        String quantityText = txtFieldQuantity.getText();
        if(name==null || name.equals("") || quantityText.equals("") || quantityText==null){
            JOptionPane.showMessageDialog(null,"Please enter medicine details to add one.");
            return;
        }

        try{
            Integer.parseInt(txtFieldQuantity.getText());
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please type in a number for Quantity");
            return;
        }

        int quantity = Integer.parseInt(quantityText);

        LocalDate date = LocalDate.now();
        medicine.setName(name);
        medicine.setQuantity(quantity);
        medicine.setOrderedDate(date);
        JOptionPane.showMessageDialog(null, "Medicine details updated successfully");

        txtFieldMedicineName.setText("");
        txtFieldQuantity.setText("");
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(true);
        btnModify.setEnabled(true);
        btnUpdate.setEnabled(false);
        tblMedicines.setEnabled(true);
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HealthDepartmentPharmacyWorkAreaJPanel dwjp = (HealthDepartmentPharmacyWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRequestMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestMedicineActionPerformed

        HealthPharmacyWorkRequest request = new HealthPharmacyWorkRequest();

        List<Medicine> medList = new ArrayList<Medicine>(userAccount.getMedicineList());
        if(medList.isEmpty()){
            JOptionPane.showMessageDialog(null, "No medicines added! Please add a medicine to request.");
            return;
        }

        request.setMedicineList(medList);

        for(Medicine medicine : userAccount.getMedicineList()){
            userAccount.getMedicineHistory().add(medicine);
        }

        String street = txtFieldStreet.getText();
        String area = txtFieldArea.getText();
        String city = txtFieldCity.getText();
        String state = txtFieldState.getText();
        String pin = txtFieldPin.getText();
        if(street == null || street.equals("") || area==null || area.equals("") || city==null || city.equals("") || pin==null || pin.equals("") || state==null || state.equals("")){
            JOptionPane.showMessageDialog(null, "Please complete the address details!");
            return;
        }
        String contactNumber = txtNumber.getText();
        if(contactNumber == null || contactNumber.equals("")){
            JOptionPane.showMessageDialog(null, "Contact Number can't be empty!");
            return;
        }
        if(!phonePatternCheck(contactNumber)){
            JOptionPane.showMessageDialog(null, "Please enter a valid Contact Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!pinpatternCheck(pin)){
            JOptionPane.showMessageDialog(null, "Please enter a valid Pincode.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        request.setPrescription(prescription);
        request.setArea(area);
        request.setCity(city);
        request.setStreet(street);
        request.setState(state);
        request.setPinCode(pin);
        request.setSenderNumber(contactNumber);

        String address = street+", "+area+", "+city+", "+state+"- "+pin;
        request.setAddress(address);
        request.setSenderAddress(address);

        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setNgo(enterprise.getName());

        Organization org = null;

        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e.getEnterpriseType().equals(e.getEnterpriseType().Hospital))
            {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList())
                {
                    if (organization instanceof PharmacyOrganization){
                        org = organization;
                        org.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            }
        }

        if(org!=null){
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        } else {
            JOptionPane.showMessageDialog(null, "Medcines Request Failed.");
        }

        JOptionPane.showMessageDialog(null, "Medcines Request Sent Successfully");

        txtFieldArea.setText("");
        txtFieldCity.setText("");
        txtFieldPin.setText("");
        txtFieldState.setText("");
        txtFieldStreet.setText("");
        txtNumber.setText("");

        DefaultTableModel dtm = (DefaultTableModel) tblMedicines.getModel();
        dtm.setRowCount(0);

    }//GEN-LAST:event_btnRequestMedicineActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            prescription = path;
            labelPicture.setText("");
            labelPicture.setIcon(resizeImage(path));
        }
        //if the user click on save in Jfilechooser
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicines.getSelectedRow();
        if(selectedRow>=0){
            Medicine medicine = (Medicine) tblMedicines.getValueAt(selectedRow, 0);
            txtFieldMedicineName.setText(medicine.getName());
            txtFieldQuantity.setText(String.valueOf(medicine.getQuantity()));
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtFieldMedicineName.setEditable(true);
        txtFieldQuantity.setEditable(true);
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnModify.setEnabled(false);
        btnUpdate.setEnabled(true);
        tblMedicines.setEnabled(false);
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRequestMedicine;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPicture;
    private javax.swing.JTable tblMedicines;
    private javax.swing.JTextField txtFieldArea;
    private javax.swing.JTextField txtFieldCity;
    private javax.swing.JTextField txtFieldMedicineName;
    private javax.swing.JTextField txtFieldPin;
    private javax.swing.JTextField txtFieldQuantity;
    private javax.swing.JTextField txtFieldState;
    private javax.swing.JTextField txtFieldStreet;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}