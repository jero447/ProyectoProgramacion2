/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author jeron
 */
public class Comprador extends Persona{    
    private static Integer id = 0;
    private Integer idComprador;
    private Integer cantCompras;
    
    public Comprador(String nombre, String apellido,Integer dni, String direccion, Long telefono) {
        super( nombre, apellido, dni, direccion, telefono);
        idComprador = ++id;
    }

    public Comprador() {
        idComprador = ++id;
        cantCompras = 0;
    }

    public Integer getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(Integer cantCompras) {
        this.cantCompras = cantCompras;
    }

    
    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Comprador.id = id;
    }

    public Integer getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Integer idComprador) {
        this.idComprador = idComprador;
    }
    
    
    
}
