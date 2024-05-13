package persistencia.pruebas;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import persistencia.dao.DetalleProductoDAO;
import persistencia.dao.PedidoDAO;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.entidades.Tamano;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IDetalleProductoDAO;
import persistencia.interfaces.IPedidoDAO;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author Berry
 */
public class Pruebas {
//IDetalleProductoDAO detalleProductoDAO = new DetalleProductoDAO(coleccionDetalleProducto);
//        IPedidoDAO pedido = new PedidoDAO(coleccionPedido);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersistenciaException {

        IProductoDAO productoDAO = new ProductoDAO();
        IDetalleProductoDAO detallesDAO = new DetalleProductoDAO();
        IPedidoDAO pedidoDAO = new PedidoDAO();

        List<String> sabores = new ArrayList<>();
        sabores.add("Uva");
        sabores.add("Sandia");
        sabores.add("Fresa");

        List<Tamano> listTamano = new ArrayList<>();
        Tamano tamano1 = new Tamano();
        tamano1.setNombreTamano("grande");
        tamano1.setPrecioBase(50F);
        Tamano tamano2 = new Tamano();
        tamano2.setNombreTamano("pequeño");
        tamano2.setPrecioBase(25F);
        listTamano.add(tamano1);
        listTamano.add(tamano2);
//        productoDAO.guardarProducto(new Producto("Conos", listTamano, sabores));
//        productoDAO.guardarProducto(new Producto("Paletas", listTamano, sabores));
//        productoDAO.guardarProducto(new Producto("Helados", listTamano, sabores));
//        productoDAO.guardarProducto(new Producto("Chimichangas", listTamano, sabores));
//        productoDAO.guardarProducto(new Producto("Raspados", listTamano, sabores));
//        productoDAO.guardarProducto(new Producto("Gorditas", listTamano, sabores));

        DetalleProducto da = new DetalleProducto("Conos", "Uva", "Grande", 25.0f, 2, true);
        DetalleProducto de = new DetalleProducto("Conos", "Fresa", "Chico", 10.0f, 1, false);
        DetalleProducto di = new DetalleProducto("Paletas", "Sandia", "Chico", 10.5f, 3, true);

        detallesDAO.guardarDetalleProducto(da);
        detallesDAO.guardarDetalleProducto(de);
        detallesDAO.guardarDetalleProducto(di);

        List<DetalleProducto> kek = new ArrayList<>();

        kek.add(de);
        kek.add(di);

        List<DetalleProducto> kok = new ArrayList<>();

        kok.add(da);

        List<DetalleProducto> kik = new ArrayList<>();

        kik.add(da);
        kik.add(di);

        Pedido a = new Pedido(1, new GregorianCalendar().getTime(), kek);
        Pedido b = new Pedido(2, new GregorianCalendar().getTime(), kok);
        Pedido c = new Pedido(3, new GregorianCalendar().getTime(), kik);

        pedidoDAO.guardarPedido(a);
        pedidoDAO.guardarPedido(b);
        pedidoDAO.guardarPedido(c);

    }

}
