/** Programa capaz de interpretar un n�mero y verificar si es primo*/
import java.util.Scanner;
public class Ejercicio3_4{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1; 
		int contador = 0;
		// Leer n�mero 
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		
		//Decir si el numero es primo o no
		while (numero > divisor) {
			if (numero % divisor == 0) {
				contador++; 
			}
			divisor++;
		}
		if (contador > 1) {
			System.out.println("El n�mero " + numero + " no es primo");
		}else {
			System.out.println("El n�mero " + numero + " es primo");
		}
	}	
}