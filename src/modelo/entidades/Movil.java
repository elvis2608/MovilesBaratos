package modelo.entidades;

/**
 * Clase Movil
 *
 * Contiene toda la información del móvil tanto información técnica del producto
 * como la información sobre el objeto en web.
 *
 * @author Gamero
 * @version 1.0
 */
public class Movil {
	// Atributos

	/**
	 * Código del producto
	 */
	private int idMovil;
	/**
	 * Nombre de la marca comercial
	 */
	private String nombre;
	/**
	 * Módelo del móvil
	 */
	private String marca;
	/**
	 * Nombre del procesador
	 */
	private String procesador;
	/**
	 * Memoria interna del teléfono en Gigabytes
	 */
	private int memoria;
	/**
	 * Capacidad de la bateria en miliamperios/hora
	 */
	private int bateria;
	/**
	 * Nombre de la foto en el sistema
	 */
	private String foto;
	/**
	 * Precio en Euros para el cliente (sin gastos de envío)
	 */
	private int precio;
	/**
	 * Número de móviles disponibles para venta web
	 */
	private int stock;

	// Constructores

	/**
	 * Constructor por defecto
	 */
	public Movil() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con 9 parametros
	 * 
	 * @param idMovil
	 *            Código del producto
	 * @param nombre
	 *            Nombre de la marca
	 * @param marca
	 *            Modelo del móvil
	 * @param procesador
	 *            Nombre comercial procesador
	 * @param memoria
	 *            Memoria interna móvil
	 * @param bateria
	 *            Capacidad de la batería
	 * @param foto
	 *            Nombre de la foto del móvil
	 * @param precio
	 *            Valor monetario del móvil
	 * @param stock
	 *            Móviles disponibles
	 */
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

	// Getters y Setters

	/**
	 * Devuelve el id del teléfono
	 * 
	 * @return
	 *         <ul>
	 *         <li>id del teléfono</li>
	 *         </ul>
	 */

	public int getIdMovil() {
		return idMovil;
	}

	/**
	 * asigna al móvil un id
	 */

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
	// Otros métodos públicos

	@Override
	public String toString() {
		return "Movil [idMovil=" + idMovil + ", nombre=" + nombre + ", marca=" + marca + ", procesador=" + procesador
				+ ", memoria=" + memoria + ", bateria=" + bateria + ", foto=" + foto + ", precio=" + precio + ", stock="
				+ stock + "]";
	}

}
