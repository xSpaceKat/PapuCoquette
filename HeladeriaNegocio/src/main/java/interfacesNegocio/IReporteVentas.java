/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesNegocio;

import dto.DetalleProductoDTO;
import java.util.List;
import persistencia.excepciones.PersistenciaException;


/**
 *
 * @author Ximena
 */
public interface IReporteVentas {
    
    public void reporteVentas(DetalleProductoDTO detalle);
}
