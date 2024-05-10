/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesNegocio;

import dto.ProductoDTO;
import java.util.List;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author USER
 */
public interface IConsultarProductos {
    public List<ProductoDTO> consultarTodosLosProductos() throws PersistenciaException;
    
    
    
    
    
}
