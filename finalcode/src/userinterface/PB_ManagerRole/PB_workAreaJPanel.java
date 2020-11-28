/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PB_ManagerRole;

import Business.OrderSystem.OrderDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class PB_workAreaJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount user;
    //private OrderDirectory orderDirectory;
    public PB_workAreaJPanel( JPanel container, UserAccount user) {
        initComponents();
        this.container=container;
        this.user=user;
        labelUser.setText(user.getUsername());
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm=(DefaultTableModel)tblQueue.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:user.getWorkQueue().getWorkRequestList()){
            Object[] row=new Object[4];
            row[0]=wr.getRequestDate().toString();
            row[1]=wr;
            row[2]=wr.getStatus();
            row[3]=wr.getMessage();
            dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQueue = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome! ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelUser.setText("labelUser");
        add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 150, 20));

        tblQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "Sender", "Status", "Message"
            }
        ));
        jScrollPane1.setViewportView(tblQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 580, 140));

        btnDetails.setText("Detials");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        add(btnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int row=tblQueue.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a work reuqest", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            WorkRequest wr=(WorkRequest)tblQueue.getValueAt(row, 1);
            PB_RequestDetailsJPanel jp=new PB_RequestDetailsJPanel(container,wr,user);
            CardLayout l=(CardLayout)container.getLayout();
            container.add(jp);
            l.next(container);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTable tblQueue;
    // End of variables declaration//GEN-END:variables
}
