/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.OrderSystem.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private UserAccount userAccount;
    private ArrayList<Order> deorderlist;
    private String name;
    
    public DeliveryMan(){
        deorderlist=new ArrayList<Order>();
        //name=userAccount.getUsername();
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ArrayList<Order> getDeorderlist() {
        return deorderlist;
    }

    public void setDeorderlist(ArrayList<Order> deorderlist) {
        this.deorderlist = deorderlist;
    }

    @Override
    public String toString() {
        return name;
    }



    
    
}
