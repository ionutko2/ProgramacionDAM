/** Programa capaz de examinar una direcci?n de correo y devolver una se?al dependiendo 
 * si la direcci?n es correcta o no */
 
import java.util.Scanner;

public class Examen1_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String direccion = "";
		String partelocal = "";
		String dominio = "";
		int atsign = 0;
		int tama?o = 0;
		int tama?op;
		int tama?od;
		boolean restriccion;
		int ascii1; // No hace falta pasar el char a ascii, lo hice porque no sab?a que se pod?a hacer directamente con el char.
		int ascii2;

		
	do {
		// Leer direcci?n de correo y validar restriccion
		System.out.println("Escriba su direcci?n de correo electr?nico");
		direccion = teclado.nextLine();
		restriccion = true;
		// Calcular el tama?o de la direccion y encontrar el atsign
		tama?o = direccion.length() - 1;
		atsign = direccion.indexOf("@");
		
		// Restricciones
		if (atsign == -1) {
			restriccion = false; 
		}else {
			// Dividir la parte local y el dominio
			partelocal = direccion.substring(0, atsign);
			dominio = direccion.substring(atsign + 1, tama?o + 1);
			tama?op = partelocal.length();
			tama?od = dominio.length();
		if (direccion.length() <= 254) {
			if (tama?op <= 64 && tama?op > 0) {
				if (tama?od <= 255 && tama?od > 0) {
					// Restricciones para la parte local
					for (int i = 0; i < tama?op; i++) {
						ascii2 = partelocal.charAt(i);
						if (i == 0 && ascii2 == '.') {
							restriccion = false;
						}
						if (ascii2 == '.') {
							if (i == 0) {
								restriccion = false;
							}
							if (i == tama?op - 1) {
								restriccion = false;
							}else {
								if (partelocal.charAt(i + 1) == '.') {
								restriccion = false;
								}
							}
						}
					
						if ((ascii2 >= 'A' && ascii2 <= 'Z') || (ascii2 >= 'a' && ascii2 <= 'z')
							|| (ascii2 >= '0' && ascii2 <= '9') || (ascii2 == '.') || (ascii2 == '-') || (ascii2 == '_')) {
						}else {
							restriccion = false;
						}
					}
					// Restricciones para la parte del dominio
						for (int j = 0; j < tama?od; j++) {
							ascii1 = dominio.charAt(j);
							if (ascii1 == '.') {
								if (j == (atsign - tama?op)) {
									restriccion = false;
								}
								if (j == (tama?od - 1)){
									restriccion = false;
								}else {
									if (dominio.charAt(j + 1) == '.') {
									restriccion = false;
									}
								}
							}
							if ((ascii1 >= 'A' && ascii1 <= 'Z') || (ascii1 >= 'a' && ascii1 <= 'z')
									|| (ascii1 >= '0' && ascii1 <= '9') || (ascii1 == '.')) {
							} else {
								restriccion = false;
							}
						}
					}else {
						restriccion = false;
					}
				} else {
					restriccion = false;
				}
			} else {
				restriccion = false;
			}
		}
		if (restriccion == true) {
			System.out.println("El correo es correcto");
		} else {
			System.out.println("El correo es incorrecto");
		}
	}while (restriccion == false);
	}
}