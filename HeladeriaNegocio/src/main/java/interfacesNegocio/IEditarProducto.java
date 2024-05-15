package interfacesNegocio;

import dto.ProductoDTO;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author USER
 */
public interface IEditarProducto {

    public void eliminarProducto(ProductoDTO productoDTO) throws PersistenciaException;

    public void actualizarProducto(ProductoDTO productoDTO) throws PersistenciaException;
}
