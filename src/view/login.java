/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LogingController;

/**
 *
 * @author Hansi
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bLoging = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bLoging2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bLoging1 = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Admin Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 67, 161, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 142, 70, -1));

        txtname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 179, 217, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 216, 70, -1));

        bLoging.setBackground(new java.awt.Color(5, 105, 72));
        bLoging.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bLoging.setForeground(new java.awt.Color(0, 204, 204));
        bLoging.setText("Login");
        bLoging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogingActionPerformed(evt);
            }
        });
        getContentPane().add(bLoging, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 325, 280, 34));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Don't have an account?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 208, -1, -1));

        bLoging2.setBackground(new java.awt.Color(0, 153, 102));
        bLoging2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bLoging2.setForeground(new java.awt.Color(255, 0, 51));
        bLoging2.setText("Get Start");
        bLoging2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoging2ActionPerformed(evt);
            }
        });
        jPanel1.add(bLoging2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 269, 133, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Close Window_50px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 229, 480));

        bLoging1.setBackground(new java.awt.Color(5, 127, 86));
        bLoging1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bLoging1.setForeground(new java.awt.Color(0, 204, 204));
        bLoging1.setText("Log out");
        bLoging1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLoging1MouseClicked(evt);
            }
        });
        bLoging1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoging1ActionPerformed(evt);
            }
        });
        getContentPane().add(bLoging1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 388, 280, 34));
        getContentPane().add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 246, 213, 29));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogingActionPerformed

        LogingController a =new LogingController();

        String un=this.txtname.getText();
         String p=this.tPassword.getText();
        a.login(un,p);
        dispose();

    }//GEN-LAST:event_bLogingActionPerformed

    private void bLoging1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoging1ActionPerformed
        dispose();
    }//GEN-LAST:event_bLoging1ActionPerformed

    private void bLoging2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoging2ActionPerformed
        new formlogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_bLoging2ActionPerformed

    private void bLoging1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLoging1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bLoging1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new index().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLoging;
    private javax.swing.JButton bLoging1;
    private javax.swing.JButton bLoging2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}