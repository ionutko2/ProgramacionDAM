/** Programa capaz de sumar los n�mero con la posici�n 
 * par por un lado y los n�mero con la posici�n impar por otro
 * hasta que el n�mero sea 0
 */
import java.util.Scanner;
public class Ejercicio3_6{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int suma1 = 0;
		int suma2 = 0;
		int numero;
		int contador = 1 ;
		
		System.out.println("Introduzca un n�mero");
		numero = teclado.nextInt();
		// Ver que posici�n tiene el n�mero escrito y acorde a eso sumar donde corresponda
		while (numero != 0) {
			if (contador % 2 == 0) {
				suma1 = suma1 + numero;
			}
			else {
				suma2 = suma2 + numero;
			}
			System.out.println("Introduzca un n�mero");
			numero = teclado.nextInt();
			contador++;
		}
		System.out.println("Los n�meros sumados en la posici�n par dan como resultado: " + suma1);
		System.out.println("Los n�meros sumados en la posici�n impar dan como resultado: " + suma2);
	} 
}