/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion1;

/**
 *
 * @author neiga
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private Cargo cargo;
    private Municipio municipio;

    public Empleado(String nombre, String apellido, Cargo cargo, Municipio municipio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.municipio = municipio;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Empleado: " + this.nombre + " " + this.apellido);
        System.out.println("Vive en el municipio de: " + this.municipio.getNombreMunicipio());
        System.out.println("Cargo: " + this.cargo.getNombreCargo());
        System.out.println("Salario: $" + this.cargo.getSalario());
    }
    
}
