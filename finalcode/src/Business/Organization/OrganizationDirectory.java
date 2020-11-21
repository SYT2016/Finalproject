/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String orgtype){
        Organization organization = null;
        if (orgtype.equals("BS_BookManagementOrganization")){
            organization = new BS_BookManagementOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("BS_SalesOrganization")){
            organization = new BS_SalesOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("BS_SecondHandOrganization")){
            organization = new BS_SecondHandOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("Deli_DeliveryManOrganization")){
            organization = new Deli_DeliveryManOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("Deli_ManagementOrganization")){
            organization = new Deli_ManagementOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("PB_ManagementOrganization")){
            organization = new PB_ManagementOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("SYS_Organization")){
            organization = new SYS_Organization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("PT_ManagementOrganization")){
            organization = new PT_ManagementOrganization();
            organizationList.add(organization);
        }
        else if (orgtype.equals("PT_PrintingOrganization")){
            organization = new PT_PrintingOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}