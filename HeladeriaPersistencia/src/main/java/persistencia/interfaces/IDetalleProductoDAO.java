package persistencia.interfaces;

import java.util.List;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Katt
 */
public interface IDetalleProductoDAO {

    public Producto buscarPorID(DetalleProducto detallesProducto) throws PersistenciaException;

    public List<Producto> consultar() throws PersistenciaException;

    public void guardarDetalleProducto(DetalleProducto detallesProducto) throws PersistenciaException;

    public void actualizarProducto(DetalleProducto detallesProducto) throws PersistenciaException;

    public void guardarProducto(Producto producto, DetalleProducto detallesProducto) throws PersistenciaException;

}
