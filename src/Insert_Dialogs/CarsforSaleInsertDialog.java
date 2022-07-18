
package Insert_Dialogs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import Main.Base_Datos;


public class CarsforSaleInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarsforSaleInsertDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_manufact;
    private final HashMap ht_modelcode;
    private final HashMap ht_vehiclecat;
    
    public CarsforSaleInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_manufact = new HashMap<String, String>();
        buildCombo_manufact(BD);
        ht_modelcode = new HashMap<String, Integer>();
        buildCombo_modelcode(BD);
        ht_vehiclecat = new HashMap<String, Integer>();
        buildCombo_vehiclecat(BD);
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Car for Sale");

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

        addButton.setText("Add");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2))
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
                                .addComponent(otherDet)))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelButton)
                .addGap(22, 22, 22))
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
                    .addComponent(vehicleCatCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(askingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(milleage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void askingPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_askingPriceFocusLost
        String text = askingPrice.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Payment Amount");
        }
    }//GEN-LAST:event_askingPriceFocusLost

    private void year_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year_acqFocusLost
        String text = year_acq.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year on Date Acquired");
        }
    }//GEN-LAST:event_year_acqFocusLost

    private void month_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_month_acqFocusLost
        String text = month_acq.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Month on Date Acquired");
        }
    }//GEN-LAST:event_month_acqFocusLost

    private void day_acqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_day_acqFocusLost
        String text = day_acq.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Day on Date Acquired");
        }
    }//GEN-LAST:event_day_acqFocusLost

    private void registrationyearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registrationyearFocusLost
        String text = registrationyear.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year acquired");
        }
    }//GEN-LAST:event_registrationyearFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String ID = "DEFAULT";
        String manufact = (String) ht_manufact.get(manufactCombobox.getSelectedItem());
        Integer modelcode = (Integer) ht_modelcode.get(modelcodeCombobox.getSelectedItem());
        Integer vehicle_catcode = (Integer) ht_vehiclecat.get(vehicleCatCombobox.getSelectedItem());
        Double askingprice = Double.parseDouble(askingPrice.getText());
        Integer currentMil = Integer.parseInt(milleage.getText());
        String dateacq = "'"+year_acq.getText()+"-"+month_acq.getText()+"-"+day_acq.getText()+"'";
        Integer registration_year = Integer.parseInt(registrationyear.getText());
        String details = otherDet.getText();
        
        StringBuilder sql = new StringBuilder ("INSERT INTO public.\"Cars_for_Sale \"(\n" +
"	\"car_for_Sale_ID\", \"asking_Price\", \"current_Mileage \", \"date_Acquired\", "
                + "\"registration_Year\", \"other_Car_Details\", \"manufacturer_ShortName\", "
                + "\"model_Code\", \"vehicle_Category_Code\")\n" +
"	VALUES (");
        sql.append(ID);
        sql.append(",");
        sql.append(askingprice.doubleValue());
        sql.append(",");
        sql.append(currentMil.intValue());
        sql.append(",");
        sql.append(dateacq);
        sql.append(",");
        sql.append(registration_year.intValue());
        sql.append(",");
        sql.append("'"+details+"'");
        sql.append(",");
        sql.append("'"+manufact+"'");
        sql.append(",");
        sql.append(modelcode.intValue());
        sql.append(",");
        sql.append(vehicle_catcode.intValue());
        sql.append(")");

        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New car for sale has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new car for sale: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
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
    private javax.swing.JComboBox<String> manufactCombobox;
    private javax.swing.JTextField milleage;
    private javax.swing.JComboBox<String> modelcodeCombobox;
    private javax.swing.JTextField month_acq;
    private javax.swing.JTextField otherDet;
    private javax.swing.JTextField registrationyear;
    private javax.swing.JComboBox<String> vehicleCatCombobox;
    private javax.swing.JTextField year_acq;
    // End of variables declaration//GEN-END:variables
}
