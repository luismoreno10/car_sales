/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insert_Dialogs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.Base_Datos;
import Main.Base_Datos;

public class CustomersInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form CustomersInsertDialog
     */
    
    private final Base_Datos BD;
    
    public CustomersInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOtherDetails = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Customer");

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

        okButton.setText("Add");
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
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
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
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
    
        String ID_registro = "DEFAULT";
        Integer phone_number = Integer.parseInt(txtPhoneNumber.getText());
        String email = txtEmail.getText();
        String other_Details = txtOtherDetails.getText();
        
        StringBuilder sql
                = new StringBuilder("INSERT INTO public.\"Customers\" (\"customer_ID\", \"cell_Mobile_Phone\", \"email_Address\", "
                        + "\"other_Customer_Details\") VALUES (");
        sql.append(ID_registro);
        //sql.append("\',");
        sql.append(",");
        sql.append(phone_number.intValue() );
        sql.append(",");
        sql.append("'"+email+"'");
        sql.append(",");
        sql.append("'"+other_Details+"'");
        sql.append(")");
        System.out.println( sql.toString() );

        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Customer has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new customer: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        String text = txtPhoneNumber.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing phone number");
        }
    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        String text = txtEmail.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing email");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtOtherDetailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOtherDetailsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtherDetailsFocusLost

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtOtherDetails;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
