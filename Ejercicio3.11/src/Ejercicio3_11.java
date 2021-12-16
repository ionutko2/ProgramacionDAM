/** programa que dado un número imprima de todos los primos hasta dicho número*/
import java.util.Scanner;
public class Ejercicio3_11{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1; 
		int contador = 2;
		
		// Leer número 
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		System.out.println("Los números primos por debajo de " + numero + " son:");
		
		//Calcular el número primo más próximo
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