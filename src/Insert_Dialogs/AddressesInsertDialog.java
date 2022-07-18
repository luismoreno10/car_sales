
package Insert_Dialogs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import Main.Base_Datos;


public class AddressesInsertDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddressesInsertDialog
     */
    
    private final Base_Datos BD;
    private final HashMap ht_customerID;
    
    public AddressesInsertDialog(java.awt.Frame parent, Base_Datos BD) {
        super(parent, true);
        initComponents();
        this.BD = BD;
        
        ht_customerID = new HashMap<String,Integer>();
        buildCombo_CustomerID(BD);
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

        AddButton.setText("Add");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelButton)
                        .addGap(16, 16, 16))))
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
                    .addComponent(CancelButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String ID ="DEFAULT";
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
        
        StringBuilder sql = new StringBuilder(
                "INSERT INTO public.\"Addresses\"(\n" +
"	\"address_ID\", \"customer_ID\", \"address_Line_1\", \"address_Line_2\", "
                        + "\"address_Line_3\", \"address_Line_4\", town_city, "
                        + "\"state_County_Province\", \"Country\", \"post_Zip_Code\", "
                        + "\"other_Address_Details\") VALUES"
        +"(");
        
        sql.append(ID);
        sql.append(",");
        sql.append(customer_ID.intValue());
        sql.append(",");
        sql.append("'"+line1+"'");
        sql.append(",");
        sql.append("'"+line2+"'");
        sql.append(",");
        sql.append("'"+line3+"'");
        sql.append(",");
        sql.append("'"+line4+"'");
        sql.append(",");
        sql.append("'"+town_city+"'");
        sql.append(",");
        sql.append("'"+state_c+"'");
        sql.append(",");
        sql.append("'"+Country+"'");
        sql.append(",");
        sql.append(post_zip.intValue());
        sql.append(",");
        sql.append("'"+otherdet+"'");
        sql.append(")");
        System.out.println(sql.toString());
        
        try {
            BD.update( sql.toString() );
            JOptionPane.showMessageDialog(this, "New address has been added!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error adding new address! \n" + ex.toString());
            System.out.println( ex.getMessage() );
        }
        setVisible(false);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void townFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_townFocusLost
        String text = town.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Town");
        }
    }//GEN-LAST:event_townFocusLost

    private void stateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusLost
        String text = state.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing State");
        }
    }//GEN-LAST:event_stateFocusLost

    private void countryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryFocusLost
        String text = country.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Country");
        }
    }//GEN-LAST:event_countryFocusLost

    private void zipcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipcodeFocusLost
        String text = zipcode.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Zip Code");
        }
    }//GEN-LAST:event_zipcodeFocusLost

    private void address_line1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address_line1FocusLost
        String text = address_line1.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing at least Address Line 1");
        }
    }//GEN-LAST:event_address_line1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CancelButton;
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
    private javax.swing.JTextField other_details;
    private javax.swing.JTextField state;
    private javax.swing.JTextField town;
    private javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables
}
