/** Programa que a partir de dos numero realiza la potencia Hola xD*/
import java.util.Scanner;
public class Potencia {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int potencia;
		double resultado = 0;
		
		//Leer n?mero y potencia
		System.out.println("Introduzca el n?mero a elevar");
		numero = teclado.nextInt();
		System.out.println("Introduzca la potencia");
		potencia = teclado.nextInt();
		
		// Realizar la potencia
		for (int i = 1; i < potencia; i++) {
			
			if (i == 1) {
				resultado = numero * numero;
			}else {
				resultado = numero * resultado;
			}
			
			
		}
		System.out.println(resultado);
	}

}
