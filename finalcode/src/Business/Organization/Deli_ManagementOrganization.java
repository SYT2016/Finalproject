/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.OrderSystem.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
//这个部门负责管理订单，给快递员分配订单
public class Deli_ManagementOrganization extends Organization {
    private ArrayList<UserAccount> deliverymanlist;//存储这个快递公司有多少个快递员
    private OrderDirectory orderDirectory;//整个快递公司的所有订单
    //整个快递公司的所有订单（处理完的，没处理的在workqueue里，workqueue在父类organization里）
    
    public Deli_ManagementOrganization(){
        super("Deli_ManagementOrganization","Deli");//设置部门类别
        this.orderDirectory=new OrderDirectory();
    }



    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public ArrayList<UserAccount> getDeliverymanlist() {
        return deliverymanlist;
    }

    public void setDeliverymanlist(ArrayList<UserAccount> deliverymanlist) {
        this.deliverymanlist = deliverymanlist;
    }
    public void addDeliveryman(UserAccount ua){
        deliverymanlist.add(ua);
    }
    
    
}
