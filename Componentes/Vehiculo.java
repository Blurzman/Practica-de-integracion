public abstract class Vehiculo{
    public int getId() {
        return this.id;
    }
    public void setId(){
        this.id = nextId++;
    }
    
    public abstract void patronMovimiento();

    private int id;
    private static int nextId = 0;
}