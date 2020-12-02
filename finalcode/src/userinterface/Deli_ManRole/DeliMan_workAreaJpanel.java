/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Deli_ManRole;

import Business.EcoSystem;
import Business.OrderSystem.OrderItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.JTableHeader;

/**
 *
 * @author liu
 */
public class DeliMan_workAreaJpanel extends javax.swing.JPanel {

    JPanel container;
    UserAccount ua;
    public DeliMan_workAreaJpanel(JPanel container,UserAccount user) {
        initComponents();      
        this.container=container;
        this.ua=user;
        labelUser.setText(ua.getUsername());   
        JTableHeader head = tblQueue.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 36));// 设置表头大小
        head.setFont(new Font("楷体", Font.PLAIN, 36));// 设置表格字体
        populate();
    }

    public void populate(){
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList()){
            if(wr.getStatus().equals(("Uncompleted"))){
                Object[] row=new Object[5];
                row[0]=wr.getRequestDate().toString();
                row[1]=wr;
                row[2]=wr.getReceiver().getUsername();
                row[3]=wr.getStatus();
                row[4]=wr.getMessage();
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

        jLabel1 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        btnUnfinished = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQueue = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSender1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenderAddr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtReceiver = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtReceiverAddr = new javax.swing.JTextField();
        txtRequestDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResolvedDate = new javax.swing.JTextField();
        btnArrival = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome! ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelUser.setText("labelUser");
        add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, 20));

        btnUnfinished.setText("Unfinished");
        add(btnUnfinished, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        btnAll.setText("All");
        add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        tblQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "Sender", "Receiver", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 770, 140));

        btnDetails.setText("Detials");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        jLabel2.setText("Sender:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        txtSender1.setEnabled(false);
        add(txtSender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 200, 30));

        jLabel7.setText("Sender Address:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        txtSenderAddr.setEnabled(false);
        add(txtSenderAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 200, 30));

        jLabel4.setText("Receiver:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        txtReceiver.setEnabled(false);
        add(txtReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 200, 30));

        jLabel6.setText("Receiver Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        txtReceiverAddr.setEnabled(false);
        add(txtReceiverAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 200, 30));

        txtRequestDate.setEnabled(false);
        add(txtRequestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 200, 30));

        jLabel3.setText("RequestDate:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabel5.setText("ResolvedDate:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        txtResolvedDate.setEnabled(false);
        add(txtResolvedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 200, 30));

        btnArrival.setText("Arrival");
        btnArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrivalActionPerformed(evt);
            }
        });
        add(btnArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int selected=tblQueue.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(null, "Please select a wrok request", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(selected, 1);
            txtSender1.setText(wr.getSender().getUsername());
            txtSenderAddr.setText(wr.getSender().getAddress());
            txtReceiver.setText(wr.getReceiver().getUsername());
            txtReceiverAddr.setText(wr.getOrder().getUserAccount().getAddress());
            txtRequestDate.setText(wr.getRequestDate().toString());
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrivalActionPerformed
        int selected=tblQueue.getSelectedRow();
        WorkRequest wr=(WorkRequest)tblQueue.getValueAt(selected, 1);
        int dialogBtn=JOptionPane.YES_NO_OPTION;
        int dialogRes=JOptionPane.showConfirmDialog(null, "Are you sure to arrivel?","Warning",dialogBtn);
        if(dialogRes==JOptionPane.YES_OPTION){
            wr.setStatus("Completed");
            wr.setResolveDate(new Date());
            //快递员送书到顾客改order状态,快递员送书到书店改order状态
            wr.getOrder().setStatus("Arrival");
            JOptionPane.showMessageDialog(null, "Completed mission successfully");             
        }          
        
        
    }//GEN-LAST:event_btnArrivalActionPerformed

    private void btnUnfinishedActionPerformed(java.awt.event.ActionEvent evt) {                                              
        populate();
    }                                             

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList()){          
            Object[] row=new Object[5];
            row[0]=wr.getRequestDate().toString();
            row[1]=wr;
            row[2]=wr.getReceiver().getUsername();
            row[3]=wr.getStatus();
            row[4]=wr.getMessage();
            dtm.addRow(row);                      
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnArrival;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnUnfinished;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tblQueue;
    private javax.swing.JTextField txtReceiver;
    private javax.swing.JTextField txtReceiverAddr;
    private javax.swing.JTextField txtRequestDate;
    private javax.swing.JTextField txtResolvedDate;
    private javax.swing.JTextField txtSender1;
    private javax.swing.JTextField txtSenderAddr;
    // End of variables declaration//GEN-END:variables
}
