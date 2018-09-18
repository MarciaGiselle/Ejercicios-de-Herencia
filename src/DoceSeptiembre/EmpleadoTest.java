package DoceSeptiembre;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void testSepuedenCargarDatos() {
		Empleado Juan = new Empleado("Juan", 2000);
		Juan.brindarDetalles();
		String detalle= "Soy empleado";
		assertEquals(detalle,Juan.brindarDetalles());
	}
	
	
	
	
	/*	@Test
	public void testVerGerente() {
		Gerente Pepe = new Gerente("pepe", 200, 1412/05/42, "d", 5);
	}*/

}
