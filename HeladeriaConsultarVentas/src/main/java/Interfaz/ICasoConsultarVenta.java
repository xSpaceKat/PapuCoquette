/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import java.util.Date;
import java.util.List;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public interface ICasoConsultarVenta {
     public List<PedidoDTO> consultarVentas(Date fecha) throws PersistenciaException;
     
     public List<DetalleProductoDTO> consultaVentasDetalles(List<PedidoDTO> pedido) throws PersistenciaException;
     
}
