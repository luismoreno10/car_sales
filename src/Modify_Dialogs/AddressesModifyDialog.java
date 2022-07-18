
package Modify_Dialogs;

import Insert_Dialogs.*;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Main.Base_Datos;


public class AddressesModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddressesModifyDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_customerID;
    
    public AddressesModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_customerID = new HashMap<String,Integer>();
        buildCombo_CustomerID(BD);
        mostrardatos("");
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
    
    void mostrardatos (String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Customer_ID");
        modelo.addColumn("Line 1");
        modelo.addColumn("Line 2");
        modelo.addColumn("Line 3");
        modelo.addColumn("Line 4");
        modelo.addColumn("Town");
        modelo.addColumn("State");
        modelo.addColumn("Country");
        modelo.addColumn("ZipCode");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Addresses\"");
        String []datos = new String [11];
        try{
            ResultSet rs = BD.query(sql_llenado.toString());
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
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
        jLabel3 = new javax.swing.JLabel();
        customerIDComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        address_line1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        address_line2 = new javax.swing.JTextField();
        address_line3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        address_line4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        town = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        zipcode = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        other_details = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        DeleteRow = new javax.swing.JButton();

        jMenuItem1.setText("Modify");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Address");

        jLabel3.setText("Customer ID:");

        jLabel1.setText("Address");

        jLabel4.setText("Line 1:");

        address_line1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                address_line1FocusLost(evt);
            }
        });

        jLabel5.setText("Line 2:");

        jLabel6.setText("Line 3:");

        jLabel7.setText("Line 4:");

        jLabel8.setText("Town/City: ");

        town.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                townFocusLost(evt);
            }
        });

        jLabel9.setText("State/County/Province: ");

        state.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateFocusLost(evt);
            }
        });

        jLabel10.setText("Country:");

        country.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryFocusLost(evt);
            }
        });

        jLabel11.setText("Zip Code:");

        zipcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipcodeFocusLost(evt);
            }
        });

        jLabel12.setText("Other Address Details:");

        AddButton.setText("Update");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(table);

        DeleteRow.setText("Delete row");
        DeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(country))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(town))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address_line2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address_line1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address_line3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address_line4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(state))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(other_details)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(address_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(address_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(address_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(address_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(town, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(other_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(CancelButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteRow)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        Integer customer_ID = (Integer) ht_customerID.get(customerIDComboBox.getSelectedItem());
        String line1 = address_line1.getText();
        String line2 = address_line2.getText();
        String line3 = address_line3.getText();
        String line4 = address_line4.getText();
        String town_city = town.getText();
        String state_c = state.getText();
        String Country = country.getText();
        Integer post_zip = Integer.parseInt(zipcode.getText());
        String otherdet = other_details.getText();
        
        StringBuilder sql = new StringBuilder("UPDATE public.\"Addresses\"\n" +
"	SET \"customer_ID\"="+customer_ID.intValue()+", "
                + "\"address_Line_1\"="+"'"+line1+"'"+", "
                + "\"address_Line_2\"="+"'"+line2+"'"+", "
                + "\"address_Line_3\"="+"'"+line3+"'"+", "
                + "\"address_Line_4\"="+"'"+line4+"'"+", "
                + "\"town_city\"="+"'"+town_city+"'"+", "
                + "\"state_County_Province\"="+"'"+state_c+"'"+", "
                + "\"Country\"="+"'"+Country+"'"+", "
                + "\"post_Zip_Code\"="+post_zip.intValue()+", "
                + "\"other_Address_Details\"="+"'"+otherdet+"'"+" WHERE \"address_ID\" = "+ID+""
                + "");
        
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating! \n"+ ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void townFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_townFocusLost
        
    }//GEN-LAST:event_townFocusLost

    private void stateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusLost
        
    }//GEN-LAST:event_stateFocusLost

    private void countryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryFocusLost
        
    }//GEN-LAST:event_countryFocusLost

    private void zipcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipcodeFocusLost
        
    }//GEN-LAST:event_zipcodeFocusLost

    private void address_line1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_line1FocusLost
        
    }//GEN-LAST:event_address_line1FocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = table.getSelectedRow();
        if(fila >=0){
            customerIDComboBox.setSelectedItem(table.getValueAt(fila,1));
            address_line1.setText(table.getValueAt(fila,2).toString());
            address_line2.setText(table.getValueAt(fila,3).toString());
            address_line3.setText(table.getValueAt(fila,4).toString());
            address_line4.setText(table.getValueAt(fila,5).toString());
            town.setText(table.getValueAt(fila,6).toString());
            state.setText(table.getValueAt(fila,7).toString());
            country.setText(table.getValueAt(fila,8).toString());
            zipcode.setText(table.getValueAt(fila,9).toString());
            other_details.setText(table.getValueAt(fila,10).toString());
            
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Addresses\"\n" +
            "	WHERE \"address_ID\" ="+ID+"");

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
    }//GEN-LAST:event_DeleteRowActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteRow;
    private javax.swing.JTextField address_line1;
    private javax.swing.JTextField address_line2;
    private javax.swing.JTextField address_line3;
    private javax.swing.JTextField address_line4;
    private javax.swing.JTextField country;
    private javax.swing.JComboBox<String> customerIDComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField other_details;
    private javax.swing.JTextField state;
    private javax.swing.JTable table;
    private javax.swing.JTextField town;
    private javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables
}
