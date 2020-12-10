/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Organization.Organization;
import Business.Network.NetworkDirectory;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    // private String name;
    //private WorkQueue workQueue;
    //private EmployeeDirectory employeeDirectory;
    //private UserAccountDirectory userAccountDirectory;
            //private String username;
            //private String password;
            //private Employee employee;
            //private Role role;
            // private WorkQueue workQueue;
    //private int organizationID;
    //private static int counter=0;
    
    private static EcoSystem business;
    private NetworkDirectory networkDirectory;
    private  int lastorderid;


    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    

   private EcoSystem(){
       super();
        networkDirectory=new NetworkDirectory();
      lastorderid=0;
    }

    


    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public int getLastorderid() {
        return lastorderid;
    }

    public  void setLastorderid(int lastorderid) {
        this.lastorderid = lastorderid;
    }

    
    


}
