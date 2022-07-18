
package Insert_Dialogs;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Main.Base_Datos;


public class CarModelInstertDialog extends javax.swing.JDialog {

    /** Creates new form CarModelInstertDialog */
    
    private final Base_Datos BD;
    public CarModelInstertDialog(java.awt.Frame parent,  Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manufac_code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        modelname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Car Model");

        jLabel1.setText("Manufacturer Code: ");

        manufac_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                manufac_codeFocusLost(evt);
            }
        });

        jLabel3.setText("Model Name: ");

        modelname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                modelnameFocusLost(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modelname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manufac_code, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(manufac_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ID = "DEFAULT";
        Integer manuf_code = Integer.parseInt(manufac_code.getText());
        String name = modelname.getText();
        
        StringBuilder sql = new StringBuilder("INSERT INTO public.\"Car_Models\"(\n" +
"	\"model_Code\", manufacturer_code, \"model_Name\")\n" +
"	VALUES (");
        sql.append(ID);
        sql.append(",");
        sql.append(manuf_code.intValue());
        sql.append(",");
        sql.append("'"+name+"'");
        sql.append(")");
        
        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New Car Model has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new Car Model: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void manufac_codeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manufac_codeFocusLost
        String text = manufac_code.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Manufacturer Code");
        }
    }//GEN-LAST:event_manufac_codeFocusLost

    private void modelnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_modelnameFocusLost
        String text = modelname.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Model Name");
        }
    }//GEN-LAST:event_modelnameFocusLost

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField manufac_code;
    private javax.swing.JTextField modelname;
    // End of variables declaration//GEN-END:variables

}
