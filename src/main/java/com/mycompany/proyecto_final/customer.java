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
public class customer extends javax.swing.JFrame {
    
    ImageIcon close = new ImageIcon("x.png");
    ImageIcon mini = new ImageIcon("mini.png");
    ImageIcon menu = new ImageIcon("home.png");

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        SelectCust();
        
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
    Statement st1 = null;
    ResultSet rs1 = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_custId = new javax.swing.JLabel();
        jTextField_customerId = new javax.swing.JTextField();
        jLabel_custname = new javax.swing.JLabel();
        jTextField_customername = new javax.swing.JTextField();
        jLabel_custphone = new javax.swing.JLabel();
        jTextField_customerphone = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel_menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        panel4 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_count = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(238, 252, 245));

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
        jLabel4.setText("manage customers ");

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

        jLabel_custId.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_custId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_custId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_custId.setText("ID customer");
        jLabel_custId.setOpaque(true);

        jTextField_customerId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_customerId.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_custname.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_custname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_custname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_custname.setText("Name");
        jLabel_custname.setOpaque(true);

        jTextField_customername.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_customername.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_custphone.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_custphone.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_custphone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_custphone.setText("Phone");
        jLabel_custphone.setOpaque(true);

        jTextField_customerphone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_customerphone.setForeground(new java.awt.Color(255, 204, 0));

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

        CustomerTable.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        CustomerTable.setForeground(new java.awt.Color(255, 204, 0));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer  ID", "Name", "Phone"
            }
        ));
        CustomerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CustomerTable.setRowHeight(25);
        CustomerTable.setSelectionBackground(new java.awt.Color(255, 204, 0));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

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
        jLabel2.setText("customers list");

        jPanel2.setBackground(new java.awt.Color(196, 77, 86));

        jLabel_count.setFont(new java.awt.Font("Qualy", 1, 36)); // NOI18N
        jLabel_count.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_count.setText("X");

        jLabel7.setBackground(new java.awt.Color(234, 50, 70));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("order number");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel_count, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_count)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_custId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_custname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_customername, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(jLabel_custphone, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(jTextField_customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton_add)
                        .addGap(46, 46, 46)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jButton_edit)
                                .addGap(36, 36, 36)
                                .addComponent(jButton_delete))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_customerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_custId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_customername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_custname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_custphone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_customerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    public void SelectCust(){
        
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
        st = con.createStatement();
        rs = st.executeQuery("select * from customertable");
        CustomerTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e)
        {
            e.printStackTrace();
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addMouseClicked
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
            PreparedStatement add = con.prepareStatement("insert into customertable values(?,?,?)");
            add.setInt(1, Integer.valueOf(jTextField_customerId.getText()));
            add.setString(2, jTextField_customername.getText());
            add.setString(3,jTextField_customerphone.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "customer succesfully added");
            con.close();
            SelectCust();
                    
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_addMouseClicked

    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked
        
        if(jTextField_customerId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "enter the customer to be deleted");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String Id = jTextField_customerId.getText();
                String Query = "delete from bee.customertable where CustId ="+Id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectCust();
                JOptionPane.showMessageDialog(this, "customer deleted successfully");
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jButton_deleteMouseClicked

    private void jButton_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_editMouseClicked
        if(jTextField_customerId.getText().isEmpty()
                ||jTextField_customername.getText().isEmpty()
                ||jTextField_customerphone.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "missing information");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String UpdateQuery = "update bee.customertable set CustName ='"+jTextField_customername.getText()+"'"
                        +",CustPhone ='"+jTextField_customerphone.getText()+"'"
                        +"where CustId ="+"'"+jTextField_customerId.getText()+"'";
                Statement add = con.createStatement();
                add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "customer updated successfully");
                SelectCust();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }    
    }//GEN-LAST:event_jButton_editMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        
       DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
       int Myindex = CustomerTable.getSelectedRow();
       jTextField_customerId.setText(model.getValueAt(Myindex, 0).toString());
       jTextField_customername.setText(model.getValueAt(Myindex, 1).toString());
       jTextField_customerphone.setText(model.getValueAt(Myindex, 2).toString());
       
       try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
           st = con.createStatement();
           //st1 = con.createStatement();
           rs = st.executeQuery("select count(*) from bee.ordertable where CustName='"+model.getValueAt(Myindex, 1).toString()+"'");
           //rs1 = st.executeQuery("select sum(Amount) from bee.ordertable where CustName='"+model.getValueAt(Myindex, 1).toString()+"'");
           while (rs.next()){
               jLabel_count.setText(""+rs.getInt(1));
           }
           while(rs1.next()){
           }
           }catch(SQLException e){
           }
    }//GEN-LAST:event_CustomerTableMouseClicked

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_count;
    private javax.swing.JLabel jLabel_custId;
    private javax.swing.JLabel jLabel_custname;
    private javax.swing.JLabel jLabel_custphone;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_customerId;
    private javax.swing.JTextField jTextField_customername;
    private javax.swing.JTextField jTextField_customerphone;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
