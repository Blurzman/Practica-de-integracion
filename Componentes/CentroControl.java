
import java.util.ArrayList;

public class CentroControl{

    public CentroControl(){
        this.flota = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v) {
        flota.add(v);
    }

    public void monitorearFlota(){
        for(Vehiculo v : flota){
            v.patronMovimiento();
        }
    }


    private ArrayList<Vehiculo> flota= null;
}