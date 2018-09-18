package DoceSeptiembre;

import static org.junit.Assert.*;

import org.junit.Test;

public class testComplejos {

	@Test
	public void test() {
		Complejos complejo = new Complejos(2000.0,4.0);
		Complejos esperado = new Complejos(2000.0,4.0);
		Double valorEsperado=0.0;
		assertEquals(complejo.getParteReal(),esperado.getParteReal());
		assertEquals(complejo.getParteImaginaria(),esperado.getParteImaginaria());
		
		assertEquals(complejo, esperado);
	}

	
	
	
}
