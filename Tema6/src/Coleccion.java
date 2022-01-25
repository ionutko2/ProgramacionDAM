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
		int contador = 0;
		String pregunta = "";
		boolean si = false;
		
		for (int i = 0;si != true && i < coleccionDiscos.length; i++) {
			coleccionDiscos[i] = new Disco();
			System.out.println("Escriba el título del disco");
			coleccionDiscos[i].setTitulo(teclado.nextLine());
			System.out.println("Escriba el numero de canciones del disco");
			coleccionDiscos[i].setNumeroCanciones(teclado.nextInt());
			System.out.println("Escriba el precio del disco");
			coleccionDiscos[i].setPrecio(teclado.nextInt());
			System.out.println("Escriba la fecha de compra del disco");
			teclado.nextLine();
			coleccionDiscos[i].setFechaCompra(teclado.nextLine());
			do {
				System.out.println("¿Quiere seguir aumentando su colección?(S/N)");
				pregunta = teclado.nextLine();
				if(pregunta.equalsIgnoreCase("S")) {
					si = false;
					contador++;
				}else {
					si = true;
				}
			}while(pregunta.equalsIgnoreCase("S") == false && pregunta.equalsIgnoreCase("N") == false);
		}
		for (int i = 0; i < coleccionDiscos.length && i <= contador; i++) {
			System.out.println("Índice: " + (i + 1)+ "\n" + "Título: " + coleccionDiscos[i].getTitulo() + "\n" +
					"Número de canciones: " + coleccionDiscos[i].getNumeroCanciones() + "\n" +
					"Precio: " + coleccionDiscos[i].getPrecio() + "\n" + "Fecha de compra: " + coleccionDiscos[i].getFechaCompra()
					+ "\n________________________________________________________________________________");
		}

	}

}
