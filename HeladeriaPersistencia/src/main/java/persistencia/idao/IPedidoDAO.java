package persistencia.idao;

import javax.persistence.PersistenceException;
import persistencia.entidades.Pedido;

/**
 *
 * @author USER
 */
public interface IPedidoDAO {
    public void agregarPedido (Pedido pedido)throws PersistenceException;
}
