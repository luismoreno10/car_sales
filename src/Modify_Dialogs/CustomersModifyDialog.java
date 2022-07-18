/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify_Dialogs;
import Insert_Dialogs.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Base_Datos;
import Main.Base_Datos;

public class CustomersModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form CustomersModifyDialog
     */
    
    private final Base_Datos BD;
    
    public CustomersModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        mostrardatos("");
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Phone #");
        modelo.addColumn("Email");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Customers\"");
        String []datos = new String [4];
        try{
            ResultSet rs = BD.query(sql_llenado.toString());
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            table.setModel(modelo);
        } catch(SQLException ex){
            Logger.getLogger(AddressesModifyDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOtherDetails = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        DeleteRow = new javax.swing.JButton();

        jMenuItem1.setText("Modify");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Modify Customer");

        jLabel3.setText("Phone Number:");

        txtPhoneNumber.setName(""); // NOI18N
        txtPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNumberFocusLost(evt);
            }
        });

        jLabel4.setText("Email Address:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        jLabel5.setText("Other Details");

        txtOtherDetails.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOtherDetailsFocusLost(evt);
            }
        });

        okButton.setText("Update");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(table);

        DeleteRow.setText("Delete Row");
        DeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtOtherDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DeleteRow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOtherDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(DeleteRow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        Integer phone_number = Integer.parseInt(txtPhoneNumber.getText());
        String email = txtEmail.getText();
        String other_Details = txtOtherDetails.getText();
        
        StringBuilder sql
                = new StringBuilder("UPDATE public.\"Customers\"\n" +
"	SET  "
                + "\"cell_Mobile_Phone\" = "+phone_number.intValue() +", "
                + "\"email_Address\" = "+"'"+email+"'"+", "
                + "\"other_Customer_Details\" = "+"'"+other_Details+"' "+"\n" +
"	WHERE \"customer_ID\" = "+ID+"");
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating! \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        
    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtOtherDetailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOtherDetailsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherDetailsFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = table.getSelectedRow();
        try{
          if(fila >=0){
            txtPhoneNumber.setText(table.getValueAt(fila, 1).toString());
            txtEmail.setText(table.getValueAt(fila, 2).toString());
            txtOtherDetails.setText(table.getValueAt(fila, 3).toString());
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error with currency! ");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Customers\"\n" +
            "	WHERE \"customer_ID\" ="+ID+"");

            try {
                BD.update( sql.toString() );
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Deleting!\n" + ex.toString());
                System.out.println( ex.getMessage() );
                
            }
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        
        mostrardatos("");
    }//GEN-LAST:event_DeleteRowActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteRow;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtOtherDetails;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
