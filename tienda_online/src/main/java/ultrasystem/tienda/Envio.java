package ultrasystem.tienda;

public class Envio {
    private int id;
    private int codigo_despacho;
    private String region;
    private String comuna;
    private String calle;
    private int numero;

    public Envio(int id, int codigo_despacho, String region, String comuna, String calle, int numero) {
        this.id = id;
        this.codigo_despacho = codigo_despacho;
        this.region = region;
        this.comuna = comuna;
        this.calle = calle;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public int getCodigo_despacho() {
        return codigo_despacho;
    }

    public String getRegion() {
        return region;
    }

    public String getComuna() {
        return comuna;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

}
