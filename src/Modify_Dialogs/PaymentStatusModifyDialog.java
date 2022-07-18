
package Modify_Dialogs;

import Insert_Dialogs.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Base_Datos;


public class PaymentStatusModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form PaymentStatusModifyDialog
     */
    private final Base_Datos BD;
    
    public PaymentStatusModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        mostrardatos("");
    }
void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("Payment Code");
        modelo.addColumn("Description");
    
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Payment_Status\"");
        String []datos = new String [2];
        try{
            ResultSet rs = BD.query(sql_llenado.toString());
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
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
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DetailsTxt = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        RemoveRow = new javax.swing.JButton();

        jMenuItem1.setText("Modify");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Modify Payment Status");

        jLabel1.setText("Details:");

        DetailsTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DetailsTxtFocusLost(evt);
            }
        });

        addButton.setText("Update");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(table);

        RemoveRow.setText("Remove Row");
        RemoveRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetailsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RemoveRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DetailsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(CancelButton)
                    .addComponent(RemoveRow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        String details = DetailsTxt.getText();
        
        StringBuilder sql = new StringBuilder
                ("UPDATE public.\"Payment_Status\"\n" +
"	SET  \"payment_Status_Description\"="+"'"+details+"'"+"\n" +
"	WHERE \"payment_Status_Code\"= "+ID+"");
        
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating! \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void DetailsTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DetailsTxtFocusLost
        
    }//GEN-LAST:event_DetailsTxtFocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        int fila = table.getSelectedRow();
        try{
          if(fila >=0){
            DetailsTxt.setText(table.getValueAt(fila,1).toString());
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Error with currency! \n" + ex.toString());
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RemoveRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Payment_Status\"\n" +
            "	WHERE \"payment_Status_Code\" ="+ID+"");

            try {
                BD.update( sql.toString() );
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Deleting! \n" + ex.toString());
                System.out.println( ex.getMessage() );
                
            }
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        
        mostrardatos("");
    }//GEN-LAST:event_RemoveRowActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField DetailsTxt;
    private javax.swing.JButton RemoveRow;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
