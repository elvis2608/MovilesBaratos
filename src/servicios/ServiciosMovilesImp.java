package servicios;

import java.util.ArrayList;

import datos.IMetodosMoviles;
import datos.MetodosMovilesImp;

public class ServiciosMovilesImp implements IServiciosMoviles {

	private IMetodosMoviles datos = new MetodosMovilesImp();
	
	@Override
	public ArrayList<String> ListarMarca() {
		// TODO Auto-generated method stub
		ArrayList<String> listaMarcas = new ArrayList<>();
		
		 listaMarcas = datos.ListarMarca();
		
		
		
		return listaMarcas;
	}

}
