package persistencia.interfaces;

import java.util.List;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Katt
 */
public interface IProductoDAO {

    public Producto buscarPorID(Producto producto) throws PersistenciaException;
    
    public Producto buscarPorNombre(Producto producto) throws PersistenciaException;

    public List<Producto> consultar() throws PersistenciaException;

    public void guardarProducto(Producto producto) throws PersistenciaException;

    public void eliminarProducto(Producto producto) throws PersistenciaException;

    public void actualizarProducto(Producto producto) throws PersistenciaException;

}
