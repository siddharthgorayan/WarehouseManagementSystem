import java.sql.*;
import javax.swing.*;
public class transactionInSM extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet result;
    public transactionInSM() {
        initComponents();
        Connect();
    }

    public void Connect()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/WarehouseManagement", "root", "warehouse");
            stmt = con.createStatement();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        checkBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costTF = new javax.swing.JTextField();
        searchTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stockTF = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        catTF = new javax.swing.JTextField();
        backBT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalCostTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pNameTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        IDTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pCostTF = new javax.swing.JTextField();
        proceedBT = new javax.swing.JButton();
        calBT = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sNameTF = new javax.swing.JTextField();
        unitsTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        supplierIDTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clearBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Product ID");

        checkBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        checkBT.setForeground(new java.awt.Color(0, 0, 153));
        checkBT.setText("Check");
        checkBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Check Availability");

        nameTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel5.setText("Cost/Unit");

        costTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        searchTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        searchTF.setForeground(new java.awt.Color(0, 0, 153));

        jLabel6.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel6.setText("Product Name");

        jLabel7.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel7.setText("Stock Available");

        stockTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        message.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        message.setForeground(new java.awt.Color(51, 153, 0));

        jLabel10.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel10.setText("Category");

        catTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(catTF)
                                    .addComponent(stockTF)
                                    .addComponent(costTF)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(checkBT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBT)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(catTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backBT.setText("Back");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Transaction");

        jLabel8.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Product ID");

        totalCostTF.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        totalCostTF.setForeground(new java.awt.Color(0, 102, 0));

        jLabel9.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Units");

        pNameTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel11.setText("Product Name");

        IDTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        IDTF.setForeground(new java.awt.Color(0, 102, 102));
        IDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTFActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel12.setText("Supplier Name");

        pCostTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        proceedBT.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        proceedBT.setForeground(new java.awt.Color(0, 102, 51));
        proceedBT.setText("Proceed");
        proceedBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBTActionPerformed(evt);
            }
        });
        proceedBT.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                proceedBTPropertyChange(evt);
            }
        });

        calBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        calBT.setForeground(new java.awt.Color(0, 102, 102));
        calBT.setText("Calculate Cost");
        calBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calBTActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel13.setText("Cost/Unit");

        jLabel14.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Total Cost");

        sNameTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N

        unitsTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        unitsTF.setForeground(new java.awt.Color(0, 102, 102));

        jLabel15.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Supplier ID");

        supplierIDTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        supplierIDTF.setForeground(new java.awt.Color(0, 102, 102));
        supplierIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierIDTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(calBT)
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(sNameTF)
                                    .addComponent(pCostTF)
                                    .addComponent(totalCostTF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(supplierIDTF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(IDTF)
                                    .addComponent(unitsTF))))))
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(proceedBT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(supplierIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pCostTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCostTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceedBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        jLabel1.setText("Transaction IN");

        clearBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        clearBT.setForeground(new java.awt.Color(255, 51, 51));
        clearBT.setText("Clear All");
        clearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(clearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBT, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(clearBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTActionPerformed
        // TODO add your handling code here:
        String id = searchTF.getText();
        try
        {
            String data = "SELECT * FROM Products WHERE productID = "+id+"";
            result = stmt.executeQuery(data);

            if(result.next())
            {
                nameTF.setText(result.getString("productName"));
                catTF.setText(result.getString("Category"));
                costTF.setText(result.getString("Cost"));
                stockTF.setText(result.getString("Stock"));
                if(Integer.parseInt(result.getString("Stock"))> 0)
                {
                    message.setText("Stock Available. You can add more units if needed.");
                }
                else
                {
                    message.setText("Stock empty. Recommended to add some units.");
                }
            }
            else
            {
                //JOptionPane.showMessageDialog(this, "Product not Found.");
                message.setText("Product not found. Try with different Product ID.");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_checkBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        dispose();
        TransactionPageSM objBack = new TransactionPageSM();
        objBack.setSize(900, 600);
        objBack.setVisible(true);
    }//GEN-LAST:event_backBTActionPerformed

    private void IDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTFActionPerformed

    private void proceedBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBTActionPerformed
        // TODO add your handling code here:

        String id = IDTF.getText();
        int costPerUnit;
        int units = Integer.parseInt(unitsTF.getText());
        int totalCost;
        int remainingStock = 0;

        String pID = IDTF.getText();
        String sID = supplierIDTF.getText();
        String pName = pNameTF.getText();
        String sName = sNameTF.getText();
        String UNITS = unitsTF.getText();
        String cost = pCostTF.getText();
        String tCost = totalCostTF.getText();

        try
        {
            String data = "SELECT * FROM Products WHERE productID = "+id+"";
            result = stmt.executeQuery(data);
            if(result.next())
            {
                costPerUnit = Integer.parseInt(result.getString("Cost"));
                totalCost = units * costPerUnit;
                remainingStock = Integer.parseInt(result.getString("Stock")) + units;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        try
        {
            String data = "UPDATE Products SET Stock= "+Integer.toString(remainingStock)+" WHERE ProductID = "+IDTF.getText()+"";
            stmt.executeUpdate(data);
            JOptionPane.showMessageDialog(this, "Transaction Successful.");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        try
        {

            String data = "INSERT INTO transactionIN(productID, productName, cost, units, supplierID, supplierName, totalCost) VALUES("+pID+",'"+pName+"', "+cost+","+UNITS+", "+sID+", '"+sName+"', "+tCost+")";
            stmt.executeUpdate(data);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        nameTF.setText("");
        catTF.setText("");
        costTF.setText("");
        stockTF.setText("");
        searchTF.setText("");
        IDTF.setText("");
        pNameTF.setText("");
        sNameTF.setText("");
        pCostTF.setText("");
        totalCostTF.setText("");
        stockTF.setText("");
        unitsTF.setText("");
        message.setText("");
        supplierIDTF.setText("");
    }//GEN-LAST:event_proceedBTActionPerformed

    private void proceedBTPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_proceedBTPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_proceedBTPropertyChange

    private void calBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calBTActionPerformed
        // TODO add your handling code here:
        proceedBT.setEnabled(true);
        String id = IDTF.getText();
        String sID = supplierIDTF.getText();
        String units = unitsTF.getText();
        try
        {
            String data = "SELECT * FROM Products WHERE productID = "+id+"";
            result = stmt.executeQuery(data);

            if(result.next())
            {
                pNameTF.setText(result.getString("productName"));
                pCostTF.setText(result.getString("Cost"));

                totalCostTF.setText(Integer.parseInt(units) * Integer.parseInt(result.getString("Cost")) + "");

            }
            else
            {
                //JOptionPane.showMessageDialog(this, "Product not Found.");
                JOptionPane.showMessageDialog(this, "Invalid Product ID. Try with different Product ID.");
                proceedBT.setEnabled(false);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        try
        {
            String data = "SELECT * FROM Suppliers WHERE supplierID = "+sID+"";
            result = stmt.executeQuery(data);

            if(result.next())
            {
                sNameTF.setText(result.getString("supplierName"));
            }
            else
            {
                //JOptionPane.showMessageDialog(this, "Product not Found.");
                JOptionPane.showMessageDialog(this, "Invalid Supplier ID. Try with different Supplier ID.");
                proceedBT.setEnabled(false);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_calBTActionPerformed

    private void supplierIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierIDTFActionPerformed

    private void clearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");
        catTF.setText("");
        costTF.setText("");
        stockTF.setText("");
        searchTF.setText("");
        IDTF.setText("");
        pNameTF.setText("");
        sNameTF.setText("");
        pCostTF.setText("");
        totalCostTF.setText("");
        stockTF.setText("");
        unitsTF.setText("");
        message.setText("");
        supplierIDTF.setText("");
    }//GEN-LAST:event_clearBTActionPerformed

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
            java.util.logging.Logger.getLogger(transactionInSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactionInSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactionInSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactionInSM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactionInSM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTF;
    private javax.swing.JButton backBT;
    private javax.swing.JButton calBT;
    private javax.swing.JTextField catTF;
    private javax.swing.JButton checkBT;
    private javax.swing.JButton clearBT;
    private javax.swing.JTextField costTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel message;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField pCostTF;
    private javax.swing.JTextField pNameTF;
    private javax.swing.JButton proceedBT;
    private javax.swing.JTextField sNameTF;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField stockTF;
    private javax.swing.JTextField supplierIDTF;
    private javax.swing.JTextField totalCostTF;
    private javax.swing.JTextField unitsTF;
    // End of variables declaration//GEN-END:variables
}
