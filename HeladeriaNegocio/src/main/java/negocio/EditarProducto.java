package negocio;

import dto.ProductoDTO;
import interfacesNegocio.IEditarProducto;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author USER
 */
public class EditarProducto implements IEditarProducto {

    @Override
    public void eliminarProducto(ProductoDTO productoDTO) throws PersistenciaException {
        IProductoDAO productoDAO = new ProductoDAO();
        Conversor conversor = new Conversor();
        Producto producto = conversor.DTOaDAO(productoDTO);
        try {
            productoDAO.eliminarProducto(productoDAO.buscarPorNombre(producto));
        } catch (PersistenciaException ex) {
            throw new PersistenciaException("No se pudo eliminar");
        }
    }

    @Override
    public void actualizarProducto(ProductoDTO productoDTO) throws PersistenciaException {
        IProductoDAO productoDAO = new ProductoDAO();
        Conversor conversor = new Conversor();
        Producto producto = conversor.DTOaDAO(productoDTO);
        Producto productoTemp = productoDAO.buscarPorNombre(producto);
        producto.setId(productoTemp.getId());
        try {
            productoDAO.actualizarProducto(producto);
        } catch (PersistenciaException ex) {
            throw new PersistenciaException("No se pudo eliminar");
        }
    }

}
