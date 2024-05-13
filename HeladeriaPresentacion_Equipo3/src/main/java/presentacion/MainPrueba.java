package presentacion;

import dto.DetalleProductoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natas
 */
public class MainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<DetalleProductoDTO> listaDetallesProductos = new ArrayList<>();
        JMenuPrincipal jmp = new JMenuPrincipal(listaDetallesProductos);
        jmp.setVisible(true);
    }

}
