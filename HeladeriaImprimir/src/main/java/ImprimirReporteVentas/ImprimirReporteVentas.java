/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ImprimirReporteVentas;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TabAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfaces.IImprimirReporteVentas;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ximena
 */
public class ImprimirReporteVentas implements IImprimirReporteVentas {

    public static String formatoFecha(Date date) {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    
    @Override
    public void imprimirReporteVentas(List<DetalleProductoDTO> detalles, PedidoDTO pedido) {
        try {

            PdfDocument pdfDoc = new PdfDocument(new PdfWriter("./ReporteVentas.pdf"));
            Document doc = new Document(pdfDoc);

            doc.add(new Paragraph("PAPU COQUETTE"));
            doc.add(new Paragraph("Reporte de ventas"));

            TabStop tabStop = new TabStop(PageSize.A4.getWidth() - 36, TabAlignment.RIGHT);

            Paragraph paragraph = new Paragraph();
            paragraph.addTabStops(tabStop);
            paragraph.add("Fecha del Pedido: " + formatoFecha(pedido.getFecha()));
            paragraph.add(new Tab());
            paragraph.add("Venta Total: " + pedido.getTotalPedido());
            doc.add(paragraph);

            Table table = new Table(new float[]{2, 2, 2, 1, 1, 1, 1});
            String[] headers = {"Nombre del Producto", "Tamaño", "Sabor", "Cantidad", "¿Topping?", "Precio", "Total Vendido"};
            PdfFont font = PdfFontFactory.createFont();

            DeviceRgb headerColor = new DeviceRgb(233, 215, 248);

            for (String header : headers) {
                Cell cell = new Cell();
                cell.setFont(font);
                cell.setBackgroundColor(new DeviceRgb(192, 192, 192));
                cell.setTextAlignment(TextAlignment.CENTER);
                cell.add(new Paragraph(header));
                table.addCell(cell);
            }
            for (DetalleProductoDTO detalle : detalles) {
                table.addCell(new Cell().add(new Paragraph(detalle.getNombreProducto())));
                table.addCell(new Cell().add(new Paragraph(detalle.getTamano())));
                table.addCell(new Cell().add(new Paragraph(detalle.getSabor())));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getCantidad()))));
                if (detalle.getTopping() == true) {
                    table.addCell(new Cell().add(new Paragraph("Sí")));
                } else {
                    table.addCell(new Cell().add(new Paragraph("No")));
                }

                table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getTamanoPrecio()))));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(detalle.getPrecioTotal()))));
            }

            doc.add(table);

            doc.close();
        } catch (Exception ex) {
            System.out.println("Error al generar el reporte de ventas: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
