/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author USER
 */
public class TamanoDTO {
    private String nombreTamano;
    private Float precioBase;

    public TamanoDTO() {
    }

    public TamanoDTO(String nombreTamano, Float precioBase) {
        this.nombreTamano = nombreTamano;
        this.precioBase = precioBase;
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
        return "TamanoDTO{" + "nombreTamano=" + nombreTamano + ", precioBase=" + precioBase + '}';
    }
    
    
}
