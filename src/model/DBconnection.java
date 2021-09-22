
package model;

import java.sql.DriverManager;


import java.sql.*;

public class DBconnection {
    static Connection conn;
    static Statement stat=null;
    
    public static Statement getStatementConnection(){
        try{
            //Establish the connection
            String url="jdbc:mysql://localhost:3306/end_exam";
            conn =DriverManager.getConnection(url, "root","");
            // create the class
            stat=conn.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    //close the connection
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
}
