/**Diseñar la clase Cuentas para crear un vector de 100 objetos (de la clase CuentaCorriente).
Escribir un programa que utilice la clase Cuentas que permita obtener el titular y código de la
cuenta con mayor saldo. Para ello se sugiere crear un vector de saldos, ordenarlo en orden
creciente y, tomando el último valor que almacene, compararlo con el saldo de los diferentes
objetos mediante un metodo getSaldo y mostrar por pantalla los que sean iguales que el saldo
máximo.
 */
package cuentas; 
public class Cuentas {
	
	NombreAleatorio [] nombreAleatorio = new NombreAleatorio[100];
	CuentaCorriente [] cuenta = new CuentaCorriente[100];

	float [] saldo;
	Cuentas(){
		saldo = new float [100];
	}
	public void asignar() {
		cuenta[0].setTitular(nombreAleatorio[1].getNombreCompleto());
		cuenta[0].setCodigo("11110000");
		cuenta[0].setSaldo(200);
		cuenta[1].setTitular(nombreAleatorio[2].getNombreCompleto());
		cuenta[1].setCodigo("11110001");
		cuenta[1].setSaldo(201);
		cuenta[2].setTitular(nombreAleatorio[3].getNombreCompleto());
		cuenta[2].setCodigo("11110002");
		cuenta[2].setSaldo(2000);
		cuenta[3].setTitular(nombreAleatorio[4].getNombreCompleto());
		cuenta[3].setCodigo("11110003");
		cuenta[3].setSaldo(2001);
	}
	public  void comparar() {
		float mayor;
		for (int i = 0; i < cuenta.length; i++) {
			saldo[i] = cuenta[i].getSaldo();
			if(saldo[i] > saldo[i + 1]) {
				mayor = saldo[i];
				saldo[i] = saldo[i + 1];
				saldo[i + 1] = mayor;
			}
		}
	}
	public static void main(String [] args) {
		Cuentas hola = new Cuentas();
		System.out.println();
	}
}
