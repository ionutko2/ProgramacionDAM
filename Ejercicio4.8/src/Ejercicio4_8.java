
import java.util.Scanner;
public class Ejercicio4_8{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		// Leer un número
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		frase = frase.toUpperCase();
		String nuevafrase = ""; 
		char letra;
		int valor;
		
		//Hacer el  cifrado César
		for (int i = 0;i < frase.length();i++) {
			letra = frase.charAt(i);
			letra +=3;
			if (letra>'Z') {
				letra -= 26;
			}nuevafrase += letra;
			
		}System.out.println(nuevafrase);
	}
}