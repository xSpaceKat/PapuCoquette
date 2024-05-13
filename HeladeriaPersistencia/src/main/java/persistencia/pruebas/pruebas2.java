/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.pruebas;

import java.util.Date;
import java.util.GregorianCalendar;
import persistencia.dao.PedidoDAO;

/**
 *
 * @author Ximena
 */
public class pruebas2 {
    public static void main(String[] args) {
        Date fecha = new Date(2024, 5, 13);
        PedidoDAO cv = new PedidoDAO();
        
        System.out.println(cv.listaPedidos(fecha));
    }
}
