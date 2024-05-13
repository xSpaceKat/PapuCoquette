/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heladeriaeditarproducto;

import com.mycompany.iheladeriaeditarproducto.ICasoEditarProducto;
import dto.ProductoDTO;
import interfacesNegocio.IEditarProducto;
import negocio.EditarProducto;

/**
 *
 * @author USER
 */
public class CasoEditarProducto implements ICasoEditarProducto{

    @Override
    public void eliminarProducto(ProductoDTO productoDTO) throws Exception{
        IEditarProducto editarProducto=new EditarProducto();
        try{
            editarProducto.eliminarProducto(productoDTO);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public void actualizarProducto(ProductoDTO productoDTO) throws Exception{
        IEditarProducto editarProducto=new EditarProducto();
        try{
            editarProducto.actualizarProducto(productoDTO);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    
}
