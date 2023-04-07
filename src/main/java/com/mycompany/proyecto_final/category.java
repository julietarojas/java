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
public class category extends javax.swing.JFrame {
    
    ImageIcon close = new ImageIcon("x.png");
    ImageIcon mini = new ImageIcon("mini.png");
    ImageIcon menu = new ImageIcon("home.png");

    /**
     * Creates new form category
     */
    public category() {
        initComponents();
        SelectCat();
        
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

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_catId = new javax.swing.JLabel();
        jTextField_categoryId = new javax.swing.JTextField();
        jLabel_catname = new javax.swing.JLabel();
        jTextField_categoryname = new javax.swing.JTextField();
        jButton_add = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel_menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        panel4 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel4.setText("manage categories");

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

        jLabel_catId.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_catId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_catId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_catId.setText("ID category");
        jLabel_catId.setOpaque(true);

        jTextField_categoryId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_categoryId.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_catname.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_catname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel_catname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_catname.setText("Cat name");
        jLabel_catname.setOpaque(true);

        jTextField_categoryname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_categoryname.setForeground(new java.awt.Color(255, 204, 0));

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

        CategoryTable.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        CategoryTable.setForeground(new java.awt.Color(255, 204, 0));
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category name"
            }
        ));
        CategoryTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CategoryTable.setRowHeight(30);
        CategoryTable.setSelectionBackground(new java.awt.Color(255, 204, 0));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

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
        jLabel2.setText("categories list");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_catId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_catname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_categoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_categoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(233, 233, 233))))
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_categoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_catId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_categoryname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_catname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
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

    
    public void SelectCat(){
        
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
        st = con.createStatement();
        rs = st.executeQuery("select * from categorytable");
        CategoryTable.setModel(DbUtils.resultSetToTableModel(rs));
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
            PreparedStatement add = con.prepareStatement("insert into categorytable values(?,?)");
            add.setInt(1, Integer.valueOf(jTextField_categoryId.getText()));
            add.setString(2, jTextField_categoryname.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "category succesfully added");
            con.close();
            SelectCat();
                    
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton_addMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)CategoryTable.getModel();
       int Myindex = CategoryTable.getSelectedRow();
       jTextField_categoryId.setText(model.getValueAt(Myindex, 0).toString());
       jTextField_categoryname.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void jButton_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_deleteMouseClicked
        if(jTextField_categoryId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "enter the category to be deleted");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String Id = jTextField_categoryId.getText();
                String Query = "delete from bee.categorytable where CatId ="+Id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectCat();
                JOptionPane.showMessageDialog(this, "category deleted successfully");
                
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jButton_deleteMouseClicked

    private void jButton_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_editMouseClicked
        if(jTextField_categoryId.getText().isEmpty()
                ||jTextField_categoryname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "missing information");
        }
        else
        {
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String UpdateQuery = "update bee.categorytable set CatName ='"+jTextField_categoryname.getText()+"'"
                        +"where CatId ="+jTextField_categoryId.getText();
                Statement add = con.createStatement();
                add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "category updated successfully");
                SelectCat();
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
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_catId;
    private javax.swing.JLabel jLabel_catname;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_categoryId;
    private javax.swing.JTextField jTextField_categoryname;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
