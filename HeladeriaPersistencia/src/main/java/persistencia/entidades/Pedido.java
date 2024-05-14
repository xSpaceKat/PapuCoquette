package persistencia.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Pedido {

    private ObjectId _idMongo;
    private Date fecha;
    private Float totalPedido;
    private List<DetalleProducto> detalles;

    public Pedido() {
        this.detalles = new ArrayList<>();
    }

    public Pedido(Date fecha, List<DetalleProducto> detalles) {
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.detalles = detalles;
        this.totalPedido = 0f;
        for (DetalleProducto dp : detalles) {
            totalPedido += dp.getprecioTotal();
        }
    }

    public Pedido(ObjectId _idMongo, Date fecha, List<DetalleProducto> detalles) {
        this._idMongo = _idMongo;
        this.fecha = fecha;
        this.detalles = detalles;
        this.totalPedido = 0f;
        for (DetalleProducto dp : detalles) {
            totalPedido += dp.getprecioTotal();
        }

    }

    public ObjectId getIdMongo() {
        return _idMongo;
    }

    public void setIdMongo(ObjectId _idMongo) {
        this._idMongo = _idMongo;
    }

    public List<DetalleProducto> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleProducto> detalles) {
        this.detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Float totalPedido) {
        this.totalPedido = totalPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "_idMongo=" + _idMongo + ", fecha=" + fecha + ", totalPedido=" + totalPedido + ", detalles=" + detalles + '}';
    }

}
