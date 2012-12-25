/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anirban
 */

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;

           
public class connection {
    
    public Connection conn;
    Statement stmt;
    String dbURL=("jdbc:mysql://192.168.1.106:3306/messbilling?zeroDateTimeBehavior=convertToNull");
    ResultSet res;
    public connection() {
        create();
    }
            

    private void create(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(dbURL,"root","anineo");
        }
        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            System.out.print(e);
        }
    }
    
    
        
}

