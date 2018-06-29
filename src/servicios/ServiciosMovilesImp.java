package servicios;

import java.util.ArrayList;

import datos.IMetodosMoviles;
import datos.MetodosMovilesImp;
import modelo.entidades.Movil;

public class ServiciosMovilesImp implements IServiciosMoviles {

	private IMetodosMoviles datos = new MetodosMovilesImp();
	
	@Override
	public ArrayList<String> ListarMarca() {
		// TODO Auto-generated method stub
		ArrayList<String> listaMarcas = new ArrayList<>();
		
		 listaMarcas = datos.listarMarca();
		
		
		
		return listaMarcas;
	}

	@Override
	public ArrayList<Movil> listarMovilMarca(int idMarca) {
		// TODO Auto-generated method stub
		
		ArrayList<Movil> listaMovilMarca = new ArrayList<>();
		
		listaMovilMarca = datos.listarMovilMarca(idMarca);
		
		
		return listaMovilMarca;
	}

	@Override
	public ArrayList<Movil> listarMoviles() {
		// TODO Auto-generated method stub
		
		ArrayList<Movil> listaMovil = new ArrayList<>();
		
		listaMovil = datos.listarMoviles();
		
		
		
		
		return listaMovil;
	}

	@Override
	public Movil bucarMovil(int idMovil) {
		// TODO Auto-generated method stub
		
		Movil movil = new Movil();
		
		movil = datos.bucarMovil(idMovil);
		
		
		return movil;
	}

}
