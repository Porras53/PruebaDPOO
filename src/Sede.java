import java.util.ArrayList;

public class Sede {
	
	private ArrayList<Paquete> paquetesDespachado;
	
	private ArrayList<Paquete> paquetesPendientes;
	
	private ArrayList<Paquete> paquetesLlegaron;
	
	private Ciudad ciudadSede;
	
	private ArrayList<Camion> camiones;

	

	public Sede(Ciudad ciudadSede) {
		super();
		this.paquetesDespachado = new ArrayList<Paquete>();
		this.paquetesPendientes = new ArrayList<Paquete>();
		this.paquetesLlegaron = new ArrayList<Paquete>();
		this.setCiudadSede(ciudadSede);
		this.camiones= new ArrayList<Camion>();
	}

	
	
	
	/**
	 * @return the camiones
	 */
	public ArrayList<Camion> getCamiones() {
		return camiones;
	}
	
	/**
	 * @return the camiones
	 */
	public Camion getCamion(int pos) {
		return camiones.get(pos);
	}




	/**
	 * @param camiones the camiones to set
	 */
	public void setCamiones(ArrayList<Camion> camiones) {
		this.camiones = camiones;
	}




	public void agregarPaquetePendienteDespachar(Paquete paqueteNuevo) {
		// TODO Auto-generated method stub
		paquetesPendientes.add(paqueteNuevo);
		
	}
	
	public void despacharPaquete(Paquete paquete) {
        paquetesPendientes.remove(paquete);
        paquetesDespachado.add(paquete);
    }

	public void agregarPaqueteDespachado(Paquete paqueteNuevo) {
		// TODO Auto-generated method stub
		paquetesDespachado.add(paqueteNuevo);
		
	}


	public void agregarPaqueteRecibido(Paquete paqueteNuevo) {
		// TODO Auto-generated method stub
		paquetesLlegaron.add(paqueteNuevo);
		
	}
	
	public void asignarPaqueteACamion(Paquete paquete, Camion camion) {
        if (camion.puedeCargar(paquete)) {
            camion.cargarPaquete(paquete);
            //paquetesPendientes.remove(paquete); 
        } else {
            System.out.println("No se puede asignar el paquete al camión.");
        }
    }
	
	public void agregarCamion(Camion cam) 
	{
		camiones.add(cam);
	}
	
	public double calcularValorTotalAsegurado() {
		double sumaTotalValoresAsegurados = 0.0;

		// Recorremos cada paquete en la lista de paquetes llegados
		for (Paquete paquete : this.paquetesLlegaron) {
		    // Obtenemos el valor asegurado del paquete actual
		    double valorAsegurado = paquete.getValorAsegurado();
		    // Sumamos el valor asegurado a la suma total
		    sumaTotalValoresAsegurados += valorAsegurado;
		}
        return sumaTotalValoresAsegurados;
    }
	
	


	public Ciudad getCiudadSede() {
		return ciudadSede;
	}


	public void setCiudadSede(Ciudad ciudadSede) {
		this.ciudadSede = ciudadSede;
	}
	
	
	
	
	
	
	
	
	

}
