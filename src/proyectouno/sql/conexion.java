
package proyectouno.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import proyectouno.sql.conexion;

public class conexion {
    public static Connection getConexion() {
        Connection connection = null;
        try {
           String driverClassName = "com.mysql.jdbc.Driver";
           String driverUrl="jdbc:mysql://localhost/chocolateria";
           Class.forName(driverClassName);
           connection = DriverManager.getConnection(driverUrl, "root","");
           System.out.println("BRAVO!!!");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}