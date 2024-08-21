/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NotasAlum;
import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class Notas {
    private double[][] notas;

    // Constructor
    public Notas(int nAlumnos, int numEvalu) {
        notas = new double[nAlumnos][numEvalu];
    }

    // Método para ingresar las notas en la matriz
    public void ingresarNotas() {
        Scanner nota = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Ingrese la nota del alumno " + (i + 1) + " en la evaluación " + (j + 1) + ": ");
                notas[i][j] = nota.nextDouble();
            }
        }
    }

    // Método para obtener la mayor nota
    public double obtenerMayorNota() {
        double mayorNota = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > mayorNota) {
                    mayorNota = notas[i][j];
                }
            }
        }
        return mayorNota;
    }

    // Método para calcular el porcentaje de aprobados
    public double calcularPorcentajeAprobados(double notaMinimaAprobatoria) {
        int aprobados = 0;
        int totalNotas = notas.length * notas[0].length;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > notaMinimaAprobatoria) {
                    aprobados++;
                }
            }
        }
        return (double) aprobados / totalNotas * 100;
    }

    // Método para calcular el promedio de las notas
    public double calcularPromedioNotas() {
        double suma = 0;
        int totalNotas = notas.length * notas[0].length;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
        }
        return suma / totalNotas;
    }

    // Método para obtener la posición de la menor nota
    public int[] obtenerPosicionMenorNota() {
        double menorNota = Double.MAX_VALUE;
        int[] posicion = new int[2]; // [fila, columna]
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
}
