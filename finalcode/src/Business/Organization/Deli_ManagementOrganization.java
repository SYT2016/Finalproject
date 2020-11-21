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
    private ArrayList<UserAccount> employeelist;//整个快递公司的所有员工
    private OrderDirectory orderDirectory;//整个快递公司的所有订单
    //整个快递公司的所有订单（处理完的，没处理的在workqueue里，workqueue在父类ordanization里）
    
    public Deli_ManagementOrganization(){
        super("Deli_ManagementOrganization");//设置部门类别
    }

    public ArrayList<UserAccount> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<UserAccount> employeelist) {
        this.employeelist = employeelist;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
}
