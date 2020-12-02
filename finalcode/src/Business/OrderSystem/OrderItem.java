/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderSystem;

/**
 *
 * @author 16104
 */
public class OrderItem {
    private Book selectedbook;
    private int quantity;
    private double price;
    private String bookname;
    
    public OrderItem(Book b, int q,double pr) {
        selectedbook = b;
        b.addOrderItem(this); //把这个orderitem加入到book里面的orderitemlist里
        quantity = q;
        price=pr;
        bookname=b.getName();
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

    @Override
    public String toString() {
        return "OrderItem{" + "selectedbook=" + selectedbook + ", quantity=" + quantity + ", price=" + price + ", bookname=" + bookname + '}';
    }


    
}
