/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import Interfaz.ICasoConsultarVenta;
import com.mongodb.client.MongoCursor;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import negocio.ConsultarVentas;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class CasoConsultarVentas implements ICasoConsultarVenta{

    @Override
    public List<PedidoDTO> consultarVentas(Date fecha) {
        IConsultaVentas consultarVentas = new ConsultarVentas();
        try {
            return consultarVentas.listaPedidos(fecha);
        } catch (PersistenciaException e) {
            System.out.println(e);
        }
        return null;
    }

  

    @Override
    public List<DetalleProductoDTO> consultaVentasDetalles(List<PedidoDTO> pedido) throws PersistenciaException {
          IConsultaVentas consultarVentas = new ConsultarVentas();
        try {
            return consultarVentas.listaDetalles(pedido);
        } catch (PersistenciaException e) {
            System.out.println(e);
        }
        return null;
    }

   
    
}
