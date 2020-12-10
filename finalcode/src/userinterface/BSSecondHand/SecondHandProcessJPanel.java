/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BSSecondHand;
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
public class SecondHandProcessJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount shBookstoreManager;
    private WorkRequest workRequest;
    /**
     * Creates new form SecondHandProcessJPanel
     */
    public SecondHandProcessJPanel(JPanel container,UserAccount shBookstoreManager,WorkRequest workRequest) {
        this.container = container;
        this.shBookstoreManager = shBookstoreManager;
        this.workRequest = workRequest;
        initComponents();
        txtExpectedPrice.setText(workRequest.getOrder().getExpectedPrice());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();
        comboExpress = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtExpectedPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFinalPrice = new javax.swing.JTextField();

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

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Select Express Delivering:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Supply Information:");

        btnOrder.setText("sure!");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Expected Price:");

        jLabel6.setText("Final Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExpectedPrice)
                    .addComponent(txtFinalPrice)
                    .addComponent(comboExpress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnOrder)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboExpress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComment)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExpectedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOrder)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExpressActionPerformed

    }//GEN-LAST:event_comboExpressActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        /*Get comboBox infomation*/
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
            workRequest.getOrder().setComments(txtComment.getText());
            workRequest.setStatus("Completed");
            workRequest.getOrder().setFinalPrice(txtFinalPrice.getText());

            /*set workRequest*/
            WorkRequest wq = new WorkRequest();
            wq.setOrder(workRequest.getOrder());
            wq.setSenderEnterprise(shBookstoreManager.getEmployee().getEnterprise());
            wq.setReceiverEnterprise(deliveryCompany);
            wq.setStatus("Uncompleted");
            wq.setMessage(txtComment.getText());
            wq.setMark(1);
            deliOrg.getWorkQueue().addNewRequest(wq);
            shBookstoreManager.getEmployee().getOrganization().getWorkQueue().addNewCusToSHBSRequest(wq);
            JOptionPane.showMessageDialog(null, "have already send the order to Delivery Company!");      
        }else{          
            workRequest.getOrder().setStatus(processStatus);
            workRequest.getOrder().setComments(txtComment.getText());
            workRequest.setStatus("Completed");
            workRequest.getOrder().setFinalPrice(txtFinalPrice.getText());
            JOptionPane.showMessageDialog(null, "have already reject the order!");        
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        container.remove(this);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<DeliveryEnterprise> comboExpress;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtExpectedPrice;
    private javax.swing.JTextField txtFinalPrice;
    // End of variables declaration//GEN-END:variables
}
