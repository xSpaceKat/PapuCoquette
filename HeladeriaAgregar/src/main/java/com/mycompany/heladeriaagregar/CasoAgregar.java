package com.mycompany.heladeriaagregar;

import com.mycompany.heladeriaagregarinteraz.ICasoAgregar;
import dto.PedidoDTO;
import interfacesNegocio.IObjetosNegocioAgregarPedido;
import negocio.ObjetosNegocioAgregarPedido;

/**
 *
 * @author USER
 */
public class CasoAgregar implements ICasoAgregar {

    IObjetosNegocioAgregarPedido INegocio = new ObjetosNegocioAgregarPedido();

    public void AgregarPedido(PedidoDTO pedidoDTO) {
        INegocio.agregarPedido(pedidoDTO);
    }

}
