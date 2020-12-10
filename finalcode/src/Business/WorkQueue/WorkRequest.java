/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.OrderSystem.Order;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    private String message;//备注
    private UserAccount senderUserAccount;
    private Enterprise senderEnterprise;
    private UserAccount receiverUserAccount;//部门间wr
    private Enterprise receiverEnterprise;//企业间wr
    private String status;//request是否已经处理.11/24补充:Completed,Uncompleted   
    private Date requestDate;
    private Date resolveDate;
    private Order order;
    private int mark;//顾客买书还是卖书的标记，用于deli区分用.0买书，1卖书
    
    public WorkRequest(){
        requestDate = new Date();
        senderUserAccount=null;
        senderEnterprise=null;
        receiverUserAccount=null;
        receiverEnterprise=null;
        mark=0;
    }

    @Override
    public String toString(){
        //return this.requestDate.toString();
        return String.valueOf(order.getId());
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public UserAccount getReceiverUserAccount() {
        return receiverUserAccount;
    }

    public void setReceiverUserAccount(UserAccount receiverUserAccount) {
        this.receiverUserAccount = receiverUserAccount;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }

    public UserAccount getSenderUserAccount() {
        return senderUserAccount;
    }

    public void setSenderUserAccount(UserAccount senderUserAccount) {
        this.senderUserAccount = senderUserAccount;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }
    
}
