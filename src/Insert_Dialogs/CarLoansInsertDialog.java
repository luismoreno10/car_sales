
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
public class CarLoansInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarLoansInsertDialog
     */
    private final Base_Datos BD;
    private final HashMap ht_carSold;
    private final HashMap ht_financecompanyID;
    
    
    public CarLoansInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_carSold = new HashMap<String, Integer>();
        buildCombo_CarSold(BD);
        
        ht_financecompanyID = new HashMap<String, Integer>();
        buildCombo_FinanceCompany(BD);
        
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
    
    private void buildCombo_FinanceCompany(Base_Datos BD){
        final String sql = "select \"finance_Company_ID\" "
                + "FROM public.\"Finance_Companies\"";
        try{
            ResultSet rs = BD.query(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String label =rs.getString(1);
                financecompanyIDCombobox.addItem(label);
                ht_financecompanyID.put(label, id);
            }
        }catch(SQLException ex){   
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carSoldComboBox = new javax.swing.JComboBox<>();
        financecompanyIDCombobox = new javax.swing.JComboBox<>();
        Start_Year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Start_month = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        start_day = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        end_Date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        end_month = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        end_day = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        monthlyrep = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        otherdet = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Insert New Car Loan");

        jLabel1.setText("Car Sold ID:");

        jLabel3.setText("Finance Company ID:");

        jLabel4.setText("Payment Start Date:");

        jLabel5.setText("Policy End Date:");

        jLabel6.setText("Monthly Repayment:");

        jLabel7.setText("Other Details:");

        carSoldComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                carSoldComboBoxFocusLost(evt);
            }
        });

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

        end_Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                end_DateFocusLost(evt);
            }
        });

        jLabel11.setText("M:");

        end_month.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                end_monthFocusLost(evt);
            }
        });

        jLabel12.setText("D:");

        end_day.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                end_dayFocusLost(evt);
            }
        });

        jLabel13.setText("Y:");

        monthlyrep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthlyrepFocusLost(evt);
            }
        });

        jLabel15.setText("$");

        otherdet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                otherdetFocusLost(evt);
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
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Start_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Start_month, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(start_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(financecompanyIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carSoldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(monthlyrep, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(end_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(end_month)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(end_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherdet)))))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(carSoldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(financecompanyIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(end_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(end_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(end_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(monthlyrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap())
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

    private void end_DateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_DateFocusLost
        String text = end_Date.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Year on End Date");
        }
    }//GEN-LAST:event_end_DateFocusLost

    private void end_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_monthFocusLost
        String text = end_month.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Month on End Date");
        }
    }//GEN-LAST:event_end_monthFocusLost

    private void end_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_dayFocusLost
        String text = end_day.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Day on End Date");
        }
    }//GEN-LAST:event_end_dayFocusLost

    private void monthlyrepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthlyrepFocusLost
        String text = monthlyrep.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Monthly Repayment");
        }
    }//GEN-LAST:event_monthlyrepFocusLost

    private void otherdetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherdetFocusLost
        
    }//GEN-LAST:event_otherdetFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String ID = "DEFAULT";
        Integer car_Sold_ID = (Integer) ht_carSold.get(carSoldComboBox.getSelectedItem());
        Integer financecompanyID = (Integer) ht_financecompanyID.get(financecompanyIDCombobox.getSelectedItem());
        String start_date = "'"+Start_Year.getText()+"-"+Start_month.getText()+"-"+start_day.getText()+"'";
        String end_date = "'"+end_Date.getText()+"-"+end_month.getText()+"-"+end_day.getText()+"'";
        Double payment = Double.parseDouble(monthlyrep.getText());
        String details = otherdet.getText();
        
        StringBuilder sql = new StringBuilder("INSERT INTO public.\"Car_Loans\"(\n" +
"	\"loan_ID\", \"car_Sold_ID\", \"finance_Company_ID\", \"repayment_Start_Date\","
                + " \"repayment_End_Date\", \"monthly_Repayments\", \"other_Details\")\n" +
"	VALUES (");
        sql.append(ID);
        sql.append(",");
        sql.append(car_Sold_ID.intValue());
        sql.append(",");
        sql.append(financecompanyID.intValue());
        sql.append(",");
        sql.append(start_date);
        sql.append(",");
        sql.append(end_date);
        sql.append(",");
        sql.append(payment.doubleValue());
        sql.append(",");
        sql.append("'"+details+"'");
        sql.append(")");
        
        System.out.println(sql.toString());
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New Car Loan has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new Car Loan: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Start_Year;
    private javax.swing.JTextField Start_month;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> carSoldComboBox;
    private javax.swing.JTextField end_Date;
    private javax.swing.JTextField end_day;
    private javax.swing.JTextField end_month;
    private javax.swing.JComboBox<String> financecompanyIDCombobox;
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
    private javax.swing.JTextField monthlyrep;
    private javax.swing.JTextField otherdet;
    private javax.swing.JTextField start_day;
    // End of variables declaration//GEN-END:variables
}
