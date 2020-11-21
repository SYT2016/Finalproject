/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> CustomerList;
    public CustomerDirectory(){
        CustomerList=new ArrayList<Customer>();
        
    }
    public Customer addCustomer(){
        Customer c=new Customer();
        CustomerList.add(c);
        return c;
        
    
    }
    public Customer CustomerSearch(String username){
    for(Customer c:CustomerList){
            if(c.getUserAccount().getUsername().equals(username))
                return c;
                        
    }
    return null;
    
    }
    public void deleteCustomer(String username){
    Iterator<Customer> i=CustomerList.iterator();
   while(i.hasNext()){
       Customer c=i.next();
            if( c.getUserAccount().getUsername().equals(username))
                 i.remove();
                        
    }
         
                        
    }
    //tem.out.print("soubuchulainulll");
       
    
    
    
    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
}
