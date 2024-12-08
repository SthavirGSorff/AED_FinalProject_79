/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.HealthRole.HealthDepartmentDoctorWorkAreaJPanel;
import UserInterface.HealthRole.HealthDepartmentWorkAreaJPanel;

/**
 *
 * @author sthavir
 */
public class HealthRole {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new HealthDepartmentWorkAreaJPanel(userProcessContainer, account, (HealthOrganization) organization, enterprise, network);
    }
    
     @Override
    public String toString() {
        return RoleType.Health.getValue();
    }
    
}
