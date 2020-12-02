/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import Business.Enterprise.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Cong
 */
public class Book {

    private int id;
    private String name;
    private double price;
    private static int count = 0;
    /** 出版社 */
    private Enterprise enterprise;
    /** New or Old */
    private String status;
    /** 库存数目 */
    private int totalQuantity;
    private ArrayList<OrderItem> orderItemList;

    public Book(){
         count++;
         id =count;
         orderItemList = new ArrayList<>();
    }

    public void addOrderItem(OrderItem oi){
        this.orderItemList.add(oi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return name;
    }
}
