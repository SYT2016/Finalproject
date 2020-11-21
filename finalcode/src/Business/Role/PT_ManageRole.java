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
//印刷厂办公室员工 负责分发订单给印刷工人
public class PT_ManageRole extends Role{
        public PT_ManageRole(){
        super();
        rolename="PT_ManageRole";
    
    }
    

        public String getRolename() {
       
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
}
