
import java.util.Scanner;
public class Ejercicio4_7{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		// Leer una frase
		System.out.println("Escriba una frase");
		String frase = teclado.nextLine();
		char letra;
		int contadorNum = 0;
		int contadorMa = 0;
		int contadorMi = 0;
		
		// Decir cuantas may�sculas, min�sculas y n�meros tiene la frase
		for (int i = 0; i < frase.length();i++) {
			letra = frase.charAt(i);
			if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5' 
					|| letra == '6' || letra == '7' || letra == '8' || letra == '9') {
				contadorNum++;
			}else if (Character.isUpperCase(letra)) {
				contadorMa++;
			}else if (Character.isLowerCase(letra)){
				contadorMi++;
			}
		}
		System.out.println("El n�mero de n�meros en la frase es de: " + contadorNum);
		System.out.println("El n�mero de may�sculas en la frase es de: " + contadorMa);
		System.out.println("El n�mero de min�sculas en la frase es de: " + contadorMi);
	}
}