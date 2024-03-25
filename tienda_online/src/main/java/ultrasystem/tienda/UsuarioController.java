package ultrasystem.tienda;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

@RestController
public class UsuarioController {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {

        usuarios.add(new Usuario(1, "PREMIUM", "Diego", "torre",
                Arrays.asList(new Producto("MOUSE", 20.990)),
                Arrays.asList(new Envio(1, 13874, "Region metropolitana", "Maipu", "Los olivos", 2365)),
                llenarDescuentos("MOUSE", 3.000)));

        usuarios.add(new Usuario(2, "PLATINUM", "hugo", "perez",
                Arrays.asList(new Producto("Teclado", 25.990)),
                Arrays.asList(new Envio(2, 15679, "Region de valparaiso", "viña del mar", "La arboleda", 8756)),
                llenarDescuentos("teclado", 2.000)));

        usuarios.add(new Usuario(3, "ORO", "daniel", "mendez",
                Arrays.asList(new Producto("disco duro", 99.990)),
                Arrays.asList(new Envio(3, 12097, "Region metropolitana", "santiago", "Los cristales", 4598)),
                llenarDescuentos("disco duro", 1.000)));
    }

    private Map<String, List<Double>> llenarDescuentos(String producto, Double descuento1) {
        Map<String, List<Double>> retorno = new HashMap<String, List<Double>>();

        List<Double> cantidad = Arrays.asList(descuento1);

        retorno.put(producto, cantidad);

        return retorno;

    }

    @GetMapping("/usuarios")
    public List<Usuario> getClientes() {
        return usuarios;
    }

    @GetMapping("/usuarios/{id}")
    public Usuario getClientesById(@PathVariable int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == id) {
                return usuario;
            }
        }
        return null;
    }

    @GetMapping(path = "usuarios/{id}/descuent/{descuento}")
    public Double listaEnvio(@PathVariable("id") Integer id,
            @PathVariable("descuento") String descuento) {
        Double des = 0.0;

        for (Usuario usuario : usuarios) {

            if (usuario.getIdUsuario() == id & usuario.getTipoUsuario() == "PREMIUM") {
                List<Double> cantidad = usuario.descuento().get(descuento);
                Double Descuento_usuario_premium = 5.000;
                des = Descuento_usuario_premium;
            } else {

                System.out.println("Este usuario no tiene descuento asociado");
            }

        }
        return des;
    }
}
