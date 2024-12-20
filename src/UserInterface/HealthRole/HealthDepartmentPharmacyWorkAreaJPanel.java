/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HealthRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HealthOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthDoctorWorkRequest;
import Business.WorkQueue.HealthPharmacyWorkRequest;
import Business.WorkQueue.VolunteerInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.DoctorRole.ProcessWorkRequestJPanel;

/**
 *
 * @author poojaraghu
 */
public class HealthDepartmentPharmacyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthDepartmentDoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HealthOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    
    public HealthDepartmentPharmacyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HealthOrganization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        txtSenderContact = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        txtDelivered = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineRequestJTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtDeliveryContact = new javax.swing.JTextField();
        requestJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        deleteRequestJButton = new javax.swing.JButton();
        txtDeliveryDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 976));

        txtSent.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request Pharmacy Work Area");

        jLabel13.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel13.setText("Sender Contact");

        enterpriseLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        enterpriseLabel.setText("EnterPrise -");

        txtSenderContact.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        valueLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        valueLabel.setText("<value>");

        jLabel11.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel11.setText("Delivered By");

        refreshTestJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        txtDelivered.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        medicineRequestJTable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        medicineRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Address", "MedicineList", "Pharmacist", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicineRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicineRequestJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicineRequestJTable);

        jLabel9.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel9.setText("Delivery Contact");

        txtDeliveryContact.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        requestJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        requestJButton.setText("New Request");
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel10.setText("Delivery Date");

        deleteRequestJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        deleteRequestJButton.setText("Delete Request");
        deleteRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRequestJButtonActionPerformed(evt);
            }
        });

        txtDeliveryDate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnUpdate.setText("View Status or Updates");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel12.setText("Sent By");

        btnBack.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requestJButton)
                                .addGap(140, 140, 140)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteRequestJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(txtDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(txtDeliveryContact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(txtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(txtSenderContact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtSent, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterpriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valueLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deleteRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenderContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDeliveryContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateRequestTable() {
       DefaultTableModel model = (DefaultTableModel) medicineRequestJTable.getModel();
       model.setRowCount(0);
       for (Iterator<WorkRequest> it = userAccount.getWorkQueue().getWorkRequestList().iterator(); it.hasNext();) 
       {
           WorkRequest workRequest = it.next();
           if(workRequest instanceof HealthPharmacyWorkRequest){
           HealthPharmacyWorkRequest request = (HealthPharmacyWorkRequest) workRequest;
           Object[] row = new Object[5];
           row[0] = request;
           row[1] = request.getAddress();
           row[2] = request.getMedicineList();
           row[3] = request.getReceiver();
           row[4] = request.getStatus();
           model.addRow(row);
           }
       }
    }
    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        txtDelivered.setText("");
        txtDeliveryContact.setText("");
        txtDeliveryDate.setText("");
        txtSenderContact.setText("");
        txtSent.setText("");
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void medicineRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicineRequestJTableMouseClicked
        int selectedRow = medicineRequestJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showConfirmDialog(null, "Please select a row from table to view details.!","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest w = (WorkRequest) medicineRequestJTable.getValueAt(selectedRow, 0);
            HealthPharmacyWorkRequest wr = (HealthPharmacyWorkRequest) w;

            if(wr.getStatus().equals("Delivered")){
                txtDelivered.setText(wr.getDelivery().getEmployee().getName());
                txtDeliveryContact.setText(wr.getDeliveryNumber());
                SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
                Date date = wr.getExpectedDelivery();
                String pickDate = formatter.format(date);
                txtDeliveryDate.setText(pickDate);
                txtSenderContact.setText(wr.getRecieverNumber());
                txtSent.setText(wr.getReceiver().getEmployee().getName());
            }

        }
    }//GEN-LAST:event_medicineRequestJTableMouseClicked

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestPharmacyJPanel", new RequestPharmacyJPanel(userProcessContainer, userAccount, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestJButtonActionPerformed

    private void deleteRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRequestJButtonActionPerformed
        int selectedRow = medicineRequestJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to Delete this request??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                HealthPharmacyWorkRequest request = (HealthPharmacyWorkRequest)medicineRequestJTable.getValueAt(selectedRow, 0);
                if(request.getStatus().equalsIgnoreCase("Completed")){
                    JOptionPane.showMessageDialog(null, "Completed Request cannot be deleted!");
                    return;
                }
                if(request.getStatus().equalsIgnoreCase("Delivered")){
                    JOptionPane.showMessageDialog(null, "Delivered Request cannot be deleted!");
                    return;
                }
                if(request.getStatus().equalsIgnoreCase("Accepted")){
                    JOptionPane.showMessageDialog(null, "Accepted Request cannot be deleted!");
                    return;
                }
                if(request.getStatus().equalsIgnoreCase("Delivery Requested")){
                    JOptionPane.showMessageDialog(null, "Delivery Requested cannot be deleted!");
                    return;
                }
                if(request.getStatus().equalsIgnoreCase("Delivery Assigned")){
                    JOptionPane.showMessageDialog(null, "Delivery Assigned cannot be deleted!");
                    return;
                }
                Organization org = null;
                for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
                {
                    if(e.getEnterpriseType().equals(e.getEnterpriseType().Hospital))
                    {
                        for (Organization organization : e.getOrganizationDirectory().getOrganizationList())
                        {
                            if (organization instanceof PharmacyOrganization){
                                org = organization;
                                org.getWorkQueue().getWorkRequestList().remove(request);

                                for(UserAccount a : org.getUserAccountDirectory().getUserAccountList())
                                {
                                    for(WorkRequest w: a.getWorkQueue().getWorkRequestList())
                                    {
                                        if(w.equals(request))
                                        {
                                            a.getWorkQueue().getWorkRequestList().remove(request);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (org!=null){
                    userAccount.getWorkQueue().getWorkRequestList().remove(request);
                }
                populateRequestTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteRequestJButtonActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = medicineRequestJTable.getSelectedRow();
        if(selectedRow>=0)
        {
            HealthPharmacyWorkRequest request = (HealthPharmacyWorkRequest)medicineRequestJTable.getValueAt(selectedRow, 0);
            if(request.getStatus().equalsIgnoreCase("Sent"))
            {
                JOptionPane.showMessageDialog(null, "No updates available");
                return;
            }
            ViewStatusJPanel panel = new ViewStatusJPanel(userProcessContainer,enterprise,userAccount,request);
            userProcessContainer.add("ViewStatusJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton deleteRequestJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineRequestJTable;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestJButton;
    private javax.swing.JTextField txtDelivered;
    private javax.swing.JTextField txtDeliveryContact;
    private javax.swing.JTextField txtDeliveryDate;
    private javax.swing.JTextField txtSenderContact;
    private javax.swing.JTextField txtSent;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
