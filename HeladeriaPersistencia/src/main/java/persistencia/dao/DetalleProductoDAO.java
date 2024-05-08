package persistencia.dao;

import java.util.List;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IDetalleProductoDAO;

/**
 *
 * @author Katt
 */
public class DetalleProductoDAO implements IDetalleProductoDAO {

    public Producto buscarPorID(DetalleProducto detallesProducto) throws PersistenciaException {
        return null;
    }

    public List<Producto> consultar() throws PersistenciaException {
        return null;
    }

    public void guardarDetalleProducto(DetalleProducto detallesProducto) throws PersistenciaException {
    }

    public void actualizarProducto(DetalleProducto detallesProducto) throws PersistenciaException {
    }

    public void guardarProducto(Producto producto, DetalleProducto detallesProducto) throws PersistenciaException {
    }

}
