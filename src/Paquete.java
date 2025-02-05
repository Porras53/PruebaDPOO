
public class Paquete {
	
	private int peso;
	
	private int valorAsegurado;
	
	private Ciudad ciudadEntrega;

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the valorAsegurado
	 */
	public int getValorAsegurado() {
		return valorAsegurado;
	}

	/**
	 * @param valorAsegurado the valorAsegurado to set
	 */
	public void setValorAsegurado(int valorAsegurado) {
		this.valorAsegurado = valorAsegurado;
	}

	public Paquete(int peso, int valorAsegurado,Ciudad ciudadEntrega) {
		this.peso = peso;
		this.valorAsegurado = valorAsegurado;
		this.ciudadEntrega= ciudadEntrega;
	}

	public Ciudad getCiudadEntrega() {
		return ciudadEntrega;
	}

	public void setCiudadEntrega(Ciudad ciudadEntrega) {
		this.ciudadEntrega = ciudadEntrega;
	}

	
	

}
