/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TransportRole;
import Business.Role.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author vinaypawar
 */
public class TransportOrganization extends Organization{
    
    public TransportOrganization() {
        super(Organization.Type.Transport.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TransportRole());
        return roles;
    }
    
}
