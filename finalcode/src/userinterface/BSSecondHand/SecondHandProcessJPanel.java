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
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.BookStoreManagement.ManageOrdersJPanel;
import static userinterface.MainJFrame.dB4OUtil;
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
        this.setBackground(new Color(253,251,239));
        txtExpectedPrice.setText(workRequest.getOrder().getExpectedPrice());
        Enterprise ua_enterprise=shBookstoreManager.getEmployee().getEnterprise();
        l1.setText("Enterprise: "+ua_enterprise.getEnterpriseName());
        l3.setText("Network: "+ua_enterprise.getNetwork().getName());
        populateCombo();
        
        
    }
    public static boolean isNumeric(String str){

        String reg = "^[0-9]+(.[0-9]+)?$";

        return str.matches(reg);

    }
    public void populateCombo(){
        comboExpress.removeAllItems();
        ArrayList<Network> networkList = system.getNetworkDirectory().getNetworkList();
        Network net=shBookstoreManager.getEmployee().getEnterprise().getNetwork();
        boolean existDeli=false;//当前地区是否有快递公司
            ArrayList<Enterprise> enterPriseList = net.getEnterpriseDirectory().getEnterpriseList();
            for(Enterprise enterprise: enterPriseList){
                if(enterprise.getEnterpriseType().equals("Type-DeliveryCompany")){
                    DeliveryEnterprise deliveryEnterprise = (DeliveryEnterprise)enterprise;
                    comboExpress.addItem(deliveryEnterprise);
                    existDeli=true;
                }
            }
            if(!existDeli)
            {
                 JOptionPane.showMessageDialog(null, "Sorry! There is no Delivery Company available in the current network!");    
            btnOrder.setEnabled(false);
            txtComment.setEnabled(false);
            txtExpectedPrice.setEnabled(false);
            txtFinalPrice.setEnabled(false);
            comboStatus.setEnabled(false);
            comboExpress.setEnabled(false);
            
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
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 251, 239));
        setPreferredSize(new java.awt.Dimension(950, 800));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 48)); // NOI18N
        jLabel1.setText("Process Order");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Process?");

        comboStatus.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recieved", "Rejected" }));

        comboExpress.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        comboExpress.setModel(new javax.swing.DefaultComboBoxModel<>(new DeliveryEnterprise[]{}));
        comboExpress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboExpressActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Select Express Delivering:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Message:");

        txtComment.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        btnOrder.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        btnOrder.setText("Process");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setText("Expected Price:");

        txtExpectedPrice.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        txtExpectedPrice.setEnabled(false);
        txtExpectedPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpectedPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setText("Final Price:");

        txtFinalPrice.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        l1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l1.setText("jLabel2");

        l3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l3.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(280, 280, 280))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboExpress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtComment)
                            .addComponent(txtExpectedPrice)
                            .addComponent(txtFinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(l3))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboExpress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtComment))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtExpectedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder))
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboExpressActionPerformed

    }//GEN-LAST:event_comboExpressActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        /*Get comboBox infomation*/
        
         String str=txtFinalPrice.getText();
          
        if(!isNumeric(str)){
              JOptionPane.showMessageDialog(null, "Please input a valid number!", "Warning", JOptionPane.WARNING_MESSAGE);
          
        }
        else{
        
        
        
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
            workRequest.getOrder().setStatus("Waiting DeliveryCompany Process");
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
            //shBookstoreManager.getEmployee().getOrganization().getWorkQueue().addNewCusToSHBSRequest(wq);
             dB4OUtil.storeSystem(system);
            JOptionPane.showMessageDialog(null, "Work request have already send the order to Delivery Company!");     
            txtComment.setEnabled(false);
            txtFinalPrice.setEnabled(false);
        }else{          
            workRequest.getOrder().setStatus(processStatus);
            workRequest.getOrder().setComments(txtComment.getText());
            workRequest.setStatus("Completed");
            workRequest.getOrder().setFinalPrice(txtFinalPrice.getText());
            JOptionPane.showMessageDialog(null, "You have already reject the order!");   
             dB4OUtil.storeSystem(system);
             
            txtComment.setEnabled(false);
            txtFinalPrice.setEnabled(false);
        }
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

    container.remove(this);
        Component[] coms=container.getComponents();
        Component c=(Component)coms[coms.length-1];
        SecondHandOrderMngJPanel jp=(SecondHandOrderMngJPanel)c;
        jp.populateTable();
        jp.populateItems(null);  
        jp.cleartable();
        CardLayout l=(CardLayout)container.getLayout();
        l.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtExpectedPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpectedPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpectedPriceActionPerformed


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
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtExpectedPrice;
    private javax.swing.JTextField txtFinalPrice;
    // End of variables declaration//GEN-END:variables
}
