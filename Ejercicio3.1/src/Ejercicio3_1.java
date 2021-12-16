/**
 * Realiza la suma de todos los números comprendidos entre dos números, 
 * sin icluirlos, y la imprime
 * fecha: 02/11/2021
 * @author
 */
import java.util.Scanner;
public class Ejercicio3_1 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b; // números extremos
		
		//Leo los numeros A yB, extremos de los que debo sumar
		System.out.println("Introduzca el número menor: ");
		a = teclado.nextInt();
		System.out.println("Introduzca el número mayor: ");
		b = teclado.nextInt();
		
		//Sumo los números entre A y B sin incluirlos
		int suma = 0;
		for (int contador = a+1; contador < b; contador++) {
			suma += contador;
		}
		System.out.println("La suma es " + suma);
	}
}
