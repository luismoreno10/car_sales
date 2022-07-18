
package Consultas;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import Main.Base_Datos;

public class DeleteCustomer extends javax.swing.JDialog {

    /**
     * Creates new form DeleteCustomer
     */
    
    private final Base_Datos BD;
    private final HashMap ht_customerID;
    public DeleteCustomer(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_customerID = new HashMap<String,Integer>();
        buildCombo_CustomerID(BD);
    }
    private void buildCombo_CustomerID(Base_Datos BD){
            final String sql = "select \"customer_ID\" "
                    + "FROM public.\"Customers\"";
            try{
                ResultSet rs = BD.query(sql);
                while(rs.next()){
                    int id = rs.getInt(1);
                    String label =rs.getString(1);
                    customerIDComboBox.addItem(label);
                    ht_customerID.put(label, id);
                }
            }catch(SQLException ex){   
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelButton = new javax.swing.JButton();
        DeleteRow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerIDComboBox = new javax.swing.JComboBox<>();
        cancelButton1 = new javax.swing.JButton();
        DeleteRow1 = new javax.swing.JButton();

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        DeleteRow.setText("Delete Row");
        DeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRowActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Select Customer ID:");

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        DeleteRow1.setText("Delete");
        DeleteRow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteRow1)
                        .addGap(82, 82, 82)
                        .addComponent(cancelButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton1)
                    .addComponent(DeleteRow1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void DeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowActionPerformed
        
            
    }//GEN-LAST:event_DeleteRowActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void DeleteRow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRow1ActionPerformed
        int ID = Integer.parseInt(customerIDComboBox.getSelectedItem().toString());
        try{
            StringBuilder sql = new StringBuilder("DELETE FROM public.\"Customers\"\n" +
                "	WHERE \"customer_ID\" ="+ID+"");

            try {
                BD.update( sql.toString() );
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Deleting! \n" + ex.toString());
                System.out.println( ex.getMessage() );

            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        customerIDComboBox.setSelectedIndex(0);
        buildCombo_CustomerID(BD);
    }//GEN-LAST:event_DeleteRow1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteRow;
    private javax.swing.JButton DeleteRow1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JComboBox<String> customerIDComboBox;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
