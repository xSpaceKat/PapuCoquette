package dto;

/**
 *
 * @author Katt
 */
public class PagoTarjetaDTO {

    private String numTarjeta;
    private String fechaVencimiento;
    private Integer cvv;
    private Float cambbio;
    private Float precioTotal;

    public PagoTarjetaDTO() {
    }

    public PagoTarjetaDTO(String numTarjeta, String fechaVencimiento, Integer cvv, Float cambbio, Float precioTotal) {
        this.numTarjeta = numTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.cambbio = cambbio;
        this.precioTotal = precioTotal;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Float getCambbio() {
        return cambbio;
    }

    public void setCambbio(Float cambbio) {
        this.cambbio = cambbio;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String toString() {
        return "PagoTarjetaDTO{" + "numTarjeta=" + numTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", cvv=" + cvv + ", cambbio=" + cambbio + ", precioTotal=" + precioTotal + '}';
    }

}
