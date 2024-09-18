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

        // Datos para el Docente de Tiempo Completo
        System.out.println("Ingrese el nombre del docente TC:");
        String nombreTC = sc.nextLine();
        System.out.println("Ingrese la facultad del docente TC:");
        String facultadTC = sc.nextLine();
        System.out.println("Ingrese la categoría del docente TC:");
        String cadiTC = sc.nextLine();
        System.out.println("Ingrese el sueldo mensual del docente TC:");
        double sueldoMensualTC = sc.nextDouble();
        System.out.println("Ingrese la cantidad de trabajos de grado del docente TC:");
        int canTrabGrado = sc.nextInt();
        System.out.println("Ingrese el valor por hora de asesoría del docente TC:");
        double valorHoraAsesor = sc.nextDouble();
        System.out.println("Ingrese la cantidad de horas de asesoría del docente TC:");
        double asesoriaDoc = sc.nextDouble();
        System.out.println("Ingrese el sueldo básico del docente TC:");
        double sueldoBasicoTC = sc.nextDouble();

        // Crear el objeto de DocenteTC01
        DocenteTC01 docenteTC = new DocenteTC01(nombreTC, facultadTC, cadiTC, sueldoMensualTC, canTrabGrado, valorHoraAsesor, asesoriaDoc, sueldoBasicoTC);
        
        // Calcular el sueldo del docente TC
        docenteTC.CalcularSueldo();
        System.out.println("Sueldo final del docente TC: " + docenteTC.getSueldoMensual());

        // Datos para el Docente de Horas Cátedra
        sc.nextLine(); // Limpiar buffer
        System.out.println("Ingrese el nombre del docente HC:");
        String nombreHC = sc.nextLine();
        System.out.println("Ingrese la facultad del docente HC:");
        String facultadHC = sc.nextLine();
        System.out.println("Ingrese la categoría del docente HC:");
        String cadiHC = sc.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas del docente HC:");
        int horasTrab = sc.nextInt();
        System.out.println("Ingrese el valor por hora del docente HC:");
        double valorHoraHC = sc.nextDouble();

        // Crear el objeto de DocenteHC1
        DocenteHC1 docenteHC = new DocenteHC1(nombreHC, facultadHC, cadiHC, horasTrab, valorHoraHC, 0);
        
        // Calcular el sueldo del docente HC
        docenteHC.CalcularSueldo();
        System.out.println("Sueldo final del docente HC: " + docenteHC.getSueldoMesHora());
    }
    
}
