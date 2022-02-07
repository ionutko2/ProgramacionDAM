import java.util.Scanner;
public class Comedor {
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
	String ingredientesPrecio(int i) {
		String [] platos = new String[6];
		platos [0] = "Ingredientes = lechuga, tomate, pepino, cebolla Precio = 4 €";
		platos [1] = "Ingredientes = patatas (no me lo esperaba la verdad, pensaba que estaba hecho de tiera) Precio = 4€";
		platos [2] = "Ingredientes = lentejas Precio = 7 €";
		platos [3] = "Ingredientes = arroz, tomate, sal, huevo, mejillones, pimiento, cebolla y ajo Precio = 12€";
		platos [4] = "Ingredientes = oreja de unicornio pegaso Precio = 470€";
		platos [5] = "Ingrediented = elefante Precio = 102€";
		return platos[i];
	}
	void pedirMenu() {
		Comedor platos = new Comedor();
		String [][] menu = new String [100][2];
		int j = 0;
		int valor;
		do {
			for(int i = 0; i < 2; i++) {
				System.out.println("¿Qué plato desea?");
				for (int k = 0; k < 6; k++) {
					System.out.println((k + 1)+ " " + platos.platos(k));
					platos.platos(k);
				}
				menu [j][i] = platos.platos(teclado.nextInt() - 1);
			}
			System.out.println("¿Quieres más menús? 1-si 2-no");
			valor = teclado.nextInt();
		}while(valor == 1);
	}
	public static void main(String[] args) {
		Comedor comedor = new Comedor();
		comedor.pedirMenu();

	}

}
