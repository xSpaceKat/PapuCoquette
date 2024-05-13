package negocio;

import com.itextpdf.io.exceptions.IOException;
import interfacesNegocio.IRealizarRecibo;
import java.awt.Desktop;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.dao.DetalleProductoDAO;
import persistencia.interfaces.IDetalleProductoDAO;

/**
 *
 * @author Katt
 */
public class RealizarRecibo implements IRealizarRecibo {

    IDetalleProductoDAO vaya = new DetalleProductoDAO();

    public void recibo() {
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
