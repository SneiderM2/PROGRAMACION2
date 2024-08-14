/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2;

import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keys = new Scanner(System.in);
        double[][] notas = new double[5][4];  

        // Ingresar las notas de los alumnos
        for (int i = 0; i < 5; i++) {
            double suma = 0;
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + " : ");
                notas[i][j] = keys.nextDouble();
                suma += notas[i][j];
            }
            // Calcular y almacenar el promedio en la cuarta columna
            notas[i][3] = suma / 3.0;
        }

        // Mostrar las notas y el promedio de cada alumno
        System.out.println("\nNotas y promedios de los alumnos: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + " : ");
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    System.out.print(notas[i][j] + " ");
                } else {
                    System.out.print("| Promedio: " + notas[i][j]);
                }
            }
        }

    }
    
}
