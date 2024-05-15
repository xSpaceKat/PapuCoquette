package interfaces;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import java.util.List;

/**
 *
 * @author Katt
 */
public interface IImprimirRecibo {

    public void imprimir(PedidoDTO pedido);
    
    public void imprimirReporteVentas(DetalleProductoDTO detalle);

}
