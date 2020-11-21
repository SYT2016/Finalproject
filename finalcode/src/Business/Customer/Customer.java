/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.OrderSystem.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
   
    private UserAccount useraccount;
    private ArrayList<Order> customerorderlist;
    public Customer(){
        this.customerorderlist=new  ArrayList<Order>();
       
    }
    public void addOrderToCustomer(Order o){
        customerorderlist.add(o);
    }
    public void deleteOrderFromCustomer(Order o){
        customerorderlist.remove(o);
    }

    public ArrayList<Order> getCustomerorderlist() {
        return customerorderlist;
    }

    public void setCustomerorderlist(ArrayList<Order> customerorderlist) {
        this.customerorderlist = customerorderlist;
    }

    public UserAccount getUserAccount() {
        return useraccount;
    }

    public void setUserAccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    
   

    
}
