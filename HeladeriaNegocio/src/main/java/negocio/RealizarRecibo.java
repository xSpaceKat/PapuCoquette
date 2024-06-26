package negocio;

import com.itextpdf.io.exceptions.IOException;
import dto.PedidoDTO;
import interfacesNegocio.IRealizarRecibo;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.dao.PedidoDAO;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Katt
 */
public class RealizarRecibo implements IRealizarRecibo {

    IPedidoDAO vaya = new PedidoDAO();
    Pedido pedido = new Pedido();

    public void recibo(PedidoDTO dto) {

        pedido.setTotalPedido(dto.getTotalPedido());

        try {
            vaya.ImprimirReporte(pedido);
        } catch (PersistenciaException ex) {
            Logger.getLogger(RealizarRecibo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RealizarRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String filePath = "./Recibo.pdf";

        try {
            // Abrir el archivo PDF con el visor predeterminado del sistema operativo
            File file = new File(filePath);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                JOptionPane.showMessageDialog(null, "El archivo PDF no existe: " + filePath);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo PDF: " + e.getMessage());
            e.printStackTrace();
        } catch (java.io.IOException ex) {
            Logger.getLogger(RealizarRecibo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
