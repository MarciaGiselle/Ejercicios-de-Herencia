package DoceSeptiembre;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPersona {

	Persona miPersona = new Persona ("Pepe", 15, 'a', 28156, 8.0, 100.0, 'H');
	
	@Test
	public void testCalcularIMC() {
		Integer resultadoEperadoIMC=0;
		miPersona.calcularIMC();
		assertTrue (miPersona.calcularIMC()>25);
		
		
		
	}

}
