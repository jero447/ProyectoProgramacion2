/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.Comprador;
import capaLogica.ManejadorCompradores;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jeron
 */
public class ManejadorArchivoComprador {
    
    private static String archivoComprador = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoCompradores.txt";
    
    
    public static void guardarCompradorArchivo(){
        
        try{          
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoComprador)); 
            for(Comprador comprador : ManejadorCompradores.getListaCompradores()){
                bw.write(comprador.getIdComprador() + "\t" +comprador.getNombre() + "\t" + comprador.getApellido() + "\t" + comprador.getDni().toString() + "\t" + comprador.getDireccion() + "\t" + comprador.getTelefono().toString() + "\t" + comprador.getCantCompras());
                bw.newLine();
            }          
            bw.close();       
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de compradores");
        }       
    }
    
    
    public static void leerArchivoComprador(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoComprador));
            String linea = "";
            while((linea = br.readLine()) != null){
               String[] partes = linea.split("\t+");
               if(partes.length == 7){
                   Comprador comprador = new Comprador();
                   comprador.setIdComprador(Integer.parseInt(partes[0]));
                   comprador.setNombre(partes[1]);
                   comprador.setApellido(partes[2]);
                   comprador.setDni(Integer.parseInt(partes[3]));
                   comprador.setDireccion(partes[4]);
                   comprador.setTelefono(Long.parseLong(partes[5]));
                   comprador.setCantCompras(Integer.parseInt(partes[6]));
                   ManejadorCompradores.guardarComprador(comprador);
               }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se enconto el archivo de compradores");
        }
    }   
}
