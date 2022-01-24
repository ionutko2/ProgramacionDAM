import java.util.Scanner;
public class PruebaDisco {
	public static void main (String [] args) {
		Scanner teclado = new Scanner(System.in);
		Disco prueba = new Disco();
		System.out.println("Escriba el título del disco");
		prueba.setTitulo(teclado.nextLine());
		System.out.println("Escriba el número de canciones del disco");
		prueba.setNumeroCanciones(teclado.nextInt());
		System.out.println("Escriba el precio del disco");
		prueba.setPrecio(teclado.nextInt());
		System.out.println("Escriba la fecha de compra del disco");
		teclado.nextLine();
		prueba.setFechaCompra(teclado.nextLine());
		System.out.println("Título del disco: " + prueba.getTitulo());
		System.out.println("Numero de canciones: " + prueba.getNumeroCanciones());
		System.out.println("Precio: " + prueba.getPrecio());
		System.out.println("Fecha de la compra: " + prueba.getFechaCompra());
	}
}
