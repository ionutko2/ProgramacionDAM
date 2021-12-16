
import java.util.Scanner;
public class Examen2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dni,n;
		String letra;
		String le = ("TRWAGMYFPDXBNJZSQVHLCKE");
		boolean correcto = false;
		while(correcto == false) {
			dni = teclado.nextInt();
			letra = teclado.next();
			letra = letra.toUpperCase();
			n=dni%23;
			if(letra.charAt(0)==(le.charAt(n))) {
				correcto = true;
			}
		}

	}

}