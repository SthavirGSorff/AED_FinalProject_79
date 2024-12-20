/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.AnalystRole;
//import org.jfree.data.category;

import UserInterface.HealthRole.*;
import org.jfree.data.category.DefaultCategoryDataset;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.AnalyticsOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.EducationOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationVolunteerWorkRequest;
import Business.WorkQueue.HealthDoctorWorkRequest;
import Business.WorkQueue.HealthPharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;

/**
 *
 * @author sthavir
 */
public class EducationAnalysisJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AnalyticsOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    EcoSystem business;

    public EducationAnalysisJPanel(JPanel userProcessContainer, UserAccount account,
            AnalyticsOrganization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAreaWise = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        OverallJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1309, 748));

        btnAreaWise.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        btnAreaWise.setText("SHOW REPORT");
        btnAreaWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaWiseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDUCATION ANALYSIS");

        OverallJPanel.setBackground(new java.awt.Color(102, 102, 102));
        OverallJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Show Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        OverallJPanel.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        OverallJPanel.setLayout(new javax.swing.BoxLayout(OverallJPanel, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Area Wise Student Distribution");

        btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(791, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OverallJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAreaWise))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(OverallJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAreaWise, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaWiseActionPerformed
        // TODO add your handling code here:

        ArrayList<WorkRequest> requestList = new ArrayList<WorkRequest>();
        Organization org = null;

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType().equals(e.getEnterpriseType().NGO)) {
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof VolunteerOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            requestList.add(request);
                        }
                    }
                }
            }
        }

        System.out.println(requestList);
        Map<String, Integer> map = new HashMap<String, Integer>();
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        for (WorkRequest request : requestList) {
            EducationVolunteerWorkRequest r = (EducationVolunteerWorkRequest) request;
            if (map.containsKey(r.getArea())) {
                int oldCount = map.get(r.getArea());
                int newCount = oldCount + r.getNumberOfStudents();
                map.put(r.getArea(), newCount);
            } else {
                map.put(r.getArea(), r.getNumberOfStudents());
            }
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            dcd.setValue(entry.getValue(), "Number of Students", entry.getKey());
        }

        JFreeChart jchart = ChartFactory.createBarChart("Areawise Student Distribution", "Area", "Number", dcd, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot cplot = jchart.getCategoryPlot();
        cplot.setRangeGridlinePaint(Color.black);
        //        ((BarRenderer) cplot.getRenderer()).setBarPainter(new StandardBarPainter());
        BarRenderer r = (BarRenderer) jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.orange);

        ChartPanel chartPanel = new ChartPanel(jchart);

        OverallJPanel.removeAll();
        OverallJPanel.add(chartPanel);
        OverallJPanel.updateUI();
    }//GEN-LAST:event_btnAreaWiseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private ArrayList<String> findAllUniqueAreas(ArrayList<WorkRequest> requestList) {
        ArrayList<String> areas = new ArrayList<String>();
        for (WorkRequest request : requestList) {
            HealthPharmacyWorkRequest r = (HealthPharmacyWorkRequest) request;
            if (!(areas.contains(r.getArea()))) {
                areas.add(r.getArea());
            }
        }
        return areas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OverallJPanel;
    private javax.swing.JButton btnAreaWise;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
