package persistencia.entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Tamano {

    private ObjectId _id;
    private String nombreTamano;
    private Float precioBase;

    public Tamano() {
    }

    public Tamano(String nombreTamano, Float precioBase) {
        this.nombreTamano = nombreTamano;
        this.precioBase = precioBase;
    }

    public Tamano(ObjectId _id, String nombreTamano, Float precioBase) {
        this._id = _id;
        this.nombreTamano = nombreTamano;
        this.precioBase = precioBase;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getNombreTamano() {
        return nombreTamano;
    }

    public void setNombreTamano(String nombreTamano) {
        this.nombreTamano = nombreTamano;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Tamano{" + "_id=" + _id + ", nombreTamano=" + nombreTamano + ", precioBase=" + precioBase + '}';
    }
}
