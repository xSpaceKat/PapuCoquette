package pagarTarjeta;

import dto.PagoTarjetaDTO;
import interfaces.IPagoConTarjeta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Katt
 */
public class PagoConTarjeta implements IPagoConTarjeta {

    // F A L T A N T E S
    // Validar que las tarjetas sean las mismas 
    private int numero;

    private String[] tarjetas = {"6666-66666-66666", "2815-7392-5681", "9463-8027-1439",
        "5079-4182-9362", "6294-0385-92172", "1850-9627-3748", "7402-9186-5639",
        "3157-0249-8062", "8609-2731-5024", "4256-1098-8372"};

    private String[] fechasVencimiento = {"06/30", "09/26", "12/24", "05/25", "03/24",
        "11/24", "08/25", "07/24", "02/25", "10/25"};

    private Integer[] cvv = {666, 507, 813, 642, 195, 378, 460, 925, 186, 739};

    private Float[] dinero = {52.37f, 128.50f, 76.92f, 33.25f, 94.60f, 215.75f,
        17.99f, 63.80f, 183.45f, 40.10f};

    public PagoTarjetaDTO verficarTarejta(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < tarjetas.length; i++) {
                if (tarjetas.equals(tarjeta.getNumTarjeta())) {
                    return tarjeta;
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontro la tarjeta, pruebe otra vez");
        } catch (Exception ex) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public PagoTarjetaDTO verificarFechaVencimiento(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < fechasVencimiento.length; i++) {
                if (fechasVencimiento.equals(tarjeta.getFechaVencimiento())) {
                    return tarjeta;
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontro la fecha de vencimiento, intente de nuevo");
        } catch (Exception e) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public PagoTarjetaDTO verficarCvv(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < cvv.length; i++) {
                if (cvv.equals(tarjeta.getCvv())) {
                    return tarjeta;
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontro el cvv, intente de nuevo");
        } catch (Exception e) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public PagoTarjetaDTO verficarDinero(PagoTarjetaDTO tarjeta) {
        return null;
    }

    public PagoTarjetaDTO calcularCambio(PagoTarjetaDTO tarjeta) {
        return null;
    }

}
 