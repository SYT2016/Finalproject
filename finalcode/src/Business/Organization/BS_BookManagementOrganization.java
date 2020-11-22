/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.OrderSystem.BookDirectory;
import Business.OrderSystem.OrderDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//管理部，负责增添图书+给出版商下订单
public class BS_BookManagementOrganization extends Organization {
    
    
    private BookDirectory bookDirectory;//整个书店的所有书
    private OrderDirectory orderDirectory;
    //整个书店的所有订单
    //整个书店的所有订单（处理完的，没处理的在workqueue里，workqueue在父类ordanization里）
    
    public BS_BookManagementOrganization(){
        super("BS_BookManagementOrganization","BS");//设置部门类别
        this.bookDirectory=new BookDirectory ();
        this.orderDirectory=new OrderDirectory();
    }


    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    
}
