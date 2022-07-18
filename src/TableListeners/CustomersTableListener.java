package TableListeners;




import java.sql.SQLException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import Main.Base_Datos;
import Main.JDBCTableAdapter;

/**
 *
 * @author luism
 */
public class CustomersTableListener implements TableModelListener{
    
    private final Base_Datos db;
    
    public CustomersTableListener(Base_Datos d){
        super();
        db = d;
    }
    
    @Override
    public void tableChanged(TableModelEvent event){
        JDBCTableAdapter modelo = (JDBCTableAdapter) event.getSource();
        
        int row = event.getFirstRow();
        int column = event.getColumn();
        int type = event.getType();
        
        if (column == 0){
            return;
        }
        
        String colName = modelo.getColumnName(column);
        String colSQLName = modelo.getSQLColumnName(column);
        String sql = String.format(
               "UPDATE Customers set %s = %s WHERE customer_ID \'%s\'",
               colSQLName,
               modelo.getValueAt(row, column),
               modelo.getValueAt(row, 0));
        
        try{
            db.update(sql);
        }catch (SQLException ex) {           
            System.out.println(ex.getMessage());
        }
        System.out.println(sql);
                
    }
}
