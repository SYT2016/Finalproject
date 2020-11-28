/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    public Enterprise searchEnterprise(Enterprise en){
    for(Enterprise e:enterpriseList){
        if(e.getEnterpriseID()==en.getEnterpriseID())
            return e;
    
    }
    System.out.println("在enterprisedirectory里没找到对应的enterprise");
        return null;
    }
    //Create enterprise
    //Five type "Type-BookStore""Type-DeliveryCompany" "Type-Printer" "Type-Publisher" "Type-Population" 
//PopulationEnterprise只有一个不可创建多个
    public Enterprise createAndAddEnterprise(String name,String type){
        Enterprise enterprise=null;
        
        
        if(type.equals("Type-BookStore")){
            enterprise=new BookstoreEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type.equals("Type-DeliveryCompany")){
            enterprise=new DeliveryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type.equals("Type-Printer")){
            enterprise=new PrinterEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type.equals("Type-Publisher")){
            enterprise=new PublisherEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if(type.equals("Type-System")){
            enterprise=new SystemEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
