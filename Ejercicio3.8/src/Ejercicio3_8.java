/** Programa que lea un n�mero y haga su factorial*/
import java.util.Scanner;
public class Ejercicio3_8{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numeroi;
		int numero;
		int factorial = 1;
		
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		numeroi = numero;
		
		while (numero != 0) {
			factorial = factorial * numero;
			numero--;
		}
		System.out.println("El factorial de " + numeroi + " es " + factorial);
	}
}