/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colas;

import javax.swing.JOptionPane;

public class Punto2 {
    public static void main(String[] args) {
        int max = 10; // Tamaño
        int[] colaA = new int[max];
        int[] colaB = new int[max];
        int frenteA = -1, finA = -1; // Punteros cola A
        int frenteB = -1, finB = -1; // Punteros cola B

        // Llenar la cola A 
        int cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos desea agregar a la cola A? (máximo 10)"));

        for (int i = 0; i < cantidadElementos; i++) {
            int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + " para la cola A:"));
            if (finA == max - 1) {
                JOptionPane.showMessageDialog(null, "No se pueden agregar más elementos a la cola A");
                break;
            } else {
                if (frenteA == -1) { 
                    frenteA = 0;
                }
                finA++;
                colaA[finA] = elemento;
            }
        }

        // Mover los elementos de la cola A a la cola B 
        while (frenteA != -1 && frenteA <= finA) {
            if (finB == max - 1) {
                JOptionPane.showMessageDialog(null, "No se pueden agregar más elementos a la cola B");
                break;
            } else {
                if (frenteB == -1) { 
                    frenteB = 0;
                }
                finB++;
                colaB[finB] = colaA[frenteA]; 
                frenteA++; 
            }
        }

        // Verificar si la cola A está vacía
        if (frenteA > finA || frenteA == -1) {
            JOptionPane.showMessageDialog(null, "La cola A ahora está vacía.");
        } else {
            JOptionPane.showMessageDialog(null, "La cola A aún tiene elementos.");
        }

        // Mostrar los elementos de la cola B
        if (frenteB != -1) {
            StringBuilder resultadoB = new StringBuilder("Elementos en la cola B: ");
            for (int i = frenteB; i <= finB; i++) {
                resultadoB.append(colaB[i]).append(" ");
            }
            JOptionPane.showMessageDialog(null, resultadoB.toString());
        } else {
            JOptionPane.showMessageDialog(null, "La cola B está vacía.");
        }
    }
}
