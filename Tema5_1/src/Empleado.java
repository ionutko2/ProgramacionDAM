/**
 * 
 * 	Crear una clase llamada Empleado que contenga como datos miembro el nombre y
 * 	el número de empleado, y como métodos miembro leerDatos( ) para leer los datos
 * 	desde teclado y verDatos( ) para mostrarlos en pantalla, además de los getters y
 *	setters que sean necesarios.
 *
 */
import java.util.Scanner;
public class Empleado {
	Scanner teclado = new Scanner(System.in);
	private String nombreEmpleado;
	private int numeroEmpleado;
	
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	void leerDatos(){
		System.out.println("Escriba el nombre del empleado:");
		setNombreEmpleado(teclado.nextLine());
		System.out.println("Escriba el número del empleado");
		setNumeroEmpleado(teclado.nextInt());
	}
	void verDatos() {
		System.out.println("El nombre del empleado es: " + getNombreEmpleado());
		System.out.println("El número del empleado es: " + getNumeroEmpleado());
	}
	
}
