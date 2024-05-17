/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ximena
 */
public interface IImprimirReporteVentas {
    
    public void imprimirReporteVentas(List<DetalleProductoDTO> detalle, PedidoDTO pedido);
}
