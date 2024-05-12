/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caso;

import Interfaz.ICasoConsultarVenta;
import dto.ConsultarVentasDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.util.List;
import negocio.ConsultarVentas;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public class CasoConsultarVentas implements ICasoConsultarVenta{

    @Override
    public List<PedidoDTO> consultarVentas() {
        IConsultaVentas consultarVentas = new ConsultarVentas();
        try {
            return consultarVentas.consultarVentas();
        } catch (PersistenciaException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void historial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
