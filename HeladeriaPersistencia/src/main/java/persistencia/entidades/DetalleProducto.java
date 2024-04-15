package persistencia.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import persistencia.Enum.Sabores;
import persistencia.Enum.Tamanio;

/**
 *
 * @author Katt
 */
@Entity
@Table(name = "DetallesProductos")
public class DetalleProducto implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sabor", nullable = false)
    @Enumerated(EnumType.STRING)
    private Sabores sabor;

    @Column(name = "tamanio", nullable = false)
    @Enumerated(EnumType.STRING)
    private Tamanio tamanio;

    @Column(name = "toppings", nullable = false)
    private Boolean toppings;

    @Column(name = "precioVenta", nullable = false)
    private Float precioVenta;
    
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @OneToOne
    @JoinColumn(name = "idProductos")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "pedido", nullable = false)
    private Pedido pedido;

    public DetalleProducto() {
    }

    public DetalleProducto(Long id, Sabores sabor, Tamanio tamanio, Boolean toppings, Float precioVenta) {
        this.id = id;
        this.sabor = sabor;
        this.tamanio = tamanio;
        this.toppings = toppings;
        this.precioVenta = precioVenta;
    }

    public DetalleProducto(Sabores sabor, Tamanio tamanio, Boolean toppings, Float precioVenta) {
        this.sabor = sabor;
        this.tamanio = tamanio;
        this.toppings = toppings;
        this.precioVenta = precioVenta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sabores getSabor() {
        return sabor;
    }

    public void setSabor(Sabores sabor) {
        this.sabor = sabor;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "id=" + id + ", sabor=" + sabor + ", tamanio=" + tamanio + ", toppings=" + toppings + ", precioVenta=" + precioVenta + ", producto=" + producto + ", pedido=" + pedido + '}';
    }

}
