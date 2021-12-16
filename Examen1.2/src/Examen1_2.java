
import java.util.Scanner;
public class Examen1_2 {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//Leer número 
		System.out.println("Escriba un número.");
		numero = teclado.nextInt();
		
		if (numero > 0) {
			//Crear bucle para escribir las lineas deseadas
			for (int i = 0; i < numero; i++) {
				//Crear bucle para los espacios en blanco
				for (int ii = i; ii < numero; ii++) {
					System.out.print(" ");
				}
				//Crear bucle para los asteriscos y pasar de linea
				for (int j = numero - i; j <= numero; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
