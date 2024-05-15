package persistencia.dao;

import com.mongodb.MongoException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TabAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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
                if (dt.getTopping()) {
                    document.add(new Paragraph("¿Topping?: " + "Si").addStyle(style));
                } else {
                    document.add(new Paragraph("¿Topping?: " + "No").addStyle(style));
                }

            }
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            document.add(new Paragraph("Precio Total: " + p.getTotalPedido().toString()).addStyle(style));
            document.add(new Paragraph("---------------------------------------").addStyle(style));
            document.add(new Paragraph("").addStyle(style));
            document.add(new Paragraph("").addStyle(style));
            document.add(new Paragraph("Gracias por su compra!").addStyle(style));
        }
    }

    @Override
    public List<DetalleProducto> consultaVentasDetalles(List<Pedido> pedido) throws PersistenciaException {
        List<DetalleProducto> listaDetalles = new ArrayList<>();
        for (Pedido pedidos : pedido) {
            listaDetalles.addAll(pedidos.getDetalles());
        }
        return listaDetalles;
    }

    @Override
    public List<Pedido> listaHistorial() throws PersistenciaException {
        MongoCursor<Pedido> cursor = coleccionPedido.find().iterator();
        List<Pedido> documentos = new ArrayList<>();
        while (cursor.hasNext()) {
            Pedido p = cursor.next();
            documentos.add(p);
        }
        return documentos;
    }

    @Override
    public void imprimirReporteVentas(DetalleProducto detalle) throws PersistenciaException {
        Pedido p = new Pedido();
        try {
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter("./ReporteVentas.pdf"));
            Document doc = new Document(pdfDoc);

            doc.add(new Paragraph("PAPU COQUETTE"));
            doc.add(new Paragraph("COMPRA"));

            TabStop tabStop = new TabStop(PageSize.A4.getWidth() - 36, TabAlignment.RIGHT);


            Paragraph paragraph = new Paragraph();
            paragraph.addTabStops(tabStop);

            paragraph.add("Fecha del Pedido: " + p.getFecha());

            paragraph.add(new Tab());

            paragraph.add("Venta Total: " + p.getTotalPedido());

            doc.add(paragraph);

            Table table = new Table(new float[]{2, 2, 2, 1, 1, 1});

            String[] headers = {"Nombre del Producto", "Tamaño", "Sabor", "Cantidad", "Precio", "Total Vendido"};
            PdfFont font = PdfFontFactory.createFont();
            for (String header : headers) {
                Cell cell = new Cell();
                cell.setFont(font);
                cell.setBackgroundColor(new DeviceRgb(192, 192, 192));
                cell.setTextAlignment(TextAlignment.CENTER);
                table.addCell(cell.add(new Paragraph(header))); // Agregar encabezados a la tabla
            }

            table.addCell(new Cell().add(new Paragraph(detalle.getNombreProducto())));
            table.addCell(new Cell().add(new Paragraph(detalle.getTamano())));
            table.addCell(new Cell().add(new Paragraph(detalle.getSabor())));
            table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getCantidad()))));
            table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getTamanoPrecio()))));
            table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getprecioTotal()))));

            doc.add(table);
            doc.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
