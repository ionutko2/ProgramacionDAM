import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calc = new Calculadora(10,20);
		int resul = calc.suma();
		assertEquals(30, resul);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(20,10);
		int resul = calc.resta();
		assertEquals(10, resul);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(10,20);
		int resul = calc.multiplica();
		assertEquals(200, resul);
	}
	
	@Test
	void testMultiplicaFalla() {
		Calculadora calc = new Calculadora(10,20);
		int resul = calc.multiplica();
		assertEquals(2, resul);
	}

	@Test
	void testDivide() {
		Calculadora calc = new Calculadora(20,20);
		int resul = calc.divide();
		assertEquals(1, resul);
	}
	
	@Test
	void testDivideError() {
		
		try {
		Calculadora calc = new Calculadora(20,0);
		int resul = calc.divide();
		fail("fallo, deberia haber lanzado excepción");
		}catch (ArithmeticException e) {
			//Prueba satisfactoria
		}
		
	}
	@Test
	void testDivide2() {
		Calculadora calc = new Calculadora(20,0);
		assertNull(calc.divide2());
	}
	@Test
	void testResta2() {
		Calculadora calc = new Calculadora(10,20);
		int resul = calc.resta();
		assertEquals(10, resul);
	}
}
