/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;


/**
 *
 * @author Ximena
 */
public class ConsultarVentasDTO {
    
    private String nombre;
    private String tamanio;
    private String sabor;
    private Integer cantidad, costoUnitario, costoTotalProducto, ventaTotal;
    private Date fecha;

    public ConsultarVentasDTO(String nombre, String tamanio, String sabor, Integer cantidad, Integer costoUnitario, Integer costoTotalProducto, Integer ventaTotal, Date fecha) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
        this.costoTotalProducto = costoUnitario*cantidad;
        this.ventaTotal +=costoTotalProducto;
        this.fecha = new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Integer costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public Integer getCostoTotalProducto() {
        return costoTotalProducto;
    }

    public void setCostoTotalProducto(Integer costoTotalProducto) {
        this.costoTotalProducto = costoTotalProducto;
    }

    public Integer getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(Integer ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ConsultarVentas{" + "nombre=" + nombre + ", tamanio=" + tamanio + ", sabor=" + sabor + ", cantidad=" + cantidad + ", costoUnitario=" + costoUnitario + ", costoTotalProducto=" + costoTotalProducto + ", ventaTotal=" + ventaTotal + ", fecha=" + fecha + '}';
    }
    
}
