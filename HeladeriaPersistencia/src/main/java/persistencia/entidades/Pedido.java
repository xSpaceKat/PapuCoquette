package persistencia.entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Pedido {

    private ObjectId _idMongo;
    private Integer id;
    private Date fecha;
    private Float totalPedido;
    private List<Pedido> detalles;

    public Pedido() {
    }

    public Pedido(Integer id, Date fecha, Float totalPedido, List<Pedido> detalles) {
        this.id = id;
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.detalles = detalles;
    }

    public Pedido(ObjectId _idMongo, Integer id, Date fecha, Float totalPedido, List<Pedido> detalles) {
        this._idMongo = _idMongo;
        this.id = id;
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.detalles = detalles;
    }

    public ObjectId getIdMongo() {
        return _idMongo;
    }

    public void setIdMongo(ObjectId _idMongo) {
        this._idMongo = _idMongo;
    }

    public List<Pedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Pedido> detalles) {
        this.detalles = detalles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
