
import java.util.Scanner;
public class examen1_4correccion {
	public static void main (String [] rgs) {
		Scanner teclado = new Scanner(System.in);
		boolean valido;
		String direccion;
		String direccionLocal,direccionDominio;
		
		do {
			// Leer la direcci�n
			System.out.println("Introduzca una direcci�n de correo");
			direccion = teclado.nextLine();
			// Validar la direcci�n
			valido = true;
			if (direccion.length()>254) {
				System.out.println("La direcci�n no es v�lida");
				valido = false;
			}
			// localizar el @ y separar local y dominio
			char letra;
			int contador;
			direccionLocal = "";
			contador = 0;
			letra = ' ';
			for (int i = 0; direccion.length(); i++) {
				letra = direccion.charAt(i);
			}
		}while(hola);
	}
}
