/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import capaPersistencia.ManejadorArchivoMateriales;
import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class ManejadorMateriales {
    
    private static ArrayList<Materiales> listaMateriales = new ArrayList<>();
    
    public static void guardarMateriales(Materiales mat){
        listaMateriales.add(mat);
    }
    
    public static ArrayList<Materiales> getListaMateriales() {
        return listaMateriales;
    }

    public static void setListaMateriales(ArrayList<Materiales> listaMateriales) {
        ManejadorMateriales.listaMateriales = listaMateriales;
    }
    
    public static void modificarMaterial(Materiales materialModificado){
        
        for(Materiales ma : listaMateriales){
            if(ma.getIdMaterial() == materialModificado.getIdMaterial()){
                ma.setNombre(materialModificado.getNombre());
                ma.setDescripcion(materialModificado.getDescripcion());
                ma.setTipoDeMedida(materialModificado.getTipoDeMedida());
                ma.setPeso(materialModificado.getPeso());
                ma.setStock(materialModificado.getStock());
                ma.setPrecioCompra(materialModificado.getPrecioCompra());
                ma.setPrecioVenta(materialModificado.getPrecioVenta());
                break;
            }
        }
        
    }
    
    public static void borrarMaterial(Materiales ma){
        listaMateriales.removeIf(m -> m.getIdMaterial().equals(ma.getIdMaterial()));
        ManejadorArchivoMateriales.guardarEmpleadoArchivo();
        
        
         /*for(Materiales maaterial : listaMateriales){
            if(material.getId() == ma.getIdEmpleado()){
                listaEmpleados.remove(material);              
            }
        }
        ManejadorArchivoMateriales.reescribirArchivo();
        */       
    }   
}
