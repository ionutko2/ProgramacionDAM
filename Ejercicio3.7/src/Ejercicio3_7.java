/** Programa capaz de leer n�meros hasta que el n�mero sea 0, calcular la media de todos ellos
 * y decir c�al es el mayor y el menor. */

import java.util.Scanner;
public class Ejercicio3_7{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		float suma = 0;
		int mayor;
		int menor; 
		float media = 0;
		
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		mayor = numero;
		menor = numero;
		
		// Calcular la media de todos los n�mero y ver cual es el mayor y el menor
		while (numero != 0) {
			suma = suma + numero;
			if (numero >= mayor) {
				mayor = numero;
			}
			if (numero <= menor) {
				menor = numero;
			}
			System.out.println("Introduzca un n�mero");
			numero = teclado.nextInt();
		}
		media = suma/2;
		System.out.println("La media es: " + media + " el n�mero mayor es " + mayor + " y el n�mero menor es " + menor);
	}
}