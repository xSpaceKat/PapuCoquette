package pagarEfectivo;

import dto.PagoEfectivoDTO;
import interfaces.IPagoConEfectivo;
import javax.swing.JOptionPane;

/**
 *
 * @author Katt
 */
public class PagoConEfectivo implements IPagoConEfectivo {

    public PagoEfectivoDTO calcularCambio(PagoEfectivoDTO efectivo) {
        if (efectivo.getPrecioTotal() > efectivo.getCantidadPagar()) {
            JOptionPane.showMessageDialog(null, "Error! Se necesita de mas dinero");
        } else {
            efectivo.setCambio(efectivo.getCantidadPagar() - efectivo.getPrecioTotal());
            return efectivo;
        }
        return null;
    }

}
