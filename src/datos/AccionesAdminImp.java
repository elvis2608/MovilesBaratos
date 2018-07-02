package datos;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import modelo.entidades.Marca;
import modelo.entidades.Movil;
import utilidades.ConexionBBDD;

public class AccionesAdminImp implements IAccionesAdmin {
	
	// Statement st = null;
		ResultSet rs = null;
		Connection connection = null;

	
	@Override
	public void addMovil(Movil movil) {
		// TODO Auto-generated method stub
		// Añadir movil
			ConexionBBDD c = new ConexionBBDD();
			connection = c.Conexion();
			
			try {
				Statement st = connection.createStatement();
				String query = "INSERT INTO `movil` VALUES (" + movil.getNombre() + "','" + movil.getProcesador() + "','" + movil.getMemoria() + "','" + movil.getBateria() + "',' images/Problemas.jpg ','" + movil.getPrecio() + "','" + movil.getStock() + "','"  + movil.getMarca().getIdMarca()+");";
				int i = st.executeUpdate(query);
	            System.out.println("Ha salido la query");

	        } catch (SQLException e) {

	            System.out.println(e.getMessage());

	        } 
					
		}
		


	@Override
	public void deleteMovil(int idMovil) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void updateMovil(Movil movil) {
		// TODO Auto-generated method stub
		
	}

}
