/** Programa que lea un número y nos diga si es perfecto o no.*/
import java.util.Scanner;
public class Ejercicio3_9{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1;
		int suma = 0;
		
		// Leer número 
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		
		//Calcular divisores del número 
		while (numero > divisor) {
			if (numero % divisor == 0) {
				suma = suma + divisor;
				
			}
				divisor++;
		}
		// Decir si el númeor es perfecto o no
		if (numero == suma) {
			System.out.println("El número " + numero + " es un número perfecto");
		}else {
			System.out.println("El número " + numero + " no es un número perfecto");
		}
	}
}