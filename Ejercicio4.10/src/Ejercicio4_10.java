
import java.util.Scanner;
public class Ejercicio4_10{
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		String fecha = "";
		char sexo = 0;
		char curso = 0;
		char letra;
		String codigo= "";
		int error = 0;
		int contador1M = 0;
		int contador2M = 0;
		int contador1H = 0;
		int contador2H = 0;
		final String cadena0 = "00000000";
		int S = codigo.compareTo(cadena0);
		System.out.println(S + "comparación");
		// Leer número
		while (S <= 0) {
			S = codigo.compareTo(cadena0);
			System.out.println("Escriba un código de 8 carácteres");
			codigo = teclado.nextLine();
			System.out.println(S + "comparación");
			for(int i = 0; i < 8; i++) {
				letra = codigo.charAt(i);
				for (int a = 0; a < 5
						; a++) {
					if (i < 4) {
						fecha += letra;
					}
					if (i == 4) {
						sexo = letra;
					}
					if (i == 5) {
						curso = letra;
					}
				}
				int f1 = fecha.compareTo("1990");
				int f2 = fecha.compareTo("1991");
				int f3 = fecha.compareTo("1992");
				int f4 = fecha.compareTo("1993");
				int f5 = fecha.compareTo("1994");
				int f6 = fecha.compareTo("1995");
				int comparar = f1 * f2 * f3 * f4 * f5 * f6 * f1;
				if (i > 6) {
					if (comparar < 0) {
						error++;
					}else {
						switch (curso) {
						case '1':
							switch (sexo) {
							case 'M','m':
								contador1M++;
							break;
							case 'H','h':
								contador1H++;
							break;
							default:
								error++;
							}
							break;
						case '2':
							switch (sexo) {
							case 'M','m':
								contador2M++;
							break;
							case 'H','h':
								contador2H++;
							break;
							default:
							error++;
							}
						default:
							error++;
						}
					}
				}
				
				
			}
			
				S = 0;
				System.out.println(S + "comparación");
			
			
		}
		System.out.println("En el primer curso hay: " + contador1M +" mujeres y " + contador1H + " hombres y en el segundo curso hay: " + contador2M + " mujeres y " + contador2H + " hombres." );
		System.out.println("El número de códigos erróneos ha sido de: " + error);
		
					
				
		
		
	}
}