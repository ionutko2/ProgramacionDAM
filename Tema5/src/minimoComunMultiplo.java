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
		System.out.println("Escriba un número");
		q = teclado.nextInt();
		System.out.println("Escriba otro número");
		p = teclado.nextInt();
		mcm = mcm(q,p);
		System.out.println("El mínimo común múltiplo de " + q + " y " + p + " es " + mcm);
	}
}
