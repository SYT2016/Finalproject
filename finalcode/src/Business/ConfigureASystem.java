package Business;

import Business.Employee.Employee;
import Business.Enterprise.DeliveryEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Organization.Deli_DeliveryManOrganization;
import Business.Organization.Deli_ManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.PB_ManagementOrganization;
import Business.Role.Deli_DeliveryManRole;
import Business.Role.Deli_DeliveryManageRole;
import Business.Role.PB_ManageRole;
import Business.UserAccount.UserAccount;
import static userinterface.MainJFrame.dB4OUtil;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        

        return system;
    }
    
    //        //出版社办公室
//        PublisherEnterprise pb1=new PublisherEnterprise("LiuPublisher");
//        PB_ManagementOrganization org=new PB_ManagementOrganization();
//        Employee e1 = new Employee(pb1,org);
//        system.getEmployeeDirectory().createEmployee(e1);       
//        system.getUserAccountDirectory().createUserAccount("PB_Liu", "Liu",e1, new PB_ManageRole());
//       
//        //快递员
//        DeliveryEnterprise deli1=new DeliveryEnterprise("LiDeli");
//        Deli_DeliveryManOrganization org2=new Deli_DeliveryManOrganization();
//        Employee e2 = new Employee(deli1,org2);
//        system.getEmployeeDirectory().createEmployee(e2);  
//        system.getUserAccountDirectory().createUserAccount("ZhangDelivery", "Zhang", new Deli_DeliveryManRole());
//        
//        Employee e3 = new Employee(deli1,org2);
//        system.getEmployeeDirectory().createEmployee(e3); 
//        system.getUserAccountDirectory().createUserAccount("YangDelivery", "Yang", new Deli_DeliveryManRole());
//
//        //物流公司办公室
//        Deli_ManagementOrganization org3=new Deli_ManagementOrganization();
//        Employee e4 = new Employee(deli1,org3);
//        system.getEmployeeDirectory().createEmployee(e4); 
//        system.getUserAccountDirectory().createUserAccount("DeliMana_Li", "Li", new Deli_DeliveryManageRole());
//        dB4OUtil.storeSystem(system);
    
}
