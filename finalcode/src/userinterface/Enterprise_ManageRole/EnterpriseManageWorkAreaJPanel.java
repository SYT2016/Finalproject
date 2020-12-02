/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Enterprise_ManageRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.BS_BookManageRole;
import Business.Role.BS_SalesRole;
import Business.Role.BS_SecondHandManageRole;
import Business.Role.Deli_DeliveryManRole;
import Business.Role.Deli_DeliveryManageRole;
import Business.Role.PB_ManageRole;
import Business.Role.PT_ManageRole;
import Business.Role.PT_PrintingMemberRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.system;

/**
 *
 * @author 16104
 */
public class EnterpriseManageWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount ua;
    private Enterprise ua_enterprise;
    
    /**
     * Creates new form EnterpriseManageWorkAreaJPanel
     * @param userProcessContainer
     * @param ua
     */
    public EnterpriseManageWorkAreaJPanel(JPanel userProcessContainer,UserAccount ua) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ua=ua; 
     
        populateCombo();
        
    }
    
      public void populateCombo(){
        String[] organizationType_BS={"BS_BookManagementOrganization","BS_SalesOrganization","BS_SecondHandOrganization"};
        String[] organizationType_Deli={"Deli_DeliveryManOrganization","Deli_ManagementOrganization"};
        String[] organizationType_PB={"PB_ManagementOrganization"};
        String[] organizationType_PT={"PT_ManagementOrganization","PT_PrintingOrganization"};

        b1.removeAllItems();
        b2.removeAllItems();
        ua_enterprise=ua.getEmployee().getEnterprise();//根据老板的账号，判断是哪家enterprise
        //"Type-BookStore","Type-DeliveryCompany","Type-Printer","Type-Publisher"
        tt22.setText("Enterprise Name: "+ua_enterprise.getEnterpriseName()+"  Type: "+ua_enterprise.getEnterpriseType());
        tt33.setText("Enterprise Name: "+ua_enterprise.getEnterpriseName()+"  Type: "+ua_enterprise.getEnterpriseType());
        //根据enterprise的类型不同给出可以创建的organization类型
        if(ua_enterprise.getEnterpriseType().equals("Type-BookStore")){
            //如果这是个书店
            for(String a:organizationType_BS){
                b1.addItem(a);  
                
            }
                  
        
        }
        else if(ua_enterprise.getEnterpriseType().equals("Type-DeliveryCompany")){
            //如果这是个快递公司
            for(String a:organizationType_Deli){
                  b1.addItem(a);
                  
            }
        
        } 
        else if(ua_enterprise.getEnterpriseType().equals("Type-Printer")){
            //如果这是个复印公司
            for(String a:organizationType_PT){
                  b1.addItem(a);
                  
            }
        
        }
        else if(ua_enterprise.getEnterpriseType().equals("Type-Publisher")){
        //如果这是个出版社公司
            for(String a:organizationType_PB){
                  b1.addItem(a);
                  
            }
        
        }
        for(Organization o:ua_enterprise.getOrganizationDirectory().getOrganizationList()){
            b2.addItem(o.getOrgtypename());
        }
        populateOrgTable();
        populateEmpTable();

    
    }
      private void populateEmpTable(){
        DefaultTableModel model=(DefaultTableModel)t2.getModel();
        model.setRowCount(0);
        Network nt=system.getNetworkDirectory().searchNetwork(ua_enterprise.getNetwork());
        Enterprise enter=nt.getEnterpriseDirectory().searchEnterprise(ua_enterprise);
        ArrayList<Organization> orlist=enter.getOrganizationDirectory().getOrganizationList();
        //该公司的所有organization遍历一遍
        for(Organization o:orlist){
            for(UserAccount a:o.getUserAccountDirectory().getUserAccountList()){
                 Object row[]=new Object[5];
                row[0]=a;
                row[1]=a.getPassword();
                row[2]=a.getEmployee().getRealname();
                row[3]=a.getEmployee().getGender();
                row[4]=a.getEmployee().getOrganization().getOrgtypename();
            
            model.addRow(row);
            
            }
        
        }
        
      
      }
     private void populateOrgTable(){
        //选择一个network               
        DefaultTableModel model=(DefaultTableModel)tb1.getModel();
        model.setRowCount(0);
        
        Network nt=system.getNetworkDirectory().searchNetwork(ua_enterprise.getNetwork());
        Enterprise enter=nt.getEnterpriseDirectory().searchEnterprise(ua_enterprise);
        System.out.println(enter.getEnterpriseName());
        for(Organization or:enter.getOrganizationDirectory().getOrganizationList()){
            Object row[]=new Object[2];
            row[0]=or.getOrganizationID();
            row[1]=or;
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        b2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        tt1 = new javax.swing.JTextField();
        tt2 = new javax.swing.JTextField();
        tt3 = new javax.swing.JTextField();
        btnrrr = new javax.swing.JButton();
        tt33 = new javax.swing.JLabel();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        b1 = new javax.swing.JComboBox<>();
        addneworg = new javax.swing.JButton();
        btnre = new javax.swing.JButton();
        tt22 = new javax.swing.JLabel();

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        t2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UserAccount", "Password", "Name", "Gender", "Organization Name"
            }
        ));
        t2.setRowHeight(36);
        jScrollPane1.setViewportView(t2);
        if (t2.getColumnModel().getColumnCount() > 0) {
            t2.getColumnModel().getColumn(0).setMinWidth(200);
            t2.getColumnModel().getColumn(0).setPreferredWidth(200);
            t2.getColumnModel().getColumn(0).setMaxWidth(200);
            t2.getColumnModel().getColumn(1).setMinWidth(200);
            t2.getColumnModel().getColumn(1).setPreferredWidth(200);
            t2.getColumnModel().getColumn(1).setMaxWidth(200);
            t2.getColumnModel().getColumn(2).setMinWidth(200);
            t2.getColumnModel().getColumn(2).setPreferredWidth(200);
            t2.getColumnModel().getColumn(2).setMaxWidth(200);
            t2.getColumnModel().getColumn(3).setMinWidth(150);
            t2.getColumnModel().getColumn(3).setPreferredWidth(150);
            t2.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Employee UserAccount");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Employee Password");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Employee Name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Employee Gender");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Employee Organization");

        b2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Add New Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tt1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tt2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tt2ActionPerformed(evt);
            }
        });

        tt3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tt3ActionPerformed(evt);
            }
        });

        btnrrr.setText("Refresh");
        btnrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrrrActionPerformed(evt);
            }
        });

        tt33.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tt33.setText("jLabel1");

        buttonGroup1.add(jb1);
        jb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb1.setText(" Male");

        buttonGroup1.add(jb2);
        jb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jb2.setText(" Female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(tt33, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnrrr)
                .addGap(154, 154, 154))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tt1)
                            .addComponent(tt2)
                            .addComponent(tt3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb1)
                        .addGap(23, 23, 23)
                        .addComponent(jb2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnrrr)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tt33)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb1)
                            .addComponent(jb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Employee", jPanel2);

        tb1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "OrganizationID", "Organization Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setRowHeight(36);
        jScrollPane3.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setMinWidth(200);
            tb1.getColumnModel().getColumn(0).setPreferredWidth(200);
            tb1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Organization Type");

        b1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addneworg.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        addneworg.setText("Add New Organization");
        addneworg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addneworgActionPerformed(evt);
            }
        });

        btnre.setText("Refresh");
        btnre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreActionPerformed(evt);
            }
        });

        tt22.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tt22.setText("Enterprise:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tt22, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnre))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addneworg, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(263, 263, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tt22)
                    .addComponent(btnre))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addneworg))
                .addContainerGap(497, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Organization", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tt2ActionPerformed

    private void tt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tt3ActionPerformed

    private void addneworgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addneworgActionPerformed
        // TODO add your handling code here:
         String selectorganizationtype=(String) b1.getSelectedItem();
         Network nt=system.getNetworkDirectory().searchNetwork(ua_enterprise.getNetwork());
         Enterprise enter=nt.getEnterpriseDirectory().searchEnterprise(ua_enterprise);
         Organization newOrg=enter.getOrganizationDirectory().createOrganization(selectorganizationtype);
      
        JOptionPane.showMessageDialog(null, "Add New Organization Successfully!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
        dB4OUtil.storeSystem(system);
        populateCombo();
        populateOrgTable();
    }//GEN-LAST:event_addneworgActionPerformed

    private void btnreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreActionPerformed
        // TODO add your handling code here:
        populateCombo();
        
        populateOrgTable();
    }//GEN-LAST:event_btnreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String selectorganizationrole=(String) b2.getSelectedItem();
        Organization selectedorganization=null;
        Network nt=system.getNetworkDirectory().searchNetwork(ua_enterprise.getNetwork());
        Enterprise enter=nt.getEnterpriseDirectory().searchEnterprise(ua_enterprise);
        for(Organization o:enter.getOrganizationDirectory().getOrganizationList()){
            if(o.getOrgtypename().equals(selectorganizationrole))
                selectedorganization=o;
            
        
        }

        Employee employee=new Employee();
        employee.setEnterprise(enter);
        employee.setRealname(tt3.getText());
        employee.setOrganization(selectedorganization);
        if(jb1.isSelected())
            employee.setGender("Male");
        else if(jb2.isSelected())
            employee.setGender("Female");
        
         if(selectorganizationrole.equals("BS_BookManagementOrganization")){
               BS_BookManageRole bS_BookManageRole  =new BS_BookManageRole();
               UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,bS_BookManageRole);
               selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
         else if(selectorganizationrole.equals("BS_SecondHandOrganization")){
               BS_SecondHandManageRole bS_SecondHandManageRole  =new BS_SecondHandManageRole();
               UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,bS_SecondHandManageRole);
               selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
        else if(selectorganizationrole.equals("BS_SalesOrganization")){
               BS_SalesRole bS_SalesRole  =new BS_SalesRole();
               UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,bS_SalesRole);
               selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
        else if(selectorganizationrole.equals("Deli_DeliveryManOrganization")){
               Deli_DeliveryManRole deli_DeliveryManRole  =new Deli_DeliveryManRole();
               UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,deli_DeliveryManRole);
               selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }

        else if(selectorganizationrole.equals("Deli_ManagementOrganization")){
              Deli_DeliveryManageRole deli_DeliveryManageRole  =new Deli_DeliveryManageRole();
              UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,deli_DeliveryManageRole);
              selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
        else if(selectorganizationrole.equals("PB_ManagementOrganization")){
              PB_ManageRole pB_ManageRole  =new PB_ManageRole();
              UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,pB_ManageRole);
              selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
        else if(selectorganizationrole.equals("PT_ManagementOrganization")){
               PT_ManageRole pT_ManageRole  =new PT_ManageRole();
               UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,pT_ManageRole);
               selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
         else if(selectorganizationrole.equals("PT_PrintingOrganization")){
              PT_PrintingMemberRole pT_PrintingMemberRole  =new PT_PrintingMemberRole();
              UserAccount ua=system.getUserAccountDirectory().createUserAccount(tt1.getText(), tt2.getText(), employee,pT_PrintingMemberRole);
              selectedorganization.getUserAccountDirectory().getUserAccountList().add(ua);
         }
        JOptionPane.showMessageDialog(null, "Add New Employee Successfully!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
        populateEmpTable();
        dB4OUtil.storeSystem(system);

        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrrrActionPerformed
        // TODO add your handling code here:
        populateCombo();
        
        populateEmpTable();
    }//GEN-LAST:event_btnrrrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addneworg;
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JComboBox<String> b2;
    private javax.swing.JButton btnre;
    private javax.swing.JButton btnrrr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JTable t2;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField tt1;
    private javax.swing.JTextField tt2;
    private javax.swing.JLabel tt22;
    private javax.swing.JTextField tt3;
    private javax.swing.JLabel tt33;
    // End of variables declaration//GEN-END:variables
}
