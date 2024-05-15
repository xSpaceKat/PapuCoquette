/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import Interfaz.ICasoConsultarVenta;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.util.Date;
import java.util.List;
import negocio.ConsultarVentas;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class CasoConsultarVentas implements ICasoConsultarVenta {

    IConsultaVentas consultarVentas;
    
    public CasoConsultarVentas() {
         consultarVentas = new ConsultarVentas();
    }
    
    

    @Override
    public List<PedidoDTO> consultarVentas(Date fecha) throws PersistenciaException {
//        IConsultaVentas consultarVentas = new ConsultarVentas();
//        try {
//            return consultarVentas.listaPedidos(fecha);
//        } catch (PersistenciaException e) {
//            System.out.println(e);
//        }
//        return null;
        return consultarVentas.listaPedidos(fecha);
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

    @Override
    public List<PedidoDTO> listaHistorial() throws PersistenciaException {
        IConsultaVentas consultarVentas = new ConsultarVentas();
        try {
            return consultarVentas.listaHistorial();
        } catch (PersistenciaException e) {
            System.out.println(e);
        }
        return null;
    }

}
