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
    
    public boolean ORDERFood(String foodName,String price,String quantity,String rollno,String Tprice){
        PreparedStatement st;
      
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
}
