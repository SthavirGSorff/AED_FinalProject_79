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
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthDoctorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author poojaraghu
 */
public class RequestDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDoctorJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    
    public RequestDoctorJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        requestDoctorJButton = new javax.swing.JButton();
        numberOfPatients = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        purposeJTextField = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        doctorType = new javax.swing.JComboBox();
        patientType = new javax.swing.JComboBox();
        rb2 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(731, 576));

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setText("Case:");

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Patients Type:");

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Purpose:");

        backJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("New Doctor Request");

        requestDoctorJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        requestDoctorJButton.setText("REQUEST");
        requestDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDoctorJButtonActionPerformed(evt);
            }
        });

        numberOfPatients.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        purposeJTextField.setColumns(20);
        purposeJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        purposeJTextField.setRows(5);
        jScrollPane1.setViewportView(purposeJTextField);

        jLabel8.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Number of Patients:");

        doctorType.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        doctorType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Physician", "Pediatrician", "Cardiologist", "Urologist", "Psychiatrist", "Ophthalmologist", "Orthopedist", "Dermatologist" }));

        patientType.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        patientType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Child", "Adult", "Old", "Mix" }));

        rb2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        rb2.setSelected(true);
        rb2.setText("Regular Checkup");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        rb1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        rb1.setText("New Checkup");

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Doctor Type :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backJButton)
                .addContainerGap(770, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb1)
                            .addComponent(rb2)
                            .addComponent(numberOfPatients)
                            .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorType, 0, 250, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestDoctorJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doctorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberOfPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addComponent(requestDoctorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HealthDepartmentDoctorWorkAreaJPanel dwjp = (HealthDepartmentDoctorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDoctorJButtonActionPerformed

        HealthDoctorWorkRequest request = new HealthDoctorWorkRequest();

        String typeOfDoctor = (String)doctorType.getSelectedItem();
        if(typeOfDoctor == null || typeOfDoctor.equals("")){
            JOptionPane.showMessageDialog(null, "Doctor Type can't be empty!");
            return;
        }
        request.setDoctorType(typeOfDoctor);

        String tp = numberOfPatients.getText();
        if(tp == null || tp.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Patients can't be empty!");
            return;
        }
        try {
            Integer.parseInt(tp);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a number for Number of Patients.!");
            return;
        }

        Integer totalPatients = Integer.parseInt(tp);
        if(totalPatients <= 0){
            JOptionPane.showMessageDialog(null, "Number of patients should be greater than 0!");
            return;
        }
        request.setTotalPatients(totalPatients);

        String message = purposeJTextField.getText();
        if(message == null || message.equals("")){
            JOptionPane.showMessageDialog(null, "Purpose can't be empty!");
            return;
        }
        request.setMessage(message);

        String typeOfPatient=(String)patientType.getSelectedItem();
        if(typeOfPatient == null || typeOfPatient.equals("")){
            JOptionPane.showMessageDialog(null, "Patient Type can't be empty!");
            return;
        }
        request.setPatientType(typeOfPatient);

        String patientCase;
        if(rb1.isSelected()){
            patientCase="New Checkup";
        } else {
            patientCase="Regular Checkup";
        }
        request.setCaseType(patientCase);

        request.setSender(userAccount);
        request.setStatus("Sent");

        Organization org = null;

        for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e.getEnterpriseType().equals(e.getEnterpriseType().Hospital))
            {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList())
                {
                    if (organization instanceof DoctorOrganization){
                        org = organization;
                        org.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            }
        }
        if (org!=null){
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        } else {
            JOptionPane.showMessageDialog(null, "Doctor Request Failed!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Doctor Request Sent Successfully!");
        doctorType.setSelectedIndex(0);
        numberOfPatients.setText("");
        purposeJTextField.setText("");
        patientType.setSelectedIndex(0);
        rb1.setSelected(true);
    }//GEN-LAST:event_requestDoctorJButtonActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox doctorType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numberOfPatients;
    private javax.swing.JComboBox patientType;
    private javax.swing.JTextArea purposeJTextField;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JButton requestDoctorJButton;
    // End of variables declaration//GEN-END:variables
}
