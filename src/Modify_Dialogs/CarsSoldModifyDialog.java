
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

/**
 *
 * @author luism
 */
public class CarsSoldModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarsSoldModifyDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_carforsaleID;
    private final HashMap ht_customerID;
    
    public CarsSoldModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        ht_carforsaleID = new HashMap<String,Integer>();
        buildCombo_carforsaleID(BD);
        ht_customerID = new HashMap<String,Integer>();
        buildCombo_CustomerID(BD);
        mostrardatos("");
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
        
        void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Car for Sale ID");
        modelo.addColumn("Customer ID");
        modelo.addColumn("Agreed Price");
        modelo.addColumn("Date Sold");
        modelo.addColumn("Monthly payment");
        modelo.addColumn("Monthly Date");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Cars_Sold\"");
        String []datos = new String [8];
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        DeleteRow = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Modify Car Sold");

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
                        .addComponent(Sold_Month, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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
                        .addComponent(details)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DeleteRow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelButton)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
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
                    .addComponent(CancelButton)
                    .addComponent(DeleteRow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerIDComboBoxFocusLost
        
    }//GEN-LAST:event_customerIDComboBoxFocusLost

    private void agreedPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_agreedPriceFocusLost
        
    }//GEN-LAST:event_agreedPriceFocusLost

    private void Sold_YearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_YearFocusLost
        
    }//GEN-LAST:event_Sold_YearFocusLost

    private void Sold_MonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_MonthFocusLost
        
    }//GEN-LAST:event_Sold_MonthFocusLost

    private void Sold_DayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Sold_DayFocusLost
        
    }//GEN-LAST:event_Sold_DayFocusLost

    private void actualPaymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_actualPaymentFocusLost
        
    }//GEN-LAST:event_actualPaymentFocusLost

    private void monthly_pay_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthly_pay_dateFocusLost
       
    }//GEN-LAST:event_monthly_pay_dateFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        Integer car_sale_ID = (Integer) ht_carforsaleID.get(carforsaleCombobox.getSelectedItem());
        Integer customer_ID = (Integer) ht_customerID.get(customerIDComboBox.getSelectedItem());
        Double agreedprice = Double.parseDouble(agreedPrice.getText());
        String dateSold = "'"+Sold_Year.getText()+"-"+Sold_Month.getText()+"-"+Sold_Day.getText()+"'";
        Double monthlypay = Double.parseDouble(monthly_pay_date.getText());
        Integer monthly_payment_date = Integer.parseInt(monthly_pay_date.getText());
        String det = details.getText();
        
        StringBuilder sql = new StringBuilder("UPDATE public.\"Cars_Sold\"\n" +
"	SET  \"car_for_Sale_ID\"="+car_sale_ID.intValue()+", "
                + "\"customer_ID\"="+customer_ID.intValue()+", "
                + "\"agreed_Price\"="+agreedprice.doubleValue()+", "
                + "\"date_Sold\"="+dateSold+", "
                + "\"monthly_Payment_Amount\"="+monthlypay.doubleValue()+", "
                + "\"monthly_Payment_Date\"="+monthly_payment_date.intValue()+", "
                + "\"other_Details\"="+"'"+det+"'"+"\n" +
"	WHERE \"car_Sold_ID\" = "+ID+"");
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Updating! \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NumberFormat format = NumberFormat.getCurrencyInstance();
        int fila = table.getSelectedRow();
        try{
          Number payment1 = format.parse((table.getValueAt(fila, 5).toString()));
          Number payment2 = format.parse((table.getValueAt(fila, 3).toString()));  
          if(fila >=0){
            carforsaleCombobox.setSelectedItem(table.getValueAt(fila, 1));
            customerIDComboBox.setSelectedItem(table.getValueAt(fila, 2));
            agreedPrice.setText(payment2.toString());
            Sold_Year.setText("");
            Sold_Month.setText("");
            Sold_Day.setText("");
            actualPayment.setText(payment1.toString());
            monthly_pay_date.setText(table.getValueAt(fila,6).toString());
            details.setText(table.getValueAt(fila, 7).toString());
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error with currency! ");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DeleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Cars_Sold\"\n" +
            "	WHERE \"car_Sold_ID\" ="+ID+"");

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
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteRow;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthly_pay_date;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
