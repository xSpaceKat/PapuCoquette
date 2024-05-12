/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import dto.ConsultarVentasDTO;
import dto.PedidoDTO;
import java.util.List;

/**
 *
 * @author Ximena
 */
public interface ICasoConsultarVenta {
     public List<PedidoDTO> consultarVentas();
     
     public void historial();
}
