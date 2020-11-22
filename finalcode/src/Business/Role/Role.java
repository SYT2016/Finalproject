/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    protected String rolename;
    public Role(){};

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
  
  //  public abstract JPanel createWorkArea(JPanel userProcessContainer, 
 //           UserAccount account,  
  //          EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}