/**
 * Método para dar todos los números primos hasta el número recibido.
 */
import java.util.Scanner;
public class numerosPrimosHastaDichoNumero {
	static String primos(int numero) {
		String primos = "";
		int contadorprim = 0;
		int divisor;
		numero++;
		while (numero > 2) {
			contadorprim = 2;
			while (contadorprim > 1) {
				numero--;
				contadorprim = 0;
				divisor = 1;
				while (numero > divisor) {
					if (numero % divisor == 0) {
					contadorprim++; 
					}
					divisor++; 
				}	
			}
			primos = primos + " " + numero;
		}
		return primos;
	}
	public static void main (String [] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		String primos;
		System.out.println("Escriba un número positivo");
		numero = teclado.nextInt();
		primos = primos(numero);
		System.out.println("Los numeros primos que se encuentran antes del número " + numero + " son: " + primos);
		
		
	}

}
