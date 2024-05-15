/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.DetalleProductoDTO;
import interfacesNegocio.IReporteVentas;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.dao.PedidoDAO;
import persistencia.entidades.DetalleProducto;
import persistencia.interfaces.IPedidoDAO;

/**
 *
 * @author Ximena
 */
public class ReporteVentas implements IReporteVentas{
    IPedidoDAO pedidoDAO = new PedidoDAO();
    DetalleProducto  pedidoE = new DetalleProducto();

    @Override
    public void reporteVentas(DetalleProductoDTO detalle) {
        try {
            pedidoDAO.imprimirReporteVentas(pedidoE);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        String filePath = "./ReporteVentas.pdf";
        
        try {
            File file = new File(filePath);
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            }else{
                JOptionPane.showMessageDialog(null, "El archivo no existe");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
