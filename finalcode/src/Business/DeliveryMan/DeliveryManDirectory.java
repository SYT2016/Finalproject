/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan>DeliveryManList;
    public DeliveryManDirectory(){
       DeliveryManList=new ArrayList<DeliveryMan>();
        
    }
    public DeliveryMan addDeliveryMan(){
        DeliveryMan DM=new DeliveryMan();
       DeliveryManList.add(DM);
        return DM;
        
    
    }
    public DeliveryMan DeliveryManSearch(String username){
    for(DeliveryMan c:DeliveryManList){
            if(c.getUserAccount().getUsername().equals(username))
                return c;
                        
    }
    //tem.out.print("soubuchulainulll");
        return null;
    }
    public ArrayList<DeliveryMan> getDeliveryManList() {
        return DeliveryManList;
    }
    public void deleteDeli(String username){
   Iterator<DeliveryMan> i=DeliveryManList.iterator();
   while(i.hasNext()){
       DeliveryMan c=i.next();
            if( c.getUserAccount().getUsername().equals(username))
                 i.remove();
                        
    }
    //tem.out.print("soubuchulainulll");
        
    }
    public void setDeliveryManList(ArrayList<DeliveryMan> DeliveryManList) {
        this.DeliveryManList = DeliveryManList;
    }

    
}
