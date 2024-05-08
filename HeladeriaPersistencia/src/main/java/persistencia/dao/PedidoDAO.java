package persistencia.dao;

import java.util.List;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Katt
 */
public class PedidoDAO implements IPedidoDAO {

    public Pedido buscarPorID(Pedido pedido) throws PersistenciaException {
        return null;
    }

    public List<Pedido> consultar() throws PersistenciaException {
        return null;
    }

    public void guardarPedido(Pedido pedido) throws PersistenciaException {
    }

    public void guardarDetalleProducto(DetalleProducto detallesProducto, Pedido pedido) throws PersistenciaException {
    }

}
