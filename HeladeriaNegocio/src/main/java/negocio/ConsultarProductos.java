package negocio;

import dto.ProductoDTO;
import interfacesNegocio.IConsultarProductos;
import java.util.ArrayList;
import java.util.List;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;
import persistencia.interfaces.IProductoDAO;

/**
 *
 * @author USER
 */
public class ConsultarProductos implements IConsultarProductos {

    public List<ProductoDTO> consultarTodosLosProductos() throws PersistenciaException {
        IProductoDAO productoDAO = new ProductoDAO();

        List<Producto> productos = productoDAO.consultar();
        List<ProductoDTO> productosDTO = new ArrayList<>();
        Conversor conversor = new Conversor();
        for (Producto p : productos) {
            productosDTO.add(conversor.DAOaDTO(p));
        }
        return productosDTO;
    }

    @Override
    public ProductoDTO consultarProducto(String nombre) throws PersistenciaException {
        IProductoDAO productoDAO = new ProductoDAO();
        Conversor conversor = new Conversor();
        Producto producto = new Producto();
        producto.setNombre(nombre);
        return conversor.DAOaDTO(productoDAO.buscarPorNombre(producto));
    }
}
