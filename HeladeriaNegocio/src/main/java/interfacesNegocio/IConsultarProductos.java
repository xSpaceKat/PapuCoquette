package interfacesNegocio;

import dto.ProductoDTO;
import java.util.List;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author USER
 */
public interface IConsultarProductos {

    public List<ProductoDTO> consultarTodosLosProductos() throws PersistenciaException;

    public ProductoDTO consultarProducto(String nombre) throws PersistenciaException;
    
    

}
