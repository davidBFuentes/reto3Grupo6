package controlador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControladorVueltasTest {

	@Test
	void testCamino1() {
		
		String cambios= "Te sobra 888.88€ \nDevolver 1 billete(s) de 500€ \nDevolver 1 billete(s) de 200€ \nDevolver 1 billete(s) de 100€ \nDevolver 1 billete(s) de 50€ \nDevolver 1 billete(s) de 20€ \nDevolver 1 billete(s) de 10€ \nDevolver 1 billete(s) de 5€ \nDevolver 1 moneda(s) de 2€ \nDevolver 1 moneda(s) de 1€ \nDevolver 1 moneda(s) de 0.50€ \nDevolver 1 moneda(s) de 0.20€ \nDevolver 1 moneda(s) de 0.10€ \nDevolver 1 moneda(s) de 0.05€ \nDevolver 1 moneda(s) de 0.02€ \nDevolver 1 moneda(s) de 0.01€ \n";
		double restante = 888.88;
		assertEquals(cambios,ControladorVueltas.adevolver(restante));
	}
	
	@Test
	void testCamino2() {
		
		String cambios= "Te sobra 0.0€ \n";
		double restante = 0;
		assertEquals(cambios,ControladorVueltas.adevolver(restante));
	}
	
	@Test
	void testCamino3() {
		
		String cambios= "Te sobra 500.0€ \nDevolver 1 billete(s) de 500€ \n";
		double restante = 500;
		assertEquals(cambios,ControladorVueltas.adevolver(restante));
	}
	
	@Test
	void testCamino4() {
		
		String cambios= "Te sobra 0.01€ \nDevolver 1 moneda(s) de 0.01€ \n";
		double restante = 0.01;
		assertEquals(cambios,ControladorVueltas.adevolver(restante));
	}

}
