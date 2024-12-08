/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author poojaraghu
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private HealthDoctorWorkRequest request;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer,UserAccount account, HealthDoctorWorkRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.request = request;
        this.userAccount=account;
        populateField();
    }
    
    public void populateField()
    {
        txtName.setText(userAccount.getEmployee().getName());
        
        if(request.getDoctorName()!=null) {
            txtName.setText(request.getDoctorName());
            DateChooser.setDate(request.getDate());
            txtNumber.setText(String.valueOf(request.getNumber()));
            txtAddress.setText(request.getAddress());

            Date time = null;
            String volTime = request.getTime();
            SimpleDateFormat formatterDefault = new SimpleDateFormat("HH:mm");

            try {
                time = formatterDefault.parse(volTime);
            } catch (ParseException ex) {

            }

            TimeSpinner.setValue(time);
        }
    }
    private boolean phonePatternCheck(String phoneNumber) {
        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
    
    private boolean checkTime(String t,Date d)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
        String s1=t.substring(0,2);
        String s2=t.substring(3,5);
        int h1=Integer.parseInt(s1);
        int m1=Integer.parseInt(s2);
        for (Iterator<WorkRequest> it = userAccount.getWorkQueue().getWorkRequestList().iterator(); it.hasNext();)
        {
            
            HealthDoctorWorkRequest wr = (HealthDoctorWorkRequest) it.next();
            if(wr.getStatus().equalsIgnoreCase("completed"))
            {
                
                String d1 = formatter.format(wr.getDate());
                String d2= formatter.format(d);
                if(d1.equals(d2))
                {
                    String t2=wr.getTime();
                    int h2=Integer.parseInt(t2.substring(0, 2));
                    int m2=Integer.parseInt(t2.substring(3,5));
                    int minutes=Math.abs(m1-m2);
                    int hours=Math.abs(h1-h2);
                    int totalMinutes=Math.abs((hours*60)-minutes);
                    if(totalMinutes<30)
                    {
                        JOptionPane.showMessageDialog(null, "You already have an appointment at "+t2+" on this day. Try to book keeping 30 minute gap between your appointments.");
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean checkDate(Date d1, String t1)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
        Date d2 = new Date();
        String s= formatter.format(d2);
        if(d2.before(d1))
        {
            return true;
        }
        else
        {
            String s1=formatter2.format(d1);
            String s2=formatter2.format(d2);
            if(s1.equals(s2))
            {
                s=s.substring(11,16);
                int val=s.compareTo(t1);
                if(val<=0)
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        TimeSpinner = new javax.swing.JSpinner(sm);
        jLabel5 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1076, 733));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Process Doctor Request");

        backJButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setText("Date:");

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setText("Time:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(TimeSpinner, "HH:mm");
        TimeSpinner.setEditor(de);
        TimeSpinner.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setText("Office Number:");

        txtNumber.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        submitBtn.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        DateChooser.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(TimeSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
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
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateAssignedTable();
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String docName=txtName.getText();
        if(docName==null || docName.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Name can't be empty!");
            return;
        }
        String address=txtAddress.getText();
        if(address==null || address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Address can't be empty!");
            return;
        }
        String num = txtNumber.getText();
        if(!phonePatternCheck(num))
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number!");
            return;
        }

        Date docDate = DateChooser.getDate();
        if(docDate == null || docDate.equals("")){
            JOptionPane.showMessageDialog(null, "Date can't be empty!");
            return;
        }

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        Date time =  (Date) TimeSpinner.getValue();
        String docTime = format.format(time);
        if(docTime == null || docTime.equals("")){
            JOptionPane.showMessageDialog(null, "Time can't be empty!");
            return;
        }

        if(!checkDate(docDate, docTime)){
            JOptionPane.showMessageDialog(null, "Date and Time cannot be in the Past");
            return;
        }

        if(!checkTime(docTime,docDate)){
            return;
        }

        request.setDate(docDate);
        request.setTime(docTime);
        request.setDoctorName(docName);
        request.setAddress(address);
        request.setNumber(num);
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Appointment Fixed Successfully!");
        DateChooser.setDate(null);
        txtName.setText("");
        txtNumber.setText("");
        txtAddress.setText("");

    }//GEN-LAST:event_submitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JSpinner TimeSpinner;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
