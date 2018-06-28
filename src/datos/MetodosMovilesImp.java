package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilidades.ConexionBBDD;

public class MetodosMovilesImp implements IMetodosMoviles {

	
	Statement st = null;
	ResultSet rs = null;
	
	
	
	@Override
	public  void ListarMarca() {
		// TODO Auto-generated method stub
		ConexionBBDD c =new ConexionBBDD();
		ArrayList<String> listaMarcas = new ArrayList<>();
		
		
		st = (Statement) c.Conexion();
		try {
			rs = st.executeQuery("SELECT * FROM marca");
			
			while(rs.next()) {
				
				String nombre = rs.getString(1);
				listaMarcas.add(nombre);
				System.out.println(nombre);
			}
			
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	
}
