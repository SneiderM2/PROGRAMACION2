/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Asociacion1;

/**
 *
 * @author neiga
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear objetos de Municipio y Cargo
        Municipio municipio = new Municipio("001", "Bogotá");
        Cargo cargo = new Cargo("C002", "Gerente", 4000000);

        // Crear objeto de Empleado
        Empleado empleado = new Empleado("Ana", "Gómez", cargo, municipio);

        // Mostrar la información del empleado
        empleado.mostrarInformacion();
    }
    
}
