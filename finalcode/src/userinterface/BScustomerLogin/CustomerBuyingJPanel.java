/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BScustomerLogin;

import Business.Enterprise.BookstoreEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OrderSystem.Book;
import Business.OrderSystem.OrderItem;
import Business.Organization.BS_BookManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BookStoreManagement.UpdateBookJPanel;

import static userinterface.MainJFrame.system;

/**
 *
 * @author wangcong
 */
public class CustomerBuyingJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount customer;
    private ArrayList<OrderItem> orderItemList;
    
    /**
     * Creates new form CustomerBuyingJPanel
     */
    public CustomerBuyingJPanel(JPanel container,UserAccount customer) {
        this.container = container;
        this.customer = customer;
        orderItemList = new ArrayList<>();
        initComponents();
        populateCombo();
    }
    
    public void populateCombo(){
        //populate the location option
        comboNetwork.removeAllItems();
        for(Network nt:system.getNetworkDirectory().getNetworkList()){//把现有的network名字加到combox里面，因为要在network里面创建enterprise
            comboNetwork.addItem(nt);
        }
        
        //populate all boosktores
        comboBookStore.removeAllItems();;
         Network network = (Network)comboNetwork.getSelectedItem();
         for(Enterprise en:network.getEnterpriseDirectory().getEnterpriseList()){
             if(en.getEnterpriseType().equals("Type-BookStore")){
                 comboBookStore.addItem((BookstoreEnterprise) en);
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
        comboBookStore = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookStore = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnViewShoppingCart = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        txtWanttedQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboNetwork = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();

        jLabel1.setText("Select your wanted bookstore:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Buying what you want!");

        jLabel3.setText("Try to search the book");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        tblBookStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookName", "Network", "Bookstore", "price", "status", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBookStore);
        if (tblBookStore.getColumnModel().getColumnCount() > 0) {
            tblBookStore.getColumnModel().getColumn(0).setResizable(false);
            tblBookStore.getColumnModel().getColumn(1).setResizable(false);
            tblBookStore.getColumnModel().getColumn(2).setResizable(false);
            tblBookStore.getColumnModel().getColumn(3).setResizable(false);
            tblBookStore.getColumnModel().getColumn(4).setResizable(false);
            tblBookStore.getColumnModel().getColumn(5).setResizable(false);
        }

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnViewShoppingCart.setText("View shopping cart");
        btnViewShoppingCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewShoppingCartActionPerformed(evt);
            }
        });

        btnAddToCart.setText("Add to Cart!!!");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        jLabel4.setText("Wantted Quantity:");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("Select your location:");

        comboNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboNetworkItemStateChanged(evt);
            }
        });

        btnSearch.setText("Search!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnViewShoppingCart)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddToCart)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewDetails))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(39, 39, 39)
                                    .addComponent(txtWanttedQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBookStore, 0, 127, Short.MAX_VALUE)
                                .addComponent(comboNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBookStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWanttedQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddToCart)
                        .addComponent(btnViewDetails)))
                .addGap(18, 18, 18)
                .addComponent(btnViewShoppingCart)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboNetworkItemStateChanged
        //make two comboBox related
        comboBookStore.removeAllItems();
        Network network = (Network)comboNetwork.getSelectedItem();
        if (network == null) {
            return;
        }
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseType().equals("Type-BookStore")){
                comboBookStore.addItem((BookstoreEnterprise) enterprise);
            }
        }
        populateTable();
        //make the table change according to the comboBox
    }//GEN-LAST:event_comboNetworkItemStateChanged

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed

          /* get the quantity that customer wants*/
          int wanttedQuantity = Integer.parseInt(txtWanttedQuantity.getText());
          
          int row = tblBookStore.getSelectedRow();
          if (row < 0){
              JOptionPane.showMessageDialog(null, "please select a book!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
          Book selectedBook = (Book) tblBookStore.getValueAt(row, 0);
          
          /* tell the quantity of true and wantted*/
          if(selectedBook.getTotalQuantity() < wanttedQuantity){
              JOptionPane.showMessageDialog(null, "Inventory shortage!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
          /* set the wantted quantity of the selectedbook*/
          selectedBook.setWanttedQuantity(wanttedQuantity);
          Network network = (Network) tblBookStore.getValueAt(row, 1);
          BookstoreEnterprise bookstore = (BookstoreEnterprise)tblBookStore.getValueAt(row, 2);
          
          double selectedBookPrice = selectedBook.getPrice();
          OrderItem orderItem = new OrderItem(selectedBook,wanttedQuantity,selectedBookPrice,network,bookstore);
          /* put selected book to the selectedBookList*/
          //orderItemList = new ArrayList<OrderItem>;
          orderItemList.add(orderItem);
          JOptionPane.showMessageDialog(null, "Add to your cart!");
    }//GEN-LAST:event_btnAddToCartActionPerformed

    
    
    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        int row = tblBookStore.getSelectedRow();
        if (row < 0){
              JOptionPane.showMessageDialog(null, "please select a book!","Warning",JOptionPane.WARNING_MESSAGE);
              return;
          }
        Book selectedBook = (Book) tblBookStore.getValueAt(row, 0);
        ViewBookDetailsJPanel viewBookDetailsJPanel = new ViewBookDetailsJPanel(container,customer,selectedBook);
        container.add("ViewBookDetailsJPanel",viewBookDetailsJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String bookName = txtSearch.getText();
        Network network = (Network)comboNetwork.getSelectedItem();
        BookstoreEnterprise bookstore = (BookstoreEnterprise)comboBookStore.getSelectedItem();
        List<Book> bookList = new ArrayList<>();
        Book targetBook = null;
        
        for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseName().equals(bookstore.getEnterpriseName())){
                BookstoreEnterprise bse = (BookstoreEnterprise) enterprise;
                ArrayList<Organization> organizations =  bse.getOrganizationDirectory().getOrganizationList();
                for (Organization organization : organizations) {
                    if (organization instanceof BS_BookManagementOrganization) {
                        BS_BookManagementOrganization bso = (BS_BookManagementOrganization) organization;
                        bookList.addAll(bso.getBookDirectory().getBooklist());
                        for(Book book : bookList){
                            if(book.getName().equals(bookName)){
                                targetBook = book;
                            }
                        }
                    }
                }
            }
        }
        
        
        DefaultTableModel model=(DefaultTableModel)tblBookStore.getModel();
        model.setRowCount(0);
        Object row[] = new Object[6];
        row[0]= targetBook;
        row[1] = network;
        row[2] = bookstore;
        row[3]= String.valueOf(targetBook.getPrice());
        row[4]= targetBook.getStatus();
        row[5] = targetBook.getTotalQuantity();
        model.addRow(row);
        
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewShoppingCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewShoppingCartActionPerformed
        Network network = (Network)comboNetwork.getSelectedItem();
        BookstoreEnterprise bookstore = (BookstoreEnterprise)comboBookStore.getSelectedItem();
        
        ViewShoppingCartJPanel viewShoppingCartJPanel = new ViewShoppingCartJPanel(container,customer,orderItemList,network,bookstore);
        container.add("ViewShoppingCartJPanel",viewShoppingCartJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnViewShoppingCartActionPerformed

    
    private void populateTable(){
        Network network = (Network)comboNetwork.getSelectedItem();
        BookstoreEnterprise bookstore = (BookstoreEnterprise)comboBookStore.getSelectedItem();

        List<Book> bookList = new ArrayList<>();
        for(Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise.getEnterpriseName().equals(bookstore.getEnterpriseName())){
                BookstoreEnterprise bse = (BookstoreEnterprise) enterprise;
                ArrayList<Organization> organizations =  bse.getOrganizationDirectory().getOrganizationList();
                for (Organization organization : organizations) {
                    if (organization instanceof BS_BookManagementOrganization) {
                        BS_BookManagementOrganization bso = (BS_BookManagementOrganization) organization;
                        bookList.addAll(bso.getBookDirectory().getBooklist());
                    }
                }
            }
        }

        DefaultTableModel model=(DefaultTableModel)tblBookStore.getModel();
        model.setRowCount(0);
        for(Book book:bookList){
            Object row[]=new Object[6];
            row[0]= book;
            row[1] = network;
            row[2] = bookstore;
            row[3]= String.valueOf(book.getPrice());
            row[4]= book.getStatus();
            row[5] = book.getTotalQuantity();
            model.addRow(row);
        }
    }
    
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        populateTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnViewShoppingCart;
    private javax.swing.JComboBox<BookstoreEnterprise> comboBookStore;
    private javax.swing.JComboBox<Network> comboNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBookStore;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtWanttedQuantity;
    // End of variables declaration//GEN-END:variables
}
