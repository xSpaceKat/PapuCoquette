package dto;

import java.util.List;

/**
 *
 * @author Katt
 */
public class ProductoDTO {

    private String nombre;
    private List<TamanoDTO> tamano;
    private List<String> sabores;

    public ProductoDTO() {
    }

    public ProductoDTO(String nombre, List<TamanoDTO> tamano, List<String> sabores) {
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

    public List<TamanoDTO> getTamano() {
        return tamano;
    }

    public void setTamano(List<TamanoDTO> tamano) {
        this.tamano = tamano;
    }

    public List<String> getSabores() {
        return sabores;
    }

    public void setSabores(List<String> sabores) {
        this.sabores = sabores;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "nombre=" + nombre + ", tamano=" + tamano + ", sabores=" + sabores + '}';
    }

}
