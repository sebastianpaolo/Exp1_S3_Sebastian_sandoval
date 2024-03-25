package ultrasystem.tienda;

import java.util.List;
import java.util.Map;

public class Usuario {
    private int id_usuario;
    private String tipoUsuario;
    private String nombre;
    private String apellido;
    private List<Producto> productos;
    private List<Envio> envio;
    private Map<String, List<Double>> descuento;

    public Usuario(int id_usuario, String tipoUsuario, String nombre, String apellido,
            List<Producto> productos, List<Envio> envio, Map<String, List<Double>> descuento) {
        this.id_usuario = id_usuario;
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.productos = productos;
        this.envio = envio;
        this.descuento = descuento;

    }

    // Getters y setters
    public int getIdUsuario() {
        return id_usuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Envio> getEnvio() {
        return envio;
    }

    public Map<String, List<Double>> descuento() {
        return descuento;
    }

}