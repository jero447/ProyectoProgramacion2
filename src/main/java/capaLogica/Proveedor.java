/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author jeron
 */
public class Proveedor  extends Persona{
   private static Integer id = 0;
   private Integer idProveedor;
   private Integer cuit;
   private String ciudad;

    public Proveedor() {
        this.idProveedor = ++id;
    }

   
   
    public Proveedor(String nombre, String apellido,Integer dni, String direccion, Long telefono, Integer cuit, String ciudad) {
        super( nombre, apellido, dni,direccion, telefono);
        this.cuit = cuit;
        this.ciudad = ciudad;
        this.idProveedor = ++id;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Proveedor.id = id;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getCuit() {
        return cuit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
   
   
   
}
