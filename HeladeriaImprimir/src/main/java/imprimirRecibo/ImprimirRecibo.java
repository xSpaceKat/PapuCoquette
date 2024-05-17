package imprimirRecibo;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfaces.IImprimirRecibo;
import interfacesNegocio.IConsultaVentas;
import interfacesNegocio.IRealizarRecibo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.ConsultarVentas;
import negocio.RealizarRecibo;


/**
 *
 * @author Katt
 */
public class ImprimirRecibo implements IImprimirRecibo {

    IRealizarRecibo re = new RealizarRecibo();

    @Override
    public void imprimir(PedidoDTO pedido) {
        try {
            re.recibo(pedido);
        } catch (Exception ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
