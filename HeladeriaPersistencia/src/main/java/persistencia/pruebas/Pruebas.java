package persistencia.pruebas;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.bson.types.ObjectId;
import persistencia.dao.DetalleProductoDAO;
import persistencia.dao.PedidoDAO;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Pedido;
import persistencia.entidades.Producto;
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
        productoDAO.guardarProducto(new Producto("Conos", listTamano, sabores));
        productoDAO.guardarProducto(new Producto("Paletas", listTamano, sabores));
        productoDAO.guardarProducto(new Producto("Helados", listTamano, sabores));
        productoDAO.guardarProducto(new Producto("Chimichangas", listTamano, sabores));
        productoDAO.guardarProducto(new Producto("Raspados", listTamano, sabores));
        productoDAO.guardarProducto(new Producto("Gorditas", listTamano, sabores));

        DetalleProducto detalles1 = new DetalleProducto(new ObjectId(), "Conos", "Uva", "Grande", 25.0f, 2, true);
        DetalleProducto detalles2 = new DetalleProducto(new ObjectId(), "Conos", "Fresa", "Chico", 10.0f, 1, false);
        DetalleProducto detalles3 = new DetalleProducto(new ObjectId(), "Paletas", "Sandia", "Chico", 10.5f, 3, true);

        List<DetalleProducto> listadetalles = new ArrayList<>();

        listadetalles.add(detalles2);
        listadetalles.add(detalles3);

        Pedido a = new Pedido(new ObjectId(),new Date(2024, 5, 13), listadetalles);
        Pedido b = new Pedido(new ObjectId(),new Date(2024, 5, 13), listadetalles);
        Pedido c = new Pedido(new ObjectId(),new Date(2024, 5, 13), listadetalles);

        pedidoDAO.guardarPedido(a);
        pedidoDAO.guardarPedido(b);
        pedidoDAO.guardarPedido(c);

    }

}
