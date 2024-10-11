/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilas;

import javax.swing.JOptionPane; 

public class Pilas {
    public static void main(String[] args) {
        // Declaración de variables
        byte max = 4, op = 0; // 'max' indica el tamaño máximo de la pila
        int tope = -1, i = 0; // 'tope' indica la posición más alta (última) en la pila

        byte V[] = new byte[5]; // Arreglo que representa la pila
        
        // Ciclo que permite ejecutar el programa 
        while (op != 4) {
            // Muestra un cuadro de diálogo 
            op = Byte.parseByte(JOptionPane.showInputDialog("Digite un numero\n" + 
                    "1.Insertar\n" + 
                    "2.Eliminar\n" + 
                    "3.Mostrar\n" + 
                    "4.contar\n" + 
                    "5.Salir"));
            
            // ejecutar la opción elegida por el usuario
            switch (op) {
                case 1: 
                    if (tope != max) { // Si el tope no ha alcanzado el máximo 
                        tope++; // Se incrementa el tope
                        V[tope] = Byte.parseByte(JOptionPane.showInputDialog("Digite su valor")); // Se almacena el valor en el tope.
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila llena"); // Si la pila está llena, muestra un mensaje de error.
                    }
                    break;
                    
                case 2: 
                    if (tope != -1) { // Si la pila no está vacía (tope es diferente de -1)
                        tope--; // Se decrementa el tope para eliminar el último valor.
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacía"); // Si la pila está vacía, muestra un mensaje de error.
                    }
                    break;
                    
                case 3: // Opción para mostrar los elementos de la pila
                    if (tope != -1) { // Si la pila no está vacía
                        for (i = tope; i >= 0; i--) { // Recorre la pila desde el tope hasta el fondo.
                            JOptionPane.showMessageDialog(null, V[i]); // Muestra el valor
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pila vacía"); // Si la pila está vacía, muestra un mensaje.
                    }
                    break;
                
                case 4: 
                    JOptionPane.showMessageDialog(null, "La pila tiene " + (tope + 1) + " elementos"); // Muestra la cantidad de elementos en la pila.
                    break;
                    
                case 5: // Opción para salir del programa
                    JOptionPane.showMessageDialog(null, "Gracias"); // Muestra un mensaje de despedida.
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida"); // En caso de que el usuario ingrese una opción no válida.
                    break;
            }
        }
    }
}