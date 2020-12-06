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
public class USERF {
     My_CNX mycon=new My_CNX();
     login m=new login();
 public String usr;
    
    public boolean ORDERFood(String foodName,String price,String quantity,String Tprice){
        PreparedStatement st;
         String rollno=getTab();
      
        String addQuery="INSERT INTO `orders`(`foodname`, `price`, `quantity`, `rollno`,`total_price`) VALUES (?,?,?,?,?)";
        try {
            st=My_CNX.getConnection().prepareStatement(addQuery);
            st.setString(1,foodName );
            st.setString(2,price );
            st.setString(3,quantity );
            st.setString(4,rollno );
            st.setString(5,Tprice );
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
    
     public void fillorderTable(JTable table)
    {
        PreparedStatement st;
        ResultSet rs;
        String Query="SELECT  `foodname`, `quantity`, `total_price`,`rollno` FROM `orders` ";
        
        try {
            st=My_CNX.getConnection().prepareStatement(Query);
            
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next())
           {
               row =new Object[5];
               row[0]=rs.getString(1);
               row[1]=rs.getString(2);
               row[2]=rs.getString(3);
               row[3]=rs.getString(4);
               
               tableModel.addRow(row);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
      public boolean Record(String rollno,String foodName,String price,String quantity){
        PreparedStatement st;
      
        String addQuery="INSERT INTO `records`(`rollno`, `food_name`, `quantity`, `price`) VALUES (?,?,?,?)";
        try {
            st=My_CNX.getConnection().prepareStatement(addQuery);
            st.setString(1,rollno );
            st.setString(2,foodName );
            st.setString(4,price );
            st.setString(3,quantity );
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
      
       public boolean delete(String rollno,String foodName)
    {
         PreparedStatement st;
      
        String delQuery="DELETE FROM `orders` WHERE `rollno`=? and `foodname`=?";
        try {
            st=My_CNX.getConnection().prepareStatement(delQuery);
           
            st.setString(1,rollno);
             st.setString(2,foodName);
            
          
                return (st.executeUpdate()>0);
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
       
        public void fillrecordTable(JTable table)
    {
        PreparedStatement st;
        ResultSet rs;
        String Query="SELECT `rollno`, `food_name`, `quantity`, `price`, `id` FROM `records` ";
        
        try {
            st=My_CNX.getConnection().prepareStatement(Query);
            
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next())
           {
               row =new Object[5];
               row[0]=rs.getString(5);
               row[1]=rs.getString(1);
               row[2]=rs.getString(2);
               row[3]=rs.getString(3);
               row[4]=rs.getString(4); 
               tableModel.addRow(row);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public String getTab(){
          PreparedStatement st;
        ResultSet rs;
       
        String Query="SELECT `username` FROM `exc` ";
        
    
              try {
                  st=My_CNX.getConnection().prepareStatement(Query);
                   rs = st.executeQuery();
                   while(rs.next())
                   {
                         usr=rs.getString(1);
                   }
              } catch (SQLException ex) {
                  Logger.getLogger(USERF.class.getName()).log(Level.SEVERE, null, ex);
              }
         
            
          
         return usr;
     }
       public void fillrecord1Table(JTable table){
          String usrf=getTab();
            PreparedStatement st;
        ResultSet rs;
        String Query="SELECT `food_name`, `quantity`, `price` FROM `records` WHERE `rollno`=? ";
        
        try {
            st=My_CNX.getConnection().prepareStatement(Query);
            st.setString(1,usrf );
           rs = st.executeQuery();
           DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next())
           {
               row =new Object[3];
               row[0]=rs.getString(1);
               row[1]=rs.getString(2);
               row[2]=rs.getString(3);
             
               tableModel.addRow(row);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
       
         public boolean delete1()
    {
         PreparedStatement st;
         String usrf=getTab();
      
        String delQuery="DELETE FROM `exc` WHERE `username`=? ";
        try {
            st=My_CNX.getConnection().prepareStatement(delQuery);
           
            st.setString(1,usrf);
            
          
                return (st.executeUpdate()>0);
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADMINF.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    }
    
    
        
    
}
