/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DbCon;

/**
 *
 * @author LENOVO
 */
public class DashBoard extends javax.swing.JFrame {

    DbCon con = new DbCon();
    PreparedStatement ps;
    String sql = "";
    ResultSet rs;
    public DashBoard() {
        initComponents();
    }

  public float getTotalPrice() {

        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        return totalPrice;
    }

    public float getActualPrice() {
        float discount = 0.0f;
        float totalPrice = getTotalPrice();
        String discountStr = txtSalesDiscount.getText().trim();

        discount = Float.parseFloat(discountStr);
        float discountamount = totalPrice * discount / 100;

        float actualPrice = totalPrice - discountamount;

        return actualPrice;

    }

    // First Date is Java.SQL date and parameter date is Util date
    public java.sql.Date convertUtilDateToSqlDate(java.util.Date utilDate) {
        if (utilDate != null) {
            return new java.sql.Date(utilDate.getTime());
        }

        return null;
    }

    public float getDiscountAmount() {

        return getTotalPrice() - getActualPrice();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        home = new javax.swing.JTabbedPane();
        sales = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSalesPid = new javax.swing.JTextField();
        txtSalesProductname = new javax.swing.JComboBox<>();
        txtSalesUnitPrice = new javax.swing.JTextField();
        txtSalesQuantity = new javax.swing.JTextField();
        txtSalesTotalPrice = new javax.swing.JTextField();
        txtSalesDiscount = new javax.swing.JTextField();
        txtSalesActualPrice = new javax.swing.JTextField();
        txtCashRecived = new javax.swing.JTextField();
        txtSalesDueAmount = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnSalesSave = new javax.swing.JButton();
        btnSalesUpdate = new javax.swing.JButton();
        txtSalesDelete = new javax.swing.JButton();
        txtSalesReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalesTable = new javax.swing.JTable();
        purchase = new javax.swing.JTabbedPane();
        customer = new javax.swing.JTabbedPane();
        accessories = new javax.swing.JTabbedPane();
        stock = new javax.swing.JTabbedPane();
        bill = new javax.swing.JTabbedPane();
        report = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TTM GADGETS & SERVICES");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 6, 1280, 120));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 130));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(0, 204, 204));
        btnHome.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/homelast.png"))); // NOI18N
        btnHome.setText("HOME");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        btnSales.setBackground(new java.awt.Color(0, 204, 204));
        btnSales.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        btnSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/sales.png"))); // NOI18N
        btnSales.setText("SALES");
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalesMouseExited(evt);
            }
        });
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/purchase.png"))); // NOI18N
        jButton6.setText("PURCHASE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/customer.png"))); // NOI18N
        jButton7.setText("CUSTOMER");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 30));

        jButton8.setBackground(new java.awt.Color(0, 204, 204));
        jButton8.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/device.png"))); // NOI18N
        jButton8.setText("GADGETS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 140, 30));

        jButton9.setBackground(new java.awt.Color(0, 204, 204));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/cart.png"))); // NOI18N
        jButton9.setText("STOCK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 30));

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/bill.png"))); // NOI18N
        jButton10.setText("BILL");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, 30));

        jButton11.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 51, 51));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/turn-off.png"))); // NOI18N
        jButton11.setText("LOG OUT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 30));

        jButton12.setBackground(new java.awt.Color(0, 204, 204));
        jButton12.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icon/report.png"))); // NOI18N
        jButton12.setText("REPORT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 550));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(0, 204, 204));
        menu.addTab("menu", home);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sales");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 1, 1110, 120));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 120));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setText("PID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 40, -1));

        jLabel5.setText("Mobile Name & Model");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setText("Unit Price");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel7.setText("Quantity");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel8.setText("Total price");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel9.setText("Discount");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel10.setText("Actual Price");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel11.setText("Cash Recived");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel12.setText("Due Amount");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel13.setText("Date");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel14.setText("Customer Name");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel4.add(txtSalesPid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 210, -1));

        txtSalesProductname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Samsung", "Oneplus", "Xiomi", "Realme", "Oppo" }));
        jPanel4.add(txtSalesProductname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 210, -1));

        txtSalesUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesUnitPriceFocusLost(evt);
            }
        });
        jPanel4.add(txtSalesUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 210, -1));

        txtSalesQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesQuantityFocusLost(evt);
            }
        });
        jPanel4.add(txtSalesQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, -1));
        jPanel4.add(txtSalesTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, -1));
        jPanel4.add(txtSalesDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 210, -1));
        jPanel4.add(txtSalesActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 210, -1));
        jPanel4.add(txtCashRecived, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, -1));
        jPanel4.add(txtSalesDueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 210, -1));
        jPanel4.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 210, -1));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 210, -1));

        btnSalesSave.setText("Save");
        btnSalesSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesSaveMouseClicked(evt);
            }
        });
        jPanel4.add(btnSalesSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        btnSalesUpdate.setText("Update");
        jPanel4.add(btnSalesUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        txtSalesDelete.setText("Delete");
        jPanel4.add(txtSalesDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        txtSalesReset.setText("Reset");
        jPanel4.add(txtSalesReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        txtSalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(txtSalesTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 670, 590));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 710));

        sales.addTab("tab1", jPanel3);

        menu.addTab("tab2", sales);
        menu.addTab("tab3", purchase);
        menu.addTab("tab4", customer);
        menu.addTab("tab5", accessories);
        menu.addTab("tab6", stock);
        menu.addTab("tab7", bill);
        menu.addTab("tab8", report);
        menu.addTab("tab9", jTabbedPane10);
        menu.addTab("tab10", jTabbedPane11);
        menu.addTab("tab11", jTabbedPane12);

        jPanel2.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1120, 630));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 1120, 550));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(1);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(3);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(4);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(5);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(6);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(8);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        menu.setSelectedIndex(7);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        
        btnHome.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
         btnHome.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseEntered
        btnSales.setBackground(new Color(255,255,255));
        
    }//GEN-LAST:event_btnSalesMouseEntered

    private void btnSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseExited
       btnSales.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnSalesMouseExited

    private void btnSalesSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesSaveMouseClicked
       
        
          sql = "insert into sales(name, unitPrice, quantity, actualPrice,"
                + " discount, dueAmount, salerId, salesDate)"
                + "     values(?,?,?,?,?,?,?)";

        try {
            ps = con.getCon().prepareStatement(sql);

            ps.setString(1, txtSalesProductname.getSelectedItem().toString());
            ps.setFloat(2, Float.parseFloat(txtSalesUnitPrice.getText().trim()));
            ps.setFloat(3, Float.parseFloat(txtSalesQuantity.getText().trim()));
            ps.setFloat(4, getActualPrice());
            ps.setFloat(5, getDiscountAmount());
            ps.setFloat(6, Float.parseFloat(txtSalesDueAmount.getText()));
            ps.setInt(7, 1);
//            ps.setDate(8, convertUtilDateToSqlDate(dateSalesDate.getDate()));

            ps.executeUpdate();
            ps.close();
            con.getCon().close();

            JOptionPane.showMessageDialog(rootPane, "Data Submitted");
//            updateStockSales();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Data not Submit");
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

                        
        
    }//GEN-LAST:event_btnSalesSaveMouseClicked

    private void txtSalesUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesUnitPriceFocusLost
        try {

            if (!txtSalesUnitPrice.getText().trim().isEmpty()) {
                // Your code when the text field is not empty
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unit Price cannot be empty");
                txtSalesUnitPrice.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_txtSalesUnitPriceFocusLost

    private void txtSalesQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesQuantityFocusLost
         try {
            if (txtSalesUnitPrice.getText().trim().isEmpty()) {

                txtSalesUnitPrice.requestFocus();
            } else if (!txtSalesQuantity.getText().trim().isEmpty()) {
                txtSalesTotalPrice.setText(getTotalPrice() + "");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Quantity can not be empty ");
                txtSalesQuantity.requestFocus();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
    }//GEN-LAST:event_txtSalesQuantityFocusLost

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane accessories;
    private javax.swing.JTabbedPane bill;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSalesSave;
    private javax.swing.JButton btnSalesUpdate;
    private javax.swing.JTabbedPane customer;
    private javax.swing.JTabbedPane home;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JTabbedPane purchase;
    private javax.swing.JTabbedPane report;
    private javax.swing.JTabbedPane sales;
    private javax.swing.JTabbedPane stock;
    private javax.swing.JTextField txtCashRecived;
    private javax.swing.JTextField txtSalesActualPrice;
    private javax.swing.JButton txtSalesDelete;
    private javax.swing.JTextField txtSalesDiscount;
    private javax.swing.JTextField txtSalesDueAmount;
    private javax.swing.JTextField txtSalesPid;
    private javax.swing.JComboBox<String> txtSalesProductname;
    private javax.swing.JTextField txtSalesQuantity;
    private javax.swing.JButton txtSalesReset;
    private javax.swing.JTable txtSalesTable;
    private javax.swing.JTextField txtSalesTotalPrice;
    private javax.swing.JTextField txtSalesUnitPrice;
    // End of variables declaration//GEN-END:variables
}
