package persistencia.entidades;

/**
 *
 * @author Katt
 */
public class Tamaño {

    private String nombreTamaño;
    private Float precioBase;

    public Tamaño() {
    }

    public Tamaño(String nombreTamaño, Float precioBase) {
        this.nombreTamaño = nombreTamaño;
        this.precioBase = precioBase;
    }

    public String getNombreTam() {
        return nombreTamaño;
    }

    public void setNombreTam(String nombreTamaño) {
        this.nombreTamaño = nombreTamaño;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

}
