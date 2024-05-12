package imprimirRecibo;

import interfaces.IImprimirRecibo;
import interfacesNegocio.IRealizarRecibo;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.RealizarRecibo;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Katt
 */
public class ImprimirRecibo implements IImprimirRecibo {

    IRealizarRecibo re = new RealizarRecibo();

    public void imprimir() {
        try {
            JasperPrint jp = re.recibo();
            JasperViewer.viewReport(jp);
        } catch (Exception ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}