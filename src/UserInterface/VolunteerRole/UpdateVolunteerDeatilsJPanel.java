/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.VolunteerRole;

import Business.Employee.Volunteer;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import UserInterface.EducationRole.EducationDepartmentWorkAreaJPanel;
<<<<<<< HEAD

=======
>>>>>>> main
/**
 *
 * @author sthavir
 */
public class UpdateVolunteerDeatilsJPanel extends javax.swing.JPanel {
<<<<<<< HEAD

=======
    
>>>>>>> main
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Volunteer volunteer;

    /**
     * Creates new form UpdateVolunteerDeatilsJPanel
     */
    public UpdateVolunteerDeatilsJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        populateUserDetails();
    }
<<<<<<< HEAD

    public void populateUserDetails() {

=======
    
    public void populateUserDetails(){
        
>>>>>>> main
        nameTextJField.setText(userAccount.getEmployee().getName());
        genderJCombo.setSelectedItem(userAccount.getEmployee().getGender());
        LocalDate dob = userAccount.getEmployee().getBirthDate();
        Date date = Date.from(dob.atStartOfDay(ZoneId.systemDefault()).toInstant());
        DOBDate.setDate(date);

        nationalityTextJField.setText(userAccount.getEmployee().getNationality());
        emailIDTextJField.setText(userAccount.getEmployee().getEmailID());
        contactNumberTextJField.setText(userAccount.getEmployee().getContactNumber());

<<<<<<< HEAD
=======

>>>>>>> main
        addressjTextArea1.setText(userAccount.getVolunteer().getAddress());
        cityTextJField.setText(userAccount.getVolunteer().getCity());
        pincodeTextJField.setText(userAccount.getVolunteer().getPinCode());
        skillsjTextArea.setText(userAccount.getVolunteer().getAdditionalSkills());
        englishJCombo.setSelectedItem(userAccount.getVolunteer().getEnglishProficency());

        populateLang();
        populateEducation();

<<<<<<< HEAD
        if (userAccount.getVolunteer().getExpertiseList().contains("MS Word")) {
            wordjCheckBox.setSelected(true);
        }
        if (userAccount.getVolunteer().getExpertiseList().contains("MS Excel")) {
            exceljCheckBox.setSelected(true);
        }
        if (userAccount.getVolunteer().getExpertiseList().contains("PowerPoint")) {
            pptjCheckBox.setSelected(true);
        }
        if (userAccount.getVolunteer().getExpertiseList().contains("Web Browsing")) {
            webjCheckBox.setSelected(true);
        }
        if (userAccount.getVolunteer().getExpertiseList().contains("Email Checking")) {
            emailjCheckBox.setSelected(true);
        }
    }

    private void populateLang() {

        languagejTextArea.setText("");
        for (String lang : userAccount.getVolunteer().getLanguageList()) {
            languagejTextArea.append(lang + "\n");
        }
    }

    private void populateEducation() {

        educationjTextArea.setText("");
        int count = 1;
        for (Map.Entry<String, String> entry : userAccount.getVolunteer().getEducationMap().entrySet()) {
=======

        if(userAccount.getVolunteer().getExpertiseList().contains("MS Word")){
            wordjCheckBox.setSelected(true);
        }
        if(userAccount.getVolunteer().getExpertiseList().contains("MS Excel")){
            exceljCheckBox.setSelected(true);
        }
        if(userAccount.getVolunteer().getExpertiseList().contains("PowerPoint")){
            pptjCheckBox.setSelected(true);
        }
        if(userAccount.getVolunteer().getExpertiseList().contains("Web Browsing")){
            webjCheckBox.setSelected(true);
        }
        if(userAccount.getVolunteer().getExpertiseList().contains("Email Checking")){
            emailjCheckBox.setSelected(true);
        }          
    }
    
    private void populateLang(){
        
        languagejTextArea.setText("");
        for(String lang: userAccount.getVolunteer().getLanguageList()){
                 languagejTextArea.append(lang + "\n");
        }
    }
    
    private void populateEducation(){
        
        educationjTextArea.setText("");
        int count = 1;
        for(Map.Entry<String,String> entry : userAccount.getVolunteer().getEducationMap().entrySet()){
>>>>>>> main
            educationjTextArea.append(count + ".  " + entry.getKey() + " " + entry.getValue() + "\n");
            count++;
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

        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        nameTextJField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        educationjTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        DOBDate = new com.toedter.calendar.JDateChooser();
>>>>>>> main
        englishJCombo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        languagejTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressjTextArea1 = new javax.swing.JTextArea();
        languageJTextField = new javax.swing.JTextField();
        addLanguagejButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cityTextJField = new javax.swing.JTextField();
        wordjCheckBox = new javax.swing.JCheckBox();
        exceljCheckBox = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        pptjCheckBox = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        emailjCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        pincodeTextJField = new javax.swing.JTextField();
        webjCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        educationJCombo1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        skillsjTextArea = new javax.swing.JTextArea();
        nationalityTextJField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        contactNumberTextJField = new javax.swing.JTextField();
        schoolTextJField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DegreeTextJField = new javax.swing.JTextField();
        emailIDTextJField = new javax.swing.JTextField();
        addEducationjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        genderJCombo = new javax.swing.JComboBox();
<<<<<<< HEAD
        DOBDate = new com.toedter.calendar.JDateChooser();
=======
>>>>>>> main

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1141, 944));

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel17.setText("Language Proficency & Skills");

        nameTextJField.setEditable(false);
        nameTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        educationjTextArea.setEditable(false);
        educationjTextArea.setColumns(20);
        educationjTextArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        educationjTextArea.setRows(5);
        jScrollPane2.setViewportView(educationjTextArea);

        jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Name: ");

        btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("English: ");

<<<<<<< HEAD
=======
        DOBDate.setEnabled(false);
        DOBDate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

>>>>>>> main
        englishJCombo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        englishJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Excelent", "Good", "Working" }));
        englishJCombo.setEnabled(false);
        englishJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishJComboActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel8.setText("Personal Information");

        jLabel19.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel19.setText("Other Language:");

        jLabel9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel9.setText("Contact Information");

        languagejTextArea.setEditable(false);
        languagejTextArea.setColumns(20);
        languagejTextArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        languagejTextArea.setRows(5);
        jScrollPane3.setViewportView(languagejTextArea);

        jLabel10.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel10.setText("Address:");

        addressjTextArea1.setEditable(false);
        addressjTextArea1.setColumns(20);
        addressjTextArea1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        addressjTextArea1.setRows(5);
        jScrollPane1.setViewportView(addressjTextArea1);

        languageJTextField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        languageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageJTextFieldActionPerformed(evt);
            }
        });

        addLanguagejButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        addLanguagejButton.setText("ADD");
        addLanguagejButton.setEnabled(false);
        addLanguagejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLanguagejButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel11.setText("Education");

        cityTextJField.setEditable(false);
        cityTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        cityTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextJFieldActionPerformed(evt);
            }
        });

        wordjCheckBox.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        wordjCheckBox.setText("MS Word");
        wordjCheckBox.setEnabled(false);
        wordjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordjCheckBoxActionPerformed(evt);
            }
        });

        exceljCheckBox.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        exceljCheckBox.setText("MS Excel");
        exceljCheckBox.setEnabled(false);

        jLabel12.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel12.setText("City:");

        pptjCheckBox.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        pptjCheckBox.setText("PowerPoint");
        pptjCheckBox.setEnabled(false);
        pptjCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pptjCheckBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel13.setText("Pincode:");

        emailjCheckBox.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        emailjCheckBox.setText("Email Checking");
        emailjCheckBox.setEnabled(false);

        jLabel2.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Sex: ");

        pincodeTextJField.setEditable(false);
        pincodeTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        pincodeTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeTextJFieldActionPerformed(evt);
            }
        });

        webjCheckBox.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        webjCheckBox.setText("Web Browsing");
        webjCheckBox.setEnabled(false);

        jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("D.O.B:");

        educationJCombo1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        educationJCombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10th", "12th", "Bachelors", "Masters" }));
        educationJCombo1.setEnabled(false);
        educationJCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationJCombo1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel20.setText("Work Knowledge of:");

        jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nationality:");

        jLabel14.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Education: ");

        skillsjTextArea.setEditable(false);
        skillsjTextArea.setColumns(20);
        skillsjTextArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        skillsjTextArea.setRows(5);
        jScrollPane4.setViewportView(skillsjTextArea);

        nationalityTextJField.setEditable(false);
        nationalityTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        nationalityTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityTextJFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("School/University: ");

        jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel5.setText("Email Id:");

        jLabel16.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Degree:");

        jLabel21.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel21.setText("Skills:");

        contactNumberTextJField.setEditable(false);
        contactNumberTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        contactNumberTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberTextJFieldActionPerformed(evt);
            }
        });

        schoolTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        schoolTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolTextJFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        jLabel6.setText("Contact Number:");

        DegreeTextJField.setEditable(false);
        DegreeTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        DegreeTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DegreeTextJFieldActionPerformed(evt);
            }
        });

        emailIDTextJField.setEditable(false);
        emailIDTextJField.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        emailIDTextJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDTextJFieldActionPerformed(evt);
            }
        });

        addEducationjButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        addEducationjButton.setText("ADD");
        addEducationjButton.setEnabled(false);
        addEducationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEducationjButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update Volunteer Details");

        genderJCombo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        genderJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        genderJCombo.setEnabled(false);
        genderJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderJComboActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        DOBDate.setEnabled(false);
        DOBDate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

=======
>>>>>>> main
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(genderJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(nameTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nationalityTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DOBDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(contactNumberTextJField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(emailIDTextJField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pincodeTextJField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(cityTextJField, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addComponent(jLabel4)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DegreeTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(schoolTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(educationJCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(addEducationjButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(languageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(addLanguagejButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pptjCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(wordjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(exceljCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailjCheckBox)
                                            .addComponent(webjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(englishJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(genderJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(nameTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(DOBDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nationalityTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(contactNumberTextJField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(emailIDTextJField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pincodeTextJField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(cityTextJField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addComponent(jLabel4)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DegreeTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schoolTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(educationJCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel19))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(addEducationjButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(languageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(addLanguagejButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pptjCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wordjCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exceljCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailjCheckBox)
                                    .addComponent(webjCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(englishJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> main
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(genderJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
<<<<<<< HEAD
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DOBDate, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
>>>>>>> main
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nationalityTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(educationJCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(schoolTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(DegreeTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addEducationjButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailIDTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(englishJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(contactNumberTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cityTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pincodeTextJField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(languageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addLanguagejButton))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wordjCheckBox)
                            .addComponent(emailjCheckBox)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exceljCheckBox)
                            .addComponent(webjCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pptjCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> main
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerWorkAreaJPanel dwjp = (VolunteerWorkAreaJPanel) component;
        dwjp.populateUserDetails();
<<<<<<< HEAD
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
=======
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
>>>>>>> main
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean phonePatternCheck(String phoneNumber) {
        Pattern p = Pattern.compile("^[0-9]{10}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
<<<<<<< HEAD

=======
    
>>>>>>> main
    private boolean pincodePatternCheck(String pincode) {
        Pattern p = Pattern.compile("^[0-9]{5}$");
        Matcher m = p.matcher(pincode);
        return m.matches();
    }
<<<<<<< HEAD

=======
    
>>>>>>> main
    private boolean emailPatternCheck(String email) {
        Pattern p = Pattern.compile("^(.+)@(\\S+)$");
        Matcher m = p.matcher(email);
        return m.matches();
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        nameTextJField.setEditable(true);
        nationalityTextJField.setEditable(true);
        emailIDTextJField.setEditable(true);
        contactNumberTextJField.setEditable(true);
        DOBDate.setEnabled(true);
        genderJCombo.setEnabled(true);
        englishJCombo.setEnabled(true);
        educationJCombo1.setEnabled(true);
        addressjTextArea1.setEditable(true);
        educationjTextArea.setEditable(true);
        skillsjTextArea.setEditable(true);
        pincodeTextJField.setEditable(true);
        cityTextJField.setEditable(true);
        addLanguagejButton.setEnabled(true);
        addEducationjButton.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
        wordjCheckBox.setEnabled(true);
        exceljCheckBox.setEnabled(true);
        pptjCheckBox.setEnabled(true);
        webjCheckBox.setEnabled(true);
        emailjCheckBox.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = nameTextJField.getText();
<<<<<<< HEAD
        if (name == null || name.equals("")) {
=======
        if(name == null || name.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Name can't be empty!");
            return;
        }
        userAccount.getEmployee().setName(name);

        String gender = (String) genderJCombo.getSelectedItem();
<<<<<<< HEAD
        if (gender == null || gender.equals("")) {
=======
        if(gender == null || gender.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Gender type can't be empty!");
            return;
        }
        userAccount.getEmployee().setGender(gender);

<<<<<<< HEAD
        Date DOB = (Date) DOBDate.getDate();
        if (DOB == null) {
            JOptionPane.showMessageDialog(null, "Date of Birth can't be empty!");
            return;
        }
        if (DOB.after(new Date())) {
=======
        Date DOB =  (Date) DOBDate.getDate();
        if(DOB == null){
            JOptionPane.showMessageDialog(null, "Date of Birth can't be empty!");
            return;
        }
        if(DOB.after(new Date())){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Please select a valid Date of Birth.");
            return;
        }
        LocalDate dob = DOB.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        userAccount.getEmployee().setBirthDate(dob);

        String nationality = nationalityTextJField.getText();
<<<<<<< HEAD
        if (nationality == null || nationality.equals("")) {
=======
        if(nationality == null || nationality.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Nationality can't be empty!");
            return;
        }
        userAccount.getEmployee().setNationality(nationality);

        String emailID = emailIDTextJField.getText();
<<<<<<< HEAD
        if (emailID == null || emailID.equals("")) {
            JOptionPane.showMessageDialog(null, "Email ID can't be empty!");
            return;
        }
        if (!emailPatternCheck(emailID)) {
=======
        if(emailID == null || emailID.equals("")){
            JOptionPane.showMessageDialog(null, "Email ID can't be empty!");
            return;
        }
        if(!emailPatternCheck(emailID)){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Please enter a valid Email Id.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        userAccount.getEmployee().setEmailID(emailID);

        String contactNumber = contactNumberTextJField.getText();
<<<<<<< HEAD
        if (contactNumber == null || contactNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Contact Number can't be empty!");
            return;
        }
        if (!phonePatternCheck(contactNumber)) {
=======
        if(contactNumber == null || contactNumber.equals("")){
            JOptionPane.showMessageDialog(null, "Contact Number can't be empty!");
            return;
        }
        if(!phonePatternCheck(contactNumber)){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Please enter a valid Phone Number.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        userAccount.getEmployee().setContactNumber(contactNumber);

        String address = addressjTextArea1.getText();
<<<<<<< HEAD
        if (address == null || address.equals("")) {
=======
        if(address == null || address.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Address can't be empty!");
            return;
        }
        userAccount.getVolunteer().setAddress(address);

        String pincode = pincodeTextJField.getText();
<<<<<<< HEAD
        if (pincode == null || pincode.equals("")) {
            JOptionPane.showMessageDialog(null, "Pincode can't be empty!");
            return;
        }
        if (!pincodePatternCheck(pincode)) {
=======
        if(pincode == null || pincode.equals("")){
            JOptionPane.showMessageDialog(null, "Pincode can't be empty!");
            return;
        }
        if(!pincodePatternCheck(pincode)){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Please enter a valid Pincode.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        userAccount.getVolunteer().setPinCode(pincode);

        String city = cityTextJField.getText();
<<<<<<< HEAD
        if (city == null || city.equals("")) {
=======
        if(city == null || city.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "City can't be empty!");
            return;
        }
        userAccount.getVolunteer().setCity(city);

        String english = (String) englishJCombo.getSelectedItem();
<<<<<<< HEAD
        if (english == null || english.equals("")) {
=======
        if(english == null || english.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "English type can't be empty!");
            return;
        }
        userAccount.getVolunteer().setEnglishProficency(english);

        String skills = skillsjTextArea.getText();
<<<<<<< HEAD
        if (skills == null || skills.equals("")) {
=======
        if(skills == null || skills.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Skills can't be empty!");
            return;
        }
        userAccount.getVolunteer().setAdditionalSkills(skills);

<<<<<<< HEAD
        if (wordjCheckBox.isSelected() == true) {
            userAccount.getVolunteer().getExpertiseList().add("MS Word");
        }
        if (exceljCheckBox.isSelected() == true) {
            userAccount.getVolunteer().getExpertiseList().add("MS Excel");
        }
        if (pptjCheckBox.isSelected() == true) {
            userAccount.getVolunteer().getExpertiseList().add("PowerPoint");
        }
        if (emailjCheckBox.isSelected() == true) {
            userAccount.getVolunteer().getExpertiseList().add("Email Checking");
        }
        if (webjCheckBox.isSelected() == true) {
=======
        if(wordjCheckBox.isSelected() == true){
            userAccount.getVolunteer().getExpertiseList().add("MS Word");
        }
        if(exceljCheckBox.isSelected() == true){
            userAccount.getVolunteer().getExpertiseList().add("MS Excel");
        }
        if(pptjCheckBox.isSelected() == true){
            userAccount.getVolunteer().getExpertiseList().add("PowerPoint");
        }
        if(emailjCheckBox.isSelected() == true){
            userAccount.getVolunteer().getExpertiseList().add("Email Checking");
        }
        if(webjCheckBox.isSelected() == true){
>>>>>>> main
            userAccount.getVolunteer().getExpertiseList().add("Web Browsing");
        }

        nameTextJField.setEditable(false);
        nationalityTextJField.setEditable(false);
        emailIDTextJField.setEditable(false);
        contactNumberTextJField.setEditable(false);
        DOBDate.setEnabled(false);
        genderJCombo.setEnabled(false);
        englishJCombo.setEnabled(false);
        educationJCombo1.setEnabled(false);
        addressjTextArea1.setEditable(false);
        educationjTextArea.setEditable(false);
        skillsjTextArea.setEditable(false);
        pincodeTextJField.setEditable(false);
        cityTextJField.setEditable(false);
        addLanguagejButton.setEnabled(false);
        addEducationjButton.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        wordjCheckBox.setEnabled(false);
        exceljCheckBox.setEnabled(false);
        pptjCheckBox.setEnabled(false);
        webjCheckBox.setEnabled(false);
        emailjCheckBox.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void englishJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishJComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_englishJComboActionPerformed

    private void languageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageJTextFieldActionPerformed

    private void addLanguagejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLanguagejButtonActionPerformed
        userAccount.getVolunteer().getLanguageList().add(languageJTextField.getText());
        populateLang();
        languageJTextField.setText("");
    }//GEN-LAST:event_addLanguagejButtonActionPerformed

    private void cityTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextJFieldActionPerformed

    private void wordjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordjCheckBoxActionPerformed

    private void pptjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pptjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pptjCheckBoxActionPerformed

    private void pincodeTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincodeTextJFieldActionPerformed

    private void educationJCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationJCombo1ActionPerformed
        // TODO add your handling code here:
<<<<<<< HEAD
        if (educationJCombo1.getSelectedItem().equals("Bachelors") || educationJCombo1.getSelectedItem().equals("Masters")) {
=======
        if(educationJCombo1.getSelectedItem().equals("Bachelors") || educationJCombo1.getSelectedItem().equals("Masters")){
>>>>>>> main
            DegreeTextJField.setEditable(true);
        }
    }//GEN-LAST:event_educationJCombo1ActionPerformed

    private void nationalityTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityTextJFieldActionPerformed

    private void contactNumberTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberTextJFieldActionPerformed

    private void schoolTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolTextJFieldActionPerformed

    private void DegreeTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DegreeTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DegreeTextJFieldActionPerformed

    private void emailIDTextJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDTextJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDTextJFieldActionPerformed

    private void addEducationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEducationjButtonActionPerformed

        String education = (String) educationJCombo1.getSelectedItem();
<<<<<<< HEAD
        if (education == null || education.equals("")) {
=======
        if(education == null || education.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "Education type can't be empty!");
            return;
        }

        String school = schoolTextJField.getText();
<<<<<<< HEAD
        if (school == null || school.equals("")) {
=======
        if(school == null || school.equals("")){
>>>>>>> main
            JOptionPane.showMessageDialog(null, "School/University can't be empty!");
            return;
        }

<<<<<<< HEAD
        if (education.equals("Bachelors") || education.equals("Masters")) {

            String degree = DegreeTextJField.getText();
            if (degree == null || degree.equals("")) {
=======
        if(education.equals("Bachelors") || education.equals("Masters")) {

            String degree = DegreeTextJField.getText();
            if(degree == null || degree.equals("")){
>>>>>>> main
                JOptionPane.showMessageDialog(null, "Degree can't be empty!");
                return;
            }

            String sd = school + " [" + degree + "] ";
            userAccount.getVolunteer().getEducationMap().put(education, sd);
            populateEducation();
<<<<<<< HEAD
        } else if (education.equals("10th") || education.equals("12th")) {
=======
        } else if (education.equals("10th") || education.equals("12th")){
>>>>>>> main
            userAccount.getVolunteer().getEducationMap().put(education, school);
            populateEducation();
        }

        schoolTextJField.setText("");
        DegreeTextJField.setText("");
    }//GEN-LAST:event_addEducationjButtonActionPerformed

    private void genderJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderJComboActionPerformed

    }//GEN-LAST:event_genderJComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOBDate;
    private javax.swing.JTextField DegreeTextJField;
    private javax.swing.JButton addEducationjButton;
    private javax.swing.JButton addLanguagejButton;
    private javax.swing.JTextArea addressjTextArea1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField cityTextJField;
    private javax.swing.JTextField contactNumberTextJField;
    private javax.swing.JComboBox educationJCombo1;
    private javax.swing.JTextArea educationjTextArea;
    private javax.swing.JTextField emailIDTextJField;
    private javax.swing.JCheckBox emailjCheckBox;
    private javax.swing.JComboBox englishJCombo;
    private javax.swing.JCheckBox exceljCheckBox;
    private javax.swing.JComboBox genderJCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField languageJTextField;
    private javax.swing.JTextArea languagejTextArea;
    private javax.swing.JTextField nameTextJField;
    private javax.swing.JTextField nationalityTextJField;
    private javax.swing.JTextField pincodeTextJField;
    private javax.swing.JCheckBox pptjCheckBox;
    private javax.swing.JTextField schoolTextJField;
    private javax.swing.JTextArea skillsjTextArea;
    private javax.swing.JCheckBox webjCheckBox;
    private javax.swing.JCheckBox wordjCheckBox;
    // End of variables declaration//GEN-END:variables
}
