package TableListeners;

import java.sql.SQLException;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import Main.Base_Datos;
import Main.Base_Datos;
import Main.JDBCTableAdapter;
import Main.JDBCTableAdapter;

public class FinanceCompaniesTableListener implements TableModelListener{
    
    private final Base_Datos db;
    
    public FinanceCompaniesTableListener(Base_Datos d){
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
               "UPDATE Finance_Companies set %s = %s WHERE finance_Company_ID \'%s\'",
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
