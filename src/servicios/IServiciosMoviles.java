package servicios;

import java.util.ArrayList;

import modelo.entidades.Marca;
import modelo.entidades.Movil;

public interface IServiciosMoviles {

	public ArrayList<Marca> ListarMarca ();
	
	public ArrayList<Movil> listarMovilMarca (int idMarca);	
	
	public ArrayList<Movil> listarMoviles ();	
	
	public Movil bucarMovil (int idMovil);
	
	
}
