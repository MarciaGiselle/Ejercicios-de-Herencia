package DoceSeptiembre;

public class Persona {

	private String nombre = " ";
	private Character fechaDeNacimiento = ' ';
	private Integer DNI = 0;
	private Character sexo = 'H';
	private Integer edad = 0;;
	private Double peso = 0.0;
	private Double altura = 0.0;;

	public Persona() {

	}

	public Persona(String nombre, Integer edad, Character sexo) {
		this.nombre = nombre;
		this.edad = edad;
		if (sexo != 'H') {
			this.sexo = sexo;
		}
		this.fechaDeNacimiento = ' ';
		this.DNI = 0;
		this.edad = 0;
		this.peso = 0.0;
		this.altura = 0.0;

	}

	public Persona(String nombre, Integer edad, Character fechaDeNacimiento, Integer DNI, Double peso, Double altura,
			Character sexo) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.DNI = DNI;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;

	}

	public Integer calcularIMC() {
		Double IMC = 0.0;
		Integer pesoIdeal = -1;
		Integer bajoPeso = 0;
		Integer sobrePeso = 1;
		IMC = (this.peso / (Math.pow(this.altura, 2)));
		if (IMC < 20) {
			return pesoIdeal;
		} else {
			if (IMC < 25 && IMC > 20) {
				return bajoPeso;

			} else {
				return sobrePeso;
			}

		}

	}
}
