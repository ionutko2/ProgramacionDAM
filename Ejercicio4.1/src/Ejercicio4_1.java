/** Programa capaz de leer una frase (max 80 car�cteres) y la imprima a�adiendo una letra cada vez */
import java.util.Scanner;
public class Ejercicio4_1{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		
		// Leer una frase
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		int tama�o = frase.length();
		
		//Hacer que imprima la frase empezando con un car�cter
		if (tama�o < 80) {
			while(contador <= tama�o) {
				String posicion = frase.substring(0,contador);
				System.out.println(posicion);
				contador++;
			}
		}else System.out.println("La frase tiene m�s de 80 car�cteres");
	}
}