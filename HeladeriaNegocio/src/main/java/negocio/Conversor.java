/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.ProductoDTO;
import dto.TamanoDTO;
import java.util.ArrayList;
import java.util.List;
import persistencia.entidades.Producto;
import persistencia.entidades.Tamano;

/**
 *
 * @author USER
 */
public class Conversor {
    public Producto DTOaDAO(ProductoDTO productoDTO){
        List<Tamano> tamanos=new ArrayList<>();
        List<TamanoDTO> tamanosDTO=productoDTO.getTamano();
        for(TamanoDTO t:tamanosDTO){
            tamanos.add(DTOaDAO(t));
        }
        return new Producto(productoDTO.getNombre(), tamanos, productoDTO.getSabores());
    }
    
    public ProductoDTO DAOaDTO(Producto producto){
        List<Tamano> tamanos=producto.getTamano();
        List<TamanoDTO> tamanosDTO=new ArrayList<>();
        for(Tamano t:tamanos){
            tamanosDTO.add(DAOaDTO(t));
        }
        return new ProductoDTO(producto.getNombre(), tamanosDTO, producto.getSabores());
    }
    
    public Tamano DTOaDAO(TamanoDTO tamanoDTO){
        return new Tamano(tamanoDTO.getNombreTamano(), tamanoDTO.getPrecioBase());
    }
    
    public TamanoDTO DAOaDTO(Tamano tamano){
        return new TamanoDTO(tamano.getNombreTamano(), tamano.getPrecioBase());
    }
}
