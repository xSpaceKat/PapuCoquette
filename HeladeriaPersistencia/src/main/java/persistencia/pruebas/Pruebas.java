/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import persistencia.dao.DetalleProductoDAO;
import persistencia.dao.PedidoDAO;
import persistencia.dao.ProductoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.entidades.Producto;
import persistencia.entidades.Sabores;
import persistencia.entidades.Tamaño;
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
        
        Producto producto = new Producto();
        
//        producto.setNombre("Conos");
//
//        String [] sabores = {"Uva", "Limon", "Azul"};
//        producto.setSabores(Arrays.asList(sabores));
//        
//        List<Tamaño> listTamaño = new ArrayList<>();
//        Tamaño tamaño = new Tamaño();       
//        tamaño.setNombreTamaño("grande");
//        tamaño.setPrecioBase(50F);
//        
//        Tamaño tamaño2 = new Tamaño();
//        tamaño2.setNombreTamaño("pequeño");
//        tamaño2.setPrecioBase(25F);
//        
//        listTamaño.add(tamaño);
//        listTamaño.add(tamaño2);
//        
//        
//        producto.setTamano(listTamaño);
        
        
        IDetalleProductoDAO detalleProductoDAO = new DetalleProductoDAO();
        
        DetalleProducto detalleProducto = new DetalleProducto();
        
        Producto productosas = new Producto();
        
        productosas.setNombre("Conos");
        String [] sabores = {"Uva"};
        
        producto.setSabores(Arrays.asList(sabores));
        
        
        DetalleProducto detalleProductoVendido=new DetalleProducto("Conos", "Uva", "Grande", 65f, 2);
        detalleProducto.getPrecioTotal();
        
        
        detalleProductoDAO.guardarDetalleProducto(detalleProductoVendido);
        
    }
    
}
