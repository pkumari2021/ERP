
package model;
import model.DBconnection;


import java.sql.*;
public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    public ResultSet searchLogin(String usName) //admin login search
    {
        try{
            stmt=DBconnection.getStatementConnection();
            String name=usName;
            
            rs=stmt.executeQuery("SELECT* FROM login where uname='"+name+"'");
           }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
        
    }
    ///////////////////////
     public ResultSet searchUserLogin(String usName) //user login search
    {
        try{
            stmt=DBconnection.getStatementConnection();
            String name=usName;
            
            rs=stmt.executeQuery("SELECT* FROM user_login where uname='"+name+"'");
           }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
        
    }
    
     ///////////////////////
     
    public ResultSet serchCustomers(){ 
        try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from customer ");
            
        }catch(Exception e){
            e.printStackTrace();
        }
         return rs;
    }
    

     public ResultSet serchProducts(){
        try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from product ");
            
        }catch(Exception e){
            e.printStackTrace();
        }
         return rs;
    }
        public ResultSet serchCustomers(String id) { //placeorder table ekata
       try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from customer where cus_id='"+ id +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;  
    }
        
         public ResultSet serchProducts(String id) { //part tabel ekat product id select karana
        try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from product where product_id='"+ id +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;   
    }

    public ResultSet searchOrders() { //IM , BOM
          
    try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from order1");//DB table name
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;
      }
    
////////////////////////////////////////for Forcasting
    public ResultSet search3MonthsParts() {
        try{
            stmt=(Statement) DBconnection.getStatementConnection();
            rs=stmt.executeQuery("SELECT * FROM bom " + "WHERE Order_month> DATE_SUB(now(),INTERVAL 3 Month)");
            } catch(Exception e){
                System.out.println(""+e.toString());
            }
       return rs; 
    }

    public ResultSet searchparts() {
      try{
          stmt=(Statement) DBconnection.getStatementConnection();
          rs=stmt.executeQuery("SELECT * FROM parts");
      }catch(Exception e)
      {
          System.out.println(""+e.toString());
      }
       return rs;
    }
   

    public ResultSet serchproduct(String pid) { // patrs eka product id load karanna 
        try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from product where product_id='"+ pid +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;  
    }
   
    
/////////////////////////////////////////////////////////////////for MRP
    
   

    public ResultSet searchOrder(String id) {
         try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from order1 where order_id='"+ id +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    }

    public ResultSet searchProducts(String id) {
        try{
            
            
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from orde_product where order_id='"+ id +"'");
        }catch(Exception e){
            System.out.println(e.toString());
        }
      return rs; 
    }

    public ResultSet searchPart_of_Product(String pid) {
        
     try{
            stmt=DBconnection.getStatementConnection();
            rs=stmt.executeQuery("select * from parts where product_id='"+ pid +"'");
        }catch(Exception e){
            e.printStackTrace();
        }
      return rs;  }

  
   ////////////////////////////////////////////////////////////////////////////////////////////IM
    public ResultSet searchOrder_2(String order_id) {

 try
    {
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT product_id,\n" +
     "sum(qty)as qty from orde_product where\n" +
     " order_id='"+order_id+"' GROUP BY product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs;

    }

    public ResultSet searchOrder_3(String Order_id) {
          try
    {
        System.out.println(" ");
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT p.product_id, o.product_id, p.product_name,sum(p.qty)as qty from orde_product o,"
             + "product p where o.order_id='"+Order_id+"'  and o.product_id=p.product_id GROUP BY o.product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs;
        
        
    }

    public ResultSet searchparts(String Order_id) {
         try
    {
        System.out.println(" ");
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT p.p_id, o.product_id,o.qty, p.Desc,sum(p.qty)as qty1 from orde_product o,"
             + "parts p where o.order_id='"+Order_id+"'  and o.product_id=p.product_id GROUP BY p.p_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs;
    }
    
    
    ///////////////////////////////////////////////BOM

    public ResultSet searchOrders_2(String oder_id) {
        try
    {
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT product_id,\n" +
        "sum(qty)as qty from orde_product where\n" +
        " order_id='"+oder_id+"' GROUP BY product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs; 
    }

    public ResultSet searchOrders_3(String Order_id) {
        try
    {
        System.out.println(" ");
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT p.product_id, o.product_id, p.product_name ,sum(p.qty)as qty from orde_product o,"
             + "product p where o.order_id='"+Order_id+"'  and o.product_id=p.product_id GROUP BY o.product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs; 
    }

    public ResultSet searchparts_2(String order_id) {
        try
    {
        System.out.println(" ");
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT p.p_id, o.product_id,o.qty, p.Desc,sum(p.qty)as qty1 from orde_product o,"
             + "parts p where o.order_id='"+order_id+"'  and o.product_id=p.product_id GROUP BY o.product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs; 
    }

    public ResultSet searchparts_3(String order_id) {
      try
    {
        System.out.println(" ");
     stmt=DBconnection.getStatementConnection();
     rs = stmt.executeQuery("SELECT p.p_id, o.product_id,o.qty, p.Desc,sum(p.qty)as qty1 from orde_product o,"
             + "parts p where o.order_id='"+order_id+"'  and o.product_id=p.product_id GROUP BY o.product_id");
    
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return rs; 
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    


    
