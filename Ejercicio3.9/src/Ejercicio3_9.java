/** Programa que lea un n�mero y nos diga si es perfecto o no.*/
import java.util.Scanner;
public class Ejercicio3_9{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1;
		int suma = 0;
		
		// Leer n�mero 
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		
		//Calcular divisores del n�mero 
		while (numero > divisor) {
			if (numero % divisor == 0) {
				suma = suma + divisor;
				
			}
				divisor++;
		}
		// Decir si el n�meor es perfecto o no
		if (numero == suma) {
			System.out.println("El n�mero " + numero + " es un n�mero perfecto");
		}else {
			System.out.println("El n�mero " + numero + " no es un n�mero perfecto");
		}
	}
}