/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_java;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abc
 */
public class My_CNX
{
   
    
     public static Connection getConnection(){
            Connection cnx=null;
    
            MysqlDataSource datasource =new MysqlDataSource();
            datasource.setServerName("localhost");
            datasource.setUser("root");
            datasource.setPassword("root");
            datasource.setDatabaseName("canteen");
            datasource.setPortNumber(3306);
            
        try {
            cnx= datasource.getConnection();
        } catch (SQLException ex) 
        {
            Logger.getLogger("Get Connection->" + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
     
            return cnx; 
     }
    
}
