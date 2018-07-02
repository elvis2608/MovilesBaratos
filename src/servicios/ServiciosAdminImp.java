package servicios;

import datos.AccionesAdminImp;
import datos.IAccionesAdmin;
import modelo.entidades.Movil;

public class ServiciosAdminImp implements IServiciosAdmin {

	private IAccionesAdmin datos = new AccionesAdminImp();
	
	
	@Override
	public void addMovil(Movil movil) {
		// TODO Auto-generated method stub
		
		datos.addMovil(movil);
	}

	@Override
	public void deleteMovil(int idMovil) {
		// TODO Auto-generated method stub
		
		datos.deleteMovil(idMovil);
	}

	@Override
	public void updateMovil(Movil movil) {
		// TODO Auto-generated method stub
		
		datos.updateMovil(movil);
	}
	

}
