/** Programa que lea una frase e imprima el n�mero de min�sculas y may�sculas que contenga*/
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
		int tama�o = frase.length();
		
		// Contar el n�mero de letras que son may�sculas y min�sculas
		while(contador2 < tama�o) {
			if (Character.isUpperCase(frase.charAt(contador2))) {
			mayuscula++;
			}if (Character.isLowerCase(frase.charAt(contador2))) {
			minuscula++;
			}
			contador2++;
		}
		System.out.println("El n�mero de may�sculas que contiene la frase es " + mayuscula);
		System.out.println("El n�mero de min�sculas que contiene la frase es " + minuscula);
	}
}
