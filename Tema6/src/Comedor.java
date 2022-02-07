
public class Comedor {
	
	void platos() {
		String [] platos = new String[6];
		platos [0] = "enslada";
		platos [1] = "patatas fritas";
		platos [2] = "sopa de lentejas";
		platos [3] = "fideuá";
		platos [4] = "oreja de unicornio pegaso";
		platos [5] = "elefante en mal estado";
	}
	void ingredientesPrecio() {
		String [] platos = new String[6];
		platos [0] = "Ingredientes = lechuga, tomate, pepino, cebolla Precio = 4 €";
		platos [1] = "Ingredientes = patatas (no me lo esperaba la verdad, pensaba que estaba hecho de tiera) Precio = 4€";
		platos [2] = "Ingredientes = lentejas Precio = 7 €";
		platos [3] = "Ingredientes = arroz, tomate, sal, huevo, mejillones, pimiento, cebolla y ajo Precio = 12€";
		platos [4] = "Ingredientes = oreja de unicornio pegaso Precio = 470€";
		platos [5] = "Ingrediented = elefante Precio = 102€";
	}
	void pedirMenu() {
		Comedor platos = new Comedor();
		String [][] menu = new String [100][2];
		int j = 0;
		for(int i = 0; i < 2; i++) {
			String [j][i] = platos.platos();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
