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
public class Deli_DeliveryManageRole extends Role{
    public Deli_DeliveryManageRole(){
        super();
        rolename="Deli_DeliveryManageRole";
    
    }
    

    public String getRolename() {
       
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
}
