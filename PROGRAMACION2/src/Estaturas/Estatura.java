/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estaturas;

import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class Estatura {
    private double[][] Estatura;

    // Constructor
    public Estatura(int nAlumnos,int numE) {
        Estatura = new double[nAlumnos][numE];
    }

    // Método para ingresar las notas en la matriz
    public void ingresarAlturas() {
        Scanner Altura = new Scanner(System.in);
        for (int i = 0; i < Estatura.length; i++) {
            for (int j = 0; j < Estatura[i].length; j++) {
                System.out.print("Ingrese la Altura del alumno " + (i + 1) + ": ");
                Estatura[i][j] = Altura.nextDouble();
            }
        }
    }

    // Método para obtener la mayor Altura
    public double obtenerMayorAltura() {
        double mayorAltura = 0;
        for (int i = 0; i < Estatura.length; i++) {
            for (int j = 0; j < Estatura[i].length; j++) {
                if (Estatura[i][j] > mayorAltura) {
                    mayorAltura = Estatura[i][j];
                }
            }
        }
        return mayorAltura;
    }
  
    // Método para obtener la posición de la menor Altura
    public int[] obtenerPosicionMenorAltura() {
        double menorAltura = Double.MAX_VALUE;
        int[] posicion = new int[2]; // [fila, columna]
        for (int i = 0; i < Estatura.length; i++) {
            for (int j = 0; j < Estatura[i].length; j++) {
                if (Estatura[i][j] < menorAltura) {
                    menorAltura = Estatura[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    
}
