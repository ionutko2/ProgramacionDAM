/* Leer número NIE y letra NIE 
 * por separado y verificar si el NIE es correcto
 */
import java.util.Scanner;
public class Examen2_2 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		char letra;
		String nie;
		int resto;
		boolean correcto;
		//Leer NIE y letra
		System.out.println("Escriba el número de su NIE");
		numero = teclado.nextInt();
		System.out.println("Escriba la letra de su NIE");
		letra = teclado.next().charAt(0);
		
		//Comprobar si el NIE es correcto 
		nie = "TRWAGMYFPDXBNJZSQVHLCKE";
		;
		do {
			resto = numero % 23;
			char letraposicion = nie.charAt(resto);
			if (letraposicion == letra) {
				correcto = true;
			}else {
				System.out.println("Escriba el número de su NIE");
				numero = teclado.nextInt();
				System.out.println("Escriba la letra de su NIE");
				letra = teclado.next().charAt(0);
				correcto = false;
			}
		}while (correcto = false);
		System.out.println("El NIE es correcto");
		}
}