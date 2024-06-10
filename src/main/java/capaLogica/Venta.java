/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author jeron
 */
public class Venta {
    private static Integer id = 0;
    private Integer idVenta;
    private Proveedor provedorInvolucrado;
    private LocalDate fecha;    
    private Map<Integer,Integer> material_Cant_Venta;
    private String despachada;
    private Integer sumaTotal;

    public Venta() {
        idVenta = ++id;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Venta.id = id;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Proveedor getProvedorInvolucrado() {
        return provedorInvolucrado;
    }

    public void setProvedorInvolucrado(Proveedor provedorInvolucrado) {
        this.provedorInvolucrado = provedorInvolucrado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Map<Integer, Integer> getMaterial_Cant_Venta() {
        return material_Cant_Venta;
    }

    public void setMaterial_Cant_Venta(Map<Integer, Integer> material_Cant_Venta) {
        this.material_Cant_Venta = material_Cant_Venta;
    }

    public String getDespachada() {
        return despachada;
    }

    public void setDespachada(String despachada) {
        this.despachada = despachada;
    }

    public Integer getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(Integer sumaTotal) {
        this.sumaTotal = sumaTotal;
    }
    
    
    
    
}
