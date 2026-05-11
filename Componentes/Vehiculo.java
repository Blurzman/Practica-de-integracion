/**
 * Clase abstracta que representa la identidad base de cualquier vehículo.
 * Define atributos y comportamientos comunes a todas las unidades del sistema.
 */
public abstract class Vehiculo{

    public Vehiculo(){
        setId();
    }
    /**
     * Retorna el identificador único de este vehículo.
     * @return id del vehículo
     */
    public int getId() {
        return this.id;
    }

    /**
     * Asigna automáticamente el próximo ID disponible a este vehículo.
     */
    private void setId(){
        this.id = nextId++;
    }
    

    @Override
    public String toString(){
        return String.format("Tipo: %-15s | ID: %d%n",
        this.getClass().getSimpleName(), this.id);
    }
    /**
     * Define el patrón de movimiento específico de cada vehículo.
     * Cada subclase debe implementar su propio comportamiento.
     */
    public abstract void patronMovimiento();



    private int id;
    private static int nextId = 0;
}