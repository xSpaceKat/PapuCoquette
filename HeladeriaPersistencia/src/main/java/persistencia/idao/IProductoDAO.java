package persistencia.idao;

import java.util.List;
import javax.persistence.PersistenceException;
import persistencia.entidades.Producto;

/**
 *
 * @author USER
 */
public interface IProductoDAO {
    public void agregarProductos (Producto producto)throws PersistenceException;
    public List<Producto> consultarProductos ()throws PersistenceException;
}
