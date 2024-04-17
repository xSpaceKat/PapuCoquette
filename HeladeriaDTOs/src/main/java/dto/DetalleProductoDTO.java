package dto;

/**
 *
 * @author Katt
 */
public class DetalleProductoDTO {

    private String sabores;
    private String tamanio;
    private Boolean toppings;
    private Float precioVenta;
    private Integer cantidad;
    private ProductoDTO producto;
    private PedidoDTO pedido;

    public DetalleProductoDTO() {
    }

    public DetalleProductoDTO(String sabores, String tamanio, Boolean toppings, Float precioVenta, Integer cantidad, ProductoDTO producto, PedidoDTO pedido) {
        this.sabores = sabores;
        this.tamanio = tamanio;
        this.toppings = toppings;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.producto = producto;
        this.pedido = pedido;
    }

    public String getSabores() {
        return sabores;
    }

    public void setSabores(String sabores) {
        this.sabores = sabores;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getToppings() {
        return toppings;
    }

    public void setToppings(Boolean toppings) {
        this.toppings = toppings;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleProductoDTO{" + "sabores=" + sabores + ", tamanio=" + tamanio + ", toppings=" + toppings + ", precioVenta=" + precioVenta + ", producto=" + producto + ", pedido=" + pedido + '}';
    }

}
