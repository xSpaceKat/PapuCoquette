/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.iheladeriaeditarproducto;

import dto.ProductoDTO;

/**
 *
 * @author USER
 */
public interface ICasoEditarProducto {
    public void eliminarProducto(ProductoDTO productoDTO)throws Exception;
    public void actualizarProducto(ProductoDTO productoDTO)throws Exception;
    
}
