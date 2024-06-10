/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.Empleado;
import capaLogica.ManejadorEmpleados;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jeron
 */
public class ManejadorArchivoEmpleados {
    private static String archivoEmpleados = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoEmpleados.txt";
    
    public static void guardarEmpleadoArchivo(){
        
        try{          
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoEmpleados)); 
            for(Empleado empleado : ManejadorEmpleados.getListaEmpleados()){
                bw.write(empleado.getIdEmpleado() + "\t" +empleado.getNombre() + "\t" + empleado.getApellido() + "\t" + empleado.getDni().toString() + "\t" + empleado.getDireccion()+ "\t" + empleado.getTelefono().toString() + "\t" + empleado.getNumeroDeLegajo().toString());
                bw.newLine();
            }          
            bw.close();       
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de empleados");
        }       
    }
 
    public static void leerArchivoEmpleado(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoEmpleados));
            String linea = "";
            while((linea = br.readLine()) !=  null){
                String[] partes = linea.split("\t+");
                if(partes.length == 7){
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(Integer.parseInt(partes[0]));
                empleado.setNombre(partes[1]);
                empleado.setApellido(partes[2]);
                empleado.setDni(Integer.parseInt(partes[3]));
                empleado.setDireccion(partes[4]);
                empleado.setTelefono(Long.parseLong(partes[5]));
                empleado.setNumeroDeLegajo(Integer.parseInt(partes[6]));
                ManejadorEmpleados.guardarEmpleado(empleado);
                }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se enconto el archivo de empleados");
        }
    }
    
    
}
