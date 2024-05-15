package interfacesNegocio;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import java.util.Date;
import java.util.List;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Ximena
 */
public interface IConsultaVentas {

    public List<PedidoDTO> consultarVentas() throws PersistenciaException;

    public List<PedidoDTO> listaPedidos(Date fecha) throws PersistenciaException;

    public List<DetalleProductoDTO> listaDetalles(List<PedidoDTO> listaPedidos) throws PersistenciaException;
}
