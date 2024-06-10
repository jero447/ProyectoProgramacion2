/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import capaPersistencia.ManejadorArchivoComprador;
import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class ManejadorCompradores {
    private static ArrayList<Comprador> listaCompradores = new ArrayList<>();
    
    public static void guardarComprador(Comprador com ){
        listaCompradores.add(com);
    }
    
    public static void modificarComprador(Comprador compModificado){
        
        for(Comprador comp : listaCompradores){
            if(comp.getIdComprador()== compModificado.getIdComprador()){
                comp.setNombre(compModificado.getNombre());
                comp.setApellido(compModificado.getApellido());
                comp.setDni(compModificado.getDni());
                comp.setDireccion(compModificado.getDireccion());
                comp.setTelefono(compModificado.getTelefono());
                break;
            }
        }       
    }
    
    public static void borrarComprador(Comprador comp){
        listaCompradores.removeIf(c -> c.getIdComprador().equals(comp.getIdComprador()));
        ManejadorArchivoComprador.guardarCompradorArchivo();
        
        /*for(Comprador comprador : listaCompradpres){
            if(comp.getIdComprador() == comprador.getIdComprador()){
                listaCompradores.remove(comprador);              
            }
        }
        ManejadorArchivoComprador.reescribirArchivo();
        */
    }
    
    public static ArrayList<Comprador> getListaCompradores() {
        return listaCompradores;
    }

    public static void setListaCompradores(ArrayList<Comprador> listaCompradores) {
        ManejadorCompradores.listaCompradores = listaCompradores;
    }
    
    
    
}
