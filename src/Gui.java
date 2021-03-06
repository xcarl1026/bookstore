/*Name: Carlos Diaz
Course: CNT 4714 - Fall 2017
Assignment title: Program 1 - Event-driven Programming
Date: Sunday Septembet 10, 2017 
*/
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


 
public class Gui extends javax.swing.JFrame {
  StoreLogic storeLogic;
    
    /**
     * Creates new form Gui
     */
    public Gui() throws IOException {
        this.storeLogic = new StoreLogic(Gui.this);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        integersOnly = new javax.swing.JDialog();
        dialogPanel = new javax.swing.JPanel();
        dialogLabel = new javax.swing.JLabel();
        bookIDEmptyAlert = new javax.swing.JDialog();
        bookIDEmptyPanel = new javax.swing.JPanel();
        bookIDEmptyLabel = new javax.swing.JLabel();
        jBasePane = new javax.swing.JLayeredPane();
        jAccentPane = new javax.swing.JLayeredPane();
        numItemsIn = new javax.swing.JTextField();
        bookIDIn = new javax.swing.JTextField();
        itemQuantityIn = new javax.swing.JTextField();
        itemInfoOut = new javax.swing.JTextField();
        subTotalTextField = new javax.swing.JTextField();
        numItemsLabel = new javax.swing.JLabel();
        bookIDLabel = new javax.swing.JLabel();
        itemQuantityLabel = new javax.swing.JLabel();
        itemInfoLabel = new javax.swing.JLabel();
        subTotalLabel = new javax.swing.JLabel();
        processBut = new javax.swing.JButton();
        finishOrderBut = new javax.swing.JButton();
        exitBut = new javax.swing.JButton();
        newOrderBut = new javax.swing.JButton();
        confirmBut = new javax.swing.JButton();
        viewOrderBut = new javax.swing.JButton();

        integersOnly.setMinimumSize(new java.awt.Dimension(323, 125));

        dialogPanel.setBackground(new java.awt.Color(34, 37, 44));

        dialogLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dialogLabel.setForeground(new java.awt.Color(192, 179, 160));
        dialogLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogLabel.setText("Please enter integers only");

        javax.swing.GroupLayout dialogPanelLayout = new javax.swing.GroupLayout(dialogPanel);
        dialogPanel.setLayout(dialogPanelLayout);
        dialogPanelLayout.setHorizontalGroup(
            dialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(dialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        dialogPanelLayout.setVerticalGroup(
            dialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout integersOnlyLayout = new javax.swing.GroupLayout(integersOnly.getContentPane());
        integersOnly.getContentPane().setLayout(integersOnlyLayout);
        integersOnlyLayout.setHorizontalGroup(
            integersOnlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        integersOnlyLayout.setVerticalGroup(
            integersOnlyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bookIDEmptyAlert.setMinimumSize(new java.awt.Dimension(323, 125));

        bookIDEmptyPanel.setBackground(new java.awt.Color(34, 37, 44));

        bookIDEmptyLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookIDEmptyLabel.setForeground(new java.awt.Color(192, 179, 160));
        bookIDEmptyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookIDEmptyLabel.setText("Please enter a number in the BookID field.");

        javax.swing.GroupLayout bookIDEmptyPanelLayout = new javax.swing.GroupLayout(bookIDEmptyPanel);
        bookIDEmptyPanel.setLayout(bookIDEmptyPanelLayout);
        bookIDEmptyPanelLayout.setHorizontalGroup(
            bookIDEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookIDEmptyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookIDEmptyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bookIDEmptyPanelLayout.setVerticalGroup(
            bookIDEmptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookIDEmptyPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(bookIDEmptyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout bookIDEmptyAlertLayout = new javax.swing.GroupLayout(bookIDEmptyAlert.getContentPane());
        bookIDEmptyAlert.getContentPane().setLayout(bookIDEmptyAlertLayout);
        bookIDEmptyAlertLayout.setHorizontalGroup(
            bookIDEmptyAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookIDEmptyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookIDEmptyAlertLayout.setVerticalGroup(
            bookIDEmptyAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookIDEmptyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookStore");
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(2147483647, 2147483647, 2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(698, 299));

        jBasePane.setBackground(new java.awt.Color(34, 37, 44));
        jBasePane.setOpaque(true);

        jAccentPane.setBackground(new java.awt.Color(225, 70, 88));
        jAccentPane.setOpaque(true);

        numItemsIn.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        numItemsIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numItemsInActionPerformed(evt);
            }
        });

        bookIDIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDInActionPerformed(evt);
            }
        });

        itemInfoOut.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        itemInfoOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInfoOutActionPerformed(evt);
            }
        });

        jAccentPane.setLayer(numItemsIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jAccentPane.setLayer(bookIDIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jAccentPane.setLayer(itemQuantityIn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jAccentPane.setLayer(itemInfoOut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jAccentPane.setLayer(subTotalTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jAccentPaneLayout = new javax.swing.GroupLayout(jAccentPane);
        jAccentPane.setLayout(jAccentPaneLayout);
        jAccentPaneLayout.setHorizontalGroup(
            jAccentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAccentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAccentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(itemQuantityIn)
                    .addComponent(numItemsIn)
                    .addComponent(bookIDIn)
                    .addComponent(itemInfoOut)
                    .addComponent(subTotalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jAccentPaneLayout.setVerticalGroup(
            jAccentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAccentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numItemsIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(bookIDIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemQuantityIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(itemInfoOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        numItemsLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numItemsLabel.setForeground(new java.awt.Color(192, 179, 160));
        numItemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numItemsLabel.setText("Enter Number of items in this order:");

        bookIDLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookIDLabel.setForeground(new java.awt.Color(192, 179, 160));
        bookIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bookIDLabel.setText("Enter Book ID for Item #1:");
        bookIDLabel.setToolTipText("");

        itemQuantityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemQuantityLabel.setForeground(new java.awt.Color(192, 179, 160));
        itemQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        itemQuantityLabel.setText("Enter Quantity for Item #1:");

        itemInfoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemInfoLabel.setForeground(new java.awt.Color(192, 179, 160));
        itemInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        itemInfoLabel.setText("Item #1 Info:");

        subTotalLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subTotalLabel.setForeground(new java.awt.Color(192, 179, 160));
        subTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        subTotalLabel.setText("Order Subtotal for 0 item(s):");

        processBut.setText("Process item #1");
        processBut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        processBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButActionPerformed(evt);
            }
        });

        finishOrderBut.setText("Finish Order");
        finishOrderBut.setEnabled(false);
        finishOrderBut.setMaximumSize(new java.awt.Dimension(109, 23));
        finishOrderBut.setMinimumSize(new java.awt.Dimension(109, 23));
        finishOrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishOrderButActionPerformed(evt);
            }
        });

        exitBut.setText("Exit");
        exitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButActionPerformed(evt);
            }
        });

        newOrderBut.setText("New Order");
        newOrderBut.setMaximumSize(new java.awt.Dimension(109, 23));
        newOrderBut.setMinimumSize(new java.awt.Dimension(109, 23));
        newOrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButActionPerformed(evt);
            }
        });

        confirmBut.setText("Confirm item #1");
        confirmBut.setEnabled(false);
        confirmBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButActionPerformed(evt);
            }
        });

        viewOrderBut.setText("View Order");
        viewOrderBut.setEnabled(false);
        viewOrderBut.setMaximumSize(new java.awt.Dimension(109, 23));
        viewOrderBut.setMinimumSize(new java.awt.Dimension(109, 23));
        viewOrderBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButActionPerformed(evt);
            }
        });

        jBasePane.setLayer(jAccentPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(numItemsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(bookIDLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(itemQuantityLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(itemInfoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(subTotalLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(processBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(finishOrderBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(exitBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(newOrderBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(confirmBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jBasePane.setLayer(viewOrderBut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jBasePaneLayout = new javax.swing.GroupLayout(jBasePane);
        jBasePane.setLayout(jBasePaneLayout);
        jBasePaneLayout.setHorizontalGroup(
            jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jBasePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(processBut, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewOrderBut, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finishOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(exitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jBasePaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numItemsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemQuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jBasePaneLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jAccentPane))
        );
        jBasePaneLayout.setVerticalGroup(
            jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBasePaneLayout.createSequentialGroup()
                .addGroup(jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jBasePaneLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(numItemsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemQuantityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subTotalLabel))
                    .addGroup(jBasePaneLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jAccentPane)))
                .addGap(18, 18, 18)
                .addGroup(jBasePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finishOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOrderBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processBut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBasePane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBasePane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numItemsInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numItemsInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numItemsInActionPerformed

    private void bookIDInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIDInActionPerformed

    private void itemInfoOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInfoOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemInfoOutActionPerformed

    private void newOrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButActionPerformed
        // TODO add your handling code here:
        storeLogic.newOrder();
    }//GEN-LAST:event_newOrderButActionPerformed

    private void exitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButActionPerformed

    private void confirmButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButActionPerformed
        // TODO add your handling code here:
        storeLogic.confirmOrder();
    }//GEN-LAST:event_confirmButActionPerformed

    private void processButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButActionPerformed
        
            
            storeLogic.processOrder();
           
        
        
    }//GEN-LAST:event_processButActionPerformed

    private void viewOrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButActionPerformed
        // TODO add your handling code here:
        storeLogic.viewOrder();
    }//GEN-LAST:event_viewOrderButActionPerformed

    private void finishOrderButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishOrderButActionPerformed
      try {
          // TODO add your handling code here:
          storeLogic.finishOrder();
      } catch (IOException ex) {
          Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_finishOrderButActionPerformed
    
    public JLabel getsubTotalLabel(){
        return this.subTotalLabel;
    }
    
    public JTextField getsubTotalField(){
        return this.subTotalTextField;
    }
    
     public JDialog getbookIDEmptyAlert(){
        return bookIDEmptyAlert;
    }
    
    public JDialog getintegersOnly(){
        return integersOnly;
    }
    
    public JTextField getitemQuantityIn(){
        return itemQuantityIn;
    }
    
    public JTextField getNumItemsIn(){
        return numItemsIn;
    }
    
    public JTextField getitemInfoOut(){
        return itemInfoOut;
    }
    
     public JTextField getBookIDIn(){
        return bookIDIn;
    }
    public JLabel getBookIDLabel(){
        return bookIDLabel;
    }
    
    public void setitemQuantityLabel(int num){
        this.itemQuantityLabel.setText("Enter Quantity for item #"+num+":");
    }
    
    public void setitemInfoLabel(int num){
        this.itemInfoLabel.setText("Item #"+num+" Info:");
    }
    
    public void setBookIDLabel(int num){
        this.bookIDLabel.setText("Enter Book ID for item #"+num+":");
    }
    
    public JButton getviewOrderBut(){
        return this.viewOrderBut;
    }
    public JButton getprocessBut(){
        return this.processBut;
    }
    
    public JButton getconfirmBut(){
        return this.confirmBut;
    }
    
    public JButton getfinishOrderBut(){
        return this.finishOrderBut;
    }
    
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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog bookIDEmptyAlert;
    private javax.swing.JLabel bookIDEmptyLabel;
    private javax.swing.JPanel bookIDEmptyPanel;
    private javax.swing.JTextField bookIDIn;
    private javax.swing.JLabel bookIDLabel;
    private javax.swing.JButton confirmBut;
    private javax.swing.JLabel dialogLabel;
    private javax.swing.JPanel dialogPanel;
    private javax.swing.JButton exitBut;
    private javax.swing.JButton finishOrderBut;
    private javax.swing.JDialog integersOnly;
    private javax.swing.JLabel itemInfoLabel;
    private javax.swing.JTextField itemInfoOut;
    private javax.swing.JTextField itemQuantityIn;
    private javax.swing.JLabel itemQuantityLabel;
    private javax.swing.JLayeredPane jAccentPane;
    private javax.swing.JLayeredPane jBasePane;
    private javax.swing.JButton newOrderBut;
    private javax.swing.JTextField numItemsIn;
    private javax.swing.JLabel numItemsLabel;
    private javax.swing.JButton processBut;
    private javax.swing.JLabel subTotalLabel;
    private javax.swing.JTextField subTotalTextField;
    private javax.swing.JButton viewOrderBut;
    // End of variables declaration//GEN-END:variables
}
