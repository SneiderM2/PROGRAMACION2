/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Filbo2024;

import java.util.ArrayList;
import java.util.Scanner;

public class controlador {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        
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
                    
                    LibroText libroText = new LibroText(tituloTexto, autorTexto, precioTexto, curso);
                    libroText.calcularDescuento();
                    libros.add(libroText);
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
                    
                    LibroInves libroInves = new LibroInves(tituloInves, autorInves, precioInves, facultad);
                    libroInves.calcularDescuento();
                    libros.add(libroInves);
                    break;
                    
                case 3:
                    System.out.println("Ingrese el título de la novela: ");
                    String tituloNovela = sc.nextLine();
                    System.out.println("Ingrese el autor de la novela: ");
                    String autorNovela = sc.nextLine();
                    System.out.println("Ingrese el precio de la novela: ");
                    double precioNovela = sc.nextDouble();
                    sc.nextLine();  
                    System.out.println("Ingrese el tipo de novela (histórica, romántica, policíaca, etc.): ");
                    String tipoNovela = sc.nextLine();
                    
                    Novela novela = new Novela(tituloNovela, autorNovela, precioNovela, tipoNovela);
                    novela.calcularDescuento();
                    libros.add(novela);
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
            }
        } while (tipo != 4);
        
        
        System.out.println("\n--- Libros registrados en FILBO2024 ---");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}