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
    private Date fecha;
    private Float totalPedido;
    private List<DetalleProductoDTO> detalles;

    public PedidoDTO() {
    }

    public PedidoDTO(Date fecha, Float totalPedido) {
        this.fecha = fecha;
        this.totalPedido = totalPedido;
    }
    
    public PedidoDTO(ObjectId _idMongo, Date fecha, Float totalPedido, List<DetalleProductoDTO> detalles) {
        this._idMongo = _idMongo;
        this.fecha = fecha;
        this.totalPedido = totalPedido;
        this.detalles = detalles;
    }

    public PedidoDTO(Date fecha, Float totalPedido, List<DetalleProductoDTO> detalles) {
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

    @Override
    public String toString() {
        return "PedidoDTO{" + "_idMongo=" + _idMongo + ", fecha=" + fecha + ", totalPedido=" + totalPedido + ", detalles=" + detalles + '}';
    }

    

    
}
