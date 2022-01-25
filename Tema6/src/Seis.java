import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Trabajador [] numeroTrabajadores = new Trabajador[50];
		int contador = 0;
		String pregunta = "";
		boolean si = false;
		
		for (int i = 0;si != true && i < numeroTrabajadores.length; i++) {
			numeroTrabajadores[i] = new Trabajador();
			numeroTrabajadores[i].modificar(i + 1);
			System.out.println("Escriba su nombre");
			numeroTrabajadores[i].setNombre(teclado.nextLine());
			System.out.println("Indique su estado civil (S/C)");
			numeroTrabajadores[i].setEstadoCivil(teclado.next().charAt(0));
			System.out.println("Indique el turno que realiza (D/N)");
			numeroTrabajadores[i].setTurno(teclado.next().charAt(0));
			System.out.println("Escriba el nivel de titulación (0-4)");
			numeroTrabajadores[i].setTitulacion(teclado.nextInt());
			System.out.println("Escriba los años que lleva en la empresa");
			numeroTrabajadores[i].setAnosEmpresa(teclado.nextInt());
			
			do {
				System.out.println("¿Quiere seguir apuntando trabajadores?(S/N)");
				teclado.nextLine();
				pregunta = teclado.nextLine();
				if(pregunta.equalsIgnoreCase("S")) {
					si = false;
					contador++;
				}else {
					si = true;
				}
			}while(pregunta.equalsIgnoreCase("S") == false && pregunta.equalsIgnoreCase("N") == false);
		}
		for (int i = 0; i < numeroTrabajadores.length && i <= contador; i++) {
			System.out.println("Id trabajador: " + numeroTrabajadores[i].getNumeroId() + 
					" Nombre: " + numeroTrabajadores[i].getNombre() + " Estado civil: " +
					numeroTrabajadores[i].getEstadoCivil() + " Turno: " +
					numeroTrabajadores[i].getTurno() + " Titulación: " + 
					numeroTrabajadores[i].getTitulacion() + " Años en la empresa: " +
					numeroTrabajadores[i].getAnosEmpresa());
		}
	}

}
