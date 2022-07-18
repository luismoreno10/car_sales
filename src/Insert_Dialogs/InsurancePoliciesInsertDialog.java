
package Insert_Dialogs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import Main.Base_Datos;

/**
 *
 * @author luism
 */
public class InsurancePoliciesInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form InsurancePoliciesInsertDialog
     */
    private final Base_Datos BD;
    private final HashMap ht_carSold;
    private final HashMap ht_insurancecompanyID;
    
    public InsurancePoliciesInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_carSold = new HashMap<String, Integer>();
        buildCombo_CarSold(BD);
        
        ht_insurancecompanyID = new HashMap<String, Integer>();
        buildCombo_InsuranceCompany(BD);
    }
    
    private void buildCombo_CarSold(Base_Datos BD){
        final String sql = "select \"car_Sold_ID\" "
                + "FROM public.\"Cars_Sold\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String label =rs.getString(1);
                carSoldComboBox.addItem(label);
                ht_carSold.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }
    
    private void buildCombo_InsuranceCompany(Base_Datos BD){
        final String sql = "select \"Insurance_Company_ID\" "
                + "FROM public.\"Insurance_Companies\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String label =rs.getString(1);
                insurancecompanyIDCombobox.addItem(label);
                ht_insurancecompanyID.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        carSoldComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Start_Year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Start_month = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        start_day = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        renewal_year = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        renewal_month = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        renewal_day = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        monthlypay = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        otherdet = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        insurancecompanyIDCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Insurance Policy");

        carSoldComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                carSoldComboBoxFocusLost(evt);
            }
        });

        jLabel1.setText("Car Sold ID:");

        jLabel3.setText("Insurance Company ID:");

        Start_Year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Start_YearFocusLost(evt);
            }
        });

        jLabel8.setText("M:");

        Start_month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Start_monthFocusLost(evt);
            }
        });

        jLabel9.setText("D:");

        start_day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                start_dayFocusLost(evt);
            }
        });

        jLabel10.setText("Y:");

        jLabel4.setText("Policy Start Date:");

        renewal_year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                renewal_yearFocusLost(evt);
            }
        });

        jLabel11.setText("M:");

        renewal_month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                renewal_monthFocusLost(evt);
            }
        });
        renewal_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewal_monthActionPerformed(evt);
            }
        });

        jLabel12.setText("D:");

        renewal_day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                renewal_dayFocusLost(evt);
            }
        });

        jLabel13.setText("Y:");

        jLabel5.setText("Policy Renewal Date:");

        monthlypay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthlypayFocusLost(evt);
            }
        });

        jLabel15.setText("$");

        jLabel6.setText("Monthly Payment:");

        otherdet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                otherdetFocusLost(evt);
            }
        });

        jLabel7.setText("Other Details:");

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Start_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(Start_month, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insurancecompanyIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carSoldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CancelButton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(renewal_year, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(renewal_month, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(renewal_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(carSoldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insurancecompanyIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(Start_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Start_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(start_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(renewal_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(renewal_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(renewal_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(CancelButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carSoldComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carSoldComboBoxFocusLost
        String text = carSoldComboBox.getSelectedItem().toString();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Car Sold ID");
        }
    }//GEN-LAST:event_carSoldComboBoxFocusLost

    private void Start_YearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Start_YearFocusLost
        String text = Start_Year.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year on Start Date");
        }
    }//GEN-LAST:event_Start_YearFocusLost

    private void Start_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Start_monthFocusLost
        String text = Start_month.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Month on Start Date");
        }
    }//GEN-LAST:event_Start_monthFocusLost

    private void start_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_start_dayFocusLost
        String text = start_day.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Day on Start Date");
        }
    }//GEN-LAST:event_start_dayFocusLost

    private void renewal_yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_yearFocusLost
        String text = renewal_year.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year on End Date");
        }
    }//GEN-LAST:event_renewal_yearFocusLost

    private void renewal_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_monthFocusLost
        String text = renewal_month.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Month on End Date");
        }
    }//GEN-LAST:event_renewal_monthFocusLost

    private void renewal_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_dayFocusLost
        String text = renewal_day.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Day on End Date");
        }
    }//GEN-LAST:event_renewal_dayFocusLost

    private void monthlypayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthlypayFocusLost
        String text = monthlypay.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Monthly Repayment");
        }
    }//GEN-LAST:event_monthlypayFocusLost

    private void otherdetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherdetFocusLost

    }//GEN-LAST:event_otherdetFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String ID = "DEFAULT";
        Integer car_Sold_ID = (Integer) ht_carSold.get(carSoldComboBox.getSelectedItem());
        Integer insurance_ID = (Integer) ht_insurancecompanyID.get(insurancecompanyIDCombobox.getSelectedItem());
        String start_date = "'"+Start_Year.getText()+"-"+Start_month.getText()+"-"+start_day.getText()+"'";
        String renewal_date = "'"+renewal_year.getText()+"-"+renewal_month.getText()+"-"+renewal_day.getText()+"'";
        Double payment = Double.parseDouble(monthlypay.getText());
        String details = otherdet.getText();
        
        StringBuilder sql = new StringBuilder("INSERT INTO public.\"Insurance_Policies\"(\n" +
"	\"policy_ID\", \"car_Sold_ID\", \"insurance_Company_ID\", "
                + "\"policy_Start_date\", \"policy_Renewal_Date\","
                + " \"monthly_Payments\", \"other_Details\")\n" +
"	VALUES (");
        sql.append(ID);
        sql.append(",");
        sql.append(car_Sold_ID.intValue());
        sql.append(",");
        sql.append(insurance_ID.intValue());
        sql.append(",");
        sql.append(start_date);
        sql.append(",");
        sql.append(renewal_date);
        sql.append(",");
        sql.append(payment.doubleValue());
        sql.append(",");
        sql.append("'"+details+"'");
        sql.append(")");
        
        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New Insurance Policy has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new Insurance Policy: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void renewal_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewal_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renewal_monthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField Start_Year;
    private javax.swing.JTextField Start_month;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> carSoldComboBox;
    private javax.swing.JComboBox<String> insurancecompanyIDCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthlypay;
    private javax.swing.JTextField otherdet;
    private javax.swing.JTextField renewal_day;
    private javax.swing.JTextField renewal_month;
    private javax.swing.JTextField renewal_year;
    private javax.swing.JTextField start_day;
    // End of variables declaration//GEN-END:variables
}
