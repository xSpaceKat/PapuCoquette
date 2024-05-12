package dto;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class PedidoDTO {

    private ObjectId _idMongo;
    private Integer id;
    private Date fecha;
    private Float totalPedido;
    private List<DetalleProductoDTO> detalles;

    public PedidoDTO() {
    }

    public PedidoDTO(ObjectId _idMongo, Integer id, Date fecha, Float totalPedido, List<DetalleProductoDTO> detalles) {
        this._idMongo = _idMongo;
        this.id = id;
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.detalles = detalles;
    }

    public PedidoDTO(Integer id, Date fecha, Float totalPedido, List<DetalleProductoDTO> detalles) {
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

    public List<DetalleProductoDTO> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleProductoDTO> detalles) {
        this.detalles = detalles;
    }

    public String toString() {
        return "PedidoDTO{" + "_idMongo=" + _idMongo + ", id=" + id + ", fecha=" + fecha + ", totalPedido=" + totalPedido + ", detalles=" + detalles + '}';
    }

    
}
