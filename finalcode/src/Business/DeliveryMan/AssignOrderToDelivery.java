/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.OrderSystem.Order;

/**
 *
 * @author 16104
 */
public class AssignOrderToDelivery {
    private Order order;
    private DeliveryMan deliveryman;
    
    public AssignOrderToDelivery(Order order,DeliveryMan deliveryman){
        this.order=order;
        this.deliveryman=deliveryman;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryMan getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(DeliveryMan deliveryman) {
        this.deliveryman = deliveryman;
    }
    
}
