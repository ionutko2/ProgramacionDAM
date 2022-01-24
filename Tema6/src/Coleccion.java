/**
 * Crea una clase que nos permita almacenar una colección de discos. El nombre de la clase será
Coleccion. Los datos miembro serán:
 Un vector de 100 elementos de la clase Disco.
 Un entero al que llamaremos índice que servirá para saber cuántos discos hemos
almacenado en la colección.
Diseña los métodos necesarios para gestionar la colección.
 * @author alu
 *
 */
import java.util.Scanner;
public class Coleccion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Disco [] coleccionDiscos = new Disco[100];
		Disco disco = new Disco();
		
		String pregunta = "";
		boolean si = false;
		
		for (int i = 0;si != true && i < coleccionDiscos.length; i++) {
			coleccionDiscos[i] = disco;
			System.out.println("Escriba el título del disco");
			coleccionDiscos[i].setTitulo(teclado.nextLine());
			System.out.println("Escriba el numero de canciones del disco");
			coleccionDiscos[i].setNumeroCanciones(teclado.nextInt());
			System.out.println("Escriba el precio del disco");
			coleccionDiscos[i].setPrecio(teclado.nextInt());
			System.out.println("Escriba la fecha de compra del disco");
			teclado.nextLine();
			coleccionDiscos[i].setFechaCompra(teclado.nextLine());
			System.out.println("¿Quiere seguir aumentando su colección?(S/N)");
			pregunta = teclado.nextLine();
			if(pregunta.equalsIgnoreCase("S")) {
				si = false;
			}else {
				si = true;
			}
		}
		for (int j = 0; j < coleccionDiscos.length; j++) {
			System.out.println("Índice: " + (j + 1) + " Título: " + coleccionDiscos[j].getTitulo() + 
					" Número de canciones: " + coleccionDiscos[j].getNumeroCanciones() +  
					" Precio: " + coleccionDiscos[j].getPrecio() +" Fecha de compra: " + coleccionDiscos[j].getFechaCompra());
		}

	}

}
