/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
