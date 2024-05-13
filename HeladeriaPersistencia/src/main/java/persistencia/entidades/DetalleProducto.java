package persistencia.entidades;

import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class DetalleProducto {

    private ObjectId _id;
    private String nombreProducto;
    private String sabor;
    private String tamano;
    private Float tamanoPrecio;
    private Integer cantidad;
    private Boolean topping;
    private Float precioTotal;

    public DetalleProducto() {
    }

    public DetalleProducto(ObjectId _id, String nombreProducto, String sabor, String tamano, Float tamanoPrecio, Integer cantidad, Boolean topping) {
        this._id = _id;
        this.nombreProducto = nombreProducto;
        this.sabor = sabor;
        this.tamano = tamano;
        this.tamanoPrecio = tamanoPrecio;
        this.cantidad = cantidad;
        this.topping = topping;
    }

    public DetalleProducto(String nombreProducto, String sabor, String tamano, Float tamanoPrecio, Integer cantidad, Boolean topping) {
        this.nombreProducto = nombreProducto;
        this.sabor = sabor;
        this.tamano = tamano;
        this.tamanoPrecio = tamanoPrecio;
        this.cantidad = cantidad;
        this.topping = topping;
        if (topping){
           this.precioTotal = (tamanoPrecio*cantidad)+(5*cantidad); 
        }
        else{
            this.precioTotal = (tamanoPrecio*cantidad);
        }
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
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

    public Float getprecioTotal() {
        return precioTotal;
    }

    public void setprecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "_id=" + _id + ", nombreProducto=" + nombreProducto + ", sabor=" + sabor + ", tamano=" + tamano + ", tamanoPrecio=" + tamanoPrecio + ", cantidad=" + cantidad + ", topping=" + topping + '}';
    }

    
}
