package persistencia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import persistencia.entidades.Pedido;
import persistencia.idao.IPedidoDAO;

/**
 *
 * @author USER
 */
public class PedidoDAO implements IPedidoDAO {

    @Override
    public void agregarPedido(Pedido pedido) throws PersistenceException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();

        //pedido.getDetallesPedido();
        //List<DetallesProducto> k = new List<DetallesProducto>;
        try {

            em.getTransaction().begin();

            em.persist(pedido);

            em.getTransaction().commit();
            em.close();
            emf.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
