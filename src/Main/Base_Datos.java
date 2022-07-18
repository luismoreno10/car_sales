package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Base_Datos {
    //Crear conexión
    private Connection conexion;
    
    //Localhost:
    //private final String DB_URL = "jdbc:postgresql://localhost:5432/car_sales2";
    //UNISON SERVER:
    private final String DB_URL = "jdbc:postgresql://148.225.60.116:5432/car_sales";
    //Denifir dirección del driver
    private final String DRIVER = "org.postgresql.Driver";
    private static Base_Datos DB = null;
    
    private Base_Datos(){
        super();
    }
    
    private Base_Datos (String user, String password){
        super();
        conexion  = null;
        try{
            Class.forName(DRIVER);
            Properties propiedades = new Properties();
            propiedades.setProperty("user", user);
            propiedades.setProperty("password",password);
            //Iniciar conexión a la BD
            conexion = DriverManager.getConnection(DB_URL, propiedades);
            
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
            
        } catch (SQLException ex){
            System.out.println("Error: "+ex.getMessage());
            System.out.println("Código: "+ ex.getErrorCode());
        }
    }
    
    //Regresar objeto Database
    public static Base_Datos getDatabase(String user, String pass){
        if (DB == null) {
            DB = new Base_Datos(user, pass);
        }
        return DB;
    }
    
    public ResultSet query(String sql) throws SQLException {

        ResultSet rs = null;
        Statement statement = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        rs = statement.executeQuery(sql);

        return rs;
    }

    public ResultSet query(String sql, int scroll, int concur) throws SQLException {

        ResultSet rs = null;

        Statement statement = conexion.createStatement(scroll, concur);
        rs = statement.executeQuery(sql);

        return rs;
    }

    public int update(String sql) throws SQLException {
        int result = -1;

        Statement statement = conexion.createStatement( ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE );
        result = statement.executeUpdate(sql);
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
