/**
 M�todo para hacer el factorial de un n�mero 
 */
import java.util.Scanner;
class factorial {
	static int factorial(int numero) {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int factorial;
		do {
		System.out.println("Dime un n�mero");
		numero = teclado.nextInt();
		}while(numero < 0);
		factorial = factorial(numero);
		System.out.println("El factorial del n�mero " + numero + " es " + factorial);
	}

}
