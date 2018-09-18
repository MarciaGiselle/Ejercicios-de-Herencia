package DoceSeptiembre;

import java.util.Date;

public class Gerente extends Empleado{
	String departamento;
	Integer cochera;



		public Gerente (String nombre, Integer salario, Date fechaNac,String departamento, Integer cochera){
			super(nombre, salario, fechaNac);
			this.departamento = departamento;
			this.cochera = cochera;
		}



		public String getDepartamento() {
			return departamento;
		}



		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}



		public Integer getCochera() {
			return cochera;
		}



		public void setCochera(Integer cochera) {
			this.cochera = cochera;
		}



}