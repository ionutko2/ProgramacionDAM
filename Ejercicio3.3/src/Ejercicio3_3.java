/** Programa para imprimir por pantalla los divisores de un n�mero*/
import java.util.Scanner;
public class Ejercicio3_3{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1;
		
		// Leer n�mero 
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		System.out.println("Divisores de " + numero);
		
		//Calcular divisores del n�mero e imprir los resultados
		while (numero > divisor) {
			if (numero % divisor == 0) {
				System.out.println(divisor);
				
			}
				divisor++;
		}
	}   
}