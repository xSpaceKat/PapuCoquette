package dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katt
 */
public class PedidoDTO {

    private Float subtotal;
    private List<DetalleProductoDTO> detalles;

    public PedidoDTO() {
        detalles = new ArrayList<>();
    }

    public PedidoDTO(Float subtotal, List<DetalleProductoDTO> detalles) {
        this.subtotal = subtotal;
        this.detalles = detalles;
        detalles = new ArrayList<>();
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public List<DetalleProductoDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleProductoDTO> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" + "subtotal=" + subtotal + ", detalles=" + detalles + '}';
    }

}
