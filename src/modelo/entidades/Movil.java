package modelo.entidades;

public class Movil {

	private int idMovil;
	private String nombre;
	private String marca;
	private String procesador;
	private int memoria;
	private int bateria;
	private String foto;
	private int precio;
	private int stock;
	
	public Movil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movil(int idMovil, String nombre, String marca, String procesador, int memoria, int bateria, String foto,
			int precio, int stock) {
		super();
		this.idMovil = idMovil;
		this.nombre = nombre;
		this.marca = marca;
		this.procesador = procesador;
		this.memoria = memoria;
		this.bateria = bateria;
		this.foto = foto;
		this.precio = precio;
		this.stock = stock;
	}

	public int getIdMovil() {
		return idMovil;
	}

	public void setIdMovil(int idMovil) {
		this.idMovil = idMovil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Movil [idMovil=" + idMovil + ", nombre=" + nombre + ", marca=" + marca + ", procesador=" + procesador
				+ ", memoria=" + memoria + ", bateria=" + bateria + ", foto=" + foto + ", precio=" + precio + ", stock="
				+ stock + "]";
	}
	
	
	
	
	
}
