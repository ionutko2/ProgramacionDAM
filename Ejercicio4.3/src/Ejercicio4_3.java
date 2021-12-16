/** Programa que lea una frase y una palabra y que nos diga la posición 
 de dicha palabra en la frase y si no la encuentra devuelva un cero. */
import java.util.Scanner;
public class Ejercicio4_3{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		//Leer una frase y una palabra
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		System.out.println("Escriba una palabra");
		String palabra = teclado.nextLine();
		
		if (frase.indexOf(palabra)>=0) {
			System.out.println(frase.indexOf(palabra));
		}else {
			System.out.println("0");
		}
	}
}