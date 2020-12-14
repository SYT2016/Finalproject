/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PT_ManageRole;

import Business.Enterprise.Enterprise;
import userinterface.PB_ManagerRole.*;
import Business.OrderSystem.OrderDirectory;
import Business.OrderSystem.OrderItem;
import Business.Organization.Organization;
import Business.Organization.PT_PrintingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Date;
import javax.swing.table.JTableHeader;
import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.log;
import static userinterface.MainJFrame.system;
import zOthers.changeDate;
/**
 *
 * @author admin
 */
public class PTManage_workAreaJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount user;
    private Organization ptmanorg;
    //private OrderDirectory orderDirectory;
    public PTManage_workAreaJPanel( JPanel container, UserAccount user) {
        initComponents();
        log.info("Login: Printer Manager User:"+user.getUsername());
        this.setBackground(new Color(253,251,239));
        this.container=container;
        this.user=user;
        this.ptmanorg=new PT_PrintingOrganization();
       labelUser.setText("Enterprise: "+user.getEmployee().getEnterprise().getEnterpriseName()+"("+user.getEmployee().getEnterprise().getNetwork().getName()+")");   
        JTableHeader head = tblQueue.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 24));// 设置表头大小
        head.setFont(new Font("Times New Romans", Font.PLAIN, 24));// 设置表格字体
        JTableHeader head1 = tblOrderItem.getTableHeader(); // 创建表格标题对象
        head1.setPreferredSize(new Dimension(head1.getWidth(), 24));// 设置表头大小
        head1.setFont(new Font("Times New Romans", Font.PLAIN, 24));// 设置表格字体
        //btnCommit.setEnabled(true);
        populate();
         populatePtman();
     
        
    }
    public void populatePtman(){
                comboPrintMan.removeAllItems();
        for(Organization or:user.getEmployee().getEnterprise().getOrganizationDirectory().getOrganizationList()){
            if(or.getOrgtypename().equals("PT_PrintingOrganization") ){
                ptmanorg=or;
                for(UserAccount ua:or.getUserAccountDirectory().getUserAccountList()){
                    if(checkBusy(ua)){
                         comboPrintMan.addItem(ua.getUsername());
                    }
                    
                }
                       
            }
        }
    
    }
    //判断这个ptman是否在忙
    public boolean checkBusy(UserAccount ua){
        boolean bl=true;
        for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList()){
            if(wr.getStatus().equals("Uncompleted")){
                 bl=false;
                 return bl;
            }
               
        
        }
        return bl;
    
    }
    public void populateItems(WorkRequest wr){
        if(wr!=null){
            DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
            dtm.setRowCount(0);
            for(OrderItem oi:wr.getOrder().getOrderItems()){
                Object[] r=new Object[5];
                r[0]=oi;
                r[1]=oi.getQuantity()+"";
              
             if(wr.getSenderEnterprise()!=null){
                    r[2]=wr.getSenderEnterprise().getEnterpriseName();
                    r[3]=wr.getSenderEnterprise().getPhone();               
                }else{
                    r[2]=wr.getSenderUserAccount().getUsername();
                    r[3]=wr.getSenderUserAccount().getPhone();
                }           
                
                r[4]=wr.getOrder().getStatus();
                dtm.addRow(r);

            }
        }
        
    }
    public void populate(){
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:user.getEmployee().getOrganization().getWorkQueue().getWorkRequestList()){
            if(wr.getStatus().equals("Uncompleted")){
                Object[] row=new Object[6];
                row[0]=new changeDate().change(wr.getRequestDate());
                if(wr.getSenderEnterprise()!=null){
                    row[1]=wr.getSenderEnterprise().getEnterpriseName();
                             
                }else{
                    row[1]=wr.getSenderUserAccount().getUsername();
                 
                }           
                row[2]=wr.getStatus();
                row[3]=wr.getMessage();
                row[4]=wr;
                row[5]=wr.getResolveDate()==null?"":new changeDate().change(wr.getResolveDate());
                dtm.addRow(row);
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

        btnDetails = new javax.swing.JButton();
        btnUnfinished = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboPrintMan = new javax.swing.JComboBox<>();
        btnCommit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQueue = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();

        setBackground(new java.awt.Color(253, 251, 239));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDetails.setFont(new java.awt.Font("Tekton Pro Ext", 1, 26)); // NOI18N
        btnDetails.setText("Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnUnfinished.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        btnUnfinished.setText("Unfinished");
        btnUnfinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnfinishedActionPerformed(evt);
            }
        });
        add(btnUnfinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnAll.setFont(new java.awt.Font("Tekton Pro Ext", 1, 28)); // NOI18N
        btnAll.setText("Finished");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel3.setText("Assign to a Print Man:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 290, 50));

        comboPrintMan.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        comboPrintMan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPrintMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrintManActionPerformed(evt);
            }
        });
        add(comboPrintMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, 270, 50));

        btnCommit.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        btnCommit.setText("Commit");
        btnCommit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommitActionPerformed(evt);
            }
        });
        add(btnCommit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 160, 50));

        jLabel10.setFont(new java.awt.Font("Tekton Pro Ext", 3, 36)); // NOI18N
        jLabel10.setText("Welcome! Printer Manager!");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        labelUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelUser.setText("labelUser");
        add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 350, 40));

        tblQueue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "Sender", "WR Status", "Message", "Order ID", "ResolveDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQueue.setRowHeight(25);
        jScrollPane1.setViewportView(tblQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 880, 370));

        tblOrderItem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "BookName", "Quantity", "Sender", "Sender Phone", "Order Status"
            }
        ));
        tblOrderItem.setRowHeight(25);
        jScrollPane2.setViewportView(tblOrderItem);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 880, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
             int row=tblQueue.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(row, 4);
            populateItems(wr);
        }
                
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnUnfinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnfinishedActionPerformed
         btnCommit.setEnabled(true);
        populate();
    }//GEN-LAST:event_btnUnfinishedActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
          btnCommit.setEnabled(false);
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:user.getEmployee().getOrganization().getWorkQueue().getWorkRequestList()){
               if(wr.getStatus().equals("Completed")){
            Object[] row=new Object[6];
                           row[0]=new changeDate().change(wr.getRequestDate());
                if(wr.getSenderEnterprise()!=null){
                    row[1]=wr.getSenderEnterprise().getEnterpriseName();
                             
                }else{
                    row[1]=wr.getSenderUserAccount().getUsername();
                 
                }           
                row[2]=wr.getStatus();
                row[3]=wr.getMessage();
                row[4]=wr;
                row[5]=wr.getResolveDate()==null?"":new changeDate().change(wr.getResolveDate());
            dtm.addRow(row);
               }
        }
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnCommitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommitActionPerformed

        
       int row=tblQueue.getSelectedRow();
       String selectedprintmanua=(String)comboPrintMan.getSelectedItem();
       // UserAccount selectedPrintMan=(UserAccount)comboPrintMan.getSelectedItem();
       UserAccount selectedPrintMan=new UserAccount();
       
        for(UserAccount us:ptmanorg.getUserAccountDirectory().getUserAccountList()){
            if(selectedprintmanua==us.getUsername()){
            selectedPrintMan=us;
            }
        
        }
        
        if(row<0||selectedPrintMan==null){
            if(row<0)
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
            else if(selectedPrintMan==null) 
            JOptionPane.showMessageDialog(null, "Please choose a pringting man", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(row, 4);
            
            WorkRequest newReq=new WorkRequest();
            newReq.setOrder(wr.getOrder());
            newReq.setSenderUserAccount(user);
            newReq.setStatus("Uncompleted");
            newReq.setRequestDate(new Date());
            newReq.setReceiverUserAccount(selectedPrintMan);

             //message
            int check=JOptionPane.YES_NO_OPTION;
            String mesg = JOptionPane.showInputDialog(null,"Message: \n","Mesg",check);
            if(check==JOptionPane.YES_OPTION){
                newReq.setMessage(mesg);
                JOptionPane.showMessageDialog(null, "A new work request has been sent out successfully.");
                wr.setStatus("Completed");
                wr.setResolveDate(new Date());
                selectedPrintMan.getWorkQueue().addNewRequest(newReq);
                DefaultTableModel dtm=(DefaultTableModel)tblOrderItem.getModel();
                dtm.setRowCount(0);
                populate(); 
                dB4OUtil.storeSystem(system); 
                populatePtman();
            }
                
        }
                    

    }//GEN-LAST:event_btnCommitActionPerformed

    private void comboPrintManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrintManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPrintManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnCommit;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnUnfinished;
    private javax.swing.JComboBox<String> comboPrintMan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tblOrderItem;
    private javax.swing.JTable tblQueue;
    // End of variables declaration//GEN-END:variables
}
