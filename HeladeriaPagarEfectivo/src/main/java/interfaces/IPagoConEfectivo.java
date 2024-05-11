package interfaces;

import dto.PagoEfectivoDTO;

/**
 *
 * @author Katt
 */
public interface IPagoConEfectivo {

    public PagoEfectivoDTO calcularCambio(PagoEfectivoDTO efectivo);

}
