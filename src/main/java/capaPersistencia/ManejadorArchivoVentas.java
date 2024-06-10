/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.ManejadorProveedores;
import capaLogica.ManejadorVenta;
import capaLogica.Proveedor;
import capaLogica.Venta;
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
public class ManejadorArchivoVentas {
    private static String archivoVentas = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoVentas";
    
    public static void guardarVentaArchivo(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVentas));
            for(Venta venta : ManejadorVenta.getListaVentas()){
                for(Map.Entry<Integer,Integer> entry : venta.getMaterial_Cant_Venta().entrySet()){
                    bw.write(venta.getIdVenta() + "\t" + venta.getProvedorInvolucrado().getIdProveedor() + "\t" + venta.getFecha().toString() + "\t" + entry.getKey() + "\t" + entry.getValue() + "\t" + venta.getDespachada() + "\t" + venta.getSumaTotal());
                    bw.newLine();
                }
            }
            bw.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de ventas");
        }
    }
    
    
    public static void leerArchivoVenta(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoVentas));
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] partes = linea.split("\t");
                if(partes.length == 7){
                    Venta venta = new Venta();
                    venta.setIdVenta(Integer.parseInt(partes[0]));
                    for(Proveedor pro : ManejadorProveedores.getListaProveedores()){
                        if(pro.getIdProveedor() == Integer.parseInt(partes[1])){
                            venta.setProvedorInvolucrado(pro);
                            break;
                        }
                    }
                    venta.setFecha(LocalDate.parse(partes[2]));
                    Map<Integer,Integer> materialCant = new HashMap<>();
                    materialCant.put(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]));
                    venta.setMaterial_Cant_Venta(materialCant);
                    venta.setDespachada(partes[5]);
                    venta.setSumaTotal(Integer.parseInt(partes[6]));
                    ManejadorVenta.guardarVenta(venta);
                }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de ventas");
        }
    }   
}
