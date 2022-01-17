/**
 * 
 * 	Crear una clase Disco para guardar información sobre los discos de música que
 *	tenemos.
 *	La información asociada a cada uno de los discos es:
 *	Titulo, no de canciones, precio y fecha de compra.
 *
 */
public class Disco {
	private String titulo;
	private int numeroCanciones;
	private int precio;
	private String fechaCompra;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String título) {
		this.titulo = título;
	}
	public int getNumeroCanciones() {
		return numeroCanciones;
	}
	public void setNumeroCanciones(int numeroCanciones) {
		this.numeroCanciones = numeroCanciones;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
}
