/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bdavanzadas.heladeriaagregarproducto;

import dto.ProductoDTO;
import org.itson.bdavanzadas.heladeriaagregarproductointerfaces.ICasoAgregarProducto;
import interfacesNegocio.IAgregarProductoBO;
import negocio.AgregarProductoBO;

/**
 *
 * @author natas
 */
public class CasoAgregarProducto implements ICasoAgregarProducto{

    @Override
    public void AgregarProducto(ProductoDTO productoDTO) {
        IAgregarProductoBO agregarProductoBO = new AgregarProductoBO();
        agregarProductoBO.AgregarProducto(productoDTO);
    }
    
}
