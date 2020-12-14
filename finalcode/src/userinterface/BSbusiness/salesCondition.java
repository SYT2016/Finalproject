/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BSbusiness;

import Business.OrderSystem.OrderItem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author liu
 */
public class salesCondition extends javax.swing.JPanel {

    JPanel container;
    UserAccount ua;
    public salesCondition(JPanel container,UserAccount ua) {
        initComponents();
        this.container=container;
        this.ua=ua;
        this.setBackground(new Color(253,251,239));
        populateChart();
    }
    
     public void populateChart(){
        JFreeChart chart=ChartFactory.createTimeSeriesChart("Sales Condition Recent","Day","Sales",getData());
        XYPlot plot=(XYPlot)chart.getPlot();
        DateAxis dateAxis=(DateAxis)plot.getDomainAxis();
        dateAxis.setDateFormatOverride(new SimpleDateFormat("MM-dd"));
        dateAxis.setLabelFont(new Font("Times New Roman",Font.PLAIN,24));
        dateAxis.setTickLabelFont(new Font("Times New Roman",Font.PLAIN,24));
        ValueAxis rangeAxis=plot.getRangeAxis();
        rangeAxis.setLabelFont(new Font("Times New Roman",Font.PLAIN,24));
        dateAxis.setTickUnit(new DateTickUnit(DateTickUnitType.DAY,1));
        chart.getLegend().setItemFont(new Font("Times New Roman",Font.PLAIN,24));
        chart.getTitle().setFont(new Font("Times New Roman",Font.PLAIN,24));
        ChartPanel jp=new ChartPanel(chart,true);
        jp.setBounds(100, 100, 700, 600);
        this.add(jp);
    }
    
    public XYDataset getData(){
        List<WorkRequest> workQueue=null;
        for(Organization o:ua.getEmployee().getEnterprise().getOrganizationDirectory().getOrganizationList()){
            if(o.getOrgtypename().equals("BS_BookManagementOrganization")){
                workQueue=o.getWorkQueue().getWorkRequestList();
            }
        }
        if(workQueue!=null){
            Map<String,Double> map=new HashMap<>();
            SimpleDateFormat sdf=new SimpleDateFormat("MM/dd");  
            
            for(WorkRequest w:workQueue){
//                Date tmp;
                try {
                    String tmp=sdf.format(w.getRequestDate());
//                    tmp = sdf.parse(w.getRequestDate().toString());
//                    Calendar c1=w.getRequestDate()
                    double tmpTotal=new Double(w.getOrder().getTotalPrice());
                    map.put(tmp, !map.containsKey(tmp)?tmpTotal:map.get(tmp)+tmpTotal);  
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                             
            }
            List<Map.Entry<String,Double>> l=new ArrayList<>();
            l.addAll(map.entrySet());
            Collections.sort(l, new Comparator<Map.Entry<String,Double>>(){
                @Override
                public int compare(Map.Entry<String,Double> m1,Map.Entry<String,Double> m2){
                    return m1.getKey().compareTo(m2.getKey());
                }
            });           
            TimeSeries series=new TimeSeries("Sales Condition");
            for(int i=0;i<l.size();i++){
                try {
                    
                    series.add(new Day(sdf.parse(l.get(i).getKey())),new Double(l.get(i).getValue()));
                } catch (ParseException ex) {
                    Logger.getLogger(salesCondition.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
            TimeSeriesCollection collect=new TimeSeriesCollection();
            collect.addSeries(series);
            return collect;
        }
        return null;
    }
    
    public long convert(Date d1,Date d2){
        long quot=0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");        
        try{
            Date date1=sdf.parse(d1.toString());
            Date date2=sdf.parse(d2.toString());
            quot=date1.getTime()-date2.getTime();
            quot=quot/1000/60/60/24;
        }catch(Exception e){
            e.printStackTrace();
        }
        return quot;
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

        setBackground(new java.awt.Color(253, 251, 239));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 36)); // NOI18N
        jLabel1.setText("Sales Condition Recently");

        btnBack.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addContainerGap(744, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this); 
        CardLayout l=(CardLayout)container.getLayout();
        l.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
