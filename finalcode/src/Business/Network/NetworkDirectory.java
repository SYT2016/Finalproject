/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author 16104
 */
public class NetworkDirectory {
    private ArrayList<Network> networkList; 
    private int networkid;//记录最后一个存进来的network的id
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
        networkid=network.getNetworkID()+1;
        return network;
    
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    
}
