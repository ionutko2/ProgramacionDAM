/** Programa capaz de leer una cadena y cpasarla a may�sculas o min�sculas mediante una variable */
import java.util.Scanner;
public class Ejercicio4_4{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		// Leer cadena
		System.out.println("Escriba lo que desee");
		String cadena = teclado.nextLine();
		
		//Elegir si quiere pasarlo a min�sculas o may�sculas
		System.out.println("Escriba 1 si quiere pasarlo a may�sculas o 2 si quiere pasarlo a min�sculas");
		int opcion = teclado.nextInt();
		if(cadena.length() < 80){
			if (opcion == 1) {
				System.out.println(cadena.toUpperCase());
			}else if (opcion == 2) {
				System.out.println(cadena.toLowerCase());
			}
		}
	}
}