/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vinaypawar
 */
public class NGOEnterprise extends Enterprise {

    public enum Type {
        Admin("Admin Organization"), Health("Health Organization"), Volunteer("Volunteer Organization"), Education("Education Organization"), Inventory("Inventory Organization");
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public NGOEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.NGO);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
