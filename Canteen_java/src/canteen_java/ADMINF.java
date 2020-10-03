/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abc
 */
public class ADMINF {
    My_CNX mycon=new My_CNX();
    
    public boolean addFood(String foodName,String foodType,String price){
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `menu`( `foodname`, `foodtype`, `price`) VALUES (?,?,?)";
        try {
            st=My_CNX.getConnection().prepareStatement(addQuery);
            st.setString(1,foodName );
            st.setString(2,foodType );
            st.setString(3,price );
            
            if(st.executeUpdate()>0){
                return true;
                
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    
    }
    
}
