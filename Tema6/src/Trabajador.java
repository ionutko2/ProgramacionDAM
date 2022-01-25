/**
 * lo utilizo para el ej 6
 * @author alu
 *
 */
public class Trabajador {
	private int numeroId;
	private String nombre;
	private char estadoCivil;
	private char turno;
	private int titulacion;
	private int anosEmpresa;
	
	
	
	public int getNumeroId() {
		return numeroId;
	}
	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public int getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(int titulacion) {
		this.titulacion = titulacion;
	}
	public int getAnosEmpresa() {
		return anosEmpresa;
	}
	public void setAnosEmpresa(int anosEmpresa) {
		this.anosEmpresa = anosEmpresa;
	}
	Trabajador(){
		numeroId = 0;
		nombre = "Antonio";
		estadoCivil = 'S';
		turno = 'N';
		titulacion = '4';
		anosEmpresa = '5';
	}
	public void modificar(int numeroId) {
		this.numeroId = numeroId;
	
	}
}
