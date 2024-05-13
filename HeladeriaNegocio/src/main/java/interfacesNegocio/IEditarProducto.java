/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesNegocio;

import dto.ProductoDTO;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author USER
 */
public interface IEditarProducto {
    public void eliminarProducto(ProductoDTO productoDTO)throws PersistenciaException;
    public void actualizarProducto(ProductoDTO productoDTO)throws PersistenciaException;
}
