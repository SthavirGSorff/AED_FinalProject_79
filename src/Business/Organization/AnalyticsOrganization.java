/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AnalystRole;
import Business.Role.PharmacistRole;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import java.util.ArrayList;


/**
 *
 * @author vinaypawar
 */
public class AnalyticsOrganization extends Organization{
    
    public AnalyticsOrganization() {
        super(Organization.Type.Analytics.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AnalystRole());
        return roles;
    }
    
}
