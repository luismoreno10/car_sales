
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
public class CarLoansModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form CarLoansModifyDialog
     */
    private final Base_Datos BD;
    private final HashMap ht_carSold;
    private final HashMap ht_financecompanyID;
    
    
    public CarLoansModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_carSold = new HashMap<String, Integer>();
        buildCombo_CarSold(BD);
        
        ht_financecompanyID = new HashMap<String, Integer>();
        buildCombo_FinanceCompany(BD);
        mostrardatos("");
        
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
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Car Sold ID");
        modelo.addColumn("Finance Comp. ID");
        modelo.addColumn("Repayment Start");
        modelo.addColumn("Repayment End");
        modelo.addColumn("Monthly Repayment");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Car_Loans\"");
        String []datos = new String [7];
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
        jLabel2.setText("Modify Car Loans");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherdet))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                                        .addComponent(end_month))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Start_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Start_month))
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
                                            .addComponent(jLabel15))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(start_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(end_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(cancelButton))
                    .addComponent(deleteRow))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carSoldComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_carSoldComboBoxFocusLost
        
    }//GEN-LAST:event_carSoldComboBoxFocusLost

    private void Start_YearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Start_YearFocusLost
        
    }//GEN-LAST:event_Start_YearFocusLost

    private void Start_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Start_monthFocusLost
        
    }//GEN-LAST:event_Start_monthFocusLost

    private void start_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_start_dayFocusLost
        
    }//GEN-LAST:event_start_dayFocusLost

    private void end_DateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_DateFocusLost
        
    }//GEN-LAST:event_end_DateFocusLost

    private void end_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_monthFocusLost
        
    }//GEN-LAST:event_end_monthFocusLost

    private void end_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_end_dayFocusLost
        
    }//GEN-LAST:event_end_dayFocusLost

    private void monthlyrepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthlyrepFocusLost
        
    }//GEN-LAST:event_monthlyrepFocusLost

    private void otherdetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherdetFocusLost
        
    }//GEN-LAST:event_otherdetFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        Integer car_Sold_ID = (Integer) ht_carSold.get(carSoldComboBox.getSelectedItem());
        Integer financecompanyID = (Integer) ht_financecompanyID.get(financecompanyIDCombobox.getSelectedItem());
        String start_date = "'"+Start_Year.getText()+"-"+Start_month.getText()+"-"+start_day.getText()+"'";
        String end_date = "'"+end_Date.getText()+"-"+end_month.getText()+"-"+end_day.getText()+"'";
        Double payment = Double.parseDouble(monthlyrep.getText());
        String details = otherdet.getText();
        
        StringBuilder sql = new StringBuilder("UPDATE public.\"Car_Loans\"\n" +
"	SET "
                + "\"car_Sold_ID\"="+car_Sold_ID.intValue()+", "
                + "\"finance_Company_ID\"="+financecompanyID.intValue()+", "
                + "\"repayment_Start_Date\"="+start_date+", "
                + "\"repayment_End_Date\"="+end_date+", "
                + "\"monthly_Repayments\"="+payment.doubleValue()+", "
                + "\"other_Details\"="+"'"+details+"'"+"\n" +
"	WHERE \"loan_ID\" = "+ID+"");
        
   
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating ! \n" + ex.toString() );
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NumberFormat format = NumberFormat.getCurrencyInstance();
        int fila = table.getSelectedRow();
        try{
          Number payment = format.parse((table.getValueAt(fila, 5).toString()));  
          if(fila >=0){
            carSoldComboBox.setSelectedItem(table.getValueAt(fila, 1));
            financecompanyIDCombobox.setSelectedItem(table.getValueAt(fila, 2));
            Start_Year.setText("");
            Start_month.setText("");
            start_day.setText("");
            end_Date.setText("");
            end_month.setText("");
            end_day.setText("");
            monthlyrep.setText(payment.toString());
            otherdet.setText(table.getValueAt(fila, 6).toString());
        } else{
            JOptionPane.showMessageDialog(null,"No row selected");
        }
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error with currency! ");
        }
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        if(fila >=0){
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Car_Loans\"\n" +
            "	WHERE \"loan_ID\" ="+ID+"");

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
    }//GEN-LAST:event_deleteRowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Start_Year;
    private javax.swing.JTextField Start_month;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> carSoldComboBox;
    private javax.swing.JButton deleteRow;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlyrep;
    private javax.swing.JTextField otherdet;
    private javax.swing.JTextField start_day;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
