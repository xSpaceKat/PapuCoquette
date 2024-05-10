package persistencia.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import persistencia.conexion.ConexionBD;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IDetalleProductoDAO;

/**
 *
 * @author Katt
 */
public class DetalleProductoDAO implements IDetalleProductoDAO {

    private final MongoCollection<DetalleProducto> coleccionDetalleProducto;

    public DetalleProductoDAO() {
        this.coleccionDetalleProducto = ConexionBD.getDatabase().getCollection("DetalleProducto", DetalleProducto.class);
    }

    public DetalleProducto buscarPorID(DetalleProducto detallesProducto) throws PersistenciaException {
        try {
            DetalleProducto detalleBuscado = coleccionDetalleProducto.find(Filters.eq("_id", detallesProducto.getId())).first();
            return detalleBuscado;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el detalle producto" + e);
        }
    }

    public List<DetalleProducto> consultar() throws PersistenciaException {
        try {
            List<DetalleProducto> detalles = new ArrayList<>();
            coleccionDetalleProducto.find().into(detalles);
            return detalles;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el detalle producto" + e);
        }
    }

    public void guardarDetalleProducto(DetalleProducto detallesProducto) throws PersistenciaException {
        try {
            this.coleccionDetalleProducto.insertOne(detallesProducto);
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo guardar el detalle producto" + e);
        }
    }

   

    // Si no sirve, es por la variable id, quitar y poner directo el ObjectId
    public void guardarProducto(Producto producto, DetalleProducto detallesProducto) throws PersistenciaException {
        try {
            //este seria la llamada al metodo que les regresa el id de un usuario
            ObjectId idDetalles = detallesProducto.getId();
            this.coleccionDetalleProducto.updateOne(Filters.eq("_id", idDetalles),
                    Updates.push("productosAdquiridos", producto));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
