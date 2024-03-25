package ultrasystem.medicina;

public class DatosAtencion {
    private int id;
    private String especialidad;
    private String sucursal;

    public DatosAtencion(int id, String especialidad, String sucursal) {
        this.id = id;
        this.especialidad = especialidad;
        this.sucursal = sucursal;
    }

    public int getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getSucursal() {
        return sucursal;
    }

}
