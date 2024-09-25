/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Filbo2024;

import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int tipo;
        
        do{
            System.out.println("-calcular descuento del tipo de libro en FILBO2024: ");
            System.out.println("1. Libro de texto");
            System.out.println("2. Libro de investigacion");
            System.out.println("3. Novela");
            tipo = sc.nextInt();
            
            switch (tipo){
                case 1:
                    // Datos para el Docente de Tiempo Completo
                    System.out.println("Ingrese el nombre del docente: ");
                    String Titulo = sc.nextLine();
                    System.out.println("Ingrese la facultad del docente: ");
                    String Autor = sc.nextLine();
                    System.out.println("Ingrese el sueldo mensual del docente: ");
                    double Precio = sc.nextDouble();
                    
                
                    
                    // Crear el objeto de DocenteTC01
                    Librotext librotext = new libroText(Titulo, Autor, Precio, Curso, descuento);
                    
                    // Calcular el sueldo del docente TC
                    Librotext.Calculardescuento();
                    System.out.println("Sueldo final del docente TC: " + Librotext.getprecio());
        }
        
    }
    
}
