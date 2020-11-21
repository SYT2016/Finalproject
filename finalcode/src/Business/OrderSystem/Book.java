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
 * @author 16104
 */
public class Book {
    private int bookid;
    private String bookname;
    private double bookprice; 
    private static int count=0;
    private Enterprise enterprise;//出版社
    private String status;//New or Old
    private int totalQuatity;//库存数目
    ArrayList<OrderItem> orderitems;
    
    


    public Book(){
         count++;
         bookid=count;
         orderitems=new ArrayList<OrderItem>();
    }

    public void addOrderitemToBook(OrderItem oi){
        this.orderitems.add(oi);
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
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

    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }

    public void setOrderitems(ArrayList<OrderItem> orderitems) {
        this.orderitems = orderitems;
    }

    public int getTotalQuatity() {
        return totalQuatity;
    }

    public void setTotalQuatity(int totalQuatity) {
        this.totalQuatity = totalQuatity;
    }


    
}
