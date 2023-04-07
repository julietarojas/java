package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rojas
 */
public class products extends javax.swing.JFrame {
    
    ImageIcon close = new ImageIcon("x.png");
    ImageIcon mini = new ImageIcon("mini.png");
    ImageIcon menu = new ImageIcon("home.png");

    /**
     * Creates new form products
     */
    public products() {
        initComponents();
        SelectProd();
        GetCat();
        
        //center this form
        this.setLocationRelativeTo(null);
        
        //set icons
        
        jLabel_close.setIcon(close);
        jLabel_min.setIcon(mini);
        jLabel_menu.setIcon(menu);
        
        
        jLabel_close.setText("");
        jLabel_min.setText("");
        jLabel_menu.setText("");
    }
    
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
            

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new java.awt.Panel();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_productId = new javax.swing.JLabel();
        jTextField_productId = new javax.swing.JTextField();
        jLabel_pass = new javax.swing.JLabel();
        jTextField_productname = new javax.swing.JTextField();
        jLabel_user1 = new javax.swing.JLabel();
        jTextField_productQty = new javax.swing.JTextField();
        jLabel_pass1 = new javax.swing.JLabel();
        jTextField_productDesc = new javax.swing.JTextField();
        jLabel_pass2 = new javax.swing.JLabel();
        jComboBox_cat = new javax.swing.JComboBox<>();
        jButton_add = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel_menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_Table = new javax.swing.JTable();
        panel4 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();

        panel3.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(238, 252, 245));
        panel1.setForeground(new java.awt.Color(255, 204, 0));

        panel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventory Managment System");

        jLabel_min.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_min.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_min.setToolTipText("");
        jLabel_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_min.setName(""); // NOI18N
        jLabel_min.setOpaque(true);
        jLabel_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minMouseClicked(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Qualy", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("manage products");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(276, 276, 276)
                .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                    .addContainerGap(463, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(426, 426, 426)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                    .addContainerGap(58, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(23, 23, 23)))
        );

        jLabel_productId.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_productId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_productId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_productId.setText("ID product");
        jLabel_productId.setOpaque(true);

        jTextField_productId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_productId.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_pass.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_pass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pass.setText("Name");
        jLabel_pass.setOpaque(true);

        jTextField_productname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_productname.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_user1.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_user1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_user1.setText("Quantity");
        jLabel_user1.setOpaque(true);

        jTextField_productQty.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_productQty.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_pass1.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_pass1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pass1.setText("Description");
        jLabel_pass1.setOpaque(true);

        jTextField_productDesc.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_productDesc.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_pass2.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_pass2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_pass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pass2.setText("Category");
        jLabel_pass2.setOpaque(true);

        jComboBox_cat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jButton_add.setBackground(new java.awt.Color(255, 204, 0));
        jButton_add.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton_add.setForeground(new java.awt.Color(36, 37, 42));
        jButton_add.setText("add");
        jButton_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_addMouseClicked(evt);
            }
        });
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jButton_edit.setBackground(new java.awt.Color(255, 204, 0));
        jButton_edit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton_edit.setForeground(new java.awt.Color(36, 37, 42));
        jButton_edit.setText("edit");
        jButton_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_editMouseClicked(evt);
            }
        });
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_delete.setBackground(new java.awt.Color(255, 204, 0));
        jButton_delete.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(36, 37, 42));
        jButton_delete.setText("delete");
        jButton_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_deleteMouseClicked(evt);
            }
        });
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jLabel_menu.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_menu.setOpaque(true);
        jLabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuMouseClicked(evt);
            }
        });

        Product_Table.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        Product_Table.setForeground(new java.awt.Color(255, 204, 0));
        Product_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID ", "Name", "Quantify", "Description", "Category"
            }
        ));
        Product_Table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Product_Table.setRowHeight(25);
        Product_Table.setSelectionBackground(new java.awt.Color(255, 204, 0));
        Product_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product_Table);

        panel4.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Qualy", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("products list");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField_productDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton_add)
                                .addGap(46, 46, 46))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton_edit)
                                .addGap(36, 36, 36)
                                .addComponent(jButton_delete))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jTextField_productQty, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jComboBox_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(243, 243, 243))))
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_productQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_productDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void SelectProd(){
        
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
        st = con.createStatement();
        rs = st.executeQuery("select * from producttable");
        Product_Table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
     
     private void GetCat(){
         
         try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
             st = con.createStatement();
             String query = "select * from bee.categorytable";
             rs = st.executeQuery(query);
             while(rs.next())
             {
                 String Mycat = rs.getString("CatName");
                 jComboBox_cat.addItem(Mycat);
             }
         }catch(Exception e){
             
         }
     }
    
    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        //close this form
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked
                
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed

    }//GEN-LAST:event_jButton_addActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed

    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
            PreparedStatement add = con.prepareStatement("insert into producttable values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(jTextField_productId.getText()));
            add.setString(2, jTextField_productname.getText());
            add.setInt(3, Integer.valueOf(jTextField_productQty.getText()));
            add.setString(4, jTextField_productDesc.getText());
            add.setString(5, jComboBox_cat.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "product succesfully added");
            con.close();
            SelectProd();
                    
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_addMouseClicked

    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked
        if(jTextField_productId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "enter the product to be deleted");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String Id = jTextField_productId.getText();
                String Query = "delete from bee.producttable where ProductId ="+Id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "product deleted successfully");
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jButton_deleteMouseClicked

    private void Product_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_TableMouseClicked
       DefaultTableModel model = (DefaultTableModel)Product_Table.getModel();
       int Myindex = Product_Table.getSelectedRow();
       jTextField_productId.setText(model.getValueAt(Myindex, 0).toString());
       jTextField_productname.setText(model.getValueAt(Myindex, 1).toString());
       jTextField_productQty.setText(model.getValueAt(Myindex, 2).toString());
       jTextField_productDesc.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_Product_TableMouseClicked

    private void jButton_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_editMouseClicked
        if(jTextField_productId.getText().isEmpty()
                ||jTextField_productname.getText().isEmpty()
                ||jTextField_productQty.getText().isEmpty()
                ||jTextField_productDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "missing information");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String UpdateQuery = "update bee.producttable set ProductName ='"+jTextField_productname.getText()+"'"
                        +",ProductQty ="+jTextField_productQty.getText()+""
                        +",ProductDesc ='"+jTextField_productDesc.getText()+"'"
                        +",ProductCat ='"+jComboBox_cat.getSelectedItem().toString()+"'"
                        +"where ProductId ="+jTextField_productId.getText();
                Statement add = con.createStatement();
                add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "product updated successfully");
                SelectProd();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
              
        }
        
        
    }//GEN-LAST:event_jButton_editMouseClicked

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
       new home().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel_menuMouseClicked

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
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Product_Table;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JComboBox<String> jComboBox_cat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_pass1;
    private javax.swing.JLabel jLabel_pass2;
    private javax.swing.JLabel jLabel_productId;
    private javax.swing.JLabel jLabel_user1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_productDesc;
    private javax.swing.JTextField jTextField_productId;
    private javax.swing.JTextField jTextField_productQty;
    private javax.swing.JTextField jTextField_productname;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
