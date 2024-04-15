package dto;

/**
 *
 * @author Katt
 */
public class ProductoDTO {

    private String nombre;
    private Float precio;
    private String tipo;

    public ProductoDTO() {
    }

    public ProductoDTO(String nombre, Float precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }

}
