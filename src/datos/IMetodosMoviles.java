package datos;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidades.Movil;

public interface IMetodosMoviles {

	
	
	
	
	public ArrayList<String> listarMarca ();
	
	public ArrayList<Movil> listarMovilMarca (int idMarca);	
	public ArrayList<Movil> listarMoviles ();	
	public Movil bucarMovil (int idMovil);	
	
}




	


