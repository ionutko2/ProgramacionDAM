package cuentas;
import java.util.Random;
public class NombreAleatorio {
	Random r = new Random();
	String [] nombres = {"Andrea", "Antonio", "Federico", "Javier", "Miguel", "Marta", 
			"Mar�a", "Bel�n", "Carmen", "Isabel", "Marcos", "Mario", "Samuel", "Sara",
			"Luc�a", "Guillermo", "In�s"};
	String [] apellidos = {"Garc�a", "Sancho", "Mart�nez", "Rodr�guez", "P�rez", "Sierra", "Serrano",
			"Sobreviela", "Coma", "Duc", "Mall�n", "Ara"};
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
