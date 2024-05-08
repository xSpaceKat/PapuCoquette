package persistencia.entidades;

import java.util.List;

/**
 *
 * @author Katt
 */
public class DetalleProducto {

    private Float total;
    private Integer cantidad;
    private Boolean topping;
    private List<Producto> productosAdquiridos;

    public DetalleProducto() {
    }

    public DetalleProducto(Float total, Integer cantidad, Boolean topping, List<Producto> productosAdquiridos) {
        this.total = total;
        this.cantidad = cantidad;
        this.topping = topping;
        this.productosAdquiridos = productosAdquiridos;
    }

    public List<Producto> getProductosAdquiridos() {
        return productosAdquiridos;
    }

    public void setProductosAdquiridos(List<Producto> productosAdquiridos) {
        this.productosAdquiridos = productosAdquiridos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getTopping() {
        return topping;
    }

    public void setTopping(Boolean topping) {
        this.topping = topping;
    }

}
