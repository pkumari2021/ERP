
package view;

import model.DBSearch;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;





public class BOM extends javax.swing.JFrame {
    
    String prod_order_qty [][]= new String [5][2];
    String part_order_qty [][]= new String [5][2];
    String qty[]=new String[1];
    String part_order_qty_final [][]=new String [5][2];
    String part_order_qty_last [][]=new String[5][2];


    
    public BOM() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel Light", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Bill of Materials");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 26, -1, 45));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel2.setText("Order  ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 123, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 121, 146, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Part ID", "Description", "Total Qty", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 105));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Description", "Order Qty"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 105));

        btnCancel1.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel1.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel1.setText("Cancel");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 120, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        loadorderprod((String) this.jComboBox1.getSelectedItem());
        loadProductAvalability();
        
        loadorderpart((String) this.jComboBox1.getSelectedItem());     
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(BOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BOM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
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
    
    
    private void loadorderprod(String oder_id){
         DBSearch obj=new DBSearch();
         ResultSet rs=obj.searchOrders_2(oder_id);
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
        //To change body of generated methods, choose Tools | Templates.
    
    }
    
    private void loadProductAvalability(){
        
        
    DBSearch obj=new DBSearch();
     String Order_id=(String) this.jComboBox1.getSelectedItem();
         ResultSet rs=obj.searchOrders_3(Order_id);
         
    DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
         dtm.setRowCount(0);
      
   try {
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
    
    private void loadorderpart(String order_id){
        DBSearch obj = new DBSearch();
        ResultSet rs = obj.searchparts_2(order_id);
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        try{
        
            int r=0;
            while (rs.next()){
                part_order_qty[r][0] = rs.getString("p.product_id");
                part_order_qty[r][1] = rs.getString("p.p_id");
               
                System.out.println("p_id" + part_order_qty[r][0]+" "+part_order_qty[r][1]);
                
                r++;
            }
            
        }catch(Exception e){
            
        }
        ResultSet rs1 = obj.searchparts_3(order_id);
        
        try{
            int r=0,row=0;
            while (rs1.next()){
                if(prod_order_qty[r][0].equals(rs1.getString("p.product_id")))
                {
                part_order_qty_final[row][0]=rs1.getString("p.p_id");
                part_order_qty_final[row][1]=rs1.getString("p.q_of_p_val");
                
                System.out.println("p_id "+part_order_qty_final[row][0]+" "+part_order_qty_final[row][1]);
                row++;
                }
            }
        
        }catch(Exception e){
            
        }
        
        try{
            int p=0;
            for(int L=0;L<5;L++){
                
                //part_order_qty_last
            for(int k=0;k<5;k++){
                if(prod_order_qty[L][0].equals(part_order_qty[k][0])){
                    part_order_qty_last[p][0] = part_order_qty[k][1];
                    int val = Integer.parseInt(part_order_qty[L][1])* Integer.parseInt(part_order_qty_final[k][1]);
                    part_order_qty_last[p][1] = val+"";
                    
                }
            }
            }
        
        }catch(Exception e){
        
        }
    }


    

   
    
    

   
 

    
}
