/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import capaPersistencia.ManejadorArchivoEmpleados;
import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class ManejadorEmpleados {
    
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
    
    public static void guardarEmpleado(Empleado em){
        listaEmpleados.add(em);
    }
    
    public static void borrarEmpleado(Empleado em){
        listaEmpleados.removeIf(e -> e.getIdEmpleado().equals(em.getIdEmpleado()));
        ManejadorArchivoEmpleados.guardarEmpleadoArchivo();
        
        /*for(Empleado empleado : listaEmpleados){
            if(em.getIdEmpleado() == empleado.getIdEmpleado()){
                listaEmpleados.remove(empleado);              
            }
        }
        ManejadorArchivoEmpleados.reescribirArchivo();
        */
    }
    
    public static void modificarEmpleado(Empleado empModificado){
        
        for(Empleado em : listaEmpleados){
            if(em.getIdEmpleado() == empModificado.getIdEmpleado()){
                em.setNombre(empModificado.getNombre());
                em.setApellido(empModificado.getApellido());
                em.setDni(empModificado.getDni());
                em.setDireccion(empModificado.getDireccion());
                em.setTelefono(empModificado.getTelefono());
                em.setNumeroDeLegajo(empModificado.getNumeroDeLegajo());
                em.setFechaDeIngreso(empModificado.getFechaDeIngreso());
                break;
            }
        }
        
    }
    
    public static ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public static void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        ManejadorEmpleados.listaEmpleados = listaEmpleados;
    }
    
    
    
}
