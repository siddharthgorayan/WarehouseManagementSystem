import java.sql.*;
import javax.swing.*;
public class updateProductsWM extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet result;
    public updateProductsWM() {
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

        nameTF = new javax.swing.JTextField();
        catTF = new javax.swing.JTextField();
        unitTF = new javax.swing.JTextField();
        updateBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        costTF = new javax.swing.JTextField();
        clearBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stockTF = new javax.swing.JTextField();
        backBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchBT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nameTF.setForeground(new java.awt.Color(102, 51, 0));

        catTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        catTF.setForeground(new java.awt.Color(102, 51, 0));

        unitTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        unitTF.setForeground(new java.awt.Color(102, 51, 0));

        updateBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        updateBT.setForeground(new java.awt.Color(51, 102, 0));
        updateBT.setText("Update");
        updateBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Update Product");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Category");

        costTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        costTF.setForeground(new java.awt.Color(102, 51, 0));

        clearBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        clearBT.setForeground(new java.awt.Color(255, 0, 0));
        clearBT.setText("Clear All");
        clearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Enter Product ID");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("Unit");

        stockTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        stockTF.setForeground(new java.awt.Color(102, 51, 0));

        backBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backBT.setForeground(new java.awt.Color(153, 153, 0));
        backBT.setText("Back");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Name");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 0));
        jLabel6.setText("Cost/Unit");

        searchBT.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        searchBT.setForeground(new java.awt.Color(0, 102, 102));
        searchBT.setText("Search");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 0));
        jLabel7.setText("Stock");

        searchTF.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        searchTF.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(searchBT, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(clearBT)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(updateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBT, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(catTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(unitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(stockTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(costTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(updateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBT)
                    .addComponent(backBT))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTActionPerformed
        // TODO add your handling code here:
        String name = nameTF.getText();
        String category = catTF.getText();
        String cost = costTF.getText();
        String stock = stockTF.getText();
        String unit = unitTF.getText();
        try
        {
            String data = "UPDATE Products SET productName= '"+name+"', Category= '"+category+"', Unit= '"+unit+"', Cost= '"+cost+"', Stock= '"+stock+"' WHERE ProductID = "+searchTF.getText()+"";
            stmt.executeUpdate(data);
            JOptionPane.showMessageDialog(this, "Product has been Updated Sucessfully. ");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_updateBTActionPerformed

    private void clearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTActionPerformed
        // TODO add your handling code here:
        searchTF.setText("");
        nameTF.setText("");
        catTF.setText("");
        costTF.setText("");
        stockTF.setText("");
        unitTF.setText("");
    }//GEN-LAST:event_clearBTActionPerformed

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        dispose();
        ProductsPageWM objBack = new ProductsPageWM();
        objBack.setSize(875, 380);
        objBack.setVisible(true);
    }//GEN-LAST:event_backBTActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
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
                unitTF.setText(result.getString("Unit"));
                stockTF.setText(result.getString("Stock"));
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Product not Found.");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_searchBTActionPerformed

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
            java.util.logging.Logger.getLogger(updateProductsWM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProductsWM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProductsWM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProductsWM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProductsWM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JTextField catTF;
    private javax.swing.JButton clearBT;
    private javax.swing.JTextField costTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton searchBT;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTextField stockTF;
    private javax.swing.JTextField unitTF;
    private javax.swing.JButton updateBT;
    // End of variables declaration//GEN-END:variables
}
