/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BookStoreManagement;

import Business.Enterprise.DeliveryEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OrderSystem.Order;
import Business.Organization.Deli_ManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static userinterface.MainJFrame.system;

/**
 *
 * @author wangcong
 */
public class ProcessOrderJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount bookstoreManager;
    private WorkRequest workRequest;
    /**
     * Creates new form ProcessOrderJPanel
     */
    public ProcessOrderJPanel(JPanel container,UserAccount bookstoreManager,WorkRequest workRequest) {
        this.container = container;
        this.bookstoreManager = bookstoreManager;
        this.workRequest = workRequest;
        initComponents();
        populateCombo();
    }
    
    public void populateCombo(){
        comboExpress.removeAllItems();
        ArrayList<Network> networkList = system.getNetworkDirectory().getNetworkList();
        for(Network net : networkList){
            ArrayList<Enterprise> enterPriseList = net.getEnterpriseDirectory().getEnterpriseList();
            for(Enterprise enterprise: enterPriseList){
                if(enterprise.getEnterpriseType().equals("Type-DeliveryCompany")){
                    DeliveryEnterprise deliveryEnterprise = (DeliveryEnterprise)enterprise;
                    comboExpress.addItem(deliveryEnterprise);
                    
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        comboExpress = new javax.swing.JComboBox<>();
        btnOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Process Order");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Process?");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recieved", "Rejected" }));

        comboExpress.setModel(new javax.swing.DefaultComboBoxModel<>(new DeliveryEnterprise[]{}));
        comboExpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExpressActionPerformed(evt);
            }
        });

        btnOrder.setText("Sure");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Select Express Delivering:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Supply Information:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder)
                            .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboExpress, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboExpress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComment, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(btnOrder)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        /*Get comboBox information*/
        String processStatus = (String) comboStatus.getSelectedItem();
        DeliveryEnterprise deliveryCompany = (DeliveryEnterprise)comboExpress.getSelectedItem();

        /*get the delivery company*/
        Deli_ManagementOrganization deliOrg = null;
        
        ArrayList<Organization> deliverList =  deliveryCompany.getOrganizationDirectory().getOrganizationList();
        for(Organization org : deliverList){
            if(org.getOrgtypename().equals("Deli_ManagementOrganization")){
                deliOrg = (Deli_ManagementOrganization)org;
            }
        }
        if(processStatus.equals("Recieved")){
        /*Set the Status information in order*/
        workRequest.getOrder().setStatus(processStatus);
        workRequest.setStatus("completed");
        
        /*set workRequest*/
        WorkRequest wq = new WorkRequest();
        wq.setOrder(workRequest.getOrder());
        wq.setSenderEnterprise(bookstoreManager.getEmployee().getEnterprise());
        wq.setReceiverEnterprise(deliveryCompany);
        wq.setStatus("Uncompleted");
        wq.setMessage(txtComment.getText());
        deliOrg.getWorkQueue().addNewRequest(wq);
        bookstoreManager.getEmployee().getOrganization().getWorkQueue().addNewBSToPublisherRequest(wq);
        JOptionPane.showMessageDialog(null, "have already send the order to Delivery Company!");
        }else{
            workRequest.getOrder().setStatus(processStatus);
            workRequest.setStatus("completed");
            JOptionPane.showMessageDialog(null, "have already turned down the order.");
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void comboExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExpressActionPerformed
        
    }//GEN-LAST:event_comboExpressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<DeliveryEnterprise> comboExpress;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables
}
