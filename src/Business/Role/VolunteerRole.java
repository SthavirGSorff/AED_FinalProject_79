/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Employee.Volunteer;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UserInterface.VolunteerRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author sthavir
 */
public class VolunteerRole extends Role {
    
   
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
       return new VolunteerWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise,network);
       
    }
    
     @Override
    public String toString() {
        return RoleType.Volunteer.getValue();
    }
    
}
