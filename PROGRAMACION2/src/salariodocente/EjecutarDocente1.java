/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariodocente;

import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class EjecutarDocente1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int tipo;
        
        do{
            System.out.println("-calcular sualdo de docentes: ");
            System.out.println("1. tiempo completo");
            System.out.println("2. hora catedra");
            tipo = sc.nextInt();
            
            switch (tipo){
                case 1:
                    // Datos para el Docente de Tiempo Completo
                    System.out.println("Ingrese el nombre del docente: ");
                    String nombreDoc = sc.nextLine();
                    System.out.println("Ingrese la facultad del docente: ");
                    String facultadDoc = sc.nextLine();
                    System.out.println("Ingrese la categoría del docente: ");
                    String cadiDoc = sc.nextLine();
                    System.out.println("Ingrese el sueldo mensual del docente: ");
                    double sueldoMensual = sc.nextDouble();
                    System.out.println("Ingrese la cantidad de trabajos de grado del docente: ");
                    int canTrabGrado = sc.nextInt();
                    System.out.println("Ingrese el valor por hora de asesoría del docente: ");
                    double valorHoraAsesor = sc.nextDouble();
                    System.out.println("Ingrese la cantidad de horas de asesoría del docente: ");
                    double asesoriaDoc = sc.nextDouble();
                    System.out.println("Ingrese el sueldo básico del docente: ");
                    double sueldoBasico = sc.nextDouble();
                
                    
                    // Crear el objeto de DocenteTC01
                    DocenteTC01 docenteTC = new DocenteTC01(nombreDoc, facultadDoc, cadiDoc, sueldoMensual, canTrabGrado, valorHoraAsesor, asesoriaDoc, sueldoBasico);
                    
                    // Calcular el sueldo del docente TC
                    docenteTC.CalcularSueldo();
                    System.out.println("Sueldo final del docente TC: " + docenteTC.getSueldoMensual());
                break;
                case 2:
                    // Datos para el Docente de Horas Cátedra
                    sc.nextLine(); // Limpiar buffer
                    System.out.println("Ingrese el nombre del docente HC:");
                    String nombreDocH = sc.nextLine();
                    System.out.println("Ingrese la facultad del docente HC:");
                    String facultadDocH = sc.nextLine();
                    System.out.println("Ingrese la categoría del docente HC:");
                    String cadiDocH = sc.nextLine();
                    System.out.println("Ingrese la cantidad de horas trabajadas del docente HC:");
                    int horasTrab = sc.nextInt();
                    System.out.println("Ingrese el valor por hora del docente HC:");
                    double valorHoraHC = sc.nextDouble();

                    // Crear el objeto de DocenteHC1
                    DocenteHC1 docenteHC = new DocenteHC1(nombreDocH, facultadDocH, cadiDocH, horasTrab, valorHoraHC, 0);

                    // Calcular el sueldo del docente HC
                    docenteHC.CalcularSueldo();
                    System.out.println("Sueldo final del docente HC: " + docenteHC.getSueldoMesHora());
                break;
                    
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
    

