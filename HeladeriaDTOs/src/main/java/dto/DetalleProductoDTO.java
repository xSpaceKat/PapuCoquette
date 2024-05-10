package dto;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class DetalleProductoDTO {

    private ObjectId _id;
    private Float total;
    private Integer cantidad;
    private Boolean topping;
    private List<ProductoDTO> productosAdquiridos;

    public DetalleProductoDTO() {
        this.productosAdquiridos = new ArrayList<>();
    }

    public DetalleProductoDTO(ObjectId _id, Float total, Integer cantidad, Boolean topping, List<ProductoDTO> productosAdquiridos) {
        this._id = _id;
        this.total = total;
        this.cantidad = cantidad;
        this.topping = topping;
        this.productosAdquiridos = productosAdquiridos;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
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

    public List<ProductoDTO> getProductosAdquiridos() {
        return productosAdquiridos;
    }

    public void setProductosAdquiridos(List<ProductoDTO> productosAdquiridos) {
        this.productosAdquiridos = productosAdquiridos;
    }

    public String toString() {
        return "DetalleProductoDTO{" + "_id=" + _id + ", total=" + total + ", cantidad=" + cantidad + ", topping=" + topping + ", productosAdquiridos=" + productosAdquiridos + '}';
    }

}
