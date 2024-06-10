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
public class ManejadorVenta {
    
    private static ArrayList<Venta> listaVentas = new ArrayList<>();

    public static void guardarVenta(Venta venta){
        listaVentas.add(venta);
    }

    public static ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public static void setListaVentas(ArrayList<Venta> listaVentas) {
        ManejadorVenta.listaVentas = listaVentas;
    }    
}
