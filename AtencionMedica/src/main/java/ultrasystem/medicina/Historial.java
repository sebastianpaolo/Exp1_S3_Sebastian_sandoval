package ultrasystem.medicina;

public class Historial {
    private int id;
    private String sucursal;

    public Historial(int id, String sucursal) {
        this.id = id;
        this.sucursal = sucursal;

    }

    public int getId() {
        return id;
    }

    public String getSucursal() {
        return sucursal;
    }

}
