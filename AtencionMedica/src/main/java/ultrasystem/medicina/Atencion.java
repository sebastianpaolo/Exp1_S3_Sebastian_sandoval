package ultrasystem.medicina;

import java.util.List;
import java.util.Map;

import ch.qos.logback.core.joran.spi.ActionException;

public class Atencion {
    private int id_usuario;
    private String previcion;
    private String nombre;
    private String apellido;
    private List<DatosAtencion> Datosatencion;
    private List<Historial> historial;
    private Map<String, List<Double>> descuento;

    public Atencion(int id_usuario, String previcion, String nombre, String apellido,
            List<DatosAtencion> Datosatencion, List<Historial> historial, Map<String, List<Double>> descuento) {
        this.id_usuario = id_usuario;
        this.previcion = previcion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Datosatencion = Datosatencion;
        this.historial = historial;
        this.descuento = descuento;

    }

    // Getters y setters
    public int getIdUsuario() {
        return id_usuario;
    }

    public String getPrevicion() {
        return previcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<DatosAtencion> getDatosAtencion() {
        return Datosatencion;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public Map<String, List<Double>> descuento() {
        return descuento;
    }

}