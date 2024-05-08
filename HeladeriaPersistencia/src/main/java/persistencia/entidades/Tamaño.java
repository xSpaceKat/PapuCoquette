package persistencia.entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Tamaño {

    private ObjectId _id;
    private String nombreTamaño;
    private Float precioBase;

    public Tamaño() {
    }

    public Tamaño(String nombreTamaño, Float precioBase) {
        this.nombreTamaño = nombreTamaño;
        this.precioBase = precioBase;
    }

    public Tamaño(ObjectId _id, String nombreTamaño, Float precioBase) {
        this._id = _id;
        this.nombreTamaño = nombreTamaño;
        this.precioBase = precioBase;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getNombreTamaño() {
        return nombreTamaño;
    }

    public void setNombreTamaño(String nombreTamaño) {
        this.nombreTamaño = nombreTamaño;
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
