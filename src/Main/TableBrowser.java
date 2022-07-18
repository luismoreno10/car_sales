
package Main;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
/**
 *
 * @author luism
 */

public class TableBrowser extends javax.swing.JInternalFrame{
    
    private JTable table = null;
    
    public TableBrowser(String title, TableModel modelo){
        super(title, true, true, true, true);
        
        this.initComponents(modelo); 
    }
    
    private  void initComponents(TableModel modelo) {
        // Crear la tabla con los datos de la consulta
        table = new JTable(modelo);        
        table.setPreferredScrollableViewportSize(new Dimension(640, 320));
        table.setFillsViewportHeight(true);

        //Crear un panel con scroll y agregar la tabla.
        JScrollPane scrollPane = new JScrollPane(table);

        this.getContentPane().add(scrollPane);
        this.pack();       
    }
    
}
