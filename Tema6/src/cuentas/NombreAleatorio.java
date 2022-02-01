package cuentas;
import java.util.Random;
public class NombreAleatorio {
	Random r = new Random();
	String [] nombres = {"Andrea", "Antonio", "Federico", "Javier", "Miguel", "Marta", 
			"María", "Belén", "Carmen", "Isabel", "Marcos", "Mario", "Samuel", "Sara",
			"Lucía", "Guillermo", "Inés"};
	String [] apellidos = {"García", "Sancho", "Martínez", "Rodríguez", "Pérez", "Sierra", "Serrano",
			"Sobreviela", "Coma", "Duc", "Mallén", "Ara"};
	String nombreCompleto;
	NombreAleatorio(){
		nombreCompleto = nombres[r.nextInt(17)] + " " + apellidos[r.nextInt(12)] + " " + apellidos[r.nextInt(12)];
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
