/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.util.ArrayList;

/**
 *
 * @author jeron
 */
public class ManejadorCompras {
    
    private static ArrayList<Compra> listaCompras = new ArrayList<>();
    
    public static void guardarCompra(Compra compra){
        listaCompras.add(compra);
    }

    public static ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public static void setListaCompras(ArrayList<Compra> listaCompras) {
        ManejadorCompras.listaCompras = listaCompras;
    }
    
}
