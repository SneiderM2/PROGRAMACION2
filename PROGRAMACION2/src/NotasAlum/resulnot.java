/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NotasAlum;

/**
 *
 * @author neiga
 */
public class resulnot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int nAlumnos = 15;
        int numEvalu = 1; // Una evaluación en este caso

        // w instancia de la clase Notas
        Notas Notas = new Notas(nAlumnos, numEvalu);

        Notas.ingresarNotas();

        // la mayor nota
        double mayorNota = Notas.obtenerMayorNota();
        System.out.println("La mayor nota es: " + mayorNota);

        // el porcentaje de aprobados
        double porcentajeAprobados = Notas.calcularPorcentajeAprobados(3.0);
        System.out.println("El porcentaje de alumnos que aprobaron es: " + porcentajeAprobados + "%");

        // el promedio de las notas
        double promedioNotas = Notas.calcularPromedioNotas();
        System.out.println("El promedio de las notas es: " + promedioNotas);

        // posición de la menor nota
        int[] posicionMenorNota = Notas.obtenerPosicionMenorNota();
        System.out.println("La menor nota se encuentra en la posición: Alumno " 
                           + (posicionMenorNota[0] + 1) + ", Evaluación " 
                           + (posicionMenorNota[1] + 1));
    }
}
