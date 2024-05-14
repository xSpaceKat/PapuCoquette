package negocio;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfacesNegocio.IObjetosNegocioAgregarPedido;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.dao.PedidoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Berry
 */
public class ObjetosNegocioAgregarPedido implements IObjetosNegocioAgregarPedido {

    IPedidoDAO ipedido = new PedidoDAO();

    public void agregarPedido(PedidoDTO pedido) {
        Pedido p = Conversion(pedido);
        try {
            ipedido.guardarPedido(p);
        } catch (PersistenciaException ex) {
            Logger.getLogger(ObjetosNegocioAgregarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pedido Conversion(PedidoDTO dto) {
        List<DetalleProductoDTO> detallesProductos = dto.getDetalles();
        List<DetalleProducto> darling = new ArrayList<>();
        Pedido guardarPedido = new Pedido();

        for (DetalleProductoDTO dt : detallesProductos) {
            DetalleProducto dtTemp = new DetalleProducto();
            dtTemp.setCantidad(dt.getCantidad());
            dtTemp.setNombreProducto(dt.getNombreProducto());
            dtTemp.setSabor(dt.getSabor());
            dtTemp.setTamano(dt.getTamano());
            dtTemp.setTamanoPrecio(dt.getTamanoPrecio());
            dtTemp.setprecioTotal(dt.getPrecioTotal());
            dtTemp.setTopping(dt.getTopping());
            darling.add(dtTemp);
        }

        guardarPedido.setDetalles(darling);
        guardarPedido.setFecha(dto.getFecha());
        guardarPedido.setTotalPedido(dto.getTotalPedido());

        return guardarPedido;
    }

}
