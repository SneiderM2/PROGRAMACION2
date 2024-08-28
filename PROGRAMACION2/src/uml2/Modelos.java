/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml2;
import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class Modelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keys = new Scanner(System.in);

        System.out.println("Ingrese el número de estudiantes:");
        int numeroEstudiantes = keys.nextInt();

        int[] numIdentidad = new int[numeroEstudiantes];

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Ingrese el número de identidad del estudiante " + (i + 1) + ": ");
            numIdentidad[i] = keys.nextInt();
        }

        // Crear objeto de la clase Asignar_modelos
        AsignarModelos asignacion = new AsignarModelos(numIdentidad);
        asignacion.SetCalcularMod();

        // Imprimir los resultados
        System.out.println("Modelo 1: " + asignacion.getModelo1() + " estudiantes");
        System.out.println("Modelo 2: " + asignacion.getModelo2() + " estudiantes");
        System.out.println("Modelo 3: " + asignacion.getModelo3() + " estudiantes");
        System.out.println("Modelo 4: " + asignacion.getModelo4() + " estudiantes");
        System.out.println("Modelo 5: " + asignacion.getModelo5() + " estudiantes");

    }
    
}
