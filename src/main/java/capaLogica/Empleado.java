/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.time.LocalDate;

/**
 *
 * @author jeron
 */
public class Empleado extends Persona{
    private static Integer id = 0;
    private Integer idEmpleado;
    private Integer numeroDeLegajo;
    private LocalDate fechaDeIngreso; 

    public Empleado(String nombre, String apellido, Integer dni, String direccion, Long telefono, Integer numeroDeLegajo) {
        super(nombre, apellido, dni, direccion, telefono);
        this.numeroDeLegajo = numeroDeLegajo;
        this.idEmpleado = ++id;
        //this.fechaDeIngreso = fechaDeIngreso;
    } 
    public Empleado() {
        this.idEmpleado = ++id;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Empleado.id = id;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    public void setNumeroDeLegajo(Integer numeroDeLegajo) {
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
    
    
    
    /*
    public static Empleado convertirString(String data) {
        String[] campos = data.split("\t");
        return new Empleado(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3], Integer.parseInt(campos[4]), Integer.parseInt(campos[5]));
    }
   */
}
