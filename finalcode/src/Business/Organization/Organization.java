/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    //部门类别
    private String orgtypename;
    
    //所属enterprise的类别BS,Deli,PB,PT,SYS
    private String enterpriseType;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    


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

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

  
    
    public String getName() {
        return orgtypename;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.orgtypename = name;
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
