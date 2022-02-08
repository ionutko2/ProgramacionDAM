import java.util.Scanner;
public class Comedor {
	int [] p = new int [200];
	int maximo;
	Scanner teclado = new Scanner(System.in);
	String platos(int i) {
		String [] platos = new String[6];
		platos [0] = "ensalada";
		platos [1] = "patatas fritas";
		platos [2] = "sopa de lentejas";
		platos [3] = "fideuá";
		platos [4] = "oreja de unicornio pegaso";
		platos [5] = "elefante en mal estado";
		return platos[i];
	}
	String ingredientes(int i) {
		String [] platos = new String[6];
		platos [0] = "Ensalada: Ingredientes = lechuga, tomate, pepino, cebolla";
		platos [1] = "Patatas fritas: Ingredientes = patatas (no me lo esperaba la verdad, pensaba que estaba hecho de tierra)";
		platos [2] = "Sopa de lentejas: Ingredientes = lentejas";
		platos [3] = "Fideuá: Ingredientes = arroz, tomate, sal, huevo, mejillones, pimiento, cebolla y ajo";
		platos [4] = "Oreja de unicornio pegaso: Ingredientes = oreja de unicornio pegaso";
		platos [5] = "Elefante en mal estado: Ingrediented = elefante";
		return platos[i];
	}
	int precio(int i) {
		int [] platos = new int[6];
		platos [0] = 4;
		platos [1] = 4;
		platos [2] = 7;
		platos [3] = 12;
		platos [4] = 470;
		platos [5] = 102;
		return platos[i];
	}
	void pedirMenu() {
		Comedor platos = new Comedor();
		String [][] menu = new String [100][2];
		int j = 0;
		int x = 0;
		int valor;
		do {
			for(int i = 0; i < 2; i++) {
				System.out.println("¿Qué plato desea?");
				for (int k = 0; k < 6; k++) {
					System.out.println((k + 1)+ " " + platos.platos(k));
					platos.platos(k);
				}
				p [x] = teclado.nextInt() - 1;
				menu [j][i] = platos.platos(p[i]);
				x++;
			}
			j++;
			System.out.println("¿Quieres más menús? 1-si 2-no");
			valor = teclado.nextInt();
		}while(valor == 1);
		maximo = j * 2;
	}
	void imprimirMenu() {
		int platos = 0;
		Comedor ingredientesPrecio = new Comedor();
		for (int j = 0; j < maximo/2; j++) {
			System.out.println("Menu " + (j + 1) + " Precio = " + (ingredientesPrecio.precio(p[platos]) + (ingredientesPrecio.precio(p[platos + 1]))) + "€");
			for (int i = 0; i <2;i++) {
				System.out.println(ingredientesPrecio.ingredientes(p[platos]) + " Precio = " + ingredientesPrecio.precio(p[platos]) + "€");
				platos++;
			}
		}
	}
	void pagar() {
		Comedor pagar = new Comedor();
		int total = 0;
		int dado = 0;
		int devolver = 0;
		boolean falta = false;
		for (int i = 0; i < maximo; i++) {
			total = total + pagar.precio(p[i]);
		}
		do {
			System.out.println("Debe pagar: " + total + "€");
			dado = teclado.nextInt();
			devolver = dado - total;
			if (devolver > 0) {
				System.out.println("Le devuelvo: " + devolver + "€");
				falta = false;
			}else if (devolver < 0) {
				System.out.println("Le falta por pagar: " + (-devolver));
				falta = true;
			}else { 
				System.out.println("Perfecto");
				falta = false;
			}
		}while (falta == true);
	}
	public static void main(String[] args) {
		Comedor comedor = new Comedor();
		comedor.pedirMenu();
		comedor.imprimirMenu();
		comedor.pagar();
	}

}
