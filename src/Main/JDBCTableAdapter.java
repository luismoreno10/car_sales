
package Main;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luism
 */
public class JDBCTableAdapter extends DefaultTableModel{
    
    private String tableName;
    private String sqlColumnNames[];
    private int sqlColumnTypes[];
    
    public JDBCTableAdapter(ResultSet res, String name){
        super();
        
        ResultSet rs = res;
        
        tableName = name;
        
        int rows = 0;
        int cols = 0;
        
        Object data[][] =null;
        Object[] columnNames = null;
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();

            cols = metaData.getColumnCount();

            columnNames = new Object[cols];

            int c = 0;
            //Get column names
            for (int i = 1; i <= cols; i++) {
                columnNames[c++] = metaData.getColumnLabel(i);
            }

            // Mover cursor al ultimo renglon
            rs.last();

            // Get rows
            rows = rs.getRow();
            data = new Object[rows][cols];

            // Recorrer cursor al primer renglon
            rs.beforeFirst();

            int r = 0;

            // Ontener los datos de las columnas
            while (rs.next()) {
                c = 0;
                for (int i = 1; i <= cols; i++) {
                    data[r][c++] = rs.getString(i);
                }
                r++;
            }
        }catch (SQLException ex) {
            Logger.getLogger(JDBCTableAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setDataVector(data, columnNames);
    }
    
    public JDBCTableAdapter(ResultSet res) {

        super();
        ResultSet rs = res;

        int rows = 0;
        int cols = 0;

        Object data[][] = null;
        Object names[] = null;

        try {

            ResultSetMetaData metaData = rs.getMetaData();

            tableName = metaData.getTableName(1);

            cols = metaData.getColumnCount();

            names = new Object[cols];
            sqlColumnNames = new String[cols];
            sqlColumnTypes = new int[cols];

            int c = 0;
            for (int i = 1; i <= cols; i++) {
                sqlColumnNames[c] = metaData.getColumnName(i);

                System.out.println(metaData.getColumnName(i)
                        + " Schema: " + metaData.getSchemaName(i)
                        + " Catalog:" + metaData.getCatalogName(i)
                        + " Label: " + metaData.getColumnLabel(i));
                sqlColumnTypes[c] = metaData.getColumnType(i);
                names[c++] = metaData.getColumnLabel(i);
            }

            // Mover cursor al ultimo renglon
            rs.last();
            // Cuantos renglones hay?
            rows = rs.getRow();
            data = new Object[rows][cols];

            // Recorrer cursor al primer renglon
            rs.beforeFirst();

            int r = 0;
            while (rs.next()) {
                c = 0;
                for (int i = 1; i <= cols; i++) {
                    data[r][c++] = rs.getString(i);
                }
                r++;
            }
        } catch (SQLException ex) {
        }
        this.setDataVector(data, names);
    }
    
    public JDBCTableAdapter(ResultSet res, String[] labels) {

        super();
        ResultSet rs = res;

        int rows = 0;
        int cols = 0;

        Object data[][] = null;
        Object names[];
        names = labels;

        try {

            ResultSetMetaData metaData = rs.getMetaData();       
            cols = metaData.getColumnCount();

           // names = new Object[cols];
            sqlColumnNames = new String[cols];
            sqlColumnTypes = new int[cols];

            int c = 0;
            for (int i = 1; i <= cols; i++) {
                sqlColumnNames[c] = metaData.getColumnName(i);
//                System.out.println(metaData.getColumnName(i)
//                        + " Catalog:" + metaData.getCatalogName(i)
//                        + " Label: " + metaData.getColumnLabel(i));
                sqlColumnTypes[c] = metaData.getColumnType(i);               
                c++;
            }

            // Mover cursor al ultimo renglon
            rs.last();
            // Cuantos renglones hay?
            rows = rs.getRow();
            data = new Object[rows][cols];

            // Recorrer cursor al primer renglon
            rs.beforeFirst();

            int r = 0;
            while (rs.next()) {
                c = 0;
                for (int i = 1; i <= cols; i++) {
                    data[r][c++] = rs.getString(i);
                }
                r++;
            }
        } catch (SQLException ex) {
        }
        this.setDataVector(data, names);
    }

    public String getSQLColumnName(int i) {
        String name = null;
        if (i >= 0 && i < sqlColumnNames.length) {
            name = sqlColumnNames[i];
        }
        return name;
    }

    public int getSQLColumnType(int i) {
        int dataType = -1;
        if (i >= 0 && i < sqlColumnTypes.length) {
            dataType = sqlColumnTypes[i];
        }
        return dataType;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        
        return (column != 0);
       
    }
    
}
