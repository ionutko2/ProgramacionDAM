
import java.util.Scanner;
class maximoComunDivisorDeDosNumeros {
	static int mcd (int q, int p) {
		int mcd = 0;
		boolean esDivisor = false;
		for (int i = q;esDivisor != true;i--) {
			if (q % i == 0) {
				if (p % i == 0) {
					esDivisor = true;
					mcd = i;
				}
			}
		}
		return mcd;
	}
	public static void main (String [] args) {
		int q,p;
		int mcd;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un n�mero");
		q = teclado.nextInt();
		System.out.println("Escriba otro n�mero");
		p = teclado.nextInt();
		mcd = mcd(q,p);
		System.out.println("El m�ximo com�n divisor de " + q + " y " + p + " es " + mcd);
	}

}
