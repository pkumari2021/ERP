/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.DBSearch;

/**
 *
 * @author Hansi
 */
public class Forcasting extends javax.swing.JFrame {

    /**
     * Creates new form Forcasting
     */
    public Forcasting() {
        initComponents();
        
        loadThreemonthsParts();
        loadParts();
        loadCurrentMonth();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnForcasting = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel Light", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Forcasting");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 27, -1, 45));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel2.setText("Month");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 218, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Month", "Part ID", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 413, 85));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel3.setText("Part  ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 259, -1, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 257, 109, -1));

        jLabel4.setText("________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 303, 110, 20));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel5.setText("Needs Parts :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 305, -1, -1));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 378, 116, 37));

        btnForcasting.setBackground(new java.awt.Color(102, 255, 51));
        btnForcasting.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        btnForcasting.setForeground(new java.awt.Color(102, 102, 102));
        btnForcasting.setText("Forecaste");
        btnForcasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForcastingActionPerformed(evt);
            }
        });
        jPanel1.add(btnForcasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 378, 120, 37));

        jLabel6.setText("jan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 213, 148, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
     
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnForcastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForcastingActionPerformed
       DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
       int x=dtm.getRowCount();
       //int tot_qty=0;
        int t=0;
       for(int r=0; r<x; r++)
       {
           String partId=(String) dtm.getValueAt(r, 1);
           if(partId.equals((String)this.jComboBox1.getSelectedItem()))
           {
            //tot_qty=Integer.parseInt(String) dtm.getValueAt(r, 2);
               t = Integer.parseInt((String)dtm.getValueAt(r,2));
           }
           int z=t/3;
           //this.jLabel4.setText(tot_qty /3+"");
            this.jLabel4.setText(z+"");
       }
       
       
    }//GEN-LAST:event_btnForcastingActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forcasting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forcasting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forcasting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forcasting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forcasting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnForcasting;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void loadThreemonthsParts() {
    DBSearch obj=new DBSearch();
    ResultSet rs=obj.search3MonthsParts();
    
    DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
    dtm.setRowCount(0);
    
    try{
        while(rs.next()){
            Vector v=new Vector();
            v.add(rs.getString("Order_month"));
            v.add(rs.getString("Part_id"));
            v.add(rs.getString("Order_qty"));
            dtm.addRow(v);
            
        }
    }catch(Exception e){
        System.out.println(""+e.toString());
    }
    
    }

    private void loadParts() {
    DBSearch obj=new DBSearch();
    ResultSet rs=obj.searchparts(); 
    
    try{
        while(rs.next())
        {
            this.jComboBox1.addItem(rs.getString("p_id")); //part table
            
        }
    }catch(Exception e)
    {
        System.out.println(""+e.toString());
    }
    }

    private void loadCurrentMonth() {
      Calendar now=Calendar.getInstance();
      int month=now.get(Calendar.MONTH)+1;
      
      switch(month){
          case 1:this.jLabel6.setText("Jan");
          break;
          case 2:this.jLabel6.setText("Feb");
          break;
          case 3:this.jLabel6.setText("Mar");
          break;
          case 4:this.jLabel6.setText("Apr");
          break;
          case 5:this.jLabel6.setText("May");
          break;
          case 6:this.jLabel6.setText("Jun");
          break;
          case 7:this.jLabel6.setText("Jul");
          break;
          case 8:this.jLabel6.setText("Aug");
          break;
          case 9:this.jLabel6.setText("Sep");
          break;
          case 10:this.jLabel6.setText("Oct");
          break;
          case 11:this.jLabel6.setText("Nov");
          break;
          default:this.jLabel6.setText("Dec");
      }
    }
}
