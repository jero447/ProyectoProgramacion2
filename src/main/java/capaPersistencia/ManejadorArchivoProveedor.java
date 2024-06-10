/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaPersistencia;

import capaLogica.ManejadorProveedores;
import capaLogica.Proveedor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jeron
 */
public class ManejadorArchivoProveedor {
    private static String archivoProveedores = "C:\\Users\\jeron\\Desktop\\Proyecto-Modificado-main\\src\\main\\java\\capaPersistencia\\archivoProveedor.txt";
    
    public static void guardarProveedorArchivo(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoProveedores));
            for(Proveedor proveedor : ManejadorProveedores.getListaProveedores()){
                bw.write(proveedor.getIdProveedor() + "\t" + proveedor.getNombre() + "\t" + proveedor.getApellido() + "\t" + proveedor.getDni() + "\t" + proveedor.getDireccion() + "\t" + proveedor.getTelefono() + "\t" + proveedor.getCuit() + "\t" + proveedor.getCiudad());
                bw.newLine();
            }
            bw.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de proveedores");
        }
    }
    
    public static void leerArchivoProveedor(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(archivoProveedores));
            String linea = "";
            while((linea = br.readLine()) != null){
                String[] partes = linea.split("\t");
                if(partes.length == 8){
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(Integer.parseInt((partes[0])));
                    proveedor.setNombre(partes[1]);
                    proveedor.setApellido(partes[2]);
                    proveedor.setDni(Integer.parseInt(partes[3]));
                    proveedor.setDireccion(partes[4]);
                    proveedor.setTelefono(Long.parseLong(partes[5]));
                    proveedor.setCuit(Integer.parseInt(partes[6]));
                    proveedor.setCiudad(partes[7]);
                    ManejadorProveedores.guardarProveedor(proveedor);
                }
            }
            br.close();
        }catch(IOException exep){
            System.out.println("No se encontro el archivo de proveedores");
        }
    }
}
