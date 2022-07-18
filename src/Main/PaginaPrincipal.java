
package Main;

import Insert_Dialogs.CarLoansInsertDialog;
import Insert_Dialogs.InsuranceCompaniesInsertDialog;
import Insert_Dialogs.InsurancePoliciesInsertDialog;
import Insert_Dialogs.FinanceCompaniesInsertDialog;
import Insert_Dialogs.FeaturesonCarsforSaleInsertDialog;
import Insert_Dialogs.CarsSoldInsertDialog;
import Insert_Dialogs.CarFeaturesInsertDialog;
import Insert_Dialogs.VehicleCategInsertDialog;
import Insert_Dialogs.CarManufacturerInsertDialog;
import Insert_Dialogs.CarModelInstertDialog;
import Insert_Dialogs.CarsforSaleInsertDialog;
import Insert_Dialogs.PaymentStatusInsertDialog;
import Insert_Dialogs.AddressesInsertDialog;
import Insert_Dialogs.Customer_PaymentsInsertDialog;
import Insert_Dialogs.CustomerPreferencesInsertDialog;
import Insert_Dialogs.CustomersInsertDialog;
import Modify_Dialogs.AddressesModifyDialog;
import Modify_Dialogs.CarFeaturesModifyDialog;
import Modify_Dialogs.CarLoansModifyDialog;
import Modify_Dialogs.CarManufacturerModifyDialog;
import Modify_Dialogs.CarModelModifyDialog;
import Modify_Dialogs.CarsSoldModifyDialog;
import Modify_Dialogs.CarsforSaleModifyDialog;
import Modify_Dialogs.CustomerPreferencesModifyDialog;
import Modify_Dialogs.Customer_PaymentsModifyDialog;
import Modify_Dialogs.CustomersModifyDialog;
import Modify_Dialogs.FeaturesonCarsforSaleModifyDialog;
import Modify_Dialogs.FinanceCompaniesModifyDialog;
import Modify_Dialogs.InsuranceCompaniesModifyDialog;
import Modify_Dialogs.InsurancePoliciesModifyDialog;
import Modify_Dialogs.PaymentStatusModifyDialog;
import Modify_Dialogs.VehicleCategModifyDialog;
import TableListeners.FinanceCompaniesTableListener;
import TableListeners.InsurancePoliciesTableListener;
import TableListeners.FeaturesonCarsforSaleTableListener;
import TableListeners.CarLoansTableListener;
import TableListeners.InsuranceCompaniesTableListener;
import TableListeners.VehicleCategoriesTableListener;
import TableListeners.CarsSoldTableListener;
import TableListeners.CarModelsTableListener;
import TableListeners.CarFeaturesTableListener;
import TableListeners.CarManufacturersTableListener;
import TableListeners.CarsforSaleTableListener;
import TableListeners.PaymentStatusTableListener;
import TableListeners.AddressesTableListener;
import TableListeners.CustomerPaymentTableListener;
import TableListeners.CustomerPreferencesTableListener;
import TableListeners.CustomersTableListener;
import Consultas.CarManufConsulta;
import Consultas.DeleteCustomer;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PaginaPrincipal extends javax.swing.JFrame {
    //LOCALHOST
//    private final String User = "postgres";
//    private final String Pass = "password";
    
    //SERVIDOR UNI --> Cambiar dirección de la BD en Localhost en clase Base_Datos
    private final String User = "usr216202539";
    private final String Pass = "pw216202539";
    
    final private Base_Datos db; 
    public PaginaPrincipal() {
        db = Base_Datos.getDatabase(User, Pass);
        initComponents();
        this.setSize(800,600);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(102, 102, 255));

        menuBar.setBackground(new java.awt.Color(102, 102, 255));
        menuBar.setForeground(new java.awt.Color(51, 51, 255));
        menuBar.setAutoscrolls(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menú");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir de la aplicación");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);
        fileMenu.add(jSeparator1);

        menuBar.add(fileMenu);

        jMenu1.setText("Consultar tablas");

        jMenu8.setText("Customers");

        jMenuItem17.setText("Customers");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Customer Preferences");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenuItem19.setText("Customer Payments");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem19);

        jMenuItem20.setText("Addresses");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenuItem21.setText("Payment Status");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);

        jMenu1.add(jMenu8);

        jMenu9.setText("Cars");

        jMenuItem22.setText("Cars for Sale");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem22);

        jMenuItem23.setText("Car Models");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem23);

        jMenuItem24.setText("Car Manufacturers");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem24);

        jMenuItem25.setText("Vehicle Categories");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem25);

        jMenuItem26.setText("Car Features");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem26);

        jMenuItem27.setText("Cars Sold");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem27);

        jMenuItem28.setText("Features on cars for sale");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem28);

        jMenu1.add(jMenu9);

        jMenu10.setText("Credits");

        jMenuItem29.setText("Car Loans");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem29);

        jMenuItem30.setText("Finance Companies");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem30);

        jMenuItem31.setText("Insurance Policies");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem31);

        jMenuItem32.setText("Insurance Companies");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem32);

        jMenu1.add(jMenu10);

        menuBar.add(jMenu1);

        jMenu2.setText("Insertar registros");

        jMenu5.setText("Customers");

        jMenuItem1.setText("Customers");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem3.setText("Customer Preferences");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Customer Payments");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Addresses");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Payment Status");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenu2.add(jMenu5);

        jMenu6.setText("Cars");

        jMenuItem2.setText("Cars for Sale");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem7.setText("Car Models");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Car Manufacturers");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Vehicle Categories");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Car Features");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Cars Sold");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("Features on cars for sale");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenu2.add(jMenu6);

        jMenu7.setText("Credits");

        jMenuItem13.setText("Car Loans");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("Finance Companies");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Insurance Policies");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Insurance Companies");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenu2.add(jMenu7);

        menuBar.add(jMenu2);

        jMenu4.setText("Editar registros");

        jMenu11.setText("Customers");

        jMenuItem33.setText("Customers");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem33);

        jMenuItem34.setText("Customer Preferences");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem34);

        jMenuItem35.setText("Customer Payments");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem35);

        jMenuItem36.setText("Addresses");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem36);

        jMenuItem37.setText("Payment Status");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem37);

        jMenu4.add(jMenu11);

        jMenu12.setText("Cars");

        jMenuItem38.setText("Cars for Sale");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem38);

        jMenuItem39.setText("Car Models");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem39);

        jMenuItem40.setText("Car Manufacturers");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem40);

        jMenuItem41.setText("Vehicle Categories");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem41);

        jMenuItem42.setText("Car Features");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem42);

        jMenuItem43.setText("Cars Sold");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem43);

        jMenuItem44.setText("Features on cars for sale");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem44);

        jMenu4.add(jMenu12);

        jMenu13.setText("Credits");

        jMenuItem45.setText("Car Loans");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem45);

        jMenuItem46.setText("Finance Companies");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem46);

        jMenuItem47.setText("Insurance Policies");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem47);

        jMenuItem48.setText("Insurance Companies");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem48);

        jMenu4.add(jMenu13);

        menuBar.add(jMenu4);

        jMenu17.setText("Consultas");

        jMenuItem65.setText("Car Manufacturers by Name");
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem65);

        jMenuItem66.setText("Delete Customer by ID");
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem66);

        menuBar.add(jMenu17);

        helpMenu.setBackground(java.awt.Color.gray);
        helpMenu.setMnemonic('h');
        helpMenu.setText("Detalles");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Información del programa");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed
// BOTON Insertar --> Customer  
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CustomersInsertDialog dialog = new CustomersInsertDialog(this, db);
       dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

// BOTON Consultar --> Customer Preferences
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        
        
        final String SQL = "SELECT \"customer_Preference_ID\", \"car_Feature_ID\", \"customer_ID\", \"customer_Preference_Details\"\n"
                + "	FROM public.\"Customer_Preferences\" ORDER BY \"customer_Preference_ID\"";
        
        final String labels[] = {"ID", "Car Feature ID", "Customer ID", "Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CustomerPreferencesTableListener(db));
            TableBrowser browser = new TableBrowser("Customer Preferences", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed
// BOTON Consultar --> Customers
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        
        final String SQL = "SELECT * FROM public.\"Customers\" ORDER BY \"customer_ID\"";
        
        final String labels[] = {"ID", "Phone Number", "Email", "Ohter Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CustomersTableListener(db));
            TableBrowser browser = new TableBrowser("Customers", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed
// BOTON Consultar --> Customer Payments
    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

        final String SQL = "SELECT \"customer_Payment_ID\", \"car_Sold_ID\", \"customer_ID\", "
                + "\"payment_Status_Code\", \"customer_Payment_Date_Due\", \"customer_Payment_Date_Made\", "
                + "\"actual_Payment_Amount\"\n" +
"	FROM public.\"Customer_Payments\" ORDER BY \"customer_Payment_ID\"";
        
        final String labels[] = {"Payment ID" , "Car Sold ID" , "Customer ID", "Payment Status Code", "Due Date", "Date "
                + "Made", "Amount"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CustomerPaymentTableListener(db));
            TableBrowser browser = new TableBrowser("Customers Payments", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed
// BOTON Consultar --> Addresses
    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        final String SQL = "SELECT \"address_ID\", \"customer_ID\", \"address_Line_1\", \"address_Line_2\", \"address_Line_3\", "
                + "\"address_Line_4\", town_city, \"state_County_Province\", \"Country\", \"post_Zip_Code\", \"other_Address_Details\"\n" +
"	FROM public.\"Addresses\" ORDER BY \"address_ID\"";
        
        final String labels[] = {"ID", "Customer ID", "Line 1", "Line 2", "Line 3", "Line 4", "Town/City", "State/County/Province"
                + "", "Country", "Zip Code", "Other Address Details"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new AddressesTableListener(db));
            TableBrowser browser = new TableBrowser("Addresses", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed
// BOTON Consultar --> Payment Status
    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        final String SQL = "SELECT \"payment_Status_Code\", \"payment_Status_Description\"\n" +
"	FROM public.\"Payment_Status\" ORDER BY \"payment_Status_Code\""; 
        
        final String labels[] = {"Code","Description"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new PaymentStatusTableListener(db));
            TableBrowser browser = new TableBrowser("Payment Status", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed
// BOTON Consultar --> Cars for Sale
    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        
        final String SQL = "SELECT \"car_for_Sale_ID\", \"asking_Price\", \"current_Mileage \", \"date_Acquired\", \"registration_Year\", \"other_Car_Details\""
                + ", \"manufacturer_ShortName\", \"model_Code\", \"vehicle_Category_Code\"\n" +
"	FROM public.\"Cars_for_Sale \" ORDER BY \"car_for_Sale_ID\"";
        
        final String labels[] = {"Car ID", "Asking Price", "Current Mileage", "Date Acquired", "Registration Year", "Other Details", "Manufacturer", "Model "
                + "Code", "Vehicle Category Code"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarsforSaleTableListener(db));
            TableBrowser browser = new TableBrowser("Cars for Sale", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed
// BOTON Consultar --> Car Models
    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        final String SQL = "SELECT \"model_Code\", manufacturer_code, \"model_Name\"\n" +
"	FROM public.\"Car_Models\" ORDER BY \"model_Code\"";
        
        final String labels[] = {"Model Code", "Manufacterer Code", "Model Name"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarModelsTableListener(db));
            TableBrowser browser = new TableBrowser("Car Models", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed
//BOTON Consultar --> Car Manufacturers
    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
    
        final String SQL = "SELECT \"manufacturer_ShortName\", \"manufacturer_FullName\", \"manufacturer_OtherDetails\"\n" +
"	FROM public.\"Car_Manufacturers\" ORDER BY \"manufacturer_ShortName\"";
        
        final String labels[] = {"Short Name", "Full Name", "Other Details"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarManufacturersTableListener(db));
            TableBrowser browser = new TableBrowser("Car Manufacturers", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem24ActionPerformed
//BOTON Consultar --> Vehicle Categories
    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        final String SQL = "SELECT \"vehicle_Category_Code\", \"vehicle_Category_Description\"\n" +
"	FROM public.\"Vehicle_Categories\" ORDER BY \"vehicle_Category_Code\"";
        
        final String labels[] = {"Category Code", "Description"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new VehicleCategoriesTableListener(db));
            TableBrowser browser = new TableBrowser("Vehicle Categories", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed
//BOTON Consultar --> Car Features 
    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        final String SQL = "SELECT \"car_Feature_ID\", \"car_Feature_Description\"\n" +
"	FROM public.\"Car_Features\" ORDER BY \"car_Feature_ID\"";
        
        final String labels[] = {"Feature ID", "Description"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarFeaturesTableListener(db));
            TableBrowser browser = new TableBrowser("Car Features", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed
//BOTON Consultar --> Cars Sold
    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        
        final String SQL = "SELECT \"car_Sold_ID\", \"car_for_Sale_ID\", \"customer_ID\", \"agreed_Price\","
                + " \"date_Sold\", \"monthly_Payment_Amount\", \"monthly_Payment_Date\", \"other_Details\"\n" 
                + " FROM public.\"Cars_Sold\" ORDER BY \"car_Sold_ID\"";
        
        final String labels[] = {"ID", "Car for Sale ID", "Customer ID", "Agreed Price", "Date Sold", "Monthly "
                + "Payment Amount", "Montly Payment Date","Other Details"};
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarsSoldTableListener(db));
            TableBrowser browser = new TableBrowser("Cars Sold", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem27ActionPerformed
//BOTON Consultar --> Features on cars for sale
    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        final String SQL = "SELECT \"car_for_sale_ID\", \"car_Feature_ID\"\n" +
"	FROM public.\"features_on_Cars_for_Sale\" ORDER BY \"car_for_sale_ID\"";
        
        final String labels[] = {"Car for Sale ID", "Car Feature ID"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new FeaturesonCarsforSaleTableListener(db));
            TableBrowser browser = new TableBrowser("Features on Cars for Sale", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem28ActionPerformed
//BOTON Consultar --> Car Loans
    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        final String SQL = "SELECT \"loan_ID\", \"car_Sold_ID\", \"finance_Company_ID\","
                + " \"repayment_Start_Date\", \"repayment_End_Date\", \"monthly_Repayments\","
                + " \"other_Details\"\n" +
"	FROM public.\"Car_Loans\" ORDER BY \"loan_ID\"";
        
        final String labels[] = {"Loan ID", "Car Sold ID", "Finance Company ID", "Repayment Start "
                + "Date", "Repayment End Date", "Monthly Repayments", "Other Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new CarLoansTableListener(db));
            TableBrowser browser = new TableBrowser("Car Loans", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed
//BOTON Consultar --> Finance Companies
    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        final String SQL = "SELECT \"finance_Company_ID\", \"finance_Company_Name\", \"other_Details\"\n" +
"	FROM public.\"Finance_Companies\" ORDER BY \"finance_Company_ID\"";
        
        final String labels[] = {"Company ID", "Name", "Other Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new FinanceCompaniesTableListener(db));
            TableBrowser browser = new TableBrowser("Finance Companies", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed
//BOTON Consultar --> Insurance Policies
    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        final String SQL = "SELECT \"policy_ID\", \"car_Sold_ID\", \"insurance_Company_ID\", "
                + "\"policy_Start_date\", \"policy_Renewal_Date\", \"monthly_Payments\", \"other_Details\"\n" +
"	FROM public.\"Insurance_Policies\" ORDER BY \"policy_ID\"";
        
        final String labels[] = {"ID", "Car Sold ID", "Insurance Company ID", "Start Date", "Renewal Date", "Monthly Payments", "Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new InsurancePoliciesTableListener(db));
            TableBrowser browser = new TableBrowser("Insurance Policies", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_jMenuItem31ActionPerformed
//BOTON Consultar --> Insurance Companies
    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        final String SQL = "SELECT \"Insurance_Company_ID\", \"insurance_Company_Name\", \"other_Details\"\n" +
"	FROM public.\"Insurance_Companies\" ORDER BY \"Insurance_Company_ID\"";
        
        final String labels[] = {"Company ID", "Name", "Other Details"};
        
        try{
            ResultSet rs = db.query(SQL);
            
            JDBCTableAdapter modelo = new JDBCTableAdapter(rs, labels);
            modelo.addTableModelListener(new InsuranceCompaniesTableListener(db));
            TableBrowser browser = new TableBrowser("Insurance Companies", modelo);
            browser.setVisible(true);
            this.desktopPane.add(browser);
        
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jMenuItem32ActionPerformed
//BOTON Insertar --> Customer Preferences
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CustomerPreferencesInsertDialog dialog = new CustomerPreferencesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
//BOTON Insertar --> Customer Payments
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Customer_PaymentsInsertDialog dialog = new Customer_PaymentsInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
//BOTON Insertar --> Addresses
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AddressesInsertDialog dialog = new AddressesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
//BOTON Insertar --> Payment Status
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        PaymentStatusInsertDialog dialog = new PaymentStatusInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
//BOTON Insertar --> Cars for Sale
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CarsforSaleInsertDialog dialog = new CarsforSaleInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
//BOTON Insertar --> Car Models
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CarModelInstertDialog dialog = new CarModelInstertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed
//BOTON Insertar --> Car Manufacturers
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CarManufacturerInsertDialog dialog = new CarManufacturerInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
//BOTON Insertar --> Vehicle Description
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        VehicleCategInsertDialog dialog = new VehicleCategInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed
//BOTON Insertar --> Car Features
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CarFeaturesInsertDialog dialog = new CarFeaturesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed
//BOTON Insertar --> Cars Sold
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CarsSoldInsertDialog dialog = new CarsSoldInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed
//BOTON Insertar --> Features on cars for sale
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FeaturesonCarsforSaleInsertDialog dialog = new FeaturesonCarsforSaleInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed
//BOTON Insertar --> Car Loans
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        CarLoansInsertDialog dialog = new CarLoansInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed
//BOTON Insertar --> Finance Companies
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FinanceCompaniesInsertDialog dialog = new FinanceCompaniesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed
//BOTON Insertar --> Insurance Policies
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        InsurancePoliciesInsertDialog dialog = new InsurancePoliciesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed
//BOTON Insertar --> Insurance Companies
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        InsuranceCompaniesInsertDialog dialog = new InsuranceCompaniesInsertDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed
//BOTON Editar --> Addresses
    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        AddressesModifyDialog dialog = new AddressesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed
//BOTON Editar --> Car Features
    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        CarFeaturesModifyDialog dialog = new CarFeaturesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed
//BOTON Editar --> Car Loans
    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        CarLoansModifyDialog dialog = new CarLoansModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed
//BOTON Editar --> Car Manufacturers
    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        CarManufacturerModifyDialog dialog = new CarManufacturerModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem40ActionPerformed
//BOTON Editar --> Car Models
    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        CarModelModifyDialog dialog = new CarModelModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed
//BOTON Editar --> Cars Sold
    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        CarsSoldModifyDialog dialog = new CarsSoldModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed
//BOTON Editar --> Cars for Sale
    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        CarsforSaleModifyDialog dialog = new CarsforSaleModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed
//BOTON Editar --> Customer Preferences
    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        CustomerPreferencesModifyDialog dialog = new CustomerPreferencesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed
//BOTON Editar --> Customer Payments
    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        Customer_PaymentsModifyDialog dialog = new Customer_PaymentsModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed
//BOTON Editar --> Customers
    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        CustomersModifyDialog dialog = new CustomersModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed
//BOTON Editar --> Features on cars for sale
    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        FeaturesonCarsforSaleModifyDialog dialog = new FeaturesonCarsforSaleModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed
//BOTON Editar --> Finance Companies
    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        FinanceCompaniesModifyDialog dialog = new FinanceCompaniesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed
//BOTON Editar --> Insurance Companies
    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        InsuranceCompaniesModifyDialog dialog = new InsuranceCompaniesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem48ActionPerformed
//BOTON Editar --> Insurance Policies
    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        InsurancePoliciesModifyDialog dialog = new InsurancePoliciesModifyDialog(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem47ActionPerformed
//BOTON Editar --> Payment Status
    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        PaymentStatusModifyDialog dialog = new PaymentStatusModifyDialog(this,db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed
//BOTON Editar --> Vehicle Categories
    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        VehicleCategModifyDialog dialog = new VehicleCategModifyDialog(this,db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem65ActionPerformed
        CarManufConsulta dialog = new CarManufConsulta(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem65ActionPerformed

    private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem66ActionPerformed
        DeleteCustomer dialog = new DeleteCustomer(this, db);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem66ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(this, "Hecho por: \n"
                + "--Eduardo Cadena Dávila \n"
                + "--Luis Ángel Moreno Andrade. ");
    }//GEN-LAST:event_aboutMenuItemActionPerformed



    
// ----------------------------------
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
