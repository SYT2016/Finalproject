/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
public class Order {
    private int id;
    private String status;//"preparing“ ”“delivering”“received”
    private String comments;
    private static int count=0;
    private UserAccount userAccount; //一个订单的创始者
    ArrayList<OrderItem> orderitems;
  

    public Order(){    
        orderitems = new ArrayList();
        id=count++;
        
        
    }
    public OrderItem newOrderItem(Book b, int q,double pr){
        OrderItem oi = new OrderItem(b, q,pr);
        orderitems.add(oi);
        return oi;
    }
    public double getOrderTotal(){    
        double sum = 0;
        for(OrderItem oi: orderitems){
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }    

   

    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(ArrayList<OrderItem> orderitems) {
        this.orderitems = orderitems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    
    
    @Override
    public String toString() {
        return status ;
    }
       
}
