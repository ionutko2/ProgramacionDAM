/** Programa capaz de leer un numero e interpretarlo para realizar una pir�mide que va
 * de derecha a izquierda */
 
import java.util.Scanner;
public class SI {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int numero1;
		int contador;
		
		// Leer numero
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		
		numero1 = numero;
		
		for (int i = 0; i < numero; i++) {
			numero1--;
			contador = 0;
			for (int j = 0; j < numero1; j++) {
				System.out.print(" ");
				contador++;
			}
			while (contador < numero)  {
				System.out.print("*");
				contador++;
			}
			System.out.println("");
		}
	}

}
