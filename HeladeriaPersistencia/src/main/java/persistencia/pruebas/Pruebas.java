package persistencia.pruebas;

import java.util.ArrayList;
import java.util.List;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.Producto;
import persistencia.entidades.Tamano;
import persistencia.excepciones.PersistenciaException;
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
        
        
        
        List<String> sabores =new ArrayList<>();
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
        
    }
    
}
