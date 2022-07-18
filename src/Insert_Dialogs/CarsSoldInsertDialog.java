
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
public class CarsSoldInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarsSoldInsertDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_carforsaleID;
    private final HashMap ht_customerID;
    
    public CarsSoldInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        ht_carforsaleID = new HashMap<String,Integer>();
        buildCombo_carforsaleID(BD);
        ht_customerID = new HashMap<String,Integer>();
        buildCombo_CustomerID(BD);
    }
    
        private void buildCombo_carforsaleID(Base_Datos BD){
            final String sql = "select \"car_for_Sale_ID\" "
                    + "FROM public.\"Cars_for_Sale \"";
            try{
                ResultSet rs = BD.query(sql);
                while(rs.next()){
                    int id = rs.getInt(1);
                    String label =rs.getString(1);
                    carforsaleCombobox.addItem(label);
                    ht_carforsaleID.put(label, id);
                }
            }catch(SQLException ex){   
            }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        carforsaleCombobox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        customerIDComboBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        agreedPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Sold_Year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Sold_Month = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Sold_Day = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        actualPayment = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monthly_pay_date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        details = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Car Sold");

        jLabel1.setText("Car for Sale ID: ");

        jLabel3.setText("Customer ID:");

        customerIDComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerIDComboBoxFocusLost(evt);
            }
        });

        jLabel13.setText("Agreed Price");

        agreedPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                agreedPriceFocusLost(evt);
            }
        });

        jLabel14.setText("$");

        jLabel5.setText("Date Sold:");

        jLabel7.setText("Y:");

        Sold_Year.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Sold_YearFocusLost(evt);
            }
        });

        jLabel8.setText("M:");

        Sold_Month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Sold_MonthFocusLost(evt);
            }
        });

        jLabel9.setText("D:");

        Sold_Day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Sold_DayFocusLost(evt);
            }
        });

        jLabel15.setText("Monthly Payment:");

        actualPayment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                actualPaymentFocusLost(evt);
            }
        });

        jLabel16.setText("$");

        jLabel4.setText("Monthly Payment Date: ");

        monthly_pay_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthly_pay_dateFocusLost(evt);
            }
        });

        jLabel6.setText("Other Details:");

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
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerIDComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(agreedPrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sold_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sold_Month, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sold_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualPayment))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carforsaleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthly_pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(details)))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelButton)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(carforsaleCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(customerIDComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(agreedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(Sold_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Sold_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Sold_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(actualPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthly_pay_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(CancelButton))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerIDComboBoxFocusLost
        String text = customerIDComboBox.getSelectedItem().toString();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Customer ID");
        }
    }//GEN-LAST:event_customerIDComboBoxFocusLost

    private void agreedPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agreedPriceFocusLost
        String text = agreedPrice.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Agreed Price");
        }
    }//GEN-LAST:event_agreedPriceFocusLost

    private void Sold_YearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_YearFocusLost
        String text = Sold_Year.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year Sold");
        }
    }//GEN-LAST:event_Sold_YearFocusLost

    private void Sold_MonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_MonthFocusLost
        String text = Sold_Month.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Month Sold");
        }
    }//GEN-LAST:event_Sold_MonthFocusLost

    private void Sold_DayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_DayFocusLost
        String text = Sold_Day.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Day Sold");
        }
    }//GEN-LAST:event_Sold_DayFocusLost

    private void actualPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_actualPaymentFocusLost
        String text = actualPayment.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Payment Amount");
        }
    }//GEN-LAST:event_actualPaymentFocusLost

    private void monthly_pay_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthly_pay_dateFocusLost
       String text = monthly_pay_date.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Monthly Payment Date");
        }
    }//GEN-LAST:event_monthly_pay_dateFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String ID = "DEFAULT";
        Integer car_sale_ID = (Integer) ht_carforsaleID.get(carforsaleCombobox.getSelectedItem());
        Integer customer_ID = (Integer) ht_customerID.get(customerIDComboBox.getSelectedItem());
        Double agreedprice = Double.parseDouble(agreedPrice.getText());
        String dateSold = "'"+Sold_Year.getText()+"-"+Sold_Month.getText()+"-"+Sold_Day.getText()+"'";
        Double monthlypay = Double.parseDouble(monthly_pay_date.getText());
        Integer monthly_payment_date = Integer.parseInt(monthly_pay_date.getText());
        String det = details.getText();
        
        StringBuilder sql = new StringBuilder("INSERT INTO public.\"Cars_Sold\"(\n" +
"	\"car_Sold_ID\", \"car_for_Sale_ID\", \"customer_ID\", \"agreed_Price\", "
                + "\"date_Sold\", \"monthly_Payment_Amount\", \"monthly_Payment_Date\","
                + " \"other_Details\")\n" +
"	VALUES (");
        sql.append(ID);
        sql.append(",");
        sql.append(car_sale_ID.intValue());
        sql.append(",");
        sql.append(customer_ID.intValue());
        sql.append(",");
        sql.append(agreedprice.doubleValue());
        sql.append(",");
        sql.append(dateSold);
        sql.append(",");
        sql.append(monthlypay.doubleValue());
        sql.append(",");
        sql.append(monthly_payment_date.intValue());
        sql.append(",");
        sql.append("'"+det+"'");
        sql.append(")");
        
        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New Car Sold has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new Car Sold: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField Sold_Day;
    private javax.swing.JTextField Sold_Month;
    private javax.swing.JTextField Sold_Year;
    private javax.swing.JTextField actualPayment;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField agreedPrice;
    private javax.swing.JComboBox<String> carforsaleCombobox;
    private javax.swing.JComboBox<String> customerIDComboBox;
    private javax.swing.JTextField details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthly_pay_date;
    // End of variables declaration//GEN-END:variables
}
