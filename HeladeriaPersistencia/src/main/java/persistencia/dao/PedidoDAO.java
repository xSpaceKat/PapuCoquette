package persistencia.dao;

import com.mongodb.MongoException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public Pedido buscarPorTotal(Pedido pedido) throws PersistenciaException {
        try {
            Pedido pedidoBuscado = coleccionPedido.find(Filters.eq("totalPedido", pedido.getTotalPedido())).first();
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

    @Override
    public List<Pedido> listaPedidos(Date fecha) throws PersistenciaException {
        Bson filtro = Filters.eq("fecha", fecha);
        try {
            List<Pedido> resultados = coleccionPedido.find(filtro).into(new ArrayList<>());
            return resultados;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<DetalleProducto> listaDetalles(List<Pedido> listaPedidos) throws PersistenciaException {
        List<DetalleProducto> listaDetalles = new ArrayList<>();

        for (Pedido pedido : listaPedidos) {
            List<DetalleProducto> detallesPedido = pedido.getDetalles();
            listaDetalles.addAll(detallesPedido);
        }
        return listaDetalles;
    }

    public void ImprimirReporte(Pedido pepe) throws PersistenciaException, FileNotFoundException {
        PdfFont code = null;
        Pedido p = buscarPorTotal(pepe);
        List<DetalleProducto> detallesProductos = p.getDetalles();
        try {
            code = PdfFontFactory.createFont(StandardFonts.COURIER_BOLD);
        } catch (IOException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Style style = new Style()
                .setFont(code)
                .setFontSize(14)
                .setFontColor(ColorConstants.BLACK)
                .setBackgroundColor(ColorConstants.LIGHT_GRAY);

        try (Document document = new Document(new PdfDocument(new PdfWriter("./Recibo.pdf")))) {
            document.add(new Paragraph("PAPU COQUETTE").addStyle(style));
            document.add(new Paragraph("COMPRA").addStyle(style));
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            document.add(new Paragraph(p.getFecha().toString()).addStyle(style));
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            for (DetalleProducto dt : detallesProductos) {
                document.add(new Paragraph("Nombre del Producto: " + dt.getNombreProducto()).addStyle(style));
                document.add(new Paragraph("Sabor: " + dt.getSabor()).addStyle(style));
                document.add(new Paragraph("Tamaño: " + dt.getTamano()).addStyle(style));
                document.add(new Paragraph("Precio por tamaño: " + dt.getTamanoPrecio().toString()).addStyle(style));
                document.add(new Paragraph("Cantidad: " + dt.getCantidad().toString()).addStyle(style));
                document.add(new Paragraph("¿Topping?: " + dt.getTopping().toString()).addStyle(style));
            }
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            document.add(new Paragraph("Precio Total: " + p.getTotalPedido().toString()).addStyle(style));
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            document.add(new Paragraph("").addStyle(style));
            document.add(new Paragraph("").addStyle(style));
            document.add(new Paragraph("Gracias por su compra!").addStyle(style));
        }
    }
//
//    public void reporteVentas(DetalleProducto detalleProducto){
//        PdfFont code = null;
//        DetalleProducto dp = 
//    }
//    

    @Override
    public List<DetalleProducto> consultaVentasDetalles(List<Pedido> pedido) throws PersistenciaException {
        List<DetalleProducto> listaDetalles = new ArrayList<>();
        for (Pedido pedidos : pedido) {
            listaDetalles.addAll(pedidos.getDetalles());
        }
        return listaDetalles;
    }
}
