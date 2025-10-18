package model;
//conectar la base con java y verificar que no haya errores
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexiones {

    // URL de conexión: jdbc:mysql://host:puerto/nombreBD
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection conexion = null;

    //método para obtener la conexión
    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                //cargar driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                //establecer conexión
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver MySQL no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }

    //método para cerrar la conexión
    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) { //captura excepciones que ocurren dentro del bloeuqe try
            e.printStackTrace();//te dice en qué línea y qué pasó exactamente y no detiene el programa; solo muestra el error.
        }
    }
}