package persistencia.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
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

    public JasperPrint ImprimirReporte() throws PersistenciaException, JRException {
        // Obtener la instancia de la base de datos MongoDB
        MongoDatabase database = ConexionBD.getDatabase();

        // Instanciar el DAO de DetalleProducto
        DetalleProductoDAO detalleProductoDAO = new DetalleProductoDAO();

        // Obtener los detalles de producto según el parámetro de filtro
        DetalleProducto detallesProducto = new DetalleProducto();
        // Realizar la búsqueda de los detalles de producto
        detallesProducto = detalleProductoDAO.buscarPorID(detallesProducto);

        // Convertir los detalles de producto a una lista de JavaBeans (o cualquier formato compatible con JasperReports)
        List<DetalleProducto> dataList = new ArrayList<>();
        dataList.add(detallesProducto);

        // Cargar el archivo JasperReport
        InputStream is = getClass().getResourceAsStream("/Recibo/Recibo.jasper");
        if (is == null) {
            return null;
        }

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(is);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, new JRBeanCollectionDataSource(dataList));
            return jp;
        } catch (JRException ex) {
            Logger.getLogger(DetalleProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
