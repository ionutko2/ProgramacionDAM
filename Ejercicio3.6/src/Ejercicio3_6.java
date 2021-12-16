/** Programa capaz de sumar los número con la posición 
 * par por un lado y los número con la posición impar por otro
 * hasta que el número sea 0
 */
import java.util.Scanner;
public class Ejercicio3_6{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int suma1 = 0;
		int suma2 = 0;
		int numero;
		int contador = 1 ;
		
		System.out.println("Introduzca un número");
		numero = teclado.nextInt();
		// Ver que posición tiene el número escrito y acorde a eso sumar donde corresponda
		while (numero != 0) {
			if (contador % 2 == 0) {
				suma1 = suma1 + numero;
			}
			else {
				suma2 = suma2 + numero;
			}
			System.out.println("Introduzca un número");
			numero = teclado.nextInt();
			contador++;
		}
		System.out.println("Los números sumados en la posición par dan como resultado: " + suma1);
		System.out.println("Los números sumados en la posición impar dan como resultado: " + suma2);
	} 
}