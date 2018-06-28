package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBBDD {

	
	static String URL = "jdbc:mysql://localhost:3306/tuMovilBarato";
    static String USER = "root";
    static String PASSWORD = "1111";
	
    Connection connection = null;
    
    
    public Connection  Conexion () { 
      
    try {
        /*
        Paso 1.- Instanciar un objeto de la clase de los Drivers de conexion
        a la BBDD
         */
        Class.forName("com.mysql.jdbc.Driver");

    } catch (ClassNotFoundException ex) {
        System.out.println("No se pueden cargar los drivers de BBDD");
        System.out.println("La aplicación ha finalizado");

        System.exit(0);
    }
    
    
    try {
		connection = DriverManager.getConnection(URL,USER, PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return connection;
}
    
    

	
}