
package view;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.DBSearch;

public class MRP extends javax.swing.JFrame {

    DefaultTableModel dtm;
   
    public MRP() {
        initComponents();
        loadOrders();
        
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tcus_id = new javax.swing.JTextField();
        tD_Date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Material Requirement Plan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 111, 186, -1));
        jPanel1.add(tcus_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 157, 186, -1));
        jPanel1.add(tD_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 198, 186, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Other Qty"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 254, 333, 125));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Required PROS DUCT-WISE PARTBreakdown");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 397, 415, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel6.setText("      Print");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 85, 32));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Part ID", "Description", "Required Qty"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 447, 329, 133));

        btnCancel.setBackground(new java.awt.Color(204, 0, 0));
        btnCancel.setFont(new java.awt.Font("Trajan Pro", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 114, 32));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel2.setText("Order  ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 113, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel7.setText("Customer  ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 159, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel8.setText("Delivery Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        loadDetails((String) this.jComboBox1.getSelectedItem());
        
        loadProducts((String) this.jComboBox1.getSelectedItem()); // ui eka thiyena table ekt data tika yawanna
         
        loadMRP();   
        //loadFinalCount();
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(MRP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MRP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MRP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MRP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new MRP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tD_Date;
    private javax.swing.JTextField tcus_id;
    // End of variables declaration//GEN-END:variables

    private void loadOrders() { //load  order-id  for commbo box
         DBSearch obj=new DBSearch();
         ResultSet rs=obj.searchOrders();
       try{
       
        while(rs.next())
              {
               this.jComboBox1.addItem(rs.getString("order_id"));
              }

       
       
       }catch(Exception k){
                   System.out.println("error"+k.toString());
                   }
    }

    private void loadDetails(String oid) {
        DBSearch obj=new DBSearch();
        ResultSet rs=obj.searchOrder(oid);
        
                try{
                    while(rs.next()){
                        this.tcus_id.setText(rs.getString("cus_id")); //db order table eka customer id eka colum names
                         this.tD_Date.setText(rs.getString("date")); //db order table eka deliver date colum names
                    }
                }catch(Exception k){
                   System.out.println("error"+k.toString());
                   }
    }

    private void loadProducts(String oid) {
        
     DBSearch obj=new DBSearch();
     ResultSet rs=obj.searchProducts(oid);
        
     DefaultTableModel dtm=(DefaultTableModel)
       jTable1.getModel();
     dtm.setRowCount(0);
     
     Vector v;
        
        try{
            while(rs.next()){
            v =new Vector();  //create new object
            v.add(rs.getString("product_id")); //order_product table 
            v.add("n/a");
            v.add(rs.getString("qty")); //order_product  table
            
            dtm.addRow(v);
            
        }
        }catch(Exception e){
            System.out.println(""+e.toString());  
            
        }
    }

    private void loadMRP() { //2nd table ekata
         DBSearch obj=new DBSearch();
          
        DefaultTableModel dtm=(DefaultTableModel)
        jTable1.getModel();
        
        DefaultTableModel dtm1=(DefaultTableModel)
        jTable2.getModel();
            dtm1.setRowCount(0);
        
        int x=dtm.getRowCount();//1st table eka row count karala x ta denawa
      
       int r=0;
       for(r=0;r<x;r++){
           
             
            
            String pid=(String) dtm.getValueAt(r,0); 
            String order_qty=(String) dtm.getValueAt(r,2);
            
            
                    
            System.out.println("product id :"+pid);
            
          
            ResultSet rs=obj.searchPart_of_Product(pid);
            
            String master_part=null;
            
            try{
                while(rs.next())
                {
                   Vector v=new Vector();
                    v.add(rs.getString("p_id"));
                    v.add(rs.getString("Desc"));
                    String qofp_qty=rs.getString("q_of_p_val");
                    int qp=Integer.parseInt(qofp_qty); //data base eka thiyena parts table eka qty gana  ganne methanata
                    int op=Integer.parseInt(order_qty); //ui eka

                    System.out.println("" + qp + " "+op);
                    int rq=qp*op;
                    v.add(rq);
                       v.add(pid);
                           dtm1.addRow(v); 
            
                    
                }
                }catch(Exception k)
                {
                      System.out.println(""+k.toString());  
                }
            
       }
    }
}

  
    


