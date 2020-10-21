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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abc
 */
public class ADMINF {
    My_CNX mycon=new My_CNX();
    
    public boolean addFood(String foodName,String foodType,String price){
        PreparedStatement st;
      
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
    
    public void fillAddTable(JTable table)
    {
        PreparedStatement st;
        ResultSet rs;
        String Query="SELECT * FROM `menu`";
        
        try {
            st=My_CNX.getConnection().prepareStatement(Query);
            
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next())
           {
               row =new Object[5];
               row[0]=rs.getInt(1);
               row[1]=rs.getString(2);
               row[2]=rs.getString(3);
               row[3]=rs.getString(4);
               
               tableModel.addRow(row);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean modify(int id,String foodName,String foodType,String price){
        PreparedStatement st;
      
        String modQuery="UPDATE `menu` SET `foodname`=?,`foodtype`=?,`price`=? WHERE `id`=?";
        try {
            st=My_CNX.getConnection().prepareStatement(modQuery);
            st.setString(1,foodName );
            st.setString(2,foodType );
            st.setString(3,price );
            st.setInt(4,id );
            
          
                return (st.executeUpdate()>0);
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    
    public boolean delete(int id)
    {
         PreparedStatement st;
      
        String delQuery="DELETE FROM `menu` WHERE `id`=?";
        try {
            st=My_CNX.getConnection().prepareStatement(delQuery);
           
            st.setInt(1,id);
            
          
                return (st.executeUpdate()>0);
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    
    
}
