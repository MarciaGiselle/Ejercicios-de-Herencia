package DoceSeptiembre;

public class Complejos {

	private Double parteReal;
	private Double parteImaginaria;
	
	
	public Complejos(Double parteReal, Double parteImag){
		this.parteReal=parteReal;
		this.parteImaginaria=parteImag;
		
	}
	
	public Complejos sumaEscalar(Double escalar){
		this.parteReal+= escalar;
		return this;
	}
	
	public Complejos sumaComplejo(Complejos nroComplejo){
		this.parteReal+= nroComplejo.parteReal;
		this.parteImaginaria+= nroComplejo.parteImaginaria;
		return this;
	}

	public Double getParteReal() {
		return parteReal;
	}

	public void setParteReal(Double parteReal) {
		this.parteReal = parteReal;
	}

	public Double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteImaginaria(Double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parteImaginaria == null) ? 0 : parteImaginaria.hashCode());
		result = prime * result + ((parteReal == null) ? 0 : parteReal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejos other = (Complejos) obj;
		if (parteImaginaria == null) {
			if (other.parteImaginaria != null)
				return false;
		} else if (!parteImaginaria.equals(other.parteImaginaria))
			return false;
		if (parteReal == null) {
			if (other.parteReal != null)
				return false;
		} else if (!parteReal.equals(other.parteReal))
			return false;
		return true;
	}
	
	
	
	
}
