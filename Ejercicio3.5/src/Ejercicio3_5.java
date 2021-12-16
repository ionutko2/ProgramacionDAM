/** sumar los numeros leidos hasta que el numero sea 0 */ 
import java.util.Scanner;
public class Ejercicio3_5{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;
		
		// Leer número y calcular la suma de los números hasta llegar al 0
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		while (numero != 0) {
			suma = suma + numero; 
			System.out.println("Introduzca un número");
			numero = teclado.nextInt();
		}
		// Imprimir en pantalla la suma obtenida
		System.out.println("La suma es " + suma);
	}	
}