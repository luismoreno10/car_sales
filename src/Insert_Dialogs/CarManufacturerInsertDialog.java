package Insert_Dialogs;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.Base_Datos;


public class CarManufacturerInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarManufacturerInsertDialog
     */
    
    private final Base_Datos BD;
    
    public CarManufacturerInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manuf_shortName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        manuf_longName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        details = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Car Manufacturer");

        jLabel1.setText("Short Name:");

        manuf_shortName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                manuf_shortNameFocusLost(evt);
            }
        });

        jLabel3.setText("Long Name: ");

        manuf_longName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                manuf_longNameFocusLost(evt);
            }
        });

        jLabel4.setText("Details:");

        details.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                detailsFocusLost(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
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
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(manuf_longName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(manuf_shortName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(manuf_shortName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manuf_longName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String manuf_short = manuf_shortName.getText();
        String manuf_long  = manuf_longName.getText();
        String other_det = details.getText();
        
        StringBuilder sql = new StringBuilder("INSERT INTO public.\"Car_Manufacturers\"(\n" +
"	\"manufacturer_ShortName\", \"manufacturer_FullName\", \"manufacturer_OtherDetails\")\n" +
"	VALUES (");
        sql.append("'"+manuf_short+"'");
        sql.append(",");
        sql.append("'"+manuf_long+"'");
        sql.append(",");
        sql.append("'"+other_det+"'");
        sql.append(")");
        
        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New Car Manufacturer has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new Car Manufacturer: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void manuf_shortNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manuf_shortNameFocusLost
        String text = manuf_shortName.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Manufacturer Short Name.");
        }
    }//GEN-LAST:event_manuf_shortNameFocusLost

    private void manuf_longNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manuf_longNameFocusLost
        String text = manuf_longName.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Manufacturer Long Name.");
        }
    }//GEN-LAST:event_manuf_longNameFocusLost

    private void detailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField manuf_longName;
    private javax.swing.JTextField manuf_shortName;
    // End of variables declaration//GEN-END:variables
}
