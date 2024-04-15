/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
