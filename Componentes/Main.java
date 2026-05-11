
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CentroControl centro = new CentroControl();
        
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            if (random.nextBoolean()) {
                centro.crearVehiculo(new Dron());
            } else {
                centro.crearVehiculo(new TaxiAutonomo());
            }
        }

        // Ejercicio 1 - CRUD
        System.out.println("=== CRUD ===");
        centro.listarVehiculos();
        centro.modificarVehiculo("0", 200);
        centro.listarVehiculos();
        centro.eliminarVehiculo("1");
        centro.listarVehiculos();


        // Ejercicio 3 - Streams
        System.out.println("=== Streams ===");
        System.out.println("Conectables: \n" + centro.filtrarConectables());
        System.out.println("IDs: " + centro.obtenerIds());
        System.out.println("Total: " + centro.contarVehiculos());
        System.out.println("Drones: \n" + centro.buscarPorTipo(Dron.class));

        // Ejercicio 4 - Ordenamiento
        System.out.println("=== Ordenamiento ===");
        centro.ordenarPorId();
        centro.listarVehiculos();
        centro.ordenarPorTipo();
        centro.listarVehiculos();

        // Ejercicio 6 - Mejoras
        System.out.println("=== Mejoras ===");
        centro.generarReporte();
        centro.estadisticasPorTipo();
        System.out.println("Vehiculos con ID par:");
        centro.busquedaAvanzada(v -> v.getId() % 2 == 0).forEach(System.out::print);
    }
}