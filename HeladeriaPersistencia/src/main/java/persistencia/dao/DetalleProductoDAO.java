package persistencia.dao;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public void ImprimirReporte() throws PersistenciaException, FileNotFoundException {
        PdfFont code = null;
        List<DetalleProducto> p = consultar();
        try {
            code = PdfFontFactory.createFont(StandardFonts.COURIER_BOLD);
        } catch (IOException ex) {
            Logger.getLogger(DetalleProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Style style = new Style()
                .setFont(code)
                .setFontSize(14)
                .setFontColor(ColorConstants.BLACK)
                .setBackgroundColor(ColorConstants.LIGHT_GRAY);

        try (Document document = new Document(new PdfDocument(new PdfWriter("./Recibo.pdf")))) {
            document.add(new Paragraph("PAPU COQUETTE").addStyle(style));
            document.add(new Paragraph("COMPRA").addStyle(style));
            document.add(new Paragraph(new GregorianCalendar().toString()).addStyle(style));
            for (DetalleProducto detalle : p) {
                document.add(new Paragraph("Nombre del Producto: " + detalle.getNombreProducto()).addStyle(style));
                document.add(new Paragraph("Cantidad: " + detalle.getCantidad().toString()).addStyle(style));
                document.add(new Paragraph("Tamaño: " + detalle.getTamano()).addStyle(style));
                document.add(new Paragraph("Precio del tamaño: " + detalle.getTamanoPrecio().toString()).addStyle(style));
                document.add(new Paragraph("Precio Total: " + detalle.getprecioTotal().toString()).addStyle(style));
            }
            document.add(new Paragraph("").addStyle(style));
            document.add(new Paragraph("Gracias por su compra!").addStyle(style));
            document.close();
        }
    }

}
