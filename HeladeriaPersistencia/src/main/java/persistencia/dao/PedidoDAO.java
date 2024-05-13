package persistencia.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import persistencia.conexion.ConexionBD;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Katt
 */
public class PedidoDAO implements IPedidoDAO {

    private final MongoCollection<Pedido> coleccionPedido;

    public PedidoDAO() {
        this.coleccionPedido = ConexionBD.getDatabase().getCollection("Pedido", Pedido.class);
    }

    public Pedido buscarPorID(Pedido pedido) throws PersistenciaException {
        try {
            Pedido pedidoBuscado = coleccionPedido.find(Filters.eq("_id", pedido.getIdMongo())).first();
            return pedidoBuscado;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el pedido " + e);
        }
    }

    public List<Pedido> consultar() throws PersistenciaException {
        try {
            List<Pedido> pedido = new ArrayList<>();
            coleccionPedido.find().into(pedido);
            return pedido;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el pedido " + e);
        }
    }

    public void guardarPedido(Pedido pedido) throws PersistenciaException {
        try {
            this.coleccionPedido.insertOne(pedido);
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo guardar el pedido" + e);
        }
    }

    public void guardarDetalleProducto(DetalleProducto detallesProducto, Pedido pedido) throws PersistenciaException {
        try {
            //este seria la llamada al metodo que les regresa el id de un usuario
            ObjectId idPedido = pedido.getIdMongo();
            this.coleccionPedido.updateOne(Filters.eq("_id", idPedido),
                    Updates.push("detalles", detallesProducto));
        } catch (Exception e) {
            System.out.println("No se pudo agregar el Detalle de Producto" + e);
        }
    }

    public List<Pedido> listaPedidos(Date fecha) {
        Bson filtro = Filters.eq("fecha", fecha);
        try {
            List<Pedido> resultados = coleccionPedido.find(filtro).into(new ArrayList<>());
            return resultados;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }
}
