

import java.util.Scanner;
public class Ejer3 {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int d1,d2,m1,m2,a1,a2,cont;
		d1=teclado.nextInt();
		m1=teclado.nextInt();
		a1=teclado.nextInt();
		d2=teclado.nextInt();
		m2=teclado.nextInt();
		a2=teclado.nextInt();
		for(cont=0;a1<a2;++a1) {
			if(a1%4==0)cont+=366;
			else cont+=365;
		}
		if(m1<m2)cont+=30*(m1-m2);
		else cont -= 30*(m2-m1);
		if(d1<d2)cont+=d1-d2;
		else cont -= d2-d1;
		System.out.println(cont);
	}
}