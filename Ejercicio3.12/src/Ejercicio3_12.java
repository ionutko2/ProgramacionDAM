/** Programa que permita eligiendo una figura calculr su �rea*/
import java.util.Scanner;
public class Ejercicio3_12{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Elija una de estas figuras para calcular su �rea: Tri�ngulo(1), Cuadrado(2) o Rect�ngulo(3)");
		int figura;
		float base;
		float altura;
		float ladol;
		float ladoc;
		float lado;
		float area;
		
		// Calcular el �rea de la figura deseada
		figura = teclado.nextInt();
		if (figura == 1) {
			System.out.println("Escriba el tama�o de la base");
			base = teclado.nextFloat();
			System.out.println("Escriba el tama�o de la altura");
			altura = teclado.nextFloat();
			area = base * altura / 2;
			System.out.println("El �rea de este tri�ngulo es " + area);
		}else if (figura == 2) {
			System.out.println("Escriba el tama�o del lado ");
			lado = teclado.nextFloat();
			area = lado * lado;
			System.out.println("El �rea de este cuadrado es " + area);
		}else if (figura == 3) {
			System.out.println("Escriba el tama�o de un lado");
			ladol = teclado.nextFloat();
			System.out.println("Escriba el tama�o del otro lado");
			ladoc = teclado.nextFloat();
			area = ladol * ladoc;
			System.out.println("El �rea de este rect�ngulo es " + area);
			
		}
	}
}