
package Modify_Dialogs;

import Insert_Dialogs.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Main.Base_Datos;
import java.text.NumberFormat;

/**
 *
 * @author luism
 */
public class InsurancePoliciesModifyDialog extends javax.swing.JDialog {

    /**
     * Creates new form InsurancePoliciesModifyDialog
     */
    private final Base_Datos BD;
    private final HashMap ht_carSold;
    private final HashMap ht_insurancecompanyID;
    
    public InsurancePoliciesModifyDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        mostrardatos("");
        
        ht_carSold = new HashMap<String, Integer>();
        buildCombo_CarSold(BD);
        
        ht_insurancecompanyID = new HashMap<String, Integer>();
        buildCombo_InsuranceCompany(BD);
    }
    
    void mostrardatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
        table.setAutoCreateRowSorter(true);
        modelo.addColumn("ID");
        modelo.addColumn("Car Sold ID");
        modelo.addColumn("Insurance Comp. ID");
        modelo.addColumn("Start Date");
        modelo.addColumn("Renewal Date");
        modelo.addColumn("Monthly payment");
        modelo.addColumn("Details");
        table.setModel(modelo);
        StringBuilder sql_llenado = new StringBuilder("SELECT * FROM public.\"Insurance_Policies\"");
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
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
        DeleteRow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jMenuItem1.setText("Modify");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Modify Insurance Policy");

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

        DeleteRow.setText("Delete Row");
        DeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRowActionPerformed(evt);
            }
        });

        table.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Start_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(Start_month, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insurancecompanyIDCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renewal_year, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renewal_month, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renewal_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carSoldComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addComponent(CancelButton))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(DeleteRow)
                        .addGap(86, 86, 86))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(otherdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteRow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void renewal_yearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_yearFocusLost
        
    }//GEN-LAST:event_renewal_yearFocusLost

    private void renewal_monthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_monthFocusLost
        
    }//GEN-LAST:event_renewal_monthFocusLost

    private void renewal_dayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_renewal_dayFocusLost
        
    }//GEN-LAST:event_renewal_dayFocusLost

    private void monthlypayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthlypayFocusLost
        
    }//GEN-LAST:event_monthlypayFocusLost

    private void otherdetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otherdetFocusLost

    }//GEN-LAST:event_otherdetFocusLost

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int fila = table.getSelectedRow();
        int ID = Integer.valueOf(table.getValueAt(fila, 0).toString());
        Integer car_Sold_ID = (Integer) ht_carSold.get(carSoldComboBox.getSelectedItem());
        Integer insurance_ID = (Integer) ht_insurancecompanyID.get(insurancecompanyIDCombobox.getSelectedItem());
        String start_date = "'"+Start_Year.getText()+"-"+Start_month.getText()+"-"+start_day.getText()+"'";
        String renewal_date = "'"+renewal_year.getText()+"-"+renewal_month.getText()+"-"+renewal_day.getText()+"'";
        Double payment = Double.parseDouble(monthlypay.getText());
        String details = otherdet.getText();
        
        StringBuilder sql = new StringBuilder("UPDATE public.\"Insurance_Policies\"\n" +
"	SET  "
                + "\"car_Sold_ID\"="+car_Sold_ID.intValue()+", "
                + "\"insurance_Company_ID\"="+insurance_ID.intValue()+", "
                + "\"policy_Start_date\"="+start_date+", "
                + "\"policy_Renewal_Date\"="+renewal_date+", "
                + "\"monthly_Payments\"="+payment.doubleValue()+", "
                + "\"other_Details\"="+"'"+details+"'"+"\n" +
"	WHERE \"policy_ID\"= "+ID+" ");
 
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "Updated!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error Updating: \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        mostrardatos("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void renewal_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewal_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renewal_monthActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NumberFormat format = NumberFormat.getCurrencyInstance();
        int fila = table.getSelectedRow();
        try{
          Number payment = format.parse((table.getValueAt(fila, 5).toString()));  
          if(fila >=0){
            carSoldComboBox.setSelectedItem(table.getValueAt(fila, 1));
            insurancecompanyIDCombobox.setSelectedItem(table.getValueAt(fila, 2));
            Start_Year.setText("");
            Start_month.setText("");
            start_day.setText("");
            renewal_year.setText("");
            renewal_month.setText("");
            renewal_day.setText("");
            monthlypay.setText(payment.toString());
            otherdet.setText(table.getValueAt(fila, 6).toString());
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
                StringBuilder sql = new StringBuilder("DELETE FROM public.\"Insurance_Policies\"\n" +
            "	WHERE \"policy_ID\" ="+ID+"");

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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlypay;
    private javax.swing.JTextField otherdet;
    private javax.swing.JTextField renewal_day;
    private javax.swing.JTextField renewal_month;
    private javax.swing.JTextField renewal_year;
    private javax.swing.JTextField start_day;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
