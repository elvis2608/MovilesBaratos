package modelo.entidades;

/**
 * Clase Movil
 *
 * Contiene toda la informaci�n del m�vil tanto informaci�n t�cnica del producto
 * como la informaci�n sobre el objeto en web.
 *
 * @author Gamero
 * @version 1.0
 */
public class Movil {
	// Atributos

	/**
	 * C�digo del producto
	 */
	private int idMovil;
	/**
	 * Nombre de la marca comercial
	 */
	private String nombre;
	/**
	 * M�delo del m�vil
	 */
	private String marca;
	/**
	 * Nombre del procesador
	 */
	private String procesador;
	/**
	 * Memoria interna del tel�fono en Gigabytes
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
	 * Precio en Euros para el cliente (sin gastos de env�o)
	 */
	private int precio;
	/**
	 * N�mero de m�viles disponibles para venta web
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
	 *            C�digo del producto
	 * @param nombre
	 *            Nombre de la marca
	 * @param marca
	 *            Modelo del m�vil
	 * @param procesador
	 *            Nombre comercial procesador
	 * @param memoria
	 *            Memoria interna m�vil
	 * @param bateria
	 *            Capacidad de la bater�a
	 * @param foto
	 *            Nombre de la foto del m�vil
	 * @param precio
	 *            Valor monetario del m�vil
	 * @param stock
	 *            M�viles disponibles
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
	 * Devuelve el id del tel�fono
	 * 
	 * @return
	 *         <ul>
	 *         <li>id del tel�fono</li>
	 *         </ul>
	 */

	public int getIdMovil() {
		return idMovil;
	}

	/**
	 * asigna al m�vil un id
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
	// Otros m�todos p�blicos

	@Override
	public String toString() {
		return "Movil [idMovil=" + idMovil + ", nombre=" + nombre + ", marca=" + marca + ", procesador=" + procesador
				+ ", memoria=" + memoria + ", bateria=" + bateria + ", foto=" + foto + ", precio=" + precio + ", stock="
				+ stock + "]";
	}

}
