/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }
    public UserAccount searchAccount(String username){
    for(UserAccount ua:userAccountList){
        if(ua.getUsername().equals(username))
            return ua;
    }
    return null;
    }
    public void deleteUa(String username){
        Iterator<UserAccount> i=userAccountList.iterator();
   while(i.hasNext()){
       UserAccount c=i.next();
            if( c.getUsername().equals(username))
                 i.remove();
             
   
                        
    }
    //tem.out.print("soubuchulainulll");
        
    }
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList){
             System.out.println("数据库中"+ua.getUsername()+ua.getPassword());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        
        }
        return null;
    }
    //是否是员工？如果是员工的话就在employee里面存这个员工所属的organization和enterprise，如果是普通顾客就不用存
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    //是否是员工？如果是员工的话就在employee里面存这个员工所属的organization和enterprise，如果是普通顾客就不用存
    public UserAccount createUserAccount(String username, String password,   Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        //userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        //System.out.println("qqq");
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
