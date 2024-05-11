package interfaces;

import dto.PagoTarjetaDTO;

/**
 *
 * @author Katt
 */
public interface IPagoConTarjeta {

    public PagoTarjetaDTO verificarTarjeta(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verificarFechaVencimiento(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verificarCvv(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO verificarDinero(PagoTarjetaDTO tarjeta);

    public PagoTarjetaDTO calcularCambio(PagoTarjetaDTO tarjeta);

}
