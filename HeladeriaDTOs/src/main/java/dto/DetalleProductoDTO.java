package dto;

/**
 *
 * @author Katt
 */
public class DetalleProductoDTO {

    private String nombreProducto;
    private String sabor;
    private String tamano;
    private Float tamanoPrecio;
    private Integer cantidad;
    private Boolean topping;
    private Float precioTotal;

    public DetalleProductoDTO(String nombreProducto, String sabor, String tamano, Float tamanoPrecio, Integer cantidad, Boolean topping, Float precioTotal) {
        this.nombreProducto = nombreProducto;
        this.sabor = sabor;
        this.tamano = tamano;
        this.tamanoPrecio = tamanoPrecio;
        this.cantidad = cantidad;
        this.topping = topping;
        if (topping) {
            this.precioTotal = (tamanoPrecio * cantidad) + (5 * cantidad);
        } else {
            this.precioTotal = (tamanoPrecio * cantidad);
        }
    }

    public DetalleProductoDTO() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Float getTamanoPrecio() {
        return tamanoPrecio;
    }

    public void setTamanoPrecio(Float tamanoPrecio) {
        this.tamanoPrecio = tamanoPrecio;
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

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Producto:" + nombreProducto + " | Sabor:" + sabor + " | Tamaño=" + tamano + " | Cantidad=" + cantidad + " | Topping=" + topping + " | precioTotal=" + precioTotal;
    }

}
