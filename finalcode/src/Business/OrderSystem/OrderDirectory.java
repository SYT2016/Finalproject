/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import java.util.ArrayList;

/**
 *
 * @author 16104
 */
public class OrderDirectory {
     private ArrayList<Order> orderlist;
    //private Order oo;
    public OrderDirectory(){
        orderlist=new ArrayList<Order> ();
    
    }
    
    
    public Order addNewOrder(Order o){
        
        orderlist.add(o);
        
        return o;
    
    }
    public void removeOrder(Order o){
        orderlist.remove(o);
        
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return orderlist;
    }

    public void setOrderCatalog(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
}
