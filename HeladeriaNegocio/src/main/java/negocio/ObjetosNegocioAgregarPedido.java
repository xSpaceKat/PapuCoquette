package negocio;

import dto.DetalleProductoDTO;
import dto.PedidoDTO;
import interfacesNegocio.IObjetosNegocioAgregarPedido;
import java.util.List;
import persistencia.Enum.Sabores;
import persistencia.Enum.Tamanio;
import persistencia.Enum.TipoProducto;
import persistencia.dao.PedidoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.entidades.Producto;
import persistencia.idao.IPedidoDAO;

/**
 *
 * @author Berry
 */
public class ObjetosNegocioAgregarPedido implements IObjetosNegocioAgregarPedido {

    @Override
    public void agregarPedido(PedidoDTO pedido) {
        IPedidoDAO ipedido = new PedidoDAO();
        ipedido.agregarPedido(this.DTODAO(pedido));
    }

    public Pedido DTODAO(PedidoDTO pedidoDTO) {
        pedidoDTO.getDetalles();
        Pedido pedido = new Pedido(pedidoDTO.getSubtotal());
        List<DetalleProductoDTO> detallesProductos = pedidoDTO.getDetalles();

        for (DetalleProductoDTO dt : detallesProductos) {
           
            DetalleProducto dtTemp = new DetalleProducto(Sabores.valueOf(dt.getSabores()), Tamanio.valueOf(dt.getTamanio()), dt.getToppings(), dt.getPrecioVenta());
            dtTemp.setProducto(new Producto( dt.getProducto().getNombre(), dt.getProducto().getPrecio(), TipoProducto.valueOf(dt.getProducto().getTipo())));
            pedido.agregarDetallesProd(dtTemp);
        }
        return pedido;
    }

}
