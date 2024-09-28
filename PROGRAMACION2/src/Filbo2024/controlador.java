/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Filbo2024;

import java.util.Scanner;

public class controlador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro = null;  // Un solo objeto libro

        int tipo;

        do {
            System.out.println("Calcular descuento del tipo de libro en FILBO2024: ");
            System.out.println("1. Libro de texto");
            System.out.println("2. Libro de investigación");
            System.out.println("3. Novela");
            System.out.println("4. Salir");
            tipo = sc.nextInt();
            sc.nextLine();
            
            switch (tipo) {
                case 1:
                    System.out.println("Ingrese el título del libro de texto: ");
                    String tituloTexto = sc.nextLine();
                    System.out.println("Ingrese el autor del libro de texto: ");
                    String autorTexto = sc.nextLine();
                    System.out.println("Ingrese el precio del libro de texto: ");
                    double precioTexto = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ingrese el curso asociado al libro de texto: ");
                    String curso = sc.nextLine();
                    
                    
                    libro = new LibroText(tituloTexto, autorTexto, precioTexto, curso);
                    libro.calcularDescuento();
                    break;
                    
                case 2:
                    System.out.println("Ingrese el título del libro de investigación: ");
                    String tituloInves = sc.nextLine();
                    System.out.println("Ingrese el autor del libro de investigación: ");
                    String autorInves = sc.nextLine();
                    System.out.println("Ingrese el precio del libro de investigación: ");
                    double precioInves = sc.nextDouble();
                    sc.nextLine();  
                    System.out.println("Ingrese la facultad que publicó el libro: ");
                    String facultad = sc.nextLine();
                    
                    
                    libro = new LibroInves(tituloInves, autorInves, precioInves, facultad);
                    libro.calcularDescuento();
                    break;
                    
                case 3:
                    System.out.println("Ingrese el título de la novela: ");
                    String tituloNovela = sc.nextLine();
                    System.out.println("Ingrese el autor de la novela: ");
                    String autorNovela = sc.nextLine();
                    System.out.println("Ingrese el precio de la novela: ");
                    double precioNovela = sc.nextDouble();
                    sc.nextLine();  // Consumir nueva línea
                    System.out.println("Ingrese el tipo de novela (histórica, romántica, policíaca, etc.): ");
                    String tipoNovela = sc.nextLine();
                    
                    
                    libro = new Novela(tituloNovela, autorNovela, precioNovela, tipoNovela);
                    libro.calcularDescuento();
                    break;
                    
                case 4:
                    System.out.println("Saliendo.");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }

            // 
            if (libro != null) {
                System.out.println("\n--- Libro registrado ---");
                System.out.println(libro);
            }
            
        } while (tipo != 4);
    }
}