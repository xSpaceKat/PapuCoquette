/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heladeriaconsultar;

import dto.ProductoDTO;
import interfacesNegocio.IConsultarProductos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.ConsultarProductos;
import persistencia.excepciones.PersistenciaException;
import com.mycompany.iheladeriaconsultar.ICasoConsultar;

/**
 *
 * @author USER
 */
public class CasoConsultar implements ICasoConsultar{

    @Override
    public List<ProductoDTO> consultarTodosProductos() {
        IConsultarProductos consultarProductos=new ConsultarProductos();
        try {
            return consultarProductos.consultarTodosLosProductos();
        } catch (PersistenciaException ex) {
            Logger.getLogger(CasoConsultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
}
