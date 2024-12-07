/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HealthRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vinaypawar
 */
public class HealthOrganization extends Organization {
    
    public HealthOrganization() {
        super(Organization.Type.Health.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HealthRole());
        return roles;
    }
    
}
