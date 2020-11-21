/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;


/**
 *
 * @author 16104
 */
public class SYS_ManageRole extends Role{
        public SYS_ManageRole(){
        super();
        rolename="SYS_ManageRole";
    
    }

        public String getRolename() {
       
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
}
