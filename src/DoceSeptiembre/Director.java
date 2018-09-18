package DoceSeptiembre;

import java.util.Date;

public class Director extends Gerente {

	Integer salarioExtra;
	
	public Director(String nombre, Integer salario, Date fechaNac, String departamento, Integer cochera, Integer salarioExtra) {
		super(nombre, salario, fechaNac, departamento, cochera);
		this.salarioExtra= salarioExtra;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String brindarDetalles(){
		return "Soy gerente";
	}

	
}
