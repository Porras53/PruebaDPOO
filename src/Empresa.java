import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Sede> sedes;
	
	public Empresa() {
		super();
		this.sedes= new ArrayList<Sede>();
	}


	public void agregarPaquete(int peso,int valorAsegurado, Ciudad ciudadEntrega,int posSedeDespachar,int posSedeEntregar) 
	{
		Sede sedeDespachar = sedes.get(posSedeDespachar);
		
		Sede sedeEntregar = sedes.get(posSedeEntregar);
		
		Paquete paqueteNuevo= new Paquete(peso,valorAsegurado,sedeEntregar.getCiudadSede());
		
		sedeDespachar.agregarPaquetePendienteDespachar(paqueteNuevo);
		
	}

	
	public void agregarSede(Sede sede) 
	{
		sedes.add(sede);
	}
	
	
	

}
