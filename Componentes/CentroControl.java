
import java.util.ArrayList;

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
    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
    }

    /**
     * Recorre toda la flota y ejecuta el patrón de movimiento de cada vehículo.
     */
    public void monitorearFlota(){
        for(Vehiculo v : flota){
            v.patronMovimiento();
        }
    }


    private ArrayList<Vehiculo> flota= null;
}