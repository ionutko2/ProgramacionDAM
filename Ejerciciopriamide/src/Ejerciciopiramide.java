
import java.util.Scanner;
public class Ejerciciopiramide{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int filas = teclado.nextInt();
		int contador = 0;
		int numero = 0;
		int columnas = 3;
		int contador2 = 1;
		while (1 > contador) {
			numero++;
			System.out.println(numero);
			contador++;
		}
		while (filas > contador) {
			System.out.println(" ");
			while (columnas >= contador2) {
				System.out.print(numero);
				contador2++;
			}
			contador++;
			columnas++;
			contador2 = 0;
		}	
	}
}