/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mostrar;
import Datos.Persona;
import Datos.Docente;
import Datos.Estudiante;
import java.util.Scanner;
/**
 *
 * @author neiga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipo;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("-informacion de: ");
            System.out.println("1. Docentes");
            System.out.println("2. Estudiantes");
            tipo = sc.nextInt();
            
            switch (tipo){
                
                 case 1:
                    // Docente
                    Docente Docente = new Docente("frank", "Cardozo", 124421, 1500000);
                    Docente.mostrardatos();
                    break;

                case 2:
                    // Estudiante
                    Estudiante Estudiante = new Estudiante("Gerardo", "Villarraga", 1312783, 123144);
                    Estudiante.mostrardatos();
                    break;                            //codigo hecho por pancracio
                
                default:
                    System.out.println(
                            "Opción inválida. Por favor, seleccione una opción válida (1-2) o presione 0 para salir.");
                    break;

            }
        }
        while (tipo != 0);

        System.out.println("Programa finalizado.");
    }
    
}
