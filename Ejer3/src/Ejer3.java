

import java.util.Scanner;
public class Ejer3 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia,mes,ano,diaac,mesac,anoac,suma,i,ii;
		dia = teclado.nextInt();
		mes = teclado.nextInt();
		ano = teclado.nextInt();
		diaac = teclado.nextInt();
		mesac = teclado.nextInt();
		anoac =teclado.nextInt();
		suma = 0;
		
		for (i = mes; i <= 12; i++) {
			if (i == mes) {
				if (mes == 2) {
					if (ano % 4 == 0) {
						suma = suma + 29 - dia;
					}else {
						suma = suma + 28 - dia;
					}
				}
				if (mes % 2 == 0) {
					suma = suma + 30 - dia;
				}
				if (mes % 2 != 0) {
					suma = suma + 31 - dia;
				}
			}
			if (mes == 2) {
				if (ano % 4 == 0) {
					suma = suma + 29;
				}else {
					suma = suma + 28 - dia;
			}
			if (mes % 2 == 0) {
				suma = suma + 30;
			}
			if (mes % 2 != 0) {
				suma = suma + 31;
			}
		}
		ano++;
		for ()
	}
}