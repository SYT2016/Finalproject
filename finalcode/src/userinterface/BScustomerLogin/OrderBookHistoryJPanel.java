/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BScustomerLogin;

import Business.OrderSystem.Order;
import Business.OrderSystem.OrderItem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.system;
import zOthers.changeDate;

/**
 *
 * @author wangcong
 */
public class OrderBookHistoryJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount customer;
    /**
     * Creates new form OrderHistoryJPanel
     */
    public OrderBookHistoryJPanel(JPanel container,UserAccount customer) {
        initComponents();
        this.container = container;
        this.customer = customer;
        this.setBackground(new Color(253,251,239));
        JTableHeader head = tblOrder.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 24));// 设置表头大小
        head.setFont(new Font("Times New Roman", Font.PLAIN, 24));// 设置表格字体
        
        JTableHeader head1 = tblOrderItem.getTableHeader(); // 创建表格标题对象
        head1.setPreferredSize(new Dimension(head1.getWidth(), 24));// 设置表头大小
        head1.setFont(new Font("Times New Roman", Font.PLAIN, 24));// 设置表格字体
        
        populateOrderTable();
    }
    
    public void populateOrderTable(){
        DefaultTableModel model=(DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);

        ArrayList<WorkRequest> requestList = customer.getWorkQueue().getWorkRequestList();
        for(WorkRequest request : requestList){
            Object row[] = new Object[6];
            row[0] = request;
            row[1] = request.getSenderUserAccount().getUsername();
            row[2] = request.getReceiverEnterprise().getEnterpriseName();
            row[3] = new changeDate().change(request.getRequestDate());
            //row[4] = request.getStatus();
            row[4] = request.getOrder().getStatus();
            row[5] = request.getOrder().getTotalPrice();
            model.addRow(row);
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 251, 239));
        setPreferredSize(new java.awt.Dimension(950, 800));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 48)); // NOI18N
        jLabel1.setText("View Buying Order History");

        btnBack.setFont(new java.awt.Font("Tekton Pro Ext", 1, 32)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblOrder.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Sender", "reciever", "Date", "status", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        btnViewDetails.setFont(new java.awt.Font("Tekton Pro Ext", 1, 32)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        tblOrderItem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "Bookstore", "Book Price", "Book Quantity", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderItem);
        if (tblOrderItem.getColumnModel().getColumnCount() > 0) {
            tblOrderItem.getColumnModel().getColumn(0).setResizable(false);
            tblOrderItem.getColumnModel().getColumn(1).setResizable(false);
            tblOrderItem.getColumnModel().getColumn(2).setResizable(false);
            tblOrderItem.getColumnModel().getColumn(3).setResizable(false);
            tblOrderItem.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 32)); // NOI18N
        btnBack1.setText("Delete");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                            .addComponent(btnViewDetails)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnBack1))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);        
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "please select a Order!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
        
        WorkRequest wr = (WorkRequest)tblOrder.getValueAt(selectedRow, 0);
        Order order=wr.getOrder();
        DefaultTableModel model=(DefaultTableModel)tblOrderItem.getModel();
        model.setRowCount(0);

        List<OrderItem> orderItemList = order.getOrderItems();
        for(OrderItem orderItem : orderItemList) {
            Object row[] = new Object[5];
            row[0] = orderItem.getBookname();
            row[1] = orderItem.getBookstore();
            row[2] = orderItem.getPrice();
            row[3] = orderItem.getQuantity();
            row[4] = orderItem.getSelectedbook().getStatus();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order!","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
             int mesg = JOptionPane.showConfirmDialog(null, "Are you sure to delete this order?", " WarningDialog!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(mesg==JOptionPane.YES_OPTION){
            
           WorkRequest workRequest = (WorkRequest)tblOrder.getValueAt(selectedRow, 0);
           customer.getWorkQueue().getWorkRequestList().remove(workRequest);
            }
            populateOrderTable();
            System.out.println("Customer Delete One Buying Order");
            dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblOrderItem;
    // End of variables declaration//GEN-END:variables
}
