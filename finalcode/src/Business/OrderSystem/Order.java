/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import Business.UserAccount.UserAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cong Wang
 */
public class Order {
    private int id;
    private String status;//"preparing“ ”“delivering”“received”
    private String comments;
    private static int count = 1;
    private UserAccount userAccount; //一个订单的创始者
    private String totalPrice; //add a new attribute: total Price
    private List<OrderItem> orderItems = new ArrayList<>();

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order() {
        id = count++;
    }

    public OrderItem newOrderItem(Book b, int q, double pr) {
        OrderItem oi = new OrderItem(b, q, pr);
        orderItems.add(oi);
        return oi;
    }

    public void deleteOrderItem(OrderItem oi) {
        orderItems.remove(oi);
    }

    public double getOrderTotal() {
        double sum = 0;
        for (OrderItem oi : orderItems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }


    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
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
        return String.valueOf(id);
    }

}
