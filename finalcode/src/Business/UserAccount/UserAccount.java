/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.OrderSystem.Order;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    //是否是员工？如果是员工的话就在employee里面存这个员工所属的organization和enterprise，
    //如果是普通顾客就不用存
    private Role role;
    private WorkQueue workQueue;
    private String address;
    private String phone;
    private ArrayList<Order> userorderlist;
    

    public UserAccount() {
        Employee employee=new Employee();
        workQueue = new WorkQueue();
        userorderlist=new ArrayList<Order>();
    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public ArrayList<Order> getUserorderlist() {
        return userorderlist;
    }

    public void setUserorderlist(ArrayList<Order> userorderlist) {
        this.userorderlist = userorderlist;
    }

//    public void setAddress(String address){
//        this.address = address;
//    }
    @Override
    public String toString() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}