/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import dto.DetalleProductoDTO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author natas
 */
public class MainPrueba {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<DetalleProductoDTO> listaDetallesProductos = new LinkedList<>();
        JMenuPrincipal jmp = new JMenuPrincipal(listaDetallesProductos);
        jmp.setVisible(true);
    }
    
}
