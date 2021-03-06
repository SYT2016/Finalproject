/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BookStoreManagement;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PrinterEnterprise;
import Business.Enterprise.PublisherEnterprise;
import Business.Network.Network;
import Business.OrderSystem.Book;
import Business.Organization.BS_BookManagementOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.system;

/**
 *
 * @author wangcong
 */
public class AddBookJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount bookStoreManager;
//    private List<Book> bookList;
    /**
     * Creates new form AddBookJPanel
     */
    public AddBookJPanel(JPanel container,UserAccount bookStoreManager) {
        initComponents();
        this.setBackground(new Color(253,251,239));
        this.container = container;
        this.bookStoreManager = bookStoreManager;
        
        box1.removeAllItems();
        for(Network nt:system.getNetworkDirectory().getNetworkList()){//把现有的network名字加到combox里面，因为要在network里面创建enterprise
            for(Enterprise en:nt.getEnterpriseDirectory().getEnterpriseList()){
                if(en.getEnterpriseType().equals("Type-Publisher"))
                box1.addItem(en.toString());  
            
            }
        }
        
        
    }
public static boolean isNumeric(String str){

        String reg = "^[0-9]+(.[0-9]+)?$";

        return str.matches(reg);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        txtBookName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtTotalQuantity = new javax.swing.JTextField();
        box1 = new javax.swing.JComboBox<>();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(253, 251, 239));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 48)); // NOI18N
        jLabel1.setText("ADD BOOK FOR BOOKSTORE");

        btnBack.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Book Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Book Price:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Book Publisher:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setText("Book Status:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setText("Book TotalQuality:");

        btnUpload.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        btnUpload.setText("Upload!");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        txtBookName.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        txtTotalQuantity.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        box1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(jb1);
        jb1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jb1.setText(" New");

        buttonGroup1.add(jb2);
        jb2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jb2.setText(" SecondHand");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookName)
                    .addComponent(txtPrice)
                    .addComponent(box1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb1)
                        .addGap(37, 37, 37)
                        .addComponent(jb2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTotalQuantity))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpload)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jb1)
                    .addComponent(jb2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpload))
                .addGap(176, 176, 176))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        
        String str=txtPrice.getText();
        String str1=txtTotalQuantity.getText();
        BS_BookManagementOrganization bsManager = (BS_BookManagementOrganization)bookStoreManager.getEmployee().getOrganization();
        if(!isNumeric(str)||!isNumeric(str1)){
              JOptionPane.showMessageDialog(null, "Please input a valid number!", "Warning", JOptionPane.WARNING_MESSAGE);
          
        }
        else if(!bsManager.getBookDirectory().checkBookUnique(txtBookName.getText())){
            JOptionPane.showMessageDialog(null, "This Book Name Already Exists!", "Warning", JOptionPane.WARNING_MESSAGE);
          
        }
        else
        {

        String bookName = txtBookName.getText();
        double bookprice = Double.parseDouble(txtPrice.getText());
        String pb=(String)box1.getSelectedItem();
        Enterprise publisher=null;
         for(Network nt:system.getNetworkDirectory().getNetworkList()){//把现有的network名字加到combox里面，因为要在network里面创建enterprise
            for(Enterprise en:nt.getEnterpriseDirectory().getEnterpriseList()){
                if(en.getEnterpriseName().equals(pb))
                    publisher=en;
               
            }
        }
        
      //  PrinterEnterprise publisher = new PrinterEnterprise(txtPress.getText());

        String status = "";
        
         if(jb1.isSelected())
            status="New";
        else if(jb2.isSelected())
           status="SecondHand";
        
        int totalQuality = Integer.parseInt(txtTotalQuantity.getText());
        
        
        Book newBook = new Book();
        newBook.setName(bookName);
        newBook.setPrice(bookprice);
        newBook.setEnterprise(publisher);
        newBook.setStatus(status);
        newBook.setTotalQuantity(totalQuality);
        bsManager.getBookDirectory().addProduct(newBook);

        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Add book sucessfully!");
        
        txtBookName.setEnabled(false);
         txtPrice.setEnabled(false);
          txtTotalQuantity.setEnabled(false);
          btnUpload.setEnabled(false);
        
        } 
    }//GEN-LAST:event_btnUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpload;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotalQuantity;
    // End of variables declaration//GEN-END:variables
}
