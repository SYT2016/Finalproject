/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

import Business.Enterprise.BookstoreEnterprise;
import Business.Network.Network;

/**
 *
 * @author 16104,wangcong
 */
public class OrderItem {
    private Book selectedbook;
    private int quantity;
    private double price;
    private String bookname;
    private Network network;
    private BookstoreEnterprise bookstore;
    
    public OrderItem(Book book, int quantity,double price) {
        this.selectedbook = book;
        this.selectedbook.addOrderItem(this); //把这个orderitem加入到book里面的orderitemlist里
        this.quantity = quantity;
        this.price=price;
        bookname=selectedbook.getName();
    }
    
    /*customer order use*/
    public OrderItem(Book book, int quantity,double price,Network network,BookstoreEnterprise bookstore){
        this.selectedbook = book;
        //this.selectedbook.addOrderItem(this); //把这个orderitem加入到book里面的orderitemlist里
        this.quantity = quantity;
        this.price=price;
        bookname=selectedbook.getName();
        this.network = network;
        this.bookstore = bookstore;
    }
    
    
    public double getOrderItemTotal() {
        return price * quantity;
    }

    public Book getSelectedbook() {
        return selectedbook;
    }

    public void setSelectedbook(Book selectedbook) {
        this.selectedbook = selectedbook;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public BookstoreEnterprise getBookstore() {
        return bookstore;
    }

    public void setBookstore(BookstoreEnterprise bookstore) {
        this.bookstore = bookstore;
    }
    
    
    @Override
    public String toString() {
        return selectedbook.getName();
    }


    
}
