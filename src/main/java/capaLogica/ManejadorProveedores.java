/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import capaPersistencia.ManejadorArchivoProveedor;
import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class ManejadorProveedores {
    
    private static ArrayList <Proveedor> listaProveedores = new ArrayList<>();
    
    public static void guardarProveedor(Proveedor pro){
        listaProveedores.add(pro);
    }
    
    public static void modificarProveedor(Proveedor proModificado){
        
        for(Proveedor pro : listaProveedores){
            if(pro.getIdProveedor() == proModificado.getIdProveedor()){
                pro.setNombre(proModificado.getNombre());
                pro.setApellido(proModificado.getApellido());
                pro.setDni(proModificado.getDni());
                pro.setDireccion(proModificado.getDireccion());
                pro.setTelefono(proModificado.getTelefono());
                pro.setCuit(proModificado.getCuit());
                pro.setCiudad(proModificado.getCiudad());
                break;
            }
        }
        
    }
    
    public static void borrarProveedor(Proveedor pro){
        listaProveedores.removeIf(p -> p.getIdProveedor().equals(pro.getIdProveedor()));
        ManejadorArchivoProveedor.guardarProveedorArchivo();
        
         /*for(Proveedor proveedor : listaProveedores){
            if(pro.getIdProveedor() == proveedor.getIdProveedor()){
                listaProveedores.remove(proveedor);              
            }
        }
        ManejadorArchivoProveedores.reescribirArchivo();
        */
    }
    
    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public static void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        ManejadorProveedores.listaProveedores = listaProveedores;
    }
    
}
