package imprimirRecibo;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfaces.IImprimirRecibo;
import interfacesNegocio.IRealizarRecibo;
import interfacesNegocio.IReporteVentas;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.RealizarRecibo;
import negocio.ReporteVentas;

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

    @Override
    public void imprimirReporteVentas(DetalleProductoDTO  detalle) {
        IReporteVentas rp = new ReporteVentas();
        try {
            rp.reporteVentas(detalle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
