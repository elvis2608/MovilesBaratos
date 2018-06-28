package datos;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.entidades.Movil;

public interface IMetodosMoviles {

	
	
	
	
	public ArrayList<String> ListarMarca ();
	
	public ArrayList<Movil> ListarMovilMarca (int idMarca);	
	public ArrayList<Movil> ListarMoviles ();	
	public Movil bucarMovil (int idMovil);	
	
}




	


