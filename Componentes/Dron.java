public class Dron extends Vehiculo implements IConectable{
    public Dron(){
        setId();
        altura = 0;
    }
    
    @Override
    public void patronMovimiento(){
        System.out.printf("Dron: %s esta a %d metros de altura %n", getId(), altura);
    }

    @Override
    public void sincronizarGPS(){
        System.out.printf("Dron: %s esta sincronizado %n" , getId());
    }

    private int altura = 0;
}