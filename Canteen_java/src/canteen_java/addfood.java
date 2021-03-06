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
        
        jTextField3_PRICE.setBorder(field_border);
        //jTextField1_ID.setBorder(field_border);
       
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
        jButton1_add = new javax.swing.JButton();
        jButton2_delete = new javax.swing.JButton();
        jButton3_modify = new javax.swing.JButton();
        jButton4_records = new javax.swing.JButton();
        jLabel1_add_close = new javax.swing.JLabel();
        jLabel2_add_min = new javax.swing.JLabel();
        jButton7_orders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_FOOD_NAME = new javax.swing.JTextField();
        jTextField3_PRICE = new javax.swing.JTextField();
        jButton5_add = new javax.swing.JButton();
        jButton6_clear = new javax.swing.JButton();
        jLabel4_back = new javax.swing.JLabel();
        jComboBox1_foodtype = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 150, 136));

        jButton1_add.setBackground(new java.awt.Color(51, 51, 51));
        jButton1_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_add.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_add.setText("ADD FOOD");
        jButton1_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_addMouseExited(evt);
            }
        });

        jButton2_delete.setBackground(new java.awt.Color(51, 51, 51));
        jButton2_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_delete.setText("DELETE FOOD");
        jButton2_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2_deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2_deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2_deleteMouseExited(evt);
            }
        });

        jButton3_modify.setBackground(new java.awt.Color(51, 51, 51));
        jButton3_modify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3_modify.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_modify.setText("MODIFY ");
        jButton3_modify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3_modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3_modifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3_modifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3_modifyMouseExited(evt);
            }
        });

        jButton4_records.setBackground(new java.awt.Color(51, 51, 51));
        jButton4_records.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4_records.setForeground(new java.awt.Color(255, 255, 255));
        jButton4_records.setText("RECORDS");
        jButton4_records.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4_records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4_recordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4_recordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4_recordsMouseExited(evt);
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

        jButton7_orders.setBackground(new java.awt.Color(51, 51, 51));
        jButton7_orders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7_orders.setForeground(new java.awt.Color(255, 255, 255));
        jButton7_orders.setText("ORDERS");
        jButton7_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7_ordersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7_ordersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7_ordersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4_records, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton3_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton4_records, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton7_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    jTextField1_FOOD_NAME.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1_FOOD_NAMEActionPerformed(evt);
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

    jButton6_clear.setBackground(new java.awt.Color(0, 84, 140));
    jButton6_clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton6_clear.setForeground(new java.awt.Color(255, 255, 255));
    jButton6_clear.setText("CLEAR FIELDS");
    jButton6_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton6_clear.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jButton6_clearMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jButton6_clearMouseExited(evt);
        }
    });
    jButton6_clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6_clearActionPerformed(evt);
        }
    });

    jLabel4_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4_back.setForeground(new java.awt.Color(0, 0, 204));
    jLabel4_back.setText("<<back");
    jLabel4_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel4_back.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel4_backMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            jLabel4_backMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jLabel4_backMouseExited(evt);
        }
    });

    jComboBox1_foodtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jComboBox1_foodtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veg", "Non-Veg" }));
    jComboBox1_foodtype.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jComboBox1_foodtypeMouseClicked(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jComboBox1_foodtypeMouseExited(evt);
        }
    });

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
                    .addComponent(jLabel4_back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jComboBox1_foodtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField1_FOOD_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(205, 205, 205)
                    .addComponent(jButton5_add, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addComponent(jButton6_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton5_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
            .addComponent(jLabel4_back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1_FOOD_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox1_foodtype, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField3_PRICE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_addMouseEntered
        // TODO add your handling code here:
         jButton1_add.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton1_addMouseEntered

    private void jButton1_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_addMouseExited
        // TODO add your handling code here:
         jButton1_add.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton1_addMouseExited

    private void jButton2_deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_deleteMouseEntered
        // TODO add your handling code here:
        jButton2_delete.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton2_deleteMouseEntered

    private void jButton2_deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_deleteMouseExited
        // TODO add your handling code here:
        jButton2_delete.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton2_deleteMouseExited

    private void jButton3_modifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_modifyMouseEntered
        // TODO add your handling code here:
        jButton3_modify.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton3_modifyMouseEntered

    private void jButton3_modifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_modifyMouseExited
        // TODO add your handling code here:
        jButton3_modify.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton3_modifyMouseExited

    private void jButton4_recordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_recordsMouseEntered
        // TODO add your handling code here:
        jButton4_records.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton4_recordsMouseEntered

    private void jButton4_recordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_recordsMouseExited
        // TODO add your handling code here:
        jButton4_records.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton4_recordsMouseExited

    private void jButton5_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_addMouseEntered
        // TODO add your handling code here:
        jButton5_add.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton5_addMouseEntered

    private void jButton5_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5_addMouseExited
        // TODO add your handling code here:
        jButton5_add.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton5_addMouseExited

    private void jButton6_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6_clearMouseEntered
        // TODO add your handling code here:
         jButton6_clear.setBackground(new Color(0,101,183));
    }//GEN-LAST:event_jButton6_clearMouseEntered

    private void jButton6_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6_clearMouseExited
        // TODO add your handling code here:
         jButton6_clear.setBackground(new Color(0,84,104));
    }//GEN-LAST:event_jButton6_clearMouseExited

    private void jButton5_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_addActionPerformed
        // TODO add your handling code here:
        String foodName=jTextField1_FOOD_NAME.getText();
        String foodType=String.valueOf(jComboBox1_foodtype.getSelectedItem());
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
       
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int rIndex=jTable1.getSelectedRow();
      // jTextField1_ID.setText(model.getValueAt(rIndex, 0).toString());
        jTextField1_FOOD_NAME.setText(model.getValueAt(rIndex, 1).toString());
       jComboBox1_foodtype.setSelectedItem(model.getValueAt(rIndex, 2).toString());
        jTextField3_PRICE.setText(model.getValueAt(rIndex, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel4_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_backMouseEntered
        
        jLabel4_back.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4_backMouseEntered

    private void jLabel4_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_backMouseExited
        // TODO add your handling code here:
         jLabel4_back.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_jLabel4_backMouseExited

    private void jLabel4_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4_backMouseClicked
        // TODO add your handling code here:
        admin ad=new admin();
        this.setVisible(false);
        ad.setVisible(true);
    }//GEN-LAST:event_jLabel4_backMouseClicked

    private void jButton2_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2_deleteMouseClicked
        // TODO add your handling code here:
        deletefood del=new deletefood();
        this.setVisible(false);
        del.setVisible(true);
    }//GEN-LAST:event_jButton2_deleteMouseClicked

    private void jTextField3_PRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_PRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_PRICEActionPerformed

    private void jButton6_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_clearActionPerformed
        // TODO add your handling code here:
        jTextField1_FOOD_NAME.setText("");
        
        jTextField3_PRICE.setText("");
        // jTextField1_ID.setText("");
    }//GEN-LAST:event_jButton6_clearActionPerformed

    private void jButton3_modifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3_modifyMouseClicked
        // TODO add your handling code here:
        modify mod=new modify();
        this.setVisible(false);
        mod.setVisible(true);

    }//GEN-LAST:event_jButton3_modifyMouseClicked

    private void jButton7_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7_ordersMouseClicked
        // TODO add your handling code here:
          orders ord=new orders();
        this.setVisible(false);
        ord.setVisible(true);
    }//GEN-LAST:event_jButton7_ordersMouseClicked

    private void jButton7_ordersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7_ordersMouseEntered
        // TODO add your handling code here:
        jButton7_orders.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jButton7_ordersMouseEntered

    private void jButton7_ordersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7_ordersMouseExited
        // TODO add your handling code here:
        jButton7_orders.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jButton7_ordersMouseExited

    private void jButton4_recordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4_recordsMouseClicked
        // TODO add your handling code here:
        record rec=new record();
        this.setVisible(false);
        rec.setVisible(true);
    }//GEN-LAST:event_jButton4_recordsMouseClicked

    private void jComboBox1_foodtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1_foodtypeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_foodtypeMouseClicked

    private void jComboBox1_foodtypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1_foodtypeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_foodtypeMouseExited

    private void jTextField1_FOOD_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_FOOD_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_FOOD_NAMEActionPerformed

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
    private javax.swing.JButton jButton1_add;
    private javax.swing.JButton jButton2_delete;
    private javax.swing.JButton jButton3_modify;
    private javax.swing.JButton jButton4_records;
    private javax.swing.JButton jButton5_add;
    private javax.swing.JButton jButton6_clear;
    private javax.swing.JButton jButton7_orders;
    private javax.swing.JComboBox<String> jComboBox1_foodtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_add_close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_add_min;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_FOOD_NAME;
    private javax.swing.JTextField jTextField3_PRICE;
    // End of variables declaration//GEN-END:variables
}
