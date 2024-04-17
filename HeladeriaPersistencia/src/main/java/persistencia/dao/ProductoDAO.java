package persistencia.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import persistencia.entidades.Producto;
import persistencia.idao.IProductoDAO;

/**
 *
 * @author USER
 */
public class ProductoDAO implements IProductoDAO {

    @Override
    public void agregarProductos(Producto producto) throws PersistenceException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(producto);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    @Override
    public List<Producto> consultarProductos() throws PersistenceException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Producto> criteriaQuery = criteriaBuilder.createQuery(Producto.class);

        Root<Producto> automovilRoot = criteriaQuery.from(Producto.class);

        criteriaQuery.select(automovilRoot);

        TypedQuery<Producto> typedQuery = em.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

}
