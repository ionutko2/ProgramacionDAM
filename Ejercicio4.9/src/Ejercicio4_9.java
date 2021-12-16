
import java.util.Scanner;
public class Ejercicio4_9{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		// Leer un número y valor para sumae
				System.out.println("Escriba una frase");
				String frase = teclado.nextLine();
				frase = frase.toUpperCase();
				String nuevafrase = ""; 
				char letra;
				System.out.println("Escriba un número del 1 al 10");
				int valor = teclado.nextInt();
				
				//Hacer el  cifrado César
				for (int i = 0;i < frase.length();i++) {
					letra = frase.charAt(i);
					letra += valor;
					if (letra>'Z') {
						letra -= 26;
					}
					if (letra == ' ' + valor) {
						letra -= valor;
					}nuevafrase += letra;
					
				}System.out.println(nuevafrase);
	}
}