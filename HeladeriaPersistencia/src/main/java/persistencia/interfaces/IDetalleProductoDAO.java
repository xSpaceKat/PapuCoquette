package persistencia.interfaces;

import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Producto;
import persistencia.excepciones.PersistenciaException;

/**
 *
 * @author Katt
 */
public interface IDetalleProductoDAO {

    public DetalleProducto buscarPorID(DetalleProducto detallesProducto) throws PersistenciaException;

    public List<DetalleProducto> consultar() throws PersistenciaException;

    public void guardarDetalleProducto(DetalleProducto detallesProducto) throws PersistenciaException;

    public void guardarProducto(Producto producto, DetalleProducto detallesProducto) throws PersistenciaException;
    
    public JasperPrint ImprimirReporte() throws PersistenciaException, JRException;

}
