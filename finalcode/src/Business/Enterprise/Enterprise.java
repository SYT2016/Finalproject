 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Business.Enterprise;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author MyPC1
 */
public abstract class Enterprise {
    
    private String EnterpriseName;//unique name不可重复 在整个系统里面不可重复
    private String EnterpriseType; 
    private Network network;
//Five type "BookStore""DeliveryCompany" "Printer" "Publisher" "Population" 
//PopulationEnterprise只有一个不可创建多个
    private String Address;
    private String phone;
    private OrganizationDirectory organizationDirectory;//该公司的部门
    private int enterpriseID;
    public static int counter=0;
    public Enterprise(String name,String type){
        this.EnterpriseName=name;
        this.EnterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        Network network=new Network();
        enterpriseID=counter;
        ++counter;
       
        
        
    }

    public  int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Enterprise.counter = counter;
    }

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    public String getEnterpriseType() {
        return EnterpriseType;
    }

    public void setEnterpriseType(String EnterpriseType) {
        this.EnterpriseType = EnterpriseType;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

   

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public int getEnterpriseID() {
        return enterpriseID;
    }

    public void setEnterpriseID(int enterpriseID) {
        this.enterpriseID = enterpriseID;
    }

    @Override
    public String toString() {
        return EnterpriseName ;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
    
   

