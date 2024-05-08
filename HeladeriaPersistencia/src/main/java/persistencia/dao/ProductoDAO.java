package persistencia.dao;

import java.util.List;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author Katt
 */
public class ProductoDAO implements IProductoDAO {

    public Producto buscarPorID(Producto producto) throws PersistenciaException {
        return null;
    }

    public List<Producto> consultar() throws PersistenciaException {
        return null;
    }

    public void guardarProducto(Producto producto) throws PersistenciaException {
    }

    public void eliminarProducto(Producto producto) throws PersistenciaException {
    }

    public void actualizarProducto(Producto producto) throws PersistenciaException {
    }

}
