package dto;

import org.bson.types.ObjectId;

/**
 *
 * @author Katt
 */
public class ProductoDTO {

    private ObjectId _id;
    private String nombre;
    private String tamano;
    private String sabor;

    public ProductoDTO() {
    }

    public ProductoDTO(ObjectId _id, String nombre, String tamano, String sabor) {
        this._id = _id;
        this.nombre = nombre;
        this.tamano = tamano;
        this.sabor = sabor;
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

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String toString() {
        return "ProductoDTO{" + "_id=" + _id + ", nombre=" + nombre + ", tamano=" + tamano + ", sabor=" + sabor + '}';
    }

}
