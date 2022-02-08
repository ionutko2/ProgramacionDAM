
public class TresEnRaya {
	String [][] juego;
	TresEnRaya(){
		juego = new String [3][3];
	}
	/**
	 * 
	 * @param i la posicion que elije el jugador
	 * @param j si es el jugador "O" o el jugador "X"
	 */
	void darValor(int i,String j) {
		if (i == 1 || i == 2 || 1 == 3) {
			juego [1][i] = j;
		}
		if (i == 4 || i == 5 || 1 == 6) {
			juego [2][i - 3] = j;
		}
		if (i == 7 || i == 8 || 1 == 9) {
			juego [3][i - 3] = j;
		}
	}
	void alternarJugador() {
		String j = "";
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				S
			}
		}
	}
}
