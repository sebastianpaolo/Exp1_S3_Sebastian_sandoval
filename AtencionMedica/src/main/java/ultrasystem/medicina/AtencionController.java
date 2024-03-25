package ultrasystem.medicina;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

@RestController
public class AtencionController {
    private List<Atencion> atenciones = new ArrayList<>();

    public AtencionController() {

        atenciones.add(new Atencion(1, "fonasa", "juan", "perez",
                Arrays.asList(new DatosAtencion(1, "traumatologia", "Maipu")),
                Arrays.asList(new Historial(1, "Santiago")),
                llenarDescuentos("isapre", 3.000)));

        atenciones.add(new Atencion(2, "isapre", "daniela", "mendez",
                Arrays.asList(new DatosAtencion(1, "nutricionista", "San bernardo")),
                Arrays.asList(new Historial(2, "Santiago")),
                llenarDescuentos("fonasa", 1.000)));

        atenciones.add(new Atencion(3, "isapre", "daniela", "mendez",
                Arrays.asList(new DatosAtencion(1, "nutricionista", "San bernardo")),
                Arrays.asList(new Historial(3, "Santiago")),
                llenarDescuentos("fonasa", 1.000)));
    }

    private Map<String, List<Double>> llenarDescuentos(String producto, Double descuento1) {
        Map<String, List<Double>> retorno = new HashMap<String, List<Double>>();

        List<Double> cantidad = Arrays.asList(descuento1);

        retorno.put(producto, cantidad);

        return retorno;

    }

    @GetMapping("/atenciones")
    public List<Atencion> getClientes() {
        return atenciones;
    }

    @GetMapping("/atenciones/{id}")
    public Atencion getClientesById(@PathVariable int id) {
        for (Atencion atencion : atenciones) {
            if (atencion.getIdUsuario() == id) {
                return atencion;
            }
        }
        return null;
    }

    @GetMapping(path = "atenciones/{id}/descuent/{descuento}")
    public Double listaEnvio(@PathVariable("id") Integer id,
            @PathVariable("descuento") String descuento) {
        Double des = 0.0;

        for (Atencion atencion : atenciones) {

            if (atencion.getIdUsuario() == id & atencion.getPrevicion() == "fonasa") {
                List<Double> cantidad = atencion.descuento().get(descuento);
                Double Descuento_usuario_premium = 5.000;
                des = Descuento_usuario_premium;
            } else {

                System.out.println("Este usuario no tiene descuento asociado");
            }

        }
        return des;
    }
}
