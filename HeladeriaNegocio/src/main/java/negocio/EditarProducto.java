/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.ProductoDTO;
import interfacesNegocio.IEditarProducto;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author USER
 */
public class EditarProducto implements IEditarProducto{

    @Override
    public void eliminarProducto(ProductoDTO productoDTO) throws PersistenciaException{
        IProductoDAO productoDAO=new ProductoDAO();
        Conversor conversor=new Conversor();
        Producto producto=conversor.DTOaDAO(productoDTO);
        try {
            productoDAO.eliminarProducto(productoDAO.buscarPorNombre(producto));
        } catch (PersistenciaException ex) {
            throw new PersistenciaException("No se pudo eliminar");
        }
    }

    @Override
    public void actualizarProducto(ProductoDTO productoDTO) throws PersistenciaException{
        IProductoDAO productoDAO=new ProductoDAO();
        Conversor conversor=new Conversor();
        Producto producto=conversor.DTOaDAO(productoDTO);
        try {
            productoDAO.actualizarProducto(productoDAO.buscarPorNombre(producto));
        } catch (PersistenciaException ex) {
            throw new PersistenciaException("No se pudo eliminar");
        }
    }
    
}
