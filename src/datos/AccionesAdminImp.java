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
		
		ConexionBBDD c = new ConexionBBDD();
		connection = c.Conexion();
		
		try {
			Statement st = connection.createStatement();
			String borrar = "DELETE FROM `movil` WHERE IdMovil ='" + idMovil + "'";
			int i = st.executeUpdate(borrar);
            System.out.println("Ha salido la query");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } 
		
		
	}

	@Override
	public void updateMovil(Movil movil) {
		// TODO Auto-generated method stub
		
					ConexionBBDD c = new ConexionBBDD();
					connection = c.Conexion();
					
					try {
						Statement st = connection.createStatement();
						String query = "UPDATE `movil` SET nombre = '" + movil.getNombre() + "', procesador ='" 
						+ movil.getProcesador() + "', memoria = '" + movil.getMemoria() + "', bateria = '" 
						+ movil.getBateria() + "',precio = '" + movil.getPrecio() + "', stock = '" + movil.getStock()
						+"' WHERE idMovil="+ movil.getIdMovil()+";";
						System.out.println(query);
						int i = st.executeUpdate(query);
			            System.out.println("Ha salido la query");

			        } catch (SQLException e) {

			            System.out.println(e.getMessage());

			        } 
					
	}

}
