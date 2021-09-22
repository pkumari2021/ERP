package controller;

import model.DBSearch;
import javax.swing.*;
import java.sql.*;
import model.DBconnection;
import view.Menu;
import view.Home;


public class LogingController {
    
    
 
    public static void login(String usName,String pass)
    {
        try{
            String username=null;
            String password=null;
            
            ResultSet rs= new DBSearch().searchLogin(usName);
            
             //Process the Query
           while (rs.next())
           {
           username = rs.getString("uname"); //assign database login name to the variable
           password = rs.getString("password"); //assign database password to the variable
           }
            
    if (username != null && password != null)
    {
      if (password.equals(pass))
      {
        // JOptionPane.showMessageDialog(null, "Login Succesfuly..,Welcome to Admin Page..!");
         new Menu().setVisible(true);
         
      } 
      else 
      {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
   
      }
      
     } 
    else {
         JOptionPane.showMessageDialog(null, "Invalid Please check", "Error", JOptionPane.ERROR_MESSAGE);
         }
    
          DBconnection.closeCon();
          
         } catch (SQLException ex)
         {
          ex.toString();
        }
    }

   /////////////////////////////
    public static void User_login(String usName,String pass)
    {
        try{
            String username=null;
            String password=null;
            
            ResultSet rs= new DBSearch().searchUserLogin(usName);
            
             //Process the Query
           while (rs.next())
           {
           username = rs.getString("uname"); //assign database login name to the variable
           password = rs.getString("password"); //assign database password to the variable
           }
            
    if (username != null && password != null)
    {
      if (password.equals(pass))
      {
         //JOptionPane.showMessageDialog(null, "Login Succesfuly.., Welcome to our Shop ..!");
         new Home().setVisible(true);
         
      } 
      else 
      {
        JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
   
      }
      
     } 
    else {
         JOptionPane.showMessageDialog(null, "Invalid Please check", "Error", JOptionPane.ERROR_MESSAGE);
         }
    
          DBconnection.closeCon();
          
         } catch (SQLException ex)
         {
          ex.toString();
        }
    }

   

}
