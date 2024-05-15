package persistencia.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import persistencia.conexion.ConexionBD;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author Katt
 */
public class ProductoDAO implements IProductoDAO {

    private final MongoCollection<Producto> coleccionProducto;

    public ProductoDAO() {
        this.coleccionProducto = ConexionBD.getDatabase().getCollection("Producto", Producto.class);
    }

    public Producto buscarPorID(Producto producto) throws PersistenciaException {
        try {
            Producto productoBuscado = coleccionProducto.find(Filters.eq("_id", producto.getId())).first();
            return productoBuscado;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el producto" + e);
        }
    }

    public Producto buscarPorNombre(Producto producto) throws PersistenciaException {
        try {
            Producto productoBuscado = coleccionProducto.find(Filters.eq("nombre", producto.getNombre())).first();
            return productoBuscado;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el producto" + e);
        }
    }

    public List<Producto> consultar() throws PersistenciaException {
        try {
            List<Producto> producto = new ArrayList<>();
            coleccionProducto.find().into(producto);
            return producto;
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo consultar el producto" + e);
        }
    }

    public void guardarProducto(Producto producto) throws PersistenciaException {
        try {
            this.coleccionProducto.insertOne(producto);
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo guardar el producto" + e);
        }
    }

    public void eliminarProducto(Producto producto) throws PersistenciaException {
        try {
            coleccionProducto.deleteOne(Filters.eq("_id", producto.getId()));
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo eliminar el producto" + e);
        }
    }

    public void actualizarProducto(Producto producto) throws PersistenciaException {
        Bson filtroID = Filters.eq("_id", producto.getId());

        Bson actualizacionDatos = Updates.combine(Updates.set("nombre", producto.getNombre()), Updates.set("tamano", producto.getTamano()), Updates.set("sabores", producto.getSabores()));

        try {
            coleccionProducto.updateOne(filtroID, actualizacionDatos);
        } catch (MongoException e) {
            throw new PersistenciaException("No se pudo actualizar el producto" + e);
        }
    }

}
