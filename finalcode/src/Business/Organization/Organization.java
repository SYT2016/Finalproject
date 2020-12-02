/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.OrderSystem.BookDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author raunak
 */
public abstract class Organization {

    //部门类别
    private String orgtypename;//(9 organization 类)
   // private String orgname;//部门名字 eg管理1部 管理2部 商业1部 商业2部 //在enterprise里面unique不可重复
    //所属enterprise的类别BS,Deli,PB,PT,SYS
    private String enterpriseType;//5 enterprise 类
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    public static int counter=0;
    


    public Organization(String orgtypename,String enterpriseType ) {
        this.orgtypename = orgtypename;//部门类别
        this.enterpriseType=enterpriseType;
        workQueue = new WorkQueue();
     //   employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;

    }
       public Organization(){
       workQueue = new WorkQueue();
     //   employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;

       }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }



    public WorkQueue getWorkQueue() {
        return workQueue;
    }



    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return orgtypename;
    }

    public String getOrgtypename() {
        return orgtypename;
    }

    public void setOrgtypename(String orgtypename) {
        this.orgtypename = orgtypename;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
    
}
