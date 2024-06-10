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
public class Compra {
    private static Integer id = 0;
    private Integer idCompra;
    private LocalDate fechaDeCompra;
    private Comprador comprador;
    private String pagada;
    private Empleado empleadoInvolucrado;
    private Map<Integer,Integer> material_Cant;
    private Integer sumaTotal;
    
    public Compra() {
        this.idCompra = ++id;
    }
      
    public Compra(LocalDate fechaDeCompra, Comprador cliente, String pagada, Empleado empleadoInvolucrado) {
        this.fechaDeCompra = fechaDeCompra;
        this.comprador = cliente;
        this.pagada = pagada;
        this.empleadoInvolucrado = empleadoInvolucrado;
        this.idCompra = ++id;
    }

    public String getPagada() {
        return pagada;
    }

    public void setPagada(String pagada) {
        this.pagada = pagada;
    }

    
    
    public Integer getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(Integer sumaTotal) {
        this.sumaTotal = sumaTotal;
    }
    
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Compra.id = id;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Map<Integer, Integer> getMaterial_Cant() {
        return material_Cant;
    }

    public void setMaterial_Cant(Map<Integer, Integer> material_Cant) {
        this.material_Cant = material_Cant;
    }
    
    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Comprador cliente) {
        this.comprador = cliente;
    }

    public Empleado getEmpleadoInvolucrado() {
        return empleadoInvolucrado;
    }

    public void setEmpleadoInvolucrado(Empleado empleadoInvolucrado) {
        this.empleadoInvolucrado = empleadoInvolucrado;
    }
    
    
    
}
