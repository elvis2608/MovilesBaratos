package servicios;

import java.util.ArrayList;

import modelo.entidades.Movil;

public interface IServiciosMoviles {

	public ArrayList<String> ListarMarca ();
	
	public ArrayList<Movil> listarMovilMarca (int idMarca);	
	
	public ArrayList<Movil> listarMoviles ();	
	
	public Movil bucarMovil (int idMovil);
	
	
}
