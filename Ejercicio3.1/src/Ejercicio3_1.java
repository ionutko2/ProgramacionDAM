/**
 * Realiza la suma de todos los n�meros comprendidos entre dos n�meros, 
 * sin icluirlos, y la imprime
 * fecha: 02/11/2021
 * @author
 */
import java.util.Scanner;
public class Ejercicio3_1 {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int a, b; // n�meros extremos
		
		//Leo los numeros A yB, extremos de los que debo sumar
		System.out.println("Introduzca el n�mero menor: ");
		a = teclado.nextInt();
		System.out.println("Introduzca el n�mero mayor: ");
		b = teclado.nextInt();
		
		//Sumo los n�meros entre A y B sin incluirlos
		int suma = 0;
		for (int contador = a+1; contador < b; contador++) {
			suma += contador;
		}
		System.out.println("La suma es " + suma);
	}
}
