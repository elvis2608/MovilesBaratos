package servicios;


import modelo.entidades.Movil;

public interface IServiciosAdmin {
	
	

	public void addMovil(Movil movil);
	
	public void deleteMovil(int idMovil);
	
	public void updateMovil(Movil movil);
}
