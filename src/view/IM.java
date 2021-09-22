
package view;


import model.DBAdd;
import model.DBSearch;
import model.dbupdate;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class IM extends javax.swing.JFrame {

   String prod_order_qty [][]= new String [5][2];
   String part_order_qty [][]= new String [5][2];
   String qty[]=new String[1];
   
    public IM() {
        initComponents();
          loadoders();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnReOrder = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel Light", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Inventry Management");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 32, -1, 45));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel2.setText("Order  ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 139, -1, 20));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 140, 181, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Availability");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 193, 178, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Parts Availability");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 382, 178, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Part ID", "Remarks"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 422, 321, 114));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Avalable", "Status", "Remarks"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 233, 518, 114));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel5.setText("Order Parts");

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel6.setText(" Part ID");

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel7.setText("Order QTY");

        jButton1.setText("Place an Order");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 126, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Part ID", "Name", "Avalable", "Status", "Remarks"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 422, 518, 114));

        btnReOrder.setText("ReOrder");
        btnReOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnReOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 556, 124, 33));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 556, 127, 33));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Parts Availability");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 382, 178, -1));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 116, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
        
          int x=dtm.getRowCount();
         
          for(int r=0;r<x;r++){
        
        
        
        String id=(String) dtm.getValueAt(r, 0);
        String aqty=(String) dtm.getValueAt(r, 2);
        
       
        
        for(int row=0;row<5;row++)
        {
            String oderpid=(prod_order_qty[row][0]);
            
            int bal;
            if(id.equals(oderpid))
            {
                try{
                    int aq=Integer.parseInt(aqty);
                    int oq=Integer.parseInt(prod_order_qty[row][1]);
                    
                    if(aq<oq)
                    {
                        bal=0;
                    }
                    else{
                        bal=aq-oq;
                    }
                    
        dbupdate object=new dbupdate();
        object.updateproduct(id,aqty,bal);
                    
                    
                    //System.out.println("bal"+bal+"   id"+id+"avalable"+aqty);
                }
                catch (NumberFormatException e)
                {
                    
                }
                
              
            }
            
            
        }
            
        }
       
       //update the parts table
       DefaultTableModel dtm1=(DefaultTableModel)
               jTable3.getModel();
        
          int y=dtm1.getRowCount();
         
          for(int r=0;r<y;r++){
        String id=(String) dtm1.getValueAt(r, 0);
        String aqty=(String) dtm1.getValueAt(r, 2);
        
       
        
        for(int row=0;row<5;row++)
        {
            String oderpid=(prod_order_qty[row][0]);
            
            int bal;
            if(id.equals(oderpid))
            {
                try{
                    int aq=Integer.parseInt(aqty);
                    int oq=Integer.parseInt(prod_order_qty[row][1]);
                    
                    if(aq<oq)
                    {
                        bal=0;
                    }
                    else{
                        bal=aq-oq;
                    }
                    
                    dbupdate object=new dbupdate();
                    object.updateParts(id,bal);
                    
                    System.out.println("Balance " + bal);
                  //  System.out.println("bal"+bal+"   id"+id+"avalable"+aqty);
                }
                catch (NumberFormatException e)
                {
                    
                }
                
            }    
        }
            
     }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        loadOrdersProd((String) this.jComboBox1.getSelectedItem());
        loadProductAvalability();
        
        
        loadOrdersPart((String) this.jComboBox1.getSelectedItem());
        loadParttAvalability();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnReOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReOrderActionPerformed
         DefaultTableModel dtm=(DefaultTableModel)
               jTable3.getModel();
    
       DefaultTableModel dtm1=(DefaultTableModel)
               jTable1.getModel();
       
       dtm1.setRowCount(0);
       
       int x=dtm.getRowCount();
       
       for(int r=0;r<x;r++){
           String partname=(String) dtm.getValueAt(r, 0);
           String oderqty=(String) dtm.getValueAt(r,4);
            String status=(String) dtm.getValueAt(r,3);
          
            if(!status.equals("ok")){
                
                
            Vector v=new Vector();
            
            v.add(partname);
            v.add(oderqty);
            
            dtm1.addRow(v); 
                
            }
     
                else{
            
                    }  
       }
    }//GEN-LAST:event_btnReOrderActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReOrder;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void loadoders() {
   DBSearch obj=new DBSearch();
   ResultSet rs=obj.searchOrders();
   try{
        while(rs.next())
        {
           this.jComboBox1.addItem(rs.getString("order_id"));
        
        }}
   catch(Exception k)
           {
           System.out.println("error"+k.toString());
           }
    }
    
    ////////////
    
     private void loadOrdersProd(String order_id) {
        
         DBSearch obj=new DBSearch();
         ResultSet rs=obj.searchOrder_2(order_id);
         int r=0;
        
   try{
        while(rs.next())
        {
           
           prod_order_qty[r][0]=rs.getString("product_id");
           prod_order_qty[r][1]=rs.getString("qty");
         //   System.out.println(prod_order_qty[r][0]+prod_order_qty[r][1]);
           r++;
        }}
   catch(Exception k)
           {
           System.out.println("error"+k.toString());
           }
       
    }
     
     ///////////
     private void loadProductAvalability() {
          DBSearch obj=new DBSearch();
          String Order_id=(String) this.jComboBox1.getSelectedItem();
          ResultSet rs=obj.searchOrder_3(Order_id);
         
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
         dtm.setRowCount(0);
      
   try{
        while(rs.next())
        {
         
       Vector v=new Vector();
       
       for (int x=0; x<prod_order_qty.length; x++)
       {
           if (rs.getString("o.product_id").equals(prod_order_qty[x][0]))
           {
           v.add(rs.getString("p.product_id"));
           v.add(rs.getString("p.product_name"));
           v.add(rs.getString("qty"));
           qty[0]=(rs.getString("qty"));
           
           int oq=Integer.parseInt(prod_order_qty[x][1]);
           int oa=Integer.parseInt(rs.getString("qty"));
          
           if (oq>oa)
           {
               v.add("not ok");
               int diff=oq-oa;
               v.add(""+(diff)+" More needed");
          
           }
           
           else
           {
                v.add("ok");
               int diff=oa-oq;
               v.add(""+(diff)+" More in stock");
           }
             dtm.addRow(v);
           
           }
           
        }
        }
   }
   catch(Exception k)
           {
           System.out.println("error"+k.toString());
           }
        

    }
     /////////////////////////////////
     
     private void loadOrdersPart(String order_id) {
         
          DBSearch obj=new DBSearch();
          ResultSet rs=obj.searchOrder_2(order_id);
         int r=0;
        
   try{
        while(rs.next())
        {
           
           part_order_qty[r][0]=rs.getString("product_id");
           part_order_qty[r][1]=rs.getString("qty");
        // System.out.println(prod_order_qty[r][0]+prod_order_qty[r][1]);
           r++;
        }}
   catch(Exception k)
           {
           System.out.println("error"+k.toString());
           }
       
     }
  
     ///////////////////
     
     private void loadParttAvalability() {
         DBSearch obj=new DBSearch();
         String Order_id=(String) this.jComboBox1.getSelectedItem();
         ResultSet rs=obj.searchparts(Order_id);
         
        DefaultTableModel dtm1=(DefaultTableModel) jTable3.getModel();
         dtm1.setRowCount(0);
      
   try{
        while(rs.next())
        {
         
       Vector v=new Vector();
       
       for (int x=0; x<part_order_qty.length; x++)
       {
           if (rs.getString("o.product_id").equals(part_order_qty[x][0]))
           {
           v.add(rs.getString("p.p_id"));
           v.add(rs.getString("p.Desc"));
           v.add(rs.getString("qty1"));
           
           int oq=Integer.parseInt(part_order_qty[x][1]);
           
          int oa=Integer.parseInt(rs.getString("qty1"));
          int op=Integer.parseInt(rs.getString("o.qty"));
          int qq=Integer.parseInt(qty[0]);
           if (oq>oa)
           {
               v.add("not ok");
               int diff=op-oa-qq;
               
               
               
               v.add(""+(diff)+" More needed");
          
           }
           
           else
           {
                v.add("ok");
               int diff=oa-oq;
               v.add(""+(oa)+" More in stock");
           }
             dtm1.addRow(v);
           
           }
           
        }
        }
   }
   catch(Exception k)
           {
           System.out.println("error"+k.toString());
           }
        

        }
 
}
