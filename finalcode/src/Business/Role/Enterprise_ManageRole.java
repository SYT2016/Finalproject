/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author 16104
 */
//管理这个enterprise里的所有organization和所有enployee
public class Enterprise_ManageRole extends Role{
    public Enterprise_ManageRole(){
        super();
        rolename="Enterprise_ManageRole";
    
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    
}
