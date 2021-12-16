/** Programa que lea una frase e imprima el nùmero de minúsculas y mayúsculas que contenga*/
import java.util.Scanner;
public class Ejercicio4_2{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int mayuscula = 0;
		int contador2 = 0;
		int minuscula = 0;
		// Leer una frase
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		int tamaño = frase.length();
		
		// Contar el número de letras que son mayúsculas y minúsculas
		while(contador2 < tamaño) {
			if (Character.isUpperCase(frase.charAt(contador2))) {
			mayuscula++;
			}if (Character.isLowerCase(frase.charAt(contador2))) {
			minuscula++;
			}
			contador2++;
		}
		System.out.println("El número de mayúsculas que contiene la frase es " + mayuscula);
		System.out.println("El número de minúsculas que contiene la frase es " + minuscula);
	}
}
