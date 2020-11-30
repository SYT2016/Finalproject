/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;


import Business.Enterprise.EnterpriseDirectory;

/**
 * @author MyPC1
 */
public class Network {
    private String name;
    private final EnterpriseDirectory enterpriseDirectory = new EnterpriseDirectory();
    private int networkID;
    public static int counter = 0;
    private static int lastid;

    public Network() {
        networkID = counter;
        ++counter;
    }

    public String getName() {
        return name;
    }

    public static int getLastid() {
        return lastid;
    }

    public static void setLastid(int lastid) {
        Network.lastid = lastid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public int getNetworkID() {
        return networkID;
    }

    public void setNetworkID(int networkID) {
        this.networkID = networkID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Network.counter = counter;
    }

    @Override
    public String toString() {
        return name;
    }

}
