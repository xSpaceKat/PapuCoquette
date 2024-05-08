package persistencia.entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Sabores {

    private ObjectId _id;
    private String nombreSabores;

    public Sabores() {
    }

    public Sabores(String nombreSabores) {
        this.nombreSabores = nombreSabores;
    }

    public Sabores(ObjectId _id, String nombreSabores) {
        this._id = _id;
        this.nombreSabores = nombreSabores;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getNombreSabores() {
        return nombreSabores;
    }

    public void setNombreSabores(String nombreSabores) {
        this.nombreSabores = nombreSabores;
    }

}
