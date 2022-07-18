
package Modify_Dialogs;

import Insert_Dialogs.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Base_Datos;


public class CarsforSaleModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarsforSaleModifyDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_manufact;
    private final HashMap ht_modelcode;
    private final HashMap ht_vehiclecat;
    
    public CarsforSaleModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_manufact = new HashMap<String, String>();
        buildCombo_manufact(BD);
        ht_modelcode = new HashMap<String, Integer>();
        buildCombo_modelcode(BD);
        ht_vehiclecat = new HashMap<String, Integer>();
        buildCombo_vehiclecat(BD);
        mostrardatos("");
        
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Asking Price");
        modelo.addColumn("Current Mileage");
        modelo.addColumn("Acquired");
        modelo.addColumn("Registration Year");
        modelo.addColumn("Details");
        modelo.addColumn("Manuf. Short Name");
        modelo.addColumn("Model Code");
        modelo.addColumn("Vehic. Cat. Code");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Cars_for_Sale \"");
        String []datos = new String [9];
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
                modelo.addRow(datos);
            }
            table.setModel(modelo);
        } catch(SQLException ex){
            Logger.getLogger(AddressesModifyDialog.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    private void buildCombo_manufact(Base_Datos BD){
        final String sql = "select \"manufacturer_ShortName\" "
                + "FROM public.\"Car_Manufacturers\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                String  id = rs.getString(1);
                String label =rs.getString(1);
                manufactCombobox.addItem(id);
                ht_manufact.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }
    
    private void buildCombo_modelcode(Base_Datos BD){
        final String sql = "select \"model_Code\" "
                + "FROM public.\"Car_Models\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String label =rs.getString(1);
                modelcodeCombobox.addItem(label);
                ht_modelcode.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }
    
    private void buildCombo_vehiclecat(Base_Datos BD){
        final String sql = "select \"vehicle_Category_Code\" "
                + "FROM public.\"Vehicle_Categories\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String label =rs.getString(1);
                vehicleCatCombobox.addItem(label);
                ht_vehiclecat.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        manufactCombobox = new javax.swing.JComboBox<>();
        modelcodeCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vehicleCatCombobox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        askingPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        milleage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        year_acq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        month_acq = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        day_acq = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        registrationyear = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        otherDet = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        jLabel2.setText("Modify Car for Sale");

        jLabel1.setText("Manufacturer:");

        jLabel3.setText("Model Code:");

        jLabel4.setText("Vehicle Category Code: ");

        jLabel13.setText("Asking Price:");

        askingPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                askingPriceFocusLost(evt);
            }
        });

        jLabel14.setText("$");

        jLabel5.setText("Current Mileage: ");

        milleage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                milleageFocusLost(evt);
            }
        });

        jLabel6.setText("Date Acquired:");

        jLabel7.setText("Y:");

        year_acq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                year_acqFocusLost(evt);
            }
        });

        jLabel8.setText("M:");

        month_acq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                month_acqFocusLost(evt);
            }
        });

        jLabel9.setText("D:");

        day_acq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                day_acqFocusLost(evt);
            }
        });

        jLabel10.setText("Registration Year:");

        registrationyear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                registrationyearFocusLost(evt);
            }
        });

        jLabel11.setText("Other details:");

        otherDet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                otherDetFocusLost(evt);
            }
        });

        addButton.setText("Modify");
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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(modelcodeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manufactCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vehicleCatCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(askingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(milleage, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registrationyear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_acq, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month_acq, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day_acq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherDet)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(DeleteRow))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CancelButton)
                                    .addComponent(addButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel2)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(manufactCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modelcodeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vehicleCatCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteRow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(askingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(milleage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(year_acq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(month_acq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(day_acq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(registrationyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(otherDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void askingPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_askingPriceFocusLost
        
    }//GEN-LAST:event_askingPriceFocusLost

    private void year_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year_acqFocusLost
        
    }//GEN-LAST:event_year_acqFocusLost

    private void month_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_month_acqFocusLost
        
    }//GEN-LAST:event_month_acqFocusLost

    private void day_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_day_acqFocusLost
        
    }//GEN-LAST:event_day_acqFocusLost

    private void registrationyearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registrationyearFocusLost
        
    }//GEN-LAST:event_registrationyearFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        String manufact = (String) ht_manufact.get(manufactCombobox.getSelectedItem());
        Integer modelcode = (Integer) ht_modelcode.get(modelcodeCombobox.getSelectedItem());
        Integer vehicle_catcode = (Integer) ht_vehiclecat.get(vehicleCatCombobox.getSelectedItem());
        Double askingprice = Double.parseDouble(askingPrice.getText());
        Integer currentMil = Integer.parseInt(milleage.getText());
        String dateacq = "'"+year_acq.getText()+"-"+month_acq.getText()+"-"+day_acq.getText()+"'";
        Integer registration_year = Integer.parseInt(registrationyear.getText());
        String details = otherDet.getText();
        
        StringBuilder sql = new StringBuilder ("UPDATE public.\"Cars_for_Sale \"\n" +
"	SET  \"asking_Price\"="+askingprice.doubleValue()+", "
                + "\"current_Mileage \"="+currentMil.intValue()+", "
                + "\"date_Acquired\"="+dateacq+", "
                + "\"registration_Year\"="+registration_year.intValue()+", "
                + "\"other_Car_Details\"="+"'"+details+"'"+", "
                + "\"manufacturer_ShortName\"="+"'"+manufact+"'"+", "
                + "\"model_Code\"="+modelcode.intValue()+", "
                + "\"vehicle_Category_Code\"="+vehicle_catcode.intValue()+"\n" +
"	WHERE \"car_for_Sale_ID\"= "+ID+"");

        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Updating! \n"+ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void milleageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_milleageFocusLost
        String text = milleage.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Milleage");
        }
    }//GEN-LAST:event_milleageFocusLost

    private void otherDetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherDetFocusLost

    }//GEN-LAST:event_otherDetFocusLost

    private void DeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Cars_for_Sale \"\n" +
            "	WHERE \"car_for_Sale_ID\" ="+ID+"");

            try {
                BD.update( sql.toString() );
                JOptionPane.showMessageDialog(this, "Deleted!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Deleting! \n"+ex.toString());
                System.out.println( ex.getMessage() );
                
            }
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        
        mostrardatos("");
    }//GEN-LAST:event_DeleteRowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NumberFormat format = NumberFormat.getCurrencyInstance();
        int fila = table.getSelectedRow();
        try{
          Number payment = format.parse((table.getValueAt(fila, 1).toString()));  
          if(fila >=0){
            manufactCombobox.setSelectedItem(table.getValueAt(fila, 6));
            modelcodeCombobox.setSelectedItem(table.getValueAt(fila, 7));
            vehicleCatCombobox.setSelectedItem(table.getValueAt(fila, 8));
            askingPrice.setText(payment.toString());
            milleage.setText(table.getValueAt(fila,2).toString());
            year_acq.setText("");
            month_acq.setText("");
            day_acq.setText("");
            registrationyear.setText(table.getValueAt(fila,4).toString());
            otherDet.setText(table.getValueAt(fila,5).toString()); 
              
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error with currency! ");
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteRow;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField askingPrice;
    private javax.swing.JTextField day_acq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> manufactCombobox;
    private javax.swing.JTextField milleage;
    private javax.swing.JComboBox<String> modelcodeCombobox;
    private javax.swing.JTextField month_acq;
    private javax.swing.JTextField otherDet;
    private javax.swing.JTextField registrationyear;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> vehicleCatCombobox;
    private javax.swing.JTextField year_acq;
    // End of variables declaration//GEN-END:variables
}
