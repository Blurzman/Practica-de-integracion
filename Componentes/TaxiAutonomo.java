public class TaxiAutonomo extends Vehiculo implements IConectable{
    public TaxiAutonomo(){
        setId();
        this.distanciaRecorrida = 0;
    }

    @Override
    public void patronMovimiento(){
        System.out.printf("Taxi: %s ha recorrido %d metros %n", getId(), distanciaRecorrida);
    }

    @Override
    public void sincronizarGPS(){
        System.out.printf("Taxi: %s esta sincronizado", getId());
    }


    private int distanciaRecorrida = 0;
}