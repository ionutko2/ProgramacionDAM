/** Dado un número encontrar el primo más próximo mayor que él */
import java.util.Scanner;
public class Ejercicio3_10{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1; 
		int contador = 2;
		
		// Leer número 
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		
		//Calcular el número primo más próximo
		while (contador > 1) {
			numero++;
			contador = 0;
			divisor = 1;
			while (numero > divisor) {
				if (numero % divisor == 0) {
					contador++; 
				}
				divisor++; 
			}
					
		}
		System.out.println("El número primo más próximo es el  " + numero);
	}
}