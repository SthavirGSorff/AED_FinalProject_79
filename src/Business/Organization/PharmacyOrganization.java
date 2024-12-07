/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PharmacistRole;
import Business.Role.Role;
import Business.Role.VolunteerRole;
import java.util.ArrayList;/**
 *
 * @author vinaypawar
 */
public class PharmacyOrganization extends Organization{
    
    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacistRole());
        return roles;
    }
    
}
