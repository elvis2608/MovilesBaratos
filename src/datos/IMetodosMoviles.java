package datos;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidades.Marca;
import modelo.entidades.Movil;

public interface IMetodosMoviles {

	
	
	
	
	public ArrayList<Marca> listarMarca ();
	
	public ArrayList<Movil> listarMovilMarca (int idMarca);	
	public ArrayList<Movil> listarMoviles ();	
	public Movil bucarMovil (int idMovil);	
	
}




	


