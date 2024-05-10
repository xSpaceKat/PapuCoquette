package interfaces;

import dto.PagoTarjetaDTO;

/**
 *
 * @author Katt
 */
public interface IPagoConTarjeta {

    public PagoTarjetaDTO verficarTarejta(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verificarFechaVencimiento(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verficarCvv(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verficarDinero(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO calcularCambio(PagoTarjetaDTO tarjeta);

}
