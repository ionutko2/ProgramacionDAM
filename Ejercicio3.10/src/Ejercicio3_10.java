/** Dado un n�mero encontrar el primo m�s pr�ximo mayor que �l */
import java.util.Scanner;
public class Ejercicio3_10{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int divisor = 1; 
		int contador = 2;
		
		// Leer n�mero 
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		
		//Calcular el n�mero primo m�s pr�ximo
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
		System.out.println("El n�mero primo m�s pr�ximo es el  " + numero);
	}
}