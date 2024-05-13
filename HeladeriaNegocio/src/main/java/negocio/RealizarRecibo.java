package negocio;

import interfacesNegocio.IRealizarRecibo;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperPrint;
import persistencia.dao.DetalleProductoDAO;
import persistencia.interfaces.IDetalleProductoDAO;

/**
 *
 * @author Katt
 */
public class RealizarRecibo implements IRealizarRecibo {

    IDetalleProductoDAO vaya = new DetalleProductoDAO();

    public JasperPrint recibo() {
        try {
            return vaya.ImprimirReporte();
        } catch (Exception ex) {
            Logger.getLogger(RealizarRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
