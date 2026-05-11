public class Main {
    public static void main(String[] args) {
        CentroControl centro = new CentroControl();

        centro.crearVehiculo(new Dron());
        centro.crearVehiculo(new Dron());
        centro.crearVehiculo(new TaxiAutonomo());

        centro.listarVehiculos();
    }
}