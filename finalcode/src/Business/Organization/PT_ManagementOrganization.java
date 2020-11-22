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
//接收出版社发来的订单，并且选择印刷工人进行印刷，
//如果这个印刷工正在工作，就不能分配给这个印刷工
public class PT_ManagementOrganization extends Organization {
    private ArrayList<UserAccount> printingemployeelist;//整个印刷厂的所有员工
    private OrderDirectory orderDirectory;//整个印刷厂的所有订单（处理完的，没处理的在workqueue里，workqueue在父类ordanization里）
    
    public PT_ManagementOrganization(){
        super("PT_ManagementOrganization","PT");//设置部门类别
        this.orderDirectory=new OrderDirectory();
        this.printingemployeelist=new ArrayList<UserAccount>();
        
        
    
    }

    public ArrayList<UserAccount> getPrintingemployeelist() {
        return printingemployeelist;
    }

    public void setPrintingemployeelist(ArrayList<UserAccount> printingemployeelist) {
        this.printingemployeelist = printingemployeelist;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
        public void addDeliveryman(UserAccount ua){
        printingemployeelist.add(ua);
    }
}
