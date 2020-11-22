/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;

/**
 *
 * @author raunak
 */
public class Employee {
    private Enterprise enterprise;
    private Organization organization;
    private String realname;
    private String gender;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }
    public Employee(Enterprise enterprise,Organization organization) {
        id = count;
        count++;
        this.enterprise=enterprise;
        this.organization=organization;
    }
    public int getId() {
        return id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return realname;
    }
    
    
}
