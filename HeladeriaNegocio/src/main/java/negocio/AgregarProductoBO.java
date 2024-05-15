package negocio;

import dto.ProductoDTO;
import interfacesNegocio.IAgregarProductoBO;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.dao.ProductoDAO;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Berry
 */
public class AgregarProductoBO implements IAgregarProductoBO {

    @Override
    public void AgregarProducto(ProductoDTO productoDTO) {
        Conversor conversor = new Conversor();
        ProductoDAO productoDAO = new ProductoDAO();
        try {
            productoDAO.guardarProducto(conversor.DTOaDAO(productoDTO));
        } catch (PersistenciaException ex) {
            Logger.getLogger(AgregarProductoBO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
