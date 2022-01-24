/**
 * Sea la clase CuentaCorriente, cuyos atributos son, al menos: titular (string), saldo
(float) y codigo (único para cada cuenta, string de 8 dígitos numéricos, filtrado).
Diseñar la clase para poder realizar las siguientes operaciones:
 IngresarDinero, actualizando el saldo.
 RetiraDinero, actualizando el saldo siempre que sea posible; para ello habrá otro
método llamado PuedoSacar que devolverá true si hay saldo suficiente y false si
no lo hay. En caso de no haber saldo se avisará con un mensaje indicando el
hecho y un "pulse return".
 * @author alu
 *
 */
import java.util.Scanner;
public class CuentaCorriente {
	private String titular;
	private float saldo;
	private String codigo;
	Scanner teclado = new Scanner(System.in);
	
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	void IngresarDinero() {
		System.out.println("Elija la cantidad a ingresar.");
		setSaldo(getSaldo() + teclado.nextInt()); 
	}
	void RetirarDinero() {
		
	}
}
