package persistencia.entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class Producto {

    private ObjectId _id;
    private String nombre;
    private List<Tamaño> tamano;
    private List<Sabores> sabores;

    public Producto() {
    }

    public Producto(String nombre, List<Tamaño> tamano, List<Sabores> sabores) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.sabores = sabores;
    }

    public Producto(ObjectId _id, String nombre, List<Tamaño> tamano, List<Sabores> sabores) {
        this._id = _id;
        this.nombre = nombre;
        this.tamano = tamano;
        this.sabores = sabores;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tamaño> getTamano() {
        return tamano;
    }

    public void setTamano(List<Tamaño> tamano) {
        this.tamano = tamano;
    }

    public List<Sabores> getSabores() {
        return sabores;
    }

    public void setSabores(List<Sabores> sabores) {
        this.sabores = sabores;
    }

}
