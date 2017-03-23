

package com.dgr.attributes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jerome.LOMBARD
 */
public class ResSocConnexion {
    private String url = "jdbc:mysql://localhost/java_reseau_social";
    private String user = "root";
    private String pswd = "root";
    
    //Class.forName("com.mysql.jdbc.Driver");
    private static Connection connect;
      
    private ResSocConnexion(){
        try {
            connect = DriverManager.getConnection(url, user, pswd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
    public static Connection getInstance(){
        if(connect == null){
            new ResSocConnexion();
        }
        return connect;   
    }  
}
