package com.mycompany.proyecto_final;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 * @author rojas
 */
public class login extends javax.swing.JFrame {

    ImageIcon close = new ImageIcon("x.png");
    ImageIcon user = new ImageIcon("user.png");
    ImageIcon up = new ImageIcon("up.png");
    ImageIcon lock = new ImageIcon("lock.png");
    ImageIcon eye = new ImageIcon("eye.png");
    ImageIcon mini = new ImageIcon("mini.png");
    /**
     * Creates new form dashboard
     */
    public login() {
        initComponents();
        
        //center this form
        this.setLocationRelativeTo(null);
        
        //set icons
        jLabel_close.setIcon(close);
        jLabel_user.setIcon(user);
        jLabel_pass.setIcon(lock);
        jLabel_showPass.setIcon(eye);
        jLabel_up.setIcon(up);
        jLabel_min.setIcon(mini);
        
        jLabel_close.setText("");
        jLabel_user.setText("");
        jLabel_pass.setText("");
        jLabel_showPass.setText("");
        jLabel_up.setText("");
        jLabel_min.setText("");
        
        //jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/x.png")));
        //jLabel_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/user.png")));
        //jLabel_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/lock.png")));
        //jLabel_showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/eye.png")));
        //jLabel_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/arrow.png")));
    
        //set borders
        Border panelBorder = BorderFactory.createMatteBorder(0, 0, 0, 5, Color.black);
        jPanel_container.setBorder(panelBorder);
        
        Border titleBorder = BorderFactory.createMatteBorder(0, 0, 4, 0, Color.darkGray);
        jLabel_title.setBorder(titleBorder);
    
    
    
    }

    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel_pass = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jCheckBox_showPass = new javax.swing.JCheckBox();
        jPanel_message = new java.awt.Panel();
        jLabel_up = new javax.swing.JLabel();
        jLabel_message_text = new javax.swing.JLabel();
        jLabel_showPass = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_createaccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_container.setBackground(new java.awt.Color(255, 204, 0));

        jPanel2.setBackground(new java.awt.Color(253, 246, 241));

        jLabel_title.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_title.setFont(new java.awt.Font("Qualy", 1, 50)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(8, 14, 44));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("Login");
        jLabel_title.setOpaque(true);

        jLabel_user.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_user.setOpaque(true);

        jTextField_username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel_pass.setBackground(new java.awt.Color(255, 237, 163));
        jLabel_pass.setOpaque(true);

        jPasswordField_password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton_login.setBackground(new java.awt.Color(235, 233, 224));
        jButton_login.setFont(new java.awt.Font("Qualy", 0, 12)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(36, 37, 42));
        jButton_login.setText("login");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_loginMouseClicked(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jCheckBox_showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_showPassActionPerformed(evt);
            }
        });

        jPanel_message.setBackground(new java.awt.Color(255, 195, 0));
        jPanel_message.setPreferredSize(new java.awt.Dimension(254, 60));

        jLabel_up.setBackground(new java.awt.Color(235, 233, 224));
        jLabel_up.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_up.setOpaque(true);
        jLabel_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_upMouseClicked(evt);
            }
        });

        jLabel_message_text.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        jLabel_message_text.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_message_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_message_text.setText("message");
        jLabel_message_text.setToolTipText("");

        javax.swing.GroupLayout jPanel_messageLayout = new javax.swing.GroupLayout(jPanel_message);
        jPanel_message.setLayout(jPanel_messageLayout);
        jPanel_messageLayout.setHorizontalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_messageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_up, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_message_text, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_messageLayout.setVerticalGroup(
            jPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_messageLayout.createSequentialGroup()
                .addComponent(jLabel_up, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_text, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_title, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_username))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckBox_showPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_showPass))
                .addGap(18, 18, 18)
                .addComponent(jButton_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jLabel_close.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setOpaque(true);
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

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

        jLabel_createaccount.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_createaccount.setFont(new java.awt.Font("Impact", 0, 10)); // NOI18N
        jLabel_createaccount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_createaccount.setText("  ¿nuevo usuario?  haz click aquí para crear una cuenta   ");
        jLabel_createaccount.setOpaque(true);
        jLabel_createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_createaccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_containerLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel_createaccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_createaccount)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //timer to hide the message panel
    Timer timerUp = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(jPanel_message.getHeight() != 0)
            {
                jPanel_message.setBounds(jPanel_message.getX(), jPanel_message.getY(), jPanel_message.getWidth(), jPanel_message.getHeight() -5);
            } 
            else
            {
                timerUp.stop();
            }
            
        }
    });
    
    
    
    //timer to show the message panel   
    Timer timerDown = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(jPanel_message.getHeight() != 60)
            {
                jPanel_message.setBounds(jPanel_message.getX(), jPanel_message.getY(), jPanel_message.getWidth(), jPanel_message.getHeight() +5);
            } 
            else
            {
                timerDown.stop();
            }
            
        }
    });
    
    
    
    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
      
        
//        Connection c = basededatos.getConnection();
//        PreparedStatement ps;
//        ResultSet rs;
//        
//        try {
//            ps = c.prepareStatement("SELECT * FROM `usuario` WHERE `usuario` = ? AND `password` = ?");
//            ps.setString(1, jTextField_username.getText());
//            ps.setString(2, String.valueOf(jPasswordField_password.getPassword()));
//            rs = ps.executeQuery();
//            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "loged");
//            }else{
//                JOptionPane.showMessageDialog(null, "loged error");
//            }
//        } catch (SQLException ex) {
//            
//            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        
        
//        String username = jTextField_username.getText();
//        String password = String.valueOf(jPasswordField_password.getPassword()).trim();
//        
//        if (username.equals(""))
//        {
//            jLabel_message_text.setText("enter your usename first");
//        }
//        else if(password.equals(""))
//        {
//            jLabel_message_text.setText("you need to enter your password");
//        }    
//        else if(username.equals("admin") && password.equals("pass123"))
//        {
//            this.dispose();
//            dashboard dashboard = new dashboard();
//            dashboard.setVisible(true);
//        }
//        else
//        {
//            jLabel_message_text.setText("incorrect username or password");
//        }


        // show the jpanel message
        timerDown.start();
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jCheckBox_showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_showPassActionPerformed
        // show and hide password chars
        if(jCheckBox_showPass.isSelected())
        {
            jPasswordField_password.setEchoChar((char)0);
        }
        else
        {
            jPasswordField_password.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_showPassActionPerformed

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        //close this form
        this.dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_upMouseClicked
        // hide the jpanel message
        timerUp.start();
    }//GEN-LAST:event_jLabel_upMouseClicked

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_createaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_createaccountMouseClicked
        // TODO add your handling code here:
        signup supf = new signup();
        supf.setVisible(true);
        supf.pack();
        supf.setLocationRelativeTo(null);
        supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_createaccountMouseClicked

    private void jButton_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseClicked

        if(jTextField_username.getText().isEmpty()||jPasswordField_password.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "missing information");
        }else {
            String Query = "select * from bee.usertable where UserName ='"+jTextField_username.getText()+"' "
                + "and UserPass ='"+jPasswordField_password.getText()+"'";
        try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
           st = con.createStatement();
           rs = st.executeQuery(Query); 
           if(rs.next())
           {
               new home().setVisible(true);
               this.dispose();
           }else{
               JOptionPane.showMessageDialog(this, "wrong username or password");
           }
                
        }catch(Exception e){
          //e.printStackTracer();  
        }
        }
    }//GEN-LAST:event_jButton_loginMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JCheckBox jCheckBox_showPass;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_createaccount;
    private javax.swing.JLabel jLabel_message_text;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_showPass;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_up;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_container;
    private java.awt.Panel jPanel_message;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
