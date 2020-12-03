/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BookStoreManagement;

import Business.OrderSystem.Book;
import Business.Organization.BS_BookManagementOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wangcong
 */
public class ManageBooksJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount bookStoreManager;
    private List<Book> bookList;
    /**
     * Creates new form UploadBooksJPanel
     */
    public ManageBooksJPanel(JPanel container,UserAccount bookStoreManager) {
        initComponents();
        this.container = container;
        this.bookStoreManager = bookStoreManager;
        populateTable();
    }
    
    public void populateTable(){
        
        bookList = new ArrayList<>();
        BS_BookManagementOrganization bsManager = (BS_BookManagementOrganization)bookStoreManager.getEmployee().getOrganization();
        bookList = bsManager.getBookDirectory().getBooklist();
        
        DefaultTableModel model=(DefaultTableModel)tblBooks.getModel();
        model.setRowCount(0);
        for(Book book:bookList){
            Object row[]=new Object[5];
            row[0]= book;
            row[1]= book.getEnterprise().getEnterpriseName();
            row[2]= String.valueOf(book.getPrice());
            row[3]= String.valueOf(book.getTotalQuantity());
            row[4]= book.getStatus();
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnAddBook = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Manage Books");

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Press", "Price", "Quantities", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBooks);
        if (tblBooks.getColumnModel().getColumnCount() > 0) {
            tblBooks.getColumnModel().getColumn(0).setResizable(false);
            tblBooks.getColumnModel().getColumn(1).setResizable(false);
            tblBooks.getColumnModel().getColumn(2).setResizable(false);
            tblBooks.getColumnModel().getColumn(3).setResizable(false);
            tblBooks.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAddBook.setText("Add Book");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update Book");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddBook)
                        .addGap(46, 46, 46)
                        .addComponent(btnUpdate)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook)
                    .addComponent(btnUpdate))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);        
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        AddBookJPanel addBookJPanel = new AddBookJPanel(container,bookStoreManager);
        container.add("AddBookJPanel", addBookJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row=tblBooks.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Book selectedBook = (Book) tblBooks.getValueAt(row, 0);
        UpdateBookJPanel updateBookJPanel = new UpdateBookJPanel(container,bookStoreManager,selectedBook);
        container.add("UpdateBookJPanel", updateBookJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBooks;
    // End of variables declaration//GEN-END:variables
}
