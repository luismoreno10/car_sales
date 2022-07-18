package Modify_Dialogs;

import Insert_Dialogs.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Base_Datos;


public class CarManufacturerModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarManufacturerModifyDialog
     */
    
    private final Base_Datos BD;
    
    public CarManufacturerModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        mostrardatos("");
    }
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("Short Name");
        modelo.addColumn("Full Name");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Car_Manufacturers\"");
        String []datos = new String [3];
        try{
            ResultSet rs = BD.query(sql_llenado.toString());
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            table.setModel(modelo);
        }catch(SQLException ex){
            Logger.getLogger(AddressesModifyDialog.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manuf_shortName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        manuf_longName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        details = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deleteRow = new javax.swing.JButton();

        jMenuItem1.setText("Modify");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Modify Car Manufacturer");

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

        addButton.setText("Update");
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

        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(table);

        deleteRow.setText("Delete Row");
        deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(manuf_shortName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancelButton)
                                    .addComponent(addButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(deleteRow)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRow)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        String manuf_short = table.getValueAt(fila, 0).toString();
        String manuf_long  = manuf_longName.getText();
        String other_det = details.getText();
        
        StringBuilder sql = new StringBuilder("UPDATE public.\"Car_Manufacturers\"\n" +
"	SET  \"manufacturer_FullName\"="+"'"+manuf_long+"'"+","
                + " \"manufacturer_OtherDetails\"="+"'"+other_det+"'"+"\n" +
"	WHERE \"manufacturer_ShortName\" = "+"'"+manuf_short.toString()+"'");
        
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Updating! \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void manuf_shortNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manuf_shortNameFocusLost
        
    }//GEN-LAST:event_manuf_shortNameFocusLost

    private void manuf_longNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_manuf_longNameFocusLost
        
    }//GEN-LAST:event_manuf_longNameFocusLost

    private void detailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = table.getSelectedRow();
        if(fila >=0){
            manuf_shortName.setText(table.getValueAt(fila,0).toString());
            manuf_longName.setText(table.getValueAt(fila,1).toString());
            details.setText(table.getValueAt(fila,2).toString());
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
        int fila = table.getSelectedRow();
        String manuf_short = table.getValueAt(fila, 0).toString();
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Car_Manufacturers\"\n" +
            "	WHERE \"manufacturer_ShortName\" ="+"'"+manuf_short.toString()+"'");

            try {
                BD.update( sql.toString() );
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Deleting!");
                System.out.println( ex.getMessage() );
            }
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        
        mostrardatos("");
    }//GEN-LAST:event_deleteRowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteRow;
    private javax.swing.JTextField details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manuf_longName;
    private javax.swing.JTextField manuf_shortName;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
