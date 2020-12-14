/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author 16104
 */
public class NetworkDirectory {
    private ArrayList<Network> networkList; 
    private int lastid;//记录最后一个存进来的network的id
    private int lastorid;
    public NetworkDirectory(){
        networkList=new ArrayList<Network>();
    
    }
    public Network searchNetwork(Network o){
        for(Network  or:networkList){
            if(or.getNetworkID()==o.getNetworkID())
                return or;
        
        }
        System.out.println("network directory里没找到对应的network");
        return null;
    
    }

    public Network createNetwork(String networkName){
        Network network=new Network();
        network.setName(networkName);
        networkList.add(network);
       // networkid=network.getNetworkID()+1;
        return network;
    
    }
    public boolean checkEnterpriceUnique(String enname){
        boolean b=true;
        for(Network nt:networkList){
            for(Enterprise e:nt.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseName().equals(enname)){
                    b=false;
                    return b;
                }
            
            }
        
        }
        return b;
        
    
    }
    public boolean checkNetworkUnique(String ntname){
        boolean b=true;
        for(Network nt:networkList){
            if(nt.getName().equals(ntname)){
                b=false;
                return b;
            
            }
        
        }
        return b;
    
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public int getLastorid() {
        return lastorid;
    }

    public void setLastorid(int lastorid) {
        this.lastorid = lastorid;
    }

    public int getLastid() {
        return lastid;
    }

    public void setLastid(int lastid) {
        this.lastid = lastid;
    }
    
    
}
