package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidades.Marca;
import modelo.entidades.Movil;
import utilidades.ConexionBBDD;

public class MetodosMovilesImp implements IMetodosMoviles {

	// Statement st = null;
	ResultSet rs = null;
	Connection connection = null;

	@Override
	public ArrayList<Marca> listarMarca() {
		// TODO Auto-generated method stub
		ConexionBBDD c = new ConexionBBDD();
		ArrayList<Marca> listaMarcas = new ArrayList<>();
		connection = c.Conexion();

		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery("SELECT * FROM marca");

			while (rs.next()) {
				Marca marca = new Marca(rs.getInt(1), rs.getString(2));
				listaMarcas.add(marca);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--- en capa datos");
		System.out.println("num marcas: "+listaMarcas.size());
		System.out.println("lista: "+listaMarcas);
		return listaMarcas;

	}

	@Override
	public ArrayList<Movil> listarMovilMarca(int idMarca) {
		ConexionBBDD c = new ConexionBBDD();
		ArrayList<Movil> listaMovilesMarca = new ArrayList<Movil>();
		connection = c.Conexion();

		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery("SELECT idMovil, movil.nombre, procesador, memoria, bateria, foto, precio, stock, marca.idMarca, marca.nombre "
					+ "FROM movil INNER JOIN marca ON movil.idMarca = marca.idMarca WHERE movil.idMarca= "+idMarca+"");
			
					while (rs.next()) {
						/*
						Movil movil = new Movil(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
						listaMoviles.add(movil);
						*/
						Movil movil = new Movil();
						movil.setIdMovil(rs.getInt(1));
						movil.setNombre(rs.getString(2));
						movil.setProcesador(rs.getString(3));
						movil.setMemoria(rs.getInt(4));
						movil.setBateria(rs.getInt(5));
						movil.setFoto(rs.getString(6));
						movil.setPrecio(rs.getInt(7));
						movil.setStock(rs.getInt(8));
						Marca marca =new Marca (rs.getInt(9), rs.getString(10));
						movil.setMarca(marca);
						listaMovilesMarca.add(movil);
					}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMovilesMarca;
	}

	@Override
	public ArrayList<Movil> listarMoviles() {
		// TODO Auto-generated method stub
		
		ConexionBBDD c = new ConexionBBDD();
		ArrayList<Movil> listaMoviles = new ArrayList<>();
		connection = c.Conexion();
		
		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery("SELECT idMovil, movil.nombre, procesador, memoria, bateria, foto, precio, stock, marca.idMarca, marca.nombre "
					+ "FROM movil INNER JOIN marca ON movil.idMarca = marca.idMarca");
			
					while (rs.next()) {
						/*
						Movil movil = new Movil(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
						listaMoviles.add(movil);
						*/
						Movil movil = new Movil();
						movil.setIdMovil(rs.getInt(1));
						movil.setNombre(rs.getString(2));
						movil.setProcesador(rs.getString(3));
						movil.setMemoria(rs.getInt(4));
						movil.setBateria(rs.getInt(5));
						movil.setFoto(rs.getString(6));
						movil.setPrecio(rs.getInt(7));
						movil.setStock(rs.getInt(8));
						Marca marca =new Marca (rs.getInt(9), rs.getString(10));
						movil.setMarca(marca);
						listaMoviles.add(movil);
					}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listaMoviles;
	}

	@Override
	public Movil bucarMovil(int idMovil) {
		// TODO Auto-generated method stub
		ConexionBBDD c = new ConexionBBDD();
		System.out.println(idMovil);
		Movil movil = new Movil();
		connection = c.Conexion();
		
		try {
			Statement st = connection.createStatement();
			rs = st.executeQuery("SELECT idMovil, movil.nombre, procesador, memoria, bateria, foto, precio, stock, marca.idMarca, marca.nombre "
					+ "FROM movil INNER JOIN marca ON movil.idMarca = marca.idMarca WHERE movil.idMovil="+idMovil+"");

			while (rs.next()) {
			
			movil.setIdMovil(rs.getInt(1));
			movil.setNombre(rs.getString(2));
			movil.setProcesador(rs.getString(3));
			movil.setMemoria(rs.getInt(4));
			movil.setBateria(rs.getInt(5));
			movil.setFoto(rs.getString(6));
			movil.setPrecio(rs.getInt(7));
			movil.setStock(rs.getInt(8));
			Marca marca = new Marca(rs.getInt(9), rs.getString(10));
			movil.setMarca(marca);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return movil;
	}

}
