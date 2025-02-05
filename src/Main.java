public class Main {
    public static void main(String[] args) {
    	//Crear ciudades y empresa
    	
    	Empresa interfugaz= new Empresa();
    	
    	Ciudad bogota=new Ciudad("Bogotá");
    	Ciudad medellin= new Ciudad("Medellín");
    	
        // Crear sedes
        Sede sedeBogota = new Sede(bogota);
        Sede sedeMedellin = new Sede(medellin);

        // Crear camiones para cada sede
        Camion camionBogota = new Camion("ABC123", 5000, 0); // Placa, capacidad (kg), kilómetros
        Camion camionMedellin = new Camion("DEF456", 3000, 0);

        sedeBogota.agregarCamion(camionBogota);
        sedeMedellin.agregarCamion(camionMedellin);


        // Crear paquetes
        Paquete paquete1 = new Paquete(100, 500000, medellin); // Peso, valor asegurado, ciudad destino
        Paquete paquete2 = new Paquete(200, 800000, medellin);
        Paquete paquete3 = new Paquete(150, 600000, bogota);
        
        interfugaz.agregarSede(sedeMedellin);
        interfugaz.agregarSede(sedeBogota);

        // Agregar paquetes a las sedes
        sedeBogota.agregarPaquetePendienteDespachar(paquete1);
        sedeBogota.agregarPaquetePendienteDespachar(paquete2);
        sedeMedellin.agregarPaquetePendienteDespachar(paquete3);

        // Asignar paquetes a camiones
        sedeBogota.asignarPaqueteACamion(paquete1, camionBogota);
        sedeBogota.asignarPaqueteACamion(paquete2, camionBogota);
        sedeMedellin.asignarPaqueteACamion(paquete3, camionMedellin);
        
        System.out.println("La cantidad de paquetes del camion 1 en bogotá es: "+ sedeBogota.getCamion(0).getPaquetesCargados().size());

        // Hacer un recorrido con los camiones
        System.out.println("Recorrido del camión en Bogotá:");
        camionBogota.realizarRecorrido(sedeBogota,sedeMedellin);

        System.out.println("Recorrido del camión en Medellín:");
        camionMedellin.realizarRecorrido(sedeMedellin,sedeBogota);

        // Calcular el valor total asegurado de paquetes entregados
        double valorAseguradoBogota = sedeBogota.calcularValorTotalAsegurado();
        double valorAseguradoMedellin = sedeMedellin.calcularValorTotalAsegurado();

        System.out.println("Valor asegurado total de paquetes entregados en Bogotá: " + valorAseguradoBogota);
        System.out.println("Valor asegurado total de paquetes entregados en Medellín: " + valorAseguradoMedellin);
    }
}

