package negocio;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfacesNegocio.IConsultaVentas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    public List<PedidoDTO> listaPedidos(Date fecha) throws PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> pedido = pedidoDAO.listaPedidos(fecha);
        System.out.println(pedido);
        System.out.println("esta vacia en objetonegocio usa fecha");
        List<PedidoDTO> pedidoDTO = new ArrayList<>();
        Conversor conversor = new Conversor();
        for (Pedido p : pedido) {
            pedidoDTO.add(conversor.DAOaDTO(p));
            System.out.println(p);
        }
        return pedidoDTO;
    }

    @Override
    public List<DetalleProductoDTO> listaDetalles(List<PedidoDTO> listaPedidos) throws PersistenciaException {
        List<DetalleProductoDTO> listaDetalles = new ArrayList<>();
        for (PedidoDTO pedidos : listaPedidos) {

            listaDetalles.addAll(pedidos.getDetalles());

        }
        return listaDetalles;
    }

    @Override
    public List<PedidoDTO> listaHistorial() throws PersistenciaException {
        IPedidoDAO pedidoDAO = new PedidoDAO();
        List<Pedido> pedido = pedidoDAO.listaHistorial();
        System.out.println(pedido);
        System.out.println("esta vacia en objetonegocio ");
        List<PedidoDTO> pedidoDTO = new ArrayList<>();
        Conversor conversor = new Conversor();
        for (Pedido p : pedido) {
            pedidoDTO.add(conversor.DAOaDTOHistorial(p));
            System.out.println(p);
        }
        return pedidoDTO;
    }

}
