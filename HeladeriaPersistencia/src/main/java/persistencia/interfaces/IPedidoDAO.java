package persistencia.interfaces;

import java.util.List;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Katt
 */
public interface IPedidoDAO {

    public Pedido buscarPorID(Pedido pedido) throws PersistenciaException;

    public List<Pedido> consultar() throws PersistenciaException;

    public void guardarPedido(Pedido pedido) throws PersistenciaException;

    public void guardarDetalleProducto(DetalleProducto detallesProducto, Pedido pedido) throws PersistenciaException;

}
