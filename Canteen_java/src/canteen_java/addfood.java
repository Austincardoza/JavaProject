/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen_java;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abc
 */
public class addfood extends javax.swing.JFrame {

    /**
     * Creates new form addfood
     */
    ADMINF adm=new ADMINF();
    
    public addfood() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        adm.fillAddTable(jTable1);
        
         Border glob_panel_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jPanel1.setBorder(glob_panel_border);
        jPanel2.setBorder(glob_panel_border);
        jPanel3.setBorder(glob_panel_border);
        
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel2_add_min.setBorder(label_border);
        jLabel1_add_close.setBorder(label_border);
        
         Border field_border = BorderFactory.createMatteBorder(1,2,1,1,Color.white);
        jTextField1_FOOD_NAME.setBorder(field_border);
        jTextField2_FOOD_TYPE.setBorder(field_border);
        jTextField3_PRICE.setBorder(field_border);
        jTextField1_ID.setBorder(field_border);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1_add_close = new javax.swing.JLabel();
        jLabel2_add_min = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_FOOD_NAME = new javax.swing.JTextField();
        jTextField2_FOOD_TYPE = new javax.swing.JTextField();
        jTextField3_PRICE = new javax.swing.JTextField();
        jButton5_add = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 150, 136));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD FOOD");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE FOOD");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("MODIFY ");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("RECORDS");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });

        jLabel1_add_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1_add_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_add_close.setText("x");
        jLabel1_add_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_add_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_add_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1_add_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1_add_closeMouseExited(evt);
            }
        });

        jLabel2_add_min.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2_add_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_add_min.setText("-");
        jLabel2_add_min.setToolTipText("");
        jLabel2_add_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2_add_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_add_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2_add_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2_add_minMouseExited(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("ORDERS");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(jLabel2_add_min, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1_add_close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2_add_min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1_add_close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1280, 50);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FOOD NAME", "FOOD TYPE", "PRICE"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(0, 50, 1280, 470);

    jPanel3.setBackground(new java.awt.Color(204, 204, 204));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("FOOD NAME");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("FOOD TYPE");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("PRICE");

    jTextField1_FOOD_NAME.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

    jTextField2_FOOD_TYPE.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jTextField2_FOOD_TYPE.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField2_FOOD_TYPEActionPerformed(evt);
        }
    });

    jTextField3_PRICE.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jTextField3_PRICE.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField3_PRICEActionPerformed(evt);
        }
    });

    jButton5_add.setBackground(new java.awt.Color(0, 84, 140));
    jButton5_add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton5_add.setForeground(new java.awt.Color(255, 255, 255));
    jButton5_add.setText("ADD");
    jButton5_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton5_add.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton5_addMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton5_addMouseExited(evt);
        }
    });
    jButton5_add.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5_addActionPerformed(evt);
        }
    });

    jButton6.setBackground(new java.awt.Color(0, 84, 140));
    jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton6.setForeground(new java.awt.Color(255, 255, 255));
    jButton6.setText("CLEAR FIELDS");
    jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton6MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton6MouseExited(evt);
        }
    });
    jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 0, 204));
    jLabel4.setText("<<back");
    jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel4MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jLabel4MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jLabel4MouseExited(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("ID");

    jTextField1_ID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField3_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField2_FOOD_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1_FOOD_NAME)
                        .addComponent(jTextField1_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGap(205, 205, 205)
                    .addComponent(jButton5_add, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1_FOOD_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2_FOOD_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField3_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24))
    );

    jPanel1.add(jPanel3);
    jPanel3.setBounds(0, 520, 1280, 280);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2_add_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_add_minMouseClicked
        // TODO add your handling code here:
          this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2_add_minMouseClicked

    private void jLabel2_add_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_add_minMouseEntered
        // TODO add your handling code here:
         Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        jLabel2_add_min.setBorder(label_border);
        jLabel2_add_min.setForeground(Color.white);
    }//GEN-LAST:event_jLabel2_add_minMouseEntered

    private void jLabel2_add_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_add_minMouseExited
        // TODO add your handling code here:
         Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel2_add_min.setBorder(label_border);
        jLabel2_add_min.setForeground(Color.black);
    }//GEN-LAST:event_jLabel2_add_minMouseExited

    private void jLabel1_add_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_add_closeMouseClicked
        // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_jLabel1_add_closeMouseClicked

    private void jLabel1_add_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_add_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
        jLabel1_add_close.setBorder(label_border);
        jLabel1_add_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1_add_closeMouseEntered

    private void jLabel1_add_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_add_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.black);
        jLabel1_add_close.setBorder(label_border);
        jLabel1_add_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1_add_closeMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_addMouseEntered
        // TODO add your handling code here:
        jButton5_add.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton5_addMouseEntered

    private void jButton5_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_addMouseExited
        // TODO add your handling code here:
        jButton5_add.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton5_addMouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
         jButton6.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
         jButton6.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton5_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_addActionPerformed
        // TODO add your handling code here:
        String foodName=jTextField1_FOOD_NAME.getText();
        String foodType=jTextField2_FOOD_TYPE.getText();
        String price=jTextField3_PRICE.getText();
        
        if(foodName.trim().equals("")||foodType.trim().equals("")||price.trim().equals("")){
             JOptionPane.showMessageDialog(rootPane,"REQUIRED FIELDS CANNOT BE EMPTY","EMPTY FIELDS",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
        
        if(adm.addFood(foodName,foodType,price))
        {
           JOptionPane.showMessageDialog(rootPane,"FOOD ITEM ADDED SUCCESSFULLY","ADD FOOD",JOptionPane.INFORMATION_MESSAGE);
        }else
        {
           JOptionPane.showMessageDialog(rootPane,"NEW FOOD ITEM NOT ADDED ","ADD FOOD",JOptionPane.ERROR_MESSAGE);

        }
        } 
     jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","FOOD NAME","FOOD TYPE","PRICE"}));
        adm.fillAddTable(jTable1);
        
    }//GEN-LAST:event_jButton5_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex=jTable1.getSelectedRow();
       jTextField1_ID.setText(model.getValueAt(rIndex, 0).toString());
        jTextField1_FOOD_NAME.setText(model.getValueAt(rIndex, 1).toString());
        jTextField2_FOOD_TYPE.setText(model.getValueAt(rIndex, 2).toString());
        jTextField3_PRICE.setText(model.getValueAt(rIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
         jLabel4.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        admin ad=new admin();
        this.setVisible(false);
        ad.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        deletefood del=new deletefood();
        this.setVisible(false);
        del.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField3_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_PRICEActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField1_FOOD_NAME.setText("");
        jTextField2_FOOD_TYPE.setText("");
        jTextField3_PRICE.setText("");
         jTextField1_ID.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField2_FOOD_TYPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_FOOD_TYPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_FOOD_TYPEActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        modify mod=new modify();
        this.setVisible(false);
        mod.setVisible(true);

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
          orders ord=new orders();
        this.setVisible(false);
        ord.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        jButton7.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        record rec=new record();
        this.setVisible(false);
        rec.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addfood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5_add;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_add_close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_add_min;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_FOOD_NAME;
    private javax.swing.JTextField jTextField1_ID;
    private javax.swing.JTextField jTextField2_FOOD_TYPE;
    private javax.swing.JTextField jTextField3_PRICE;
    // End of variables declaration//GEN-END:variables
}
