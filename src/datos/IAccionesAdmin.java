package datos;

import modelo.entidades.Movil;

public interface IAccionesAdmin {

	public void addMovil(Movil movil);
	
	public void deleteMovil(int idMovil);
	
	public void updateMovil(Movil movil);
}
