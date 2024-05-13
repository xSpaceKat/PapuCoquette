package presentacion;

import dto.DetalleProductoDTO;
import java.util.LinkedList;
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
        List<DetalleProductoDTO> listaDetallesProductos = new LinkedList<>();
        JMenuPrincipal jmp = new JMenuPrincipal();
        jmp.setVisible(true);
    }

}
