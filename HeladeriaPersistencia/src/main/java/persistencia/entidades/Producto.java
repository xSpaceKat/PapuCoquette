package persistencia.entidades;

import java.util.List;

/**
 *
 * @author Katt
 */
public class Producto {

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
