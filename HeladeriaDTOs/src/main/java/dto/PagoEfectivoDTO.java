package dto;

/**
 *
 * @author Katt
 */
public class PagoEfectivoDTO {

    private Float cambio;
    private Float precioTotal;

    public PagoEfectivoDTO() {
    }

    public PagoEfectivoDTO(Float cambio, Float precioTotal) {
        this.cambio = cambio;
        this.precioTotal = precioTotal;
    }

    public Float getCambio() {
        return cambio;
    }

    public void setCambio(Float cambio) {
        this.cambio = cambio;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String toString() {
        return "PagoEfectivoDTO{" + "cambio=" + cambio + ", precioTotal=" + precioTotal + '}';
    }

}
