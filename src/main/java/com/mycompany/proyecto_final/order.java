package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rojas
 */
public class order extends javax.swing.JFrame {
    
    
    ImageIcon close = new ImageIcon("x.png");
    ImageIcon mini = new ImageIcon("mini.png");
    ImageIcon menu = new ImageIcon("home.png");

    /**
     * Creates new form ordet
     */
    public order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
        
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
 
    
    private void GetToday(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        jLabel_date.setText(dtf.format(now));          
    }
    
    
    private void update(){
        
        int newqty = oldqty - Integer.valueOf(jTextField_productQty.getText());
     
        try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
                String UpdateQuery = "update bee.producttable set ProductQty ='"+newqty+"'"
                        +"where ProductId ="+productid;
                Statement add = con.createStatement();
                add.executeUpdate(UpdateQuery);
                //JOptionPane.showMessageDialog(this, "category updated successfully");
                SelectProd();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_productId = new javax.swing.JLabel();
        jTextField_BillId = new javax.swing.JTextField();
        jLabel_user1 = new javax.swing.JLabel();
        jTextField_productQty = new javax.swing.JTextField();
        jLabel_pass1 = new javax.swing.JLabel();
        jLabel_pass2 = new javax.swing.JLabel();
        jButton_addorder = new javax.swing.JButton();
        jButton_vieworders = new javax.swing.JButton();
        jButton_addto = new javax.swing.JButton();
        jLabel_menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_Table = new javax.swing.JTable();
        panel4 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel_tot = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_custname = new javax.swing.JLabel();
        jTextField_price = new javax.swing.JTextField();
        jLabel_price = new javax.swing.JLabel();
        jButton_print = new javax.swing.JButton();
        jLabel_tot1 = new javax.swing.JLabel();

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
        jLabel4.setText("manage orders");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(276, 276, 276)
                        .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(446, 446, 446))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel_productId.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_productId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_productId.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_productId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_productId.setText("order ID");
        jLabel_productId.setOpaque(true);

        jTextField_BillId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_BillId.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_user1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_user1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_user1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_user1.setText("Quantity");
        jLabel_user1.setOpaque(true);

        jTextField_productQty.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_productQty.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_pass1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_pass1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_pass1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pass1.setText("customer name");
        jLabel_pass1.setOpaque(true);

        jLabel_pass2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_pass2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_pass2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_pass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_pass2.setText("Date");
        jLabel_pass2.setToolTipText("");
        jLabel_pass2.setOpaque(true);

        jButton_addorder.setBackground(new java.awt.Color(255, 204, 0));
        jButton_addorder.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jButton_addorder.setForeground(new java.awt.Color(36, 37, 42));
        jButton_addorder.setText("add order");
        jButton_addorder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_addorderMouseClicked(evt);
            }
        });
        jButton_addorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addorderActionPerformed(evt);
            }
        });

        jButton_vieworders.setBackground(new java.awt.Color(255, 204, 0));
        jButton_vieworders.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jButton_vieworders.setForeground(new java.awt.Color(36, 37, 42));
        jButton_vieworders.setText("view orders");
        jButton_vieworders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_vieworders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_viewordersMouseClicked(evt);
            }
        });
        jButton_vieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewordersActionPerformed(evt);
            }
        });

        jButton_addto.setBackground(new java.awt.Color(255, 204, 0));
        jButton_addto.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jButton_addto.setForeground(new java.awt.Color(36, 37, 42));
        jButton_addto.setText("add to order");
        jButton_addto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_addto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_addtoMouseClicked(evt);
            }
        });
        jButton_addto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addtoActionPerformed(evt);
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

        Product_Table.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
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

        BillTable.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        BillTable.setForeground(new java.awt.Color(255, 204, 0));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. #", "Product", "Quantify", "UPrice", "Total"
            }
        ));
        BillTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        BillTable.setRowHeight(25);
        BillTable.setSelectionBackground(new java.awt.Color(255, 204, 0));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BillTable);

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
        jScrollPane3.setViewportView(CustomerTable);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Qualy", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("customers list");

        jLabel_tot.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_tot.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_tot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_tot.setText("Amount");

        jLabel_date.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_date.setText("Date");

        jLabel_custname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_custname.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_custname.setText("CustName");

        jTextField_price.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTextField_price.setForeground(new java.awt.Color(255, 204, 0));

        jLabel_price.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_price.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel_price.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_price.setText("Price");
        jLabel_price.setOpaque(true);

        jButton_print.setBackground(new java.awt.Color(255, 204, 0));
        jButton_print.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jButton_print.setForeground(new java.awt.Color(36, 37, 42));
        jButton_print.setText("print");
        jButton_print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_printMouseClicked(evt);
            }
        });
        jButton_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_printActionPerformed(evt);
            }
        });

        jLabel_tot1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_tot1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_tot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tot1.setText("$");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton_addorder)
                                .addGap(57, 57, 57)
                                .addComponent(jButton_vieworders))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_custname, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)))))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(257, 257, 257))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_productQty, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_addto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel_tot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton_print, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))))
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_productId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_custname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_vieworders, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_productQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_addto)
                            .addComponent(jLabel_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_print, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_tot1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
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

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        //close this form
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jButton_addorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addorderMouseClicked

        if(jTextField_BillId.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "enter the bill ID");  
        }else{
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
            PreparedStatement add = con.prepareStatement("insert into ordertable values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(jTextField_BillId.getText()));
            add.setString(2, jLabel_custname.getText());
            add.setString(3, jLabel_date.getText());
            add.setInt(4, Integer.valueOf(jLabel_tot.getText()));
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "order succesfully added");
            con.close();

        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_jButton_addorderMouseClicked

    private void jButton_addorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addorderActionPerformed

    }//GEN-LAST:event_jButton_addorderActionPerformed

    private void jButton_viewordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_viewordersMouseClicked
////        if(jTextField_productId.getText().isEmpty()
////            ||jTextField_productname.getText().isEmpty()
////            ||jTextField_productQty.getText().isEmpty()
////            ||jTextField_productDesc.getText().isEmpty())
////        {
////            JOptionPane.showMessageDialog(this, "missing information");
////        }
////        else
////        {
////            try{
////                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bee?serverTimezone=UTC","root","Nomeacuerdo1");
////                String UpdateQuery = "update bee.producttable set ProductName ='"+jTextField_productname.getText()+"'"
////                +",ProductQty ="+jTextField_productQty.getText()+""
////                +",ProductDesc ='"+jTextField_productDesc.getText()+"'"
////                +",ProductCat ='"+jComboBox_cat.getSelectedItem().toString()+"'"
////                +"where ProductId ="+jTextField_productId.getText();
////                Statement add = con.createStatement();
////                add.executeUpdate(UpdateQuery);
////                JOptionPane.showMessageDialog(this, "product updated successfully");
////                SelectProd();
////            }catch (Exception e)
////            {
////                e.printStackTrace();
////            }
////
////        }
////
    }//GEN-LAST:event_jButton_viewordersMouseClicked

    private void jButton_viewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewordersActionPerformed

    }//GEN-LAST:event_jButton_viewordersActionPerformed

    
    int i = 1, Uprice, tot = 0, total;
    String Prodname;
    private void jButton_addtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_addtoMouseClicked

        
        if(flag == 0 || jTextField_productQty.getText().isEmpty()||jTextField_price.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this, "select product and enter qty");
        }else{
            
        
        Uprice = Integer.valueOf(jTextField_price.getText());
        tot = Uprice * Integer.valueOf(jTextField_productQty.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(Prodname);
        v.add(jTextField_productQty.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt = (DefaultTableModel)BillTable.getModel();
        dt.addRow(v);
        total = total + tot;
        jLabel_tot.setText(""+total);
        i++;
        update();
        }
    }//GEN-LAST:event_jButton_addtoMouseClicked

    private void jButton_addtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addtoActionPerformed

    }//GEN-LAST:event_jButton_addtoActionPerformed

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel_menuMouseClicked

    int flag  = 0, productid, oldqty ;
    private void Product_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_TableMouseClicked
        DefaultTableModel model = (DefaultTableModel)Product_Table.getModel();
        int Myindex = Product_Table.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        Prodname = model.getValueAt(Myindex, 1).toString();
        oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        //jTextField_productDesc.setText(model.getValueAt(Myindex, 3).toString());
        flag = 1;
    }//GEN-LAST:event_Product_TableMouseClicked

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTableMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        int Myindex = CustomerTable.getSelectedRow();
        //jTextField_customerId.setText(model.getValueAt(Myindex, 0).toString());
        jLabel_custname.setText(model.getValueAt(Myindex, 1).toString());
        //jTextField_customerphone.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void jButton_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_printMouseClicked
        
        try{
          BillTable.print();  
        }catch(Exception exp)
        {
            exp.printStackTrace();
        } 
    }//GEN-LAST:event_jButton_printMouseClicked

    private void jButton_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_printActionPerformed

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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JTable Product_Table;
    private javax.swing.JButton jButton_addorder;
    private javax.swing.JButton jButton_addto;
    private javax.swing.JButton jButton_print;
    private javax.swing.JButton jButton_vieworders;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_custname;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JLabel jLabel_pass1;
    private javax.swing.JLabel jLabel_pass2;
    private javax.swing.JLabel jLabel_price;
    private javax.swing.JLabel jLabel_productId;
    private javax.swing.JLabel jLabel_tot;
    private javax.swing.JLabel jLabel_tot1;
    private javax.swing.JLabel jLabel_user1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField_BillId;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_productQty;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables
}
