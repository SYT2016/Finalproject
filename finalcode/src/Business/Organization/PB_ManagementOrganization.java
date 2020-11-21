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
//出版社管理部 从书店接收到订单以后，选择一家印刷厂印书
public class PB_ManagementOrganization extends Organization {
    private ArrayList<UserAccount> employeelist;//整个出版社的所有员工
    private OrderDirectory orderDirectory;//整个出版社的所有订单
    
    public PB_ManagementOrganization(){
        super("PB_ManagementOrganization");//设置部门类别
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
