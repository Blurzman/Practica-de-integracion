
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Gestiona una flota de vehículos.
 */
public class CentroControl{

    /**
     * Crea un CentroControl con la flota vacía.
     */
    public CentroControl(){
        this.flota = new ArrayList<>();
    }

    /**
     * Registra una unidad externa en la flota del centro.
     * @param v vehículo a agregar
     */
    public void crearVehiculo(Vehiculo v) {
        flota.add(v);
    }

    /**
     * Lista todos los vehiculos.
     * 
     */
    public void listarVehiculos(){
        flota.forEach(System.out::println);
    }

    /**
     * Busca un vehiculo por su id
     * @param id
     * @return el vehiculo
     */
    public Vehiculo buscarVehiculo(String id){
        return flota.stream()
        .filter(v -> v.getId() == Integer.parseInt(id))
        .findFirst()
        .orElse(null);
    }

    /**
     * Modifica la altura o la distancia recorrida segun que clase es
     * @param id
     * @param value nuevo valor a poner
     */
    public void modificarVehiculo(String id, int value){
        Vehiculo v = buscarVehiculo(id);
        switch (v) {
            case null -> {}
            case Dron d -> d.setAltura(value);
            case TaxiAutonomo t -> t.setDistanciaRecorrida(value);
            default -> {
            }
        }
    }

    /**
     * Elimina el vehiculo si lo encuentra
     * @param id
     */
    public void eliminarVehiculo(String id){
        Vehiculo v = buscarVehiculo(id);
        flota.remove(v);
    }
    /**
     * Recorre toda la flota y ejecuta el patrón de movimiento de cada vehículo.
     */
    public void monitorearFlota(){
        for(Vehiculo v : flota){
            v.patronMovimiento();
        }
    }

    /**
     * Devuelve una lista filtrada de los vehiculos conectables
     * @return vehiculos conectables
     */
    public List<Vehiculo> filtrarConectables(){
        return flota.stream()
        .filter(v -> v instanceof IConectable)
        .collect(Collectors.toList());
    }

    /**
     * Devuelve una lista de los ids de los vehiculos
     * @return los ids
     */
    public List<String> obtenerIds(){
        return flota.stream()
        .map(v -> String.valueOf(v.getId()))
        .collect(Collectors.toList());
    }

    /**
     * Devuelve la cantidad de vehiculos
     * @return la cantidad de vehiculos
     */
    public int contarVehiculos(){
        return (int) flota.stream().count();
    }

    /**
     * Devuelve los vehiculos del tipo indicado
     * @return la lista de vehiculos
     */
    public List<Vehiculo> buscarPorTipo(Class<?> tipo){
        return flota.stream()
        .filter(v -> v.getClass() == tipo)
        .collect(Collectors.toList());
    }


    private ArrayList<Vehiculo> flota= null;
}