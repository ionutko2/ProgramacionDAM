import java.util.Scanner;
class minimoComunMultiplo {
	static int mcm (int q, int p) {
		int mcm;
		mcm = (q * p)/maximoComunDivisorDeDosNumeros.mcd(q, p);
		return mcm;
	}
	public static void main (String [] args) {
		int q,p;
		int mcm;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un n�mero");
		q = teclado.nextInt();
		System.out.println("Escriba otro n�mero");
		p = teclado.nextInt();
		mcm = mcm(q,p);
		System.out.println("El m�nimo com�n m�ltiplo de " + q + " y " + p + " es " + mcm);
	}
}
