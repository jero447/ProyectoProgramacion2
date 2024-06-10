/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author jeron
 */
public class Materiales {
   private static Integer id = 0;
   private Integer idMaterial;
   private String nombre;
   private String descripcion;
   private String tipoDeMedida;
   private Integer peso;
   private Integer stock;
   private Integer precioCompra;
   private Integer precioVenta;

    public Materiales(){
        this.idMaterial = ++id;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Materiales.id = id;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeMedida() {
        return tipoDeMedida;
    }

    public void setTipoDeMedida(String tipoDeMedida) {
        this.tipoDeMedida = tipoDeMedida;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Integer precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    } 

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    
    
    @Override
    public String toString() {
        return  nombre ;
    }
   
}
