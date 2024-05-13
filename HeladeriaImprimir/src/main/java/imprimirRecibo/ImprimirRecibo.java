package imprimirRecibo;

import interfaces.IImprimirRecibo;
import interfacesNegocio.IRealizarRecibo;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.RealizarRecibo;

/**
 *
 * @author Katt
 */
public class ImprimirRecibo implements IImprimirRecibo {

    IRealizarRecibo re = new RealizarRecibo();

    public void imprimir() {
        try {
            re.recibo();
        } catch (Exception ex) {
            Logger.getLogger(ImprimirRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
