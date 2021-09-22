
package model;

import java.sql.Statement;
import javax.swing.JOptionPane;
import view.Home;
import view.Menu;

public class DBAdd {
    Statement stmt;
    
    
    //for create new account
     public void addUsers(String name,String user_type, String email,String password,String comf_password ){
       try{
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO Users VALUE('"+name+" ','"+user_type+"','"+email+"','"+password+"','"+comf_password+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
              //new Menu().setVisible(true);
       } 
       catch(Exception e){
           e.printStackTrace();
       }
        
    }
    ///////////////////////////////////
    public void addLogin(String uname,String password){
        try{
            stmt=DBconnection.getStatementConnection();
            stmt.executeUpdate
              ("INSERT INTO login VALUE('"+uname+"','"+password+"')");
             //JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
               //new Menu().setVisible(true);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
      ///////////////////////////////////
    public void addUser_login(String uname,String password){
        try{
            stmt=DBconnection.getStatementConnection();
            stmt.executeUpdate
              ("INSERT INTO User_login VALUE('"+uname+"','"+password+"')");
             //JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
           //  new Home().setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

  

       //add product to DB
       public void addproduct(String product_id,String product_name ,String Unit_price, String qty) {
          try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO product VALUE('"+product_id+"','"+ product_name+"','"+ Unit_price+"','"+qty+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }
          
  //add  customers to DB
    public void addcustomer(String cus_id, String name, String address, String tel) {
          try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO customer VALUE('"+cus_id+"','"+name+"','"+address+"','"+tel+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }
    
    //add Order to order tabel
    public void addorder(String order_id, String place, String date, String cus_id) {
          try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO order1 VALUE('"+order_id+"','"+place+"','"+date+"','"+cus_id+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }
     
    
     //order product tabel
      public void addorde_product(String order_id, String product_id, String qty) {
          try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO orde_product VALUE('"+order_id+"','"+product_id+"','"+qty+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
        
    }
//add parts to DB
    public void addParts(String p_id, String Desc, String price, String product_id, String qty, String q_of_p_val) {
        try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO parts VALUE('"+p_id+"','"+Desc+"','"+price+"','"+product_id+"','"+qty+"','"+q_of_p_val+"')");
             JOptionPane.showMessageDialog(null,"You are Succesful Added Data..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }

    public void addcontact(String name, String email, String subject, String message) {
         try{
               
           stmt=DBconnection.getStatementConnection();
           stmt.executeUpdate
              ("INSERT INTO contact VALUE('"+name+"','"+email+"','"+subject+"','"+message+"')");
             JOptionPane.showMessageDialog(null,"Thank you for contact us..!");
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }

   
    
    
}
        


 

   
    
    

