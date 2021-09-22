
package model;

import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DBconnection;


public class dbupdate {
    Statement stmt;

    public void updateproduct(String id, String aqty, int bal) {
    
        try{
            Statement stmt = DBconnection.getStatementConnection();
            stmt.executeUpdate ("UPDATE product set qty='"+bal+"' where Product_id='"+id+"'");
            
            
           
            
            JOptionPane.showMessageDialog(null,"Part has Been Added");
            
            
        }catch (Exception e){
            //JOptionPane.showMessageDialog(e.toString());
        e.printStackTrace();
    }
    }

    public void updateParts(String id, int bal) {
        try{
            Statement stmt = DBconnection.getStatementConnection();
            stmt.executeUpdate("UPDATE parts set qty='"+bal+"' where part_id='"+id+"'");
            
            
           
            
            JOptionPane.showMessageDialog(null,"Part has Been Added");
            
            
        }catch (Exception e){
            //JOptionPane.showMessageDialog(e.toString());
        e.printStackTrace();
    }
    }
    
}
