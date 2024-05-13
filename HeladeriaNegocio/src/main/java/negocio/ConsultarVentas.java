/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.ConsultarVentasDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.dao.PedidoDAO;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Ximena
 */
public class ConsultarVentas implements IConsultaVentas {

    @Override
    public List<PedidoDTO> consultarVentas() throws PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> pedido = pedidoDAO.consultar();
        List<PedidoDTO> pedidoDTO = new ArrayList<>();
        Conversor conversor = new Conversor();
        for (Pedido p : pedido) {
            pedidoDTO.add(conversor.DAOaDTO(p));
        }
        return pedidoDTO;
    }

    @Override
    public void historial() {

    }

    @Override
    public List<PedidoDTO> listaPedidos(Date fecha) throws PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> pedido = pedidoDAO.listaPedidos(fecha);
        List<PedidoDTO> pedidoDTO = new ArrayList<>();
        Conversor conversor = new Conversor();
        for (Pedido p : pedido) {
            pedidoDTO.add(conversor.DAOaDTO(p));
        }
        return pedidoDTO;
    }

}
