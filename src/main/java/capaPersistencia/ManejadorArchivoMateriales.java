/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.ManejadorMateriales;
import capaLogica.Materiales;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jeron
 */
public class ManejadorArchivoMateriales {
    private static String archivoMateriales = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoMateriales.txt";
    
    
    public static void guardarEmpleadoArchivo(){
        
        try{          
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoMateriales)); 
            for(Materiales material : ManejadorMateriales.getListaMateriales()){
                bw.write(material.getIdMaterial()+ "\t" + material.getNombre() + "\t" + material.getDescripcion() + "\t" + material.getTipoDeMedida() + "\t" + material.getPeso()  + "\t" +material.getStock() + "\t" + material.getPrecioCompra() + "\t" + material.getPrecioVenta());
                bw.newLine();
            }          
            bw.close();       
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de materiales");
        }       
    }
    
    public static void leerArchivoMaterial(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoMateriales));
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] partes = linea.split("\t+");
                if(partes.length == 8){
                    Materiales material = new Materiales();
                    material.setIdMaterial(Integer.parseInt(partes[0]));
                    material.setNombre(partes[1]);
                    material.setDescripcion(partes[2]);
                    material.setTipoDeMedida(partes[3]);
                    material.setPeso(Integer.parseInt(partes[4]));
                    material.setStock(Integer.parseInt(partes[5]));
                    material.setPrecioCompra(Integer.parseInt(partes[6]));
                    material.setPrecioVenta(Integer.parseInt(partes[7]));
                    ManejadorMateriales.guardarMateriales(material);
                }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se enconto el archivo de materiales");
        }
    } 
}
