package persistencia.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Katt
 */
@Entity
@Table(name = "Pedido")
public class Pedido implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subtotal", nullable = false)
    private Float subtotal;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, mappedBy = "pedido")
    private List<DetalleProducto> detallesPedido;

    public Pedido() {
        detallesPedido = new ArrayList<>();
    }

    public Pedido(Long id, Float subtotal) {
        this.id = id;
        this.subtotal = subtotal;
        detallesPedido = new ArrayList<>();
    }

    public Pedido(Float subtotal) {
        this.subtotal = subtotal;
        detallesPedido = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public List<DetalleProducto> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetalleProducto> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public void agregarDetallesProd(DetalleProducto detalle) {
        this.detallesPedido.add(detalle);
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", subtotal=" + subtotal + ", detallesPedido=" + detallesPedido + '}';
    }

}
