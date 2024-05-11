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
    // Ni siquiera sabe si funciona  y ya esta validando q humillante denigrante...
    private int numero;

    private String[] tarjetas = {"6666-6666-6666-6666", "9045-6721-8273-5601", "2154-7803-9640-3087",
        "4892-1037-6758-2196", "7613-5028-3846-9052", "3067-8921-5409-1735", "8193-6745-2098-3576",
        "2350-6194-7832-4067", "5082-9361-4712-8753", "7410-2856-6392-8147"};

    private String[] fechasVencimiento = {"06/30", "09/26", "12/24", "05/25", "03/24",
        "11/24", "08/25", "07/24", "02/25", "10/25"};

    private Integer[] cvv = {666, 507, 813, 642, 195, 378, 460, 925, 186, 739};

    private Float[] dinero = {1000.37f, 128.50f, 76.92f, 33.25f, 94.60f, 215.75f,
        17.99f, 63.80f, 183.45f, 40.10f};

    public PagoTarjetaDTO verificarTarjeta(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < tarjetas.length; i++) {
                if (tarjetas[i].equals(tarjeta.getNumTarjeta())) {
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
                verificarTarjeta(tarjeta);
                if (fechasVencimiento[i].equals(tarjeta.getFechaVencimiento())) {
                    return tarjeta;
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontro la fecha de vencimiento, intente de nuevo");
        } catch (Exception e) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public PagoTarjetaDTO verificarCvv(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < cvv.length; i++) {
                verificarTarjeta(tarjeta);
                verificarFechaVencimiento(tarjeta);
                if (cvv[i].equals(tarjeta.getCvv())) {
                    return tarjeta;
                }
            }
            JOptionPane.showMessageDialog(null, "No se encontro el cvv, intente de nuevo");
        } catch (Exception e) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public PagoTarjetaDTO verificarDinero(PagoTarjetaDTO tarjeta) {
        try {
            for (int i = 0; i < 10; i++) {
                if (tarjetas[i].equals(tarjeta.getNumTarjeta())) {
                    if (fechasVencimiento[i].equals(tarjeta.getFechaVencimiento())) {
                        if (cvv[i].equals(tarjeta.getCvv())) {
                            if (dinero[i] < tarjeta.getPrecioTotal()) {
                                JOptionPane.showMessageDialog(null, "No contiene dinero suficiente!");
                            } else {
                                return tarjeta;
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "ERROR! No se pudo verificar su monto de tarjeta");
        } catch (Exception e) {
            Logger.getLogger(PagoConTarjeta.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public PagoTarjetaDTO calcularCambio(PagoTarjetaDTO tarjeta) {
        verificarDinero(tarjeta);
        Float manuel = tarjeta.getPrecioTotal();
        int is = 0;
        for (int i = 0; i < 10; i++) {
            verificarTarjeta(tarjeta);
            verificarFechaVencimiento(tarjeta);
            verificarCvv(tarjeta);
            is = i;
        }
        Float kat = dinero[is];
        tarjeta.setCambbio(kat - manuel);
        return tarjeta;
    }

}
