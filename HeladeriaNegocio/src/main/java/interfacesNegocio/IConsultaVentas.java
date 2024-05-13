/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesNegocio;

import dto.PedidoDTO;
import java.util.Date;
import java.util.List;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public interface IConsultaVentas {
     public List<PedidoDTO> consultarVentas() throws PersistenciaException;
     
     public List<PedidoDTO> listaPedidos(Date fecha) throws PersistenciaException;
     
     public void historial();
     
}
