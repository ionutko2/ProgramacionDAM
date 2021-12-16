/** programa que dado un n�mero imprima de todos los primos hasta dicho n�mero*/
import java.util.Scanner;
public class Ejercicio3_11{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1; 
		int contador = 2;
		
		// Leer n�mero 
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		System.out.println("Los n�meros primos por debajo de " + numero + " son:");
		
		//Calcular el n�mero primo m�s pr�ximo
		while (numero > 2) {
			contador = 2;
			while (contador > 1) {
				numero--;
				contador = 0;
				divisor = 1;
				while (numero > divisor) {
					if (numero % divisor == 0) {
					contador++; 
					}
					divisor++; 
				}	
			}
			System.out.println(numero);
		}
	}
}