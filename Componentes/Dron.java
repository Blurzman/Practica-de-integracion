
/**
 * Vehículo aéreo.
 * Extiende Vehiculo e implementa IConectable.
 */
public class Dron extends Vehiculo implements IConectable{
    
    /**
     * Crea un nuevo Dron con ID autogenerado y altura inicial en 0.
     */
    public Dron(){
        setId();
        altura = 0;
    }
    
    /**
     * Muestra el patrón de movimiento del dron indicando su altura actual.
     */
    @Override
    public void patronMovimiento(){
        System.out.printf("Dron: %s esta a %d metros de altura %n", getId(), altura);
    }

    /**
     * Sincroniza el dron con el sistema GPS e informa por consola.
     */
    @Override
    public void sincronizarGPS(){
        System.out.printf("Dron: %s esta sincronizado %n" , getId());
    }

    private int altura = 0;
}