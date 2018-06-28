package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utilidades.ConexionBBDD;

public class MetodosMovilesImp implements IMetodosMoviles {

	// Statement st = null;
	ResultSet rs = null;
	Connection connection = null;

	@Override
	public ArrayList<String> ListarMarca() {
		// TODO Auto-generated method stub
		ConexionBBDD c = new ConexionBBDD();
		ArrayList<String> listaMarcas = new ArrayList<>();
		connection = c.Conexion();

		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery("SELECT * FROM marca");

			while (rs.next()) {

				String nombre = rs.getString(2);
				listaMarcas.add(nombre);
				//System.out.println(nombre);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMarcas;

	}

}
