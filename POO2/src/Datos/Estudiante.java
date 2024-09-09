/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author neiga
 */
public class Estudiante extends Persona{
      
   private int codigo;

    public Estudiante(String Nombre, String Apellido, int cedula, int codigo) {
        super(Nombre, Apellido, cedula);
        this.codigo = codigo;
    }
   
   public void mostrardatos() {

        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nCedula: " + getCedula() +
                "\nCodigo del estudiante: " + codigo);
                
    }
    
}

