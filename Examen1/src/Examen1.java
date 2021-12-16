
import java.util.Scanner;
public class Examen1{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		//Leer número
		System.out.println("Introduzca un número.");
		int numero = teclado.nextInt();
		int numero1 = numero;
		int numero2 = numero;
		int contador = 0;
		
	
		for (int i = 0; i < numero; i++) {
			numero1--;
			contador = 0;
			for (int a = 0; a < numero1; a++) {
				System.out.print(" ");
				contador++;
			}
			while (contador < numero) {
				
				System.out.print("*");
				contador++;
			}
			System.out.println();
		}
	}
}