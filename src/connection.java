/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anirban
 */
import java.sql.*;

public class connection {
    
    public Connection conn;
    Statement stmt;
    String dbURL=("jdbc:mysql://localhost:3306/messproject?zeroDateTimeBehavior=convertToNull");
    ResultSet res;
    public connection() {
        create();
    }
            

    public void create(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(dbURL,"root","anineo");
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
        
}

