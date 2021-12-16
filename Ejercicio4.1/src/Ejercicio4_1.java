/** Programa capaz de leer una frase (max 80 carácteres) y la imprima añadiendo una letra cada vez */
import java.util.Scanner;
public class Ejercicio4_1{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		
		// Leer una frase
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		int tamaño = frase.length();
		
		//Hacer que imprima la frase empezando con un carácter
		if (tamaño < 80) {
			while(contador <= tamaño) {
				String posicion = frase.substring(0,contador);
				System.out.println(posicion);
				contador++;
			}
		}else System.out.println("La frase tiene más de 80 carácteres");
	}
}