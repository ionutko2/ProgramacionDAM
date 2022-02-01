/**
 * Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tamaño fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es único: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (métodos de la clase) son las siguientes:
 vaciar: vacía el conjunto.
 agregar: añade un entero al conjunto
 eliminar: retira un entero del conjunto (habrá que desplazar elementos).
 copiar: recopila un conjunto en otro
 esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
existe.
 posicion: reenvía la posición en el conjunto de un entero dado, o el valor -1 si no existe.

Ejercicios Vectores Página 2 de 2

 esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
conjuntos son iguales si tienen los mismos elementos y en el mismo orden
 imprimir: realiza la visualización del conjunto.
 * @author alu
 *
 */
import java.util.Arrays; 
import java.util.Scanner;
public class Conjunto {
	int [] numeros;
	Scanner teclado = new Scanner(System.in);
	Conjunto() {
		numeros = new int[10];
	}
	void vaciar() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =  0;
		}
	}
	void agregar() {
		int valor = 0; // Este valor lo uso para comprobar si el valor que escribe el usuario no esta repetido.
		boolean comprobar;
		boolean si = false;
		String pregunta;
		int contador = 0;
		for (int i = 0; i < numeros.length && si != true; i++) {
			System.out.println("Escriba un número");
			valor = teclado.nextInt();
			comprobar = false;
			for(int j = 0; j < numeros.length && comprobar == !true; j++) {
				if (valor == numeros[j]) {
					comprobar = true;
				}
			}
			if (comprobar == false) {
				numeros[i] = valor;
			}else {
				System.out.println("Ese valor ya se encuentra en el conjunto.");
				i--;
			}
			do {
				System.out.println("¿Quiere seguir apuntando trabajadores?(S/N)");
				teclado.nextLine();
				pregunta = teclado.nextLine();
				if(pregunta.equalsIgnoreCase("S")) {
					si = false;
					contador++;
				}else {
					si = true;
				}
			}while(pregunta.equalsIgnoreCase("S") == false && pregunta.equalsIgnoreCase("N") == false && contador < (numeros.length - 1));
		}
	}
	void eliminar() {
		int pos = 0;
		System.out.println("Elija la posisción que desee eliminar");
		pos = teclado.nextInt() - 1;
		for (int i = pos; i < numeros.length - 1; i++) {
			numeros[i] = numeros[i + 1];
		}
		numeros[numeros.length - 1] = 0;
	}
	void copiar(int [] numeros) {
		numeros = Arrays.copyOf(this.numeros, this.numeros.length);
	}
	void esMiembro() {
		boolean comprobar = false;
		int valor = teclado.nextInt();
		for(int j = 0; j < numeros.length && comprobar == true; j++) {
			if (valor == numeros[j]) {
				comprobar = true;
			}
		}
		System.out.println(comprobar);
	}
	void posicion() {
		boolean comprobar = false;
		int valor = teclado.nextInt();
		int pos = 0;
		for(int j = 0; j < numeros.length && comprobar == true; j++) {
			if (valor == numeros[j]) {
				comprobar = true;
				pos = j;
			}
		}
		if (comprobar == true) {
			System.out.println(pos);
		}else {
			System.out.println("-1");
		}
	}
	boolean esIgual(int [] numeros) {
		boolean esIgual = false;
		esIgual = Arrays.equals(this.numeros, numeros);
		return esIgual; 
	}
	void imprimir() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
	}
}
