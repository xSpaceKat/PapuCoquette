/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class PedidoDAO implements IPedidoDAO{

    @Override
    public void agregarPedido(Pedido pedido) throws PersistenceException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(pedido);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
