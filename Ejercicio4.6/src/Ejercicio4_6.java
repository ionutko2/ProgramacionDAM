
import java.util.Scanner;
public class Ejercicio4_6{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		// Leer una frase
				System.out.println("Escriba una frase");
				String frase = teclado.nextLine();
				char letra;
				int contadorNum = 0;
				int contadorv = 0;
				int contadorc = 0;
				
		// Decir cuantas vocales consonantes y números tiene la frase
				for (int i = 0; i < frase.length();i++) {
					letra = frase.charAt(i);
					switch (letra) {
					case '0','1','2','3','4','5','6','7','8','9':
						contadorNum++;
					break;
					case 'a','e','i','o','u','A','E','I','O','U':
						contadorv++;
					break;
					case ' ':
						break;
					default:
						
						contadorc++;
					}
				}
				System.out.println("El número de vocales es: " + contadorv);
				System.out.println("El número de consonantes es " + contadorc);
				System.out.println("El número de numeros es " + contadorNum);
	}
}