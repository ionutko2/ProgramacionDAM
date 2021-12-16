/** Programa que permita eligiendo una figura calculr su área*/
import java.util.Scanner;
public class Ejercicio3_12{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elija una de estas figuras para calcular su área: Triángulo(1), Cuadrado(2) o Rectángulo(3)");
		int figura;
		float base;
		float altura;
		float ladol;
		float ladoc;
		float lado;
		float area;
		
		// Calcular el área de la figura deseada
		figura = teclado.nextInt();
		if (figura == 1) {
			System.out.println("Escriba el tamaño de la base");
			base = teclado.nextFloat();
			System.out.println("Escriba el tamaño de la altura");
			altura = teclado.nextFloat();
			area = base * altura / 2;
			System.out.println("El área de este triángulo es " + area);
		}else if (figura == 2) {
			System.out.println("Escriba el tamaño del lado ");
			lado = teclado.nextFloat();
			area = lado * lado;
			System.out.println("El área de este cuadrado es " + area);
		}else if (figura == 3) {
			System.out.println("Escriba el tamaño de un lado");
			ladol = teclado.nextFloat();
			System.out.println("Escriba el tamaño del otro lado");
			ladoc = teclado.nextFloat();
			area = ladol * ladoc;
			System.out.println("El área de este rectángulo es " + area);
			
		}
	}
}