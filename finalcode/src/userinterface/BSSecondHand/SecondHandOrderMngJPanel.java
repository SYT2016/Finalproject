/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BSSecondHand;

import Business.OrderSystem.Book;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BookStoreManagement.OrderBookToPublisherJPanel;

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
        initComponents();
        populateTable();
    }
    
     public void populateTable(){
        DefaultTableModel model=(DefaultTableModel)tblOrder.getModel();
        model.setRowCount(0);

        ArrayList<WorkRequest> requestList = shBookstoreManager.getWorkQueue().getWorkRequestCusToSHBSList();
        for(WorkRequest request : requestList){
            Object row[] = new Object[7];
            row[0] = request.getOrder();
            row[1] = request.getSenderUserAccount();
            row[2] = request.getSenderUserAccount().getAddress();
            row[3] = request.getRequestDate();
            row[4] = request.getOrder().getStatus();
            row[5] = request.getOrder().getExpectedPrice();
            row[6] = request.getOrder().getFinalPrice();
            model.addRow(row);
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Welcome! Second-hand center!");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Sender", "Address", "Date", "status", "Total Price", "Final Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(0).setResizable(false);
            tblOrder.getColumnModel().getColumn(1).setResizable(false);
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
            tblOrder.getColumnModel().getColumn(3).setResizable(false);
            tblOrder.getColumnModel().getColumn(4).setResizable(false);
            tblOrder.getColumnModel().getColumn(5).setResizable(false);
            tblOrder.getColumnModel().getColumn(6).setResizable(false);
        }

        btnProcess.setText("Process!");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProcess)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnProcess)
                .addContainerGap(72, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
