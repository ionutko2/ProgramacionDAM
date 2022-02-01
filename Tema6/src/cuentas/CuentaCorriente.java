/**

Lo uso en la clase Cuentas

*/
package cuentas; 

import java.util.Scanner;
public class CuentaCorriente {

	private String titular;
	private float saldo;
	private String codigo;
	private boolean bien;

	public CuentaCorriente() {
		titular = null;
		saldo = 67;
		codigo = "";
		bien = true;
	}

	public void Codigo() {

	}

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

	public boolean isBien() {
		return bien;
	}

	public void setBien(boolean bien) {
		this.bien = bien;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.length() == 8) {
			for (int i = 0; i <= codigo.length()- 1 && bien!=false; i++) {
				char valor = codigo.charAt(i);
				if (valor == '0' || valor == '1' || valor == '2' || valor == '3' || valor == '4' || valor == '5'
						|| valor == '6' || valor == '7' || valor == '8' || valor == '9') {
					bien = true;
				} else {
					bien = false;
				}
			}
		} else {
			bien = false;
		}
		
	}

	public void IngresarDinero() {
		int suma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuanto quiere meter");
		suma = teclado.nextInt();
		saldo+=suma;
		teclado.close();
	}
	public void RetirarDinero() {
		Scanner teclado = new Scanner(System.in);
		if(saldo<0) {
			System.out.println("No tienes dinero, pobre");
		}else {
			System.out.println("Su saldo actual es de "+saldo);
			System.out.println("Cuanto desea retirar");
			double retiro = teclado.nextDouble();
			if(retiro<saldo) {
			saldo-=retiro;
			System.out.println("Tu saldo actual es de "+saldo);
			}else {System.out.println("No puedes retirar tanto, tu saldo es de "+saldo);}
		}

		teclado.close();
	}
	
/**
	public static void main(String[] args) {
		CuentaCorriente cliente = new CuentaCorriente();
		Scanner teclado = new Scanner(System.in);
		cliente.setCodigo("12345678");
		if(cliente.bien==true) {
			System.out.println("El codigo es correcto");
			System.out.println("¿Que operacion quieres hacer?(1=Ingresar, 2=Retirar)");
			int operacion=teclado.nextInt();
			if(operacion==1) {
			cliente.IngresarDinero();
			System.out.println("Tu saldo ahora es de "+cliente.getSaldo());
			}else if(operacion==2){
			cliente.RetirarDinero();
			}else {System.out.println("Error");}
		}else{System.out.println("El codigo es incorrecto");}
		
		

	}*/
}