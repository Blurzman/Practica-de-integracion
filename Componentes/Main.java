public class Main {
    public static void main(String[] args) {
        CentroControl centro = new CentroControl();

        centro.registrarUnidad(new Dron());
        centro.registrarUnidad(new Dron());
        centro.registrarUnidad(new TaxiAutonomo());

        centro.monitorearFlota();
    }
}