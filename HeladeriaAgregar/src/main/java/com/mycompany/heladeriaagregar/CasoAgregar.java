/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeriaagregar;

import com.mycompany.heladeriaagregarinteraz.ICasoAgregar;
import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import dto.ProductoDTO;
import interfacesNegocio.IObjetosNegocioAgregarPedido;
import negocio.ObjetosNegocioAgregarPedido;

/**
 *
 * @author USER
 */
public class CasoAgregar implements ICasoAgregar{

    @Override
    public void AgregarPedido(PedidoDTO pedidoDTO) {
        IObjetosNegocioAgregarPedido INegocio = new ObjetosNegocioAgregarPedido();
        INegocio.agregarPedido(pedidoDTO);
    }
     
}
