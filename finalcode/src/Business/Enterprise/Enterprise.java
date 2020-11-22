 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Business.Enterprise;

import Business.Network.Network;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author MyPC1
 */
public abstract class Enterprise {
    
    private String EnterpriseName;
    private String EnterpriseType; 
    private Network network;
//Five type "BookStore""DeliveryCompany" "Printer" "Publisher" "Population" 
//PopulationEnterprise只有一个不可创建多个
    
    private OrganizationDirectory organizationDirectory;//该公司的部门
    private int enterpriseID;
    private static int counter=0;
    public Enterprise(String name,String type){
        this.EnterpriseName=name;
        this.EnterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        Network network=new Network();
        enterpriseID=counter;
        ++counter;
        
        
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

    
}
    
   

