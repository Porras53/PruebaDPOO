import java.util.ArrayList;

public class Camion {
	private String placa;
	private int capacidadMax;
	private int cantidadKmRecorridos;
	private ArrayList<Paquete> paquetesCargados;

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	/**
	 * @return the paquetesCargados
	 */
	public ArrayList<Paquete> getPaquetesCargados() {
		return paquetesCargados;
	}
	/**
	 * @param paquetesCargados the paquetesCargados to set
	 */
	public void setPaquetesCargados(ArrayList<Paquete> paquetesCargados) {
		this.paquetesCargados = paquetesCargados;
	}
	/**
	 * @return the capacidadMax
	 */
	public int getCapacidadMax() {
		return capacidadMax;
	}
	/**
	 * @param capacidadMax the capacidadMax to set
	 */
	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	/**
	 * @return the cantidadKmRecorridos
	 */
	public int getCantidadKmRecorridos() {
		return cantidadKmRecorridos;
	}
	/**
	 * @param cantidadKmRecorridos the cantidadKmRecorridos to set
	 */
	public void setCantidadKmRecorridos(int cantidadKmRecorridos) {
		this.cantidadKmRecorridos = cantidadKmRecorridos;
	}
	
	public Camion(String placa, int capacidadMax, int cantidadKmRecorridos) {
		super();
		this.placa = placa;
		this.capacidadMax = capacidadMax;
		this.cantidadKmRecorridos = cantidadKmRecorridos;
		this.paquetesCargados= new ArrayList<Paquete>();
	}
	
	public void cargarPaquete(Paquete paquete) {
        if (puedeCargar(paquete)) {
            paquetesCargados.add(paquete);
            System.out.println("Se cargó el paquete");
        } else {
            System.out.println("No se puede cargar el paquete. Capacidad máxima superada.");
        }
	}
	
    public boolean puedeCargar(Paquete paquete) {
    	double sumaTotalPesos = 0.0;
    	
    	if(paquetesCargados.isEmpty()) 
    	{
    		return true;
    	}

    	for (Paquete paquete1 : paquetesCargados) {
    	    double peso = paquete1.getPeso();
    	    sumaTotalPesos += peso;
    	}
        return (sumaTotalPesos + paquete.getPeso()) <= capacidadMax;
    }
    
    public void realizarRecorrido(Sede sedeOrigen, Sede sedeDestino) {
        for (Paquete paquete : paquetesCargados) {
            sedeOrigen.despacharPaquete(paquete); // Despachar el paquete desde la sede de origen
            sedeDestino.agregarPaqueteRecibido(paquete); // Recibir el paquete en la sede de destino
        }
        paquetesCargados.clear(); // Limpiar la lista de paquetes cargados después del recorrido
    }
	
}
