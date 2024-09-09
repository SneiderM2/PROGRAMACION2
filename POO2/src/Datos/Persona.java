/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author neiga
 */
public class Persona {
     //atributos generales
    protected String Nombre;
    protected String Apellido;
    protected int cedula;

    public Persona(String Nombre, String Apellido, int cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
    }
    
    //metodos

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
     @Override
    public String toString(){
        return Nombre+" "+Apellido+" "+cedula;
    }

    
}
