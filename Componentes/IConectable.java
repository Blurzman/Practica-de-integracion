/**
 * Contrato que deben cumplir los vehículos con capacidad de conexión GPS.
 * Representa un comportamiento, no una identidad.
 */
public interface IConectable{
    /**
     * Sincroniza el vehículo con el sistema GPS.
     */
    public void sincronizarGPS();
}