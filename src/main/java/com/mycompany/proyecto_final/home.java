package com.mycompany.proyecto_final;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author rojas
 */
public class home extends javax.swing.JFrame {
    
    ImageIcon close = new ImageIcon("x.png");
    ImageIcon mini = new ImageIcon("mini.png");
    ImageIcon products = new ImageIcon("cart.png");
    ImageIcon category = new ImageIcon("category.png");
    ImageIcon user = new ImageIcon("userh.png");
    ImageIcon customer = new ImageIcon("customer.png");
    ImageIcon order = new ImageIcon("order.png");

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        
        //center this form
        this.setLocationRelativeTo(null);
        
        //set icons
        
        jLabel_close.setIcon(close);
        jLabel_min.setIcon(mini);
        jLabel_products.setIcon(products);
        jLabel_category.setIcon(category);
        jLabel_user.setIcon(user);
        jLabel_customer.setIcon(customer);
        jLabel_order.setIcon(order);
      
        
        jLabel_close.setText("");
        jLabel_min.setText("");
        jLabel_products.setText("");
        jLabel_category.setText("");
        jLabel_user.setText("");
        jLabel_customer.setText("");
        jLabel_order.setText("");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_home = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel_order = new javax.swing.JLabel();
        jLabel_products = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jLabel_category = new javax.swing.JLabel();
        jLabel_customer = new javax.swing.JLabel();
        jLabel_productst = new javax.swing.JLabel();
        jLabel_usert = new javax.swing.JLabel();
        jLabel_categoryt = new javax.swing.JLabel();
        jLabel_ordert = new javax.swing.JLabel();
        jLabel_customert = new javax.swing.JLabel();
        jButton_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_home.setBackground(new java.awt.Color(238, 252, 245));
        panel_home.setForeground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel2.setFont(new java.awt.Font("Qualy", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");

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

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(499, 499, 499))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(403, 403, 403)
                    .addComponent(jLabel3)
                    .addContainerGap(406, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel3)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

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

        jLabel_order.setText("jLabel1");
        jLabel_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_orderMouseClicked(evt);
            }
        });

        jLabel_products.setText("jLabel1");
        jLabel_products.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_productsMouseClicked(evt);
            }
        });

        jLabel_user.setText("jLabel1");
        jLabel_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_userMouseClicked(evt);
            }
        });

        jLabel_category.setText("jLabel1");
        jLabel_category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_categoryMouseClicked(evt);
            }
        });

        jLabel_customer.setText("jLabel1");
        jLabel_customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_customerMouseEntered(evt);
            }
        });

        jLabel_productst.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_productst.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_productst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_productst.setText("products");
        jLabel_productst.setToolTipText("");

        jLabel_usert.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_usert.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_usert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_usert.setText("user");
        jLabel_usert.setToolTipText("");

        jLabel_categoryt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_categoryt.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_categoryt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_categoryt.setText("category");
        jLabel_categoryt.setToolTipText("");

        jLabel_ordert.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_ordert.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_ordert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ordert.setText("order");
        jLabel_ordert.setToolTipText("");

        jLabel_customert.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_customert.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_customert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_customert.setText("customer");
        jLabel_customert.setToolTipText("");

        jButton_logout.setBackground(new java.awt.Color(202, 184, 255));
        jButton_logout.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jButton_logout.setForeground(new java.awt.Color(36, 37, 42));
        jButton_logout.setText("logout");
        jButton_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_logoutMouseClicked(evt);
            }
        });
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_homeLayout = new javax.swing.GroupLayout(panel_home);
        panel_home.setLayout(panel_homeLayout);
        panel_homeLayout.setHorizontalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_homeLayout.createSequentialGroup()
                .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_homeLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel_products, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_homeLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel_productst, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_homeLayout.createSequentialGroup()
                        .addComponent(jLabel_customert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(319, 319, 319)
                        .addComponent(jLabel_ordert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                        .addGap(0, 194, Short.MAX_VALUE)
                        .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                                .addComponent(jLabel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(281, 281, 281)
                                .addComponent(jLabel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                                .addComponent(jLabel_categoryt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282)
                                .addComponent(jLabel_usert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                                .addComponent(jButton_logout)
                                .addGap(519, 519, 519))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_order, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
            .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_homeLayout.createSequentialGroup()
                    .addGap(342, 342, 342)
                    .addComponent(jLabel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(725, Short.MAX_VALUE)))
        );
        panel_homeLayout.setVerticalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_homeLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_category, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_products, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_productst)
                    .addComponent(jLabel_usert)
                    .addComponent(jLabel_categoryt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel_order, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ordert)
                    .addComponent(jLabel_customert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                    .addContainerGap(430, Short.MAX_VALUE)
                    .addComponent(jLabel_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(117, 117, 117)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        //close this form
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
   
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jLabel_productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_productsMouseClicked

        new products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_productsMouseClicked

    private void jLabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_userMouseClicked

        new user().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_userMouseClicked

    private void jLabel_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_customerMouseEntered

        
    }//GEN-LAST:event_jLabel_customerMouseEntered

    private void jLabel_orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_orderMouseClicked

        new order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_orderMouseClicked

    private void jLabel_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_categoryMouseClicked
       
        new category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_categoryMouseClicked

    private void jButton_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_logoutMouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_logoutMouseClicked

    private void jLabel_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_customerMouseClicked

        new customer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_customerMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_category;
    private javax.swing.JLabel jLabel_categoryt;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_customer;
    private javax.swing.JLabel jLabel_customert;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JLabel jLabel_order;
    private javax.swing.JLabel jLabel_ordert;
    private javax.swing.JLabel jLabel_products;
    private javax.swing.JLabel jLabel_productst;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JLabel jLabel_usert;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel_home;
    // End of variables declaration//GEN-END:variables
}
