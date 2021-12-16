/** Programa que ha partir de una frase la divide en dos: una que contiene los carácteres pares y otro lols impares */
import java.util.Scanner;
public class Ejercicio4_5{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		//int contador = 1; 
		
		// Leer una frase
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		String par = "";
		String impar = "";
		// Dividir la frase en dos 
		if (frase.length() <= 80) {
		
			for (int i=0; i < frase.length();i++) {
				if (i % 2 != 0) {
					impar += frase.charAt(i);
				}else {
					par += frase.charAt(i);
				}
			}
			System.out.println("par: " + par);
		System.out.println("impar: " + impar);
		}
		else System.out.println("La frase tiene más de 80 carácteres");
	}
}