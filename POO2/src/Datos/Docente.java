/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author neiga
 */
public class Docente extends Persona{
    
    private float sueldo;

    public Docente(String Nombre, String Apellido, int cedula, float sueldo) {
        super(Nombre, Apellido, cedula);
        this.sueldo = sueldo;
    }
    
     public void mostrardatos() {

        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nCedula: " + getCedula() +
                "\nSueldo del docente: " + sueldo);
                
    }
    
}
