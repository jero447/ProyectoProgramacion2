/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.Compra;
import capaLogica.Comprador;
import capaLogica.Empleado;
import capaLogica.ManejadorCompradores;
import capaLogica.ManejadorCompras;
import capaLogica.ManejadorEmpleados;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jeron
 */
public class ManejadorArchivoCompras {
    private static String archivoCompras = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoCompras.txt";
    
    
    public static void guardarCompraArchivo(){
        try{
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCompras));
            for(Compra compra : ManejadorCompras.getListaCompras()){
                Comprador c = (Comprador)compra.getComprador();
                for (Map.Entry<Integer, Integer> entry : compra.getMaterial_Cant().entrySet()) {
                bw.write(compra.getIdCompra() + "\t" + 
                         c.getIdComprador() + "\t" + 
                         compra.getEmpleadoInvolucrado().getIdEmpleado() + "\t" + 
                         entry.getKey() + "\t" + 
                         entry.getValue() + "\t" + 
                         compra.getFechaDeCompra().toString() + "\t" + 
                         compra.getPagada() + "\t" +
                         compra.getSumaTotal());
                bw.newLine();
            }
            }
            bw.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de compras");
        }
    }
    
    public static void leerArchivoCompra(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoCompras));
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] partes = linea.split("\t");
                if(partes.length == 8){
                    Compra compra = new Compra();
                    compra.setIdCompra(Integer.parseInt(partes[0]));       
                    for(Comprador com : ManejadorCompradores.getListaCompradores()){
                        if(com.getIdComprador() == Integer.parseInt(partes[1])){
                            compra.setComprador(com);
                            break;
                        }
                    }
                    for(Empleado em : ManejadorEmpleados.getListaEmpleados()){
                        if(em.getIdEmpleado() == Integer.parseInt(partes[2])){
                            compra.setEmpleadoInvolucrado(em);
                            break;
                        }
                    }
                    Map<Integer,Integer> materialCant = new HashMap<>();
                    materialCant.put(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]));
                    compra.setMaterial_Cant(materialCant);
                    compra.setFechaDeCompra(LocalDate.parse(partes[5]));
                    compra.setPagada(partes[6]);
                    compra.setSumaTotal(Integer.parseInt(partes[7]));
                    ManejadorCompras.guardarCompra(compra);
                }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de compras");
        }
    }    
}
