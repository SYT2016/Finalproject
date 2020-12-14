/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BSSecondHand;

import Business.Enterprise.Enterprise;
import java.awt.Color;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import javax.swing.table.JTableHeader;
import static userinterface.MainJFrame.log;
import zOthers.changeDate;

/**
 *
 * @author wangcong
 */
public class SecondHandOrderMngJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount shBookstoreManager;
    /**
     * Creates new form SecondHandOrderMngJPanel
     */
    public SecondHandOrderMngJPanel(JPanel container,UserAccount shBookstoreManager) {
        this.container = container;
        this.shBookstoreManager = shBookstoreManager;
        log.info("Login: BookStore SecHand Org User:"+shBookstoreManager.getUsername());
        initComponents();
        this.setBackground(new Color(253,251,239));
         Enterprise ua_enterprise=shBookstoreManager.getEmployee().getEnterprise();
    
        l1.setText("Enterprise: "+ua_enterprise.getEnterpriseName());
        l2.setText("Type: "+ua_enterprise.getEnterpriseType());
        l3.setText("Network: "+ua_enterprise.getNetwork().getName());
        
        JTableHeader head = tblOrder.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 24));// 设置表头大小
        head.setFont(new Font("Times New Roman", Font.PLAIN, 24));// 设置表格字体
        
        JTableHeader head1 = tblOrderItem.getTableHeader(); // 创建表格标题对象
        head1.setPreferredSize(new Dimension(head1.getWidth(), 24));// 设置表头大小
        head1.setFont(new Font("Times New Roman", Font.PLAIN, 24));// 设置表格字体
        populateTable();
          btnProcess.setEnabled(true);
    }
        public void cleartable(){
         DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
        dtm.setRowCount(0);
   
    }
     public void populateItems(WorkRequest wr){
        if(wr!=null){
            DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
            dtm.setRowCount(0);
          
                Object[] r=new Object[4];
                r[0]=wr.getOrder().getSellBookName();
                r[1]=wr.getOrder().getSellingNumber();
               
                r[2]  =wr.getOrder().getExpectedPrice();
                r[3]=wr.getOrder().getFinalPrice();

                dtm.addRow(r);

            
        }
        
    }
     public void populateTable(){//unfinished
        DefaultTableModel model=(DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);

        List<WorkRequest> requestList = shBookstoreManager.getEmployee().getOrganization().getWorkQueue().getWorkRequestCusToSHBSList();
        for(WorkRequest request : requestList){
            if( request.getOrder().getStatus().equals("Waiting Bookstore Process")){
            Object[] row = new Object[5];
            row[0] = request;
            //row[1] = request.getOrder().getUserAccount().getUsername();
            row[1]=request.getSenderUserAccount();
            //row[2]=0;         
            row[2] = request.getOrder().getAddress();
            row[3] = new changeDate().change(request.getRequestDate());
            row[4] = request.getOrder().getStatus();
            //row[5] = request.getOrder().getExpectedPrice();
            //row[6] = request.getOrder().getFinalPrice();
            model.addRow(row);
            }
        }
    }
      public void populateFinTable(){//finished
        DefaultTableModel model=(DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);

        List<WorkRequest> requestList = shBookstoreManager.getEmployee().getOrganization().getWorkQueue().getWorkRequestCusToSHBSList();
        for(WorkRequest request : requestList){
            if(! request.getOrder().getStatus().equals("Waiting Bookstore Process")){
            Object[] row = new Object[5];
            row[0] = request;
            //row[1] = request.getOrder().getUserAccount().getUsername();
            row[1]=request.getSenderUserAccount();
            //row[2]=0;         
            row[2] = request.getOrder().getAddress();
            row[3] = new changeDate().change(request.getRequestDate());
            row[4] = request.getOrder().getStatus();
            //row[5] = request.getOrder().getExpectedPrice();
            //row[6] = request.getOrder().getFinalPrice();
            model.addRow(row);
            }
        }
    }
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 251, 239));
        setPreferredSize(new java.awt.Dimension(950, 800));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 42)); // NOI18N
        jLabel1.setText("Welcome! Second-hand center!");

        tblOrder.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Address", "RequestDate", "OrderStatus"
            }
        ));
        tblOrder.setRowHeight(25);
        jScrollPane1.setViewportView(tblOrder);

        btnProcess.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        btnProcess.setText("Process!");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l1.setText("jLabel2");

        l2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l2.setText("jLabel2");

        l3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l3.setText("jLabel2");

        tblOrderItem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "BookName", "Quantity", "ExpectPrice", "FinalPrice"
            }
        ));
        tblOrderItem.setRowHeight(25);
        jScrollPane2.setViewportView(tblOrderItem);

        jButton1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        jButton2.setText("Unfinished");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        jButton3.setText("Finished");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProcess))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 555, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcess)
                    .addComponent(Delete))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "please select a Order!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
        
        WorkRequest workRequest = (WorkRequest)tblOrder.getValueAt(selectedRow, 0);
        
        SecondHandProcessJPanel secondHandProcessJPanel = new SecondHandProcessJPanel(container,shBookstoreManager,workRequest);
        container.add("SecondHandProcessJPanel", secondHandProcessJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "please select a Order!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
        WorkRequest workRequest = (WorkRequest)tblOrder.getValueAt(selectedRow, 0);
        shBookstoreManager.getEmployee().getOrganization().getWorkQueue().getWorkRequestCusToSHBSList().remove(workRequest);
         populateTable();
         populateFinTable();
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int row=tblOrder.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblOrder.getValueAt(row, 0);
            populateItems(wr);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
        btnProcess.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          populateFinTable();
        btnProcess.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblOrderItem;
    // End of variables declaration//GEN-END:variables
}
