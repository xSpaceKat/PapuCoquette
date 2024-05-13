/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import Interfaz.ICasoConsultarVenta;
import dto.ConsultarVentasDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ConsultarVentas;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class CasoConsultarVentas implements ICasoConsultarVenta{


    @Override
    public void historial() {
//        Object[] datos = new PedidoDTO[2];
//        try {
//            IConsultaVentas consulta = new ConsultarVentas();
//            List<PedidoDTO> pedido = consulta.consultarVentas();
//            if(!pedido.isEmpty()){
//                for (PedidoDTO p : pedido) {
//                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
//                  datos[0] = formato.format(p.getFecha().getTime());
//                  datos[1] = p.getTotalPedido();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

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

}
