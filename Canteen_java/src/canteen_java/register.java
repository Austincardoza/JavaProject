/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_java;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author abc
 */
public class register extends javax.swing.JFrame {

   

   

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel_minimize_reg.setBorder(label_border);
        jLabel_close_reg.setBorder(label_border);
        
         Border glob_panel_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel1_reg.setBorder(glob_panel_border);
        
        
         Border field_border = BorderFactory.createMatteBorder(1,2,1,1,Color.white);
        jTextField1_fullname.setBorder(field_border);
        jTextField2_rollno.setBorder(field_border);
        jTextField3_branch.setBorder(field_border);
        jTextField4_phoneno.setBorder(field_border);
        jPasswordField1_password.setBorder(field_border); 
        jPasswordField2_password_confirm.setBorder(field_border);
        jTextField1_email.setBorder(field_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_close_reg = new javax.swing.JLabel();
        jLabel_minimize_reg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1_REGISTER = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_fullname = new javax.swing.JTextField();
        jTextField2_rollno = new javax.swing.JTextField();
        jTextField3_branch = new javax.swing.JTextField();
        jTextField4_phoneno = new javax.swing.JTextField();
        jPasswordField1_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField2_password_confirm = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_email = new javax.swing.JTextField();
        jLabel1_reg = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 810));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jLabel_close_reg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_close_reg.setText("   x");
        jLabel_close_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_close_regMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_close_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_close_regMouseExited(evt);
            }
        });
        jPanel3.add(jLabel_close_reg);
        jLabel_close_reg.setBounds(840, 10, 42, 42);

        jLabel_minimize_reg.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel_minimize_reg.setText(" -");
        jLabel_minimize_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimize_regMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimize_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimize_regMouseExited(evt);
            }
        });
        jPanel3.add(jLabel_minimize_reg);
        jLabel_minimize_reg.setBounds(790, 10, 42, 42);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(440, 90, 200, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(120, 214, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Roll No");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(120, 270, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Branch");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(120, 326, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(120, 382, 90, 30);

        jButton1_REGISTER.setBackground(new java.awt.Color(0, 84, 140));
        jButton1_REGISTER.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1_REGISTER.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_REGISTER.setText("REGISTER");
        jButton1_REGISTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_REGISTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_REGISTERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_REGISTERMouseExited(evt);
            }
        });
        jButton1_REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_REGISTERActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1_REGISTER);
        jButton1_REGISTER.setBounds(270, 680, 340, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(120, 438, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm Password");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(120, 494, 180, 40);

        jTextField1_fullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField1_fullname);
        jTextField1_fullname.setBounds(370, 214, 350, 40);

        jTextField2_rollno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField2_rollno);
        jTextField2_rollno.setBounds(370, 270, 350, 40);

        jTextField3_branch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField3_branch);
        jTextField3_branch.setBounds(370, 326, 350, 40);

        jTextField4_phoneno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4_phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4_phonenoKeyTyped(evt);
            }
        });
        jPanel3.add(jTextField4_phoneno);
        jTextField4_phoneno.setBounds(370, 382, 350, 40);

        jPasswordField1_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jPasswordField1_password);
        jPasswordField1_password.setBounds(370, 438, 350, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("<<back");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel3.add(jLabel8);
        jLabel8.setBounds(790, 740, 50, 20);

        jPasswordField2_password_confirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jPasswordField2_password_confirm);
        jPasswordField2_password_confirm.setBounds(370, 494, 350, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_accounts_main.png"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(280, 70, 100, 100);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-Mail");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(120, 560, 100, 30);

        jTextField1_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jTextField1_email);
        jTextField1_email.setBounds(370, 560, 350, 40);

        jLabel1_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.png"))); // NOI18N
        jLabel1_reg.setPreferredSize(new java.awt.Dimension(896, 700));
        jPanel3.add(jLabel1_reg);
        jLabel1_reg.setBounds(0, 0, 890, 790);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 890, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minimize_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_regMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimize_regMouseClicked

    private void jLabel_minimize_regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_regMouseEntered
        // TODO add your handling code here:
         Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        jLabel_minimize_reg.setBorder(label_border);
        jLabel_minimize_reg.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimize_regMouseEntered

    private void jLabel_minimize_regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_regMouseExited
        // TODO add your handling code here:
         Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel_minimize_reg.setBorder(label_border);
        jLabel_minimize_reg.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minimize_regMouseExited

    private void jLabel_close_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_regMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_close_regMouseClicked

    private void jLabel_close_regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_regMouseEntered
        // TODO add your handling code here:
         Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        jLabel_close_reg.setBorder(label_border);
        jLabel_close_reg.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_close_regMouseEntered

    private void jLabel_close_regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_regMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel_close_reg.setBorder(label_border);
        jLabel_close_reg.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_close_regMouseExited

    private void jButton1_REGISTERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_REGISTERMouseEntered
        // TODO add your handling code here:
        jButton1_REGISTER.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton1_REGISTERMouseEntered

    private void jButton1_REGISTERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_REGISTERMouseExited
        // TODO add your handling code here:
         jButton1_REGISTER.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton1_REGISTERMouseExited

    private void jTextField4_phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_phonenoKeyTyped
        // TODO add your handling code here:
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
            
        }
    }//GEN-LAST:event_jTextField4_phonenoKeyTyped

    private void jButton1_REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_REGISTERActionPerformed
        // TODO add your handling code here:
        String fname=jTextField1_fullname.getText();
        String rno=jTextField2_rollno.getText();
        String branch=jTextField3_branch.getText();
        String phone=jTextField4_phoneno.getText();
        String pass1=String.valueOf(jPasswordField1_password.getPassword());
        String pass2=String.valueOf(jPasswordField2_password_confirm.getPassword());
        String email=jTextField1_email.getText();
        if(verifyfields()){
            
           
            
            
               PreparedStatement st;
               ResultSet rs;  
               String registerUserQuery="INSERT INTO `login`( `full_name`,  `password`, `usertype`, `phone`, `roll_no`,`branch`,`email`) VALUES (?,?,?,?,?,?,?)";
               
               try{
               st=My_CNX.getConnection().prepareStatement(registerUserQuery);
               st.setString(1,fname);
               st.setString(2,pass1);
               st.setString(3,"user");
               st.setString(4,phone);
               st.setString(5,rno);
               st.setString(6,branch);
                st.setString(7,email);
               
               if(st.executeUpdate()!=0){
                   JOptionPane.showMessageDialog(null,"YOUR ACCOUNT HAS BEEN CREATED");
               }else{
                   JOptionPane.showMessageDialog(null,"ERROR: CHECK YOUR DETAILS");
               }
               
               } catch(SQLException ex) {
                 java.util.logging.Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            
        }
    }//GEN-LAST:event_jButton1_REGISTERActionPerformed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        login log=new login();
        this.setVisible(false);
        log.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    public boolean verifyfields()
    {
        String fname=jTextField1_fullname.getText();
        String rno=jTextField2_rollno.getText();
        String branch=jTextField3_branch.getText();
        String phone=jTextField4_phoneno.getText();
        String pass1=String.valueOf(jPasswordField1_password.getPassword());
        String pass2=String.valueOf(jPasswordField2_password_confirm.getPassword());
        String email=jTextField1_email.getText();
        
        
        if(fname.trim().equals("")||rno.trim().equals("")||branch.trim().equals("")||phone.trim().equals("")||pass1.trim().equals("")||pass2.trim().equals("")||email.trim().equals("")){
            JOptionPane.showMessageDialog(null,"FIELDS CANNOT BE EMPTY","EMPTY FIELDS",2);
            return false;
        }
        
        else if(!pass1.equals(pass2)){
             JOptionPane.showMessageDialog(null,"PASSWORD DOES NOT MATCH","CONFIRM PASSWORD",2);
            return false;
        }
        else{
            return true;
        }
    }
   
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist=false;
        
        String query="SELECT * FROM `login` WHERE `username`=?";
        
        
        try{
        st=My_CNX.getConnection().prepareStatement(query);
        st.setString(1,username);
        rs=st.executeQuery();
        
        if(rs.next()){
            username_exist=true;
            JOptionPane.showMessageDialog(null,"USERNAME EXIST","USERNAME FAILED",2);
        }
            
        }catch(SQLException ex) {
                 java.util.logging.Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
        return username_exist;
    }
  
    
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_REGISTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel1_reg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close_reg;
    private javax.swing.JLabel jLabel_minimize_reg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1_password;
    private javax.swing.JPasswordField jPasswordField2_password_confirm;
    private javax.swing.JTextField jTextField1_email;
    private javax.swing.JTextField jTextField1_fullname;
    private javax.swing.JTextField jTextField2_rollno;
    private javax.swing.JTextField jTextField3_branch;
    private javax.swing.JTextField jTextField4_phoneno;
    // End of variables declaration//GEN-END:variables
}
