/**
 * Vehículo terrestre autónomo que registra la distancia recorrida.
 * Extiende Vehiculo e implementa IConectable.
 */
public class TaxiAutonomo extends Vehiculo implements IConectable{
    /**
     * Crea un nuevo TaxiAutonomo con ID autogenerado y distancia inicial en 0.
     */
    public TaxiAutonomo(){
        super();
        this.distanciaRecorrida = 0;
    }
    
    public int getDistanciaRecorrida(){
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida){
        this.distanciaRecorrida = distanciaRecorrida;
    }
    /**
     * Muestra el patrón de movimiento del taxi indicando la distancia recorrida.
     */
    @Override
    public void patronMovimiento(){
        System.out.printf("Taxi: %s ha recorrido %d metros %n", getId(), distanciaRecorrida);
    }

    /**
     * Sincroniza el taxi con el sistema GPS e informa por consola.
     */
    @Override
    public void sincronizarGPS(){
        System.out.printf("Taxi: %s esta sincronizado", getId());
    }


    private int distanciaRecorrida = 0;
}