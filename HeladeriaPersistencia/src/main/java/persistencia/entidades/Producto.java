package persistencia.entidades;

import java.util.ArrayList;
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
    private List<String> sabores;

    public Producto() {
        this.sabores = new ArrayList<>();
        this.tamano = new ArrayList<>();
    }

    public Producto(String nombre, List<Tamaño> tamano, List<String> sabores) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.sabores = sabores;
    }

    public Producto(ObjectId _id, String nombre, List<Tamaño> tamano, List<String> sabores) {
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

    public List<String> getSabores() {
        return sabores;
    }

    public void setSabores(List<String> sabores) {
        this.sabores = sabores;
    }

}
