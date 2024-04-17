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

    @Override
    public void AgregarPedido(PedidoDTO pedidoDTO) {
        IObjetosNegocioAgregarPedido INegocio = new ObjetosNegocioAgregarPedido();
        INegocio.agregarPedido(pedidoDTO);
    }

}
