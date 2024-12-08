/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EducationRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationVolunteerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author poojaraghu
 */
public class RequestVolunteerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestVolunteerJPanel
     */
    public RequestVolunteerJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        placeJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jobTitleJTextField = new javax.swing.JTextField();
        numberOfStudentsJTextField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        requirementsJTextArea1 = new javax.swing.JTextArea();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        volunteeringTime = new javax.swing.JSpinner(sm);
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numberOfHoursJTextField = new javax.swing.JTextField();
        areaJTextField = new javax.swing.JTextField();
        requestVolunteerJButton = new javax.swing.JButton();
        numberOfVolunteersJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        volunteeringDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1033, 965));

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Number of Volunteers:");

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Requirements:");

        jLabel7.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Place:");

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setText("Date:");

        placeJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Job Title:");

        jLabel8.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Number of Students:");

        jobTitleJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        numberOfStudentsJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        requirementsJTextArea1.setColumns(20);
        requirementsJTextArea1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        requirementsJTextArea1.setRows(5);
        jScrollPane4.setViewportView(requirementsJTextArea1);

        JSpinner.DateEditor de = new JSpinner.DateEditor(volunteeringTime, "HH:mm");
        volunteeringTime.setEditor(de);
        volunteeringTime.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel6.setText("Time: ");

        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("New Volunteer Request");

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Number of Hours:");

        jLabel9.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Area:");

        numberOfHoursJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        areaJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        requestVolunteerJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        requestVolunteerJButton.setText("CREATE");
        requestVolunteerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVolunteerJButtonActionPerformed(evt);
            }
        });

        numberOfVolunteersJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        backJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        volunteeringDate.setToolTipText("");
        volunteeringDate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(numberOfHoursJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(requestVolunteerJButton)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(numberOfStudentsJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(numberOfVolunteersJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jobTitleJTextField)
                                            .addComponent(volunteeringTime)
                                            .addComponent(placeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(volunteeringDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(areaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(372, Short.MAX_VALUE))))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jobTitleJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(volunteeringTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(numberOfHoursJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfStudentsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(numberOfVolunteersJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(requestVolunteerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(volunteeringDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestVolunteerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVolunteerJButtonActionPerformed

        EducationVolunteerWorkRequest request = new EducationVolunteerWorkRequest();

        String jobTitle = jobTitleJTextField.getText();
        if(jobTitle == null || jobTitle.equals("")){
            JOptionPane.showMessageDialog(null, "Job Title can't be empty!");
            return;
        }
        request.setJobTitle(jobTitle);

        Date volDate = volunteeringDate.getDate();
        if(volDate == null || volDate.equals("")){
            JOptionPane.showMessageDialog(null, "Date can't be empty!");
            return;
        }
        if(volDate.before(new Date())){
            JOptionPane.showMessageDialog(null, "Date and Time can't be in past.");
            return;
        }
        request.setDate(volDate);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date time =  (Date) volunteeringTime.getValue();
        String volTime = format.format(time);
        if(volTime == null || volTime.equals("")){
            JOptionPane.showMessageDialog(null, "Time can't be empty!");
            return;
        }
        request.setTime(volTime);

        String place = placeJTextField.getText();
        if(place == null || place.equals("")){
            JOptionPane.showMessageDialog(null, "Place can't be empty!");
            return;
        }
        request.setPlace(place);

        String area = areaJTextField.getText();
        if(area == null || area.equals("")){
            JOptionPane.showMessageDialog(null, "Area can't be empty!");
            return;
        }
        request.setArea(area);

        String hour = numberOfHoursJTextField.getText();
        if(hour == null || hour.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Hours can't be empty!");
            return;
        }
        try {
            Integer.parseInt(hour);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a number for Number Of Hours.");
            return;
        }
        Integer numbofHours = Integer.parseInt(hour);
        if(numbofHours<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of hours should be greater than 0.");
            return;
        }
        request.setNumberOfhours(numbofHours);

        String student = numberOfStudentsJTextField.getText();
        if(student == null || student.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Students can't be empty!");
            return;
        }
        try {
            Integer.parseInt(student);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a number for Number Of Students.");
            return;
        }
        Integer numbOfStudents = Integer.parseInt(student);
        if(numbOfStudents<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of students should be greater than 0.");
            return;
        }
        request.setNumberOfStudents(numbOfStudents);

        String vol = numberOfVolunteersJTextField.getText();
        if(vol == null || vol.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Volunteers can't be empty!");
            return;
        }
        try {
            Integer.parseInt(vol);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter a number for Number Of Volunteers.");
            return;
        }
        Integer numbOfVol = Integer.parseInt(vol);
        if(numbOfVol<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of volunteers should be greater than 0.");
            return;
        }
        request.setNumberOfVolunteers(numbOfVol);
        request.setCurrentVacancy(numbOfVol);

        String message = requirementsJTextArea1.getText();
        if(message == null || message.equals("")){
            JOptionPane.showMessageDialog(null, "Requirements can't be empty!");
            return;
        }
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof VolunteerOrganization){
                org = organization;
                break;
            }
        }

        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        } else {
            JOptionPane.showMessageDialog(null, "Volunteer Request Failed to Sent!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Volunteer Request Sent Successfully!");

        jobTitleJTextField.setText("");
        volunteeringDate.setDate(null);
        placeJTextField.setText("");
        areaJTextField.setText("");
        numberOfHoursJTextField.setText("");
        numberOfStudentsJTextField.setText("");
        numberOfVolunteersJTextField.setText("");
        requirementsJTextArea1.setText("");
    }//GEN-LAST:event_requestVolunteerJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EducationDepartmentWorkAreaJPanel dwjp = (EducationDepartmentWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaJTextField;
    private javax.swing.JButton backJButton;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jobTitleJTextField;
    private javax.swing.JTextField numberOfHoursJTextField;
    private javax.swing.JTextField numberOfStudentsJTextField;
    private javax.swing.JTextField numberOfVolunteersJTextField;
    private javax.swing.JTextField placeJTextField;
    private javax.swing.JButton requestVolunteerJButton;
    private javax.swing.JTextArea requirementsJTextArea1;
    private com.toedter.calendar.JDateChooser volunteeringDate;
    private javax.swing.JSpinner volunteeringTime;
    // End of variables declaration//GEN-END:variables
}
