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
	
    public static void Conexion () { 
    
    
    Connection connection = null;
   
    
    
    
    try {
		connection = DriverManager.getConnection(URL,USER, PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
