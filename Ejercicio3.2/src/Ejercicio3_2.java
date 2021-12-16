/** Leer numero comprendido entre 1 y 10 e imprimir su respectiva tabla de multiplicar
 * fecha: 02/11/2021
 * @author
 **/

import java.util.Scanner;
public class Ejercicio3_2{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int multiplicacion = 0;
		
		// Leer numero
		System.out.println("Introduzca un número comprendido entre 1 y 10 ");
		numero = teclado.nextInt();
		
		//comprobar si el numero esta comprendido entre 1 y 10 e imprimir en pantalla la tabla
		if (numero >= 1 && numero <= 10) {
			System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
			for (int i=1;i<=10;i++){
			 multiplicacion = 0;
			 multiplicacion = numero * i;
			 System.out.println(numero +" * " + i + "=" + multiplicacion);	
			}		
		}else {System.out.println("Número no válido");}
	}
}