/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Colas;

import javax.swing.JOptionPane;

public class ControlColas {
    public static void main(String[] args) {
        byte max = 9, op = 0; // tipo de dato entero con signo (8 bits)
        int i = 0, frente = -1, fin = -1;
        int V[] = new int[10];

        while (op != 5) { // ahora es 5 porque agregaremos una nueva opción
            op = Byte.parseByte(JOptionPane.showInputDialog("Digite un número\n" + 
                "1. Insertar\n" + 
                "2. Eliminar\n" + 
                "3. Mostrar\n" + 
                "4. Contar\n" + 
                "5. Salir"));

            switch (op) {
                case 1: // Insertar
                    if (fin != max) { 
                        if (frente == -1) {
                            fin++;
                            frente++;
                            V[fin] = Byte.parseByte(JOptionPane.showInputDialog("Digite el valor"));
                        } else {
                            fin++;
                            V[fin] = Byte.parseByte(JOptionPane.showInputDialog("Digite el valor"));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Overflow"); 
                    }
                    break;

                case 2: // Eliminar
                    if (fin != -1) { 
                        if (fin == frente) {
                            fin = -1;
                            frente = -1;
                        } else {
                            frente++;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Underflow"); 
                    }
                    break;

                case 3: // Mostrar
                    if (fin != -1) { 
                        for (i = frente; i <= fin; i++) { 
                            JOptionPane.showMessageDialog(null, V[i]); 
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cola vacía");
                    }
                    break;

                case 4: // Contar
                    if (fin != -1) {
                        int count = fin - frente + 1; // cantidad de elementos
                        JOptionPane.showMessageDialog(null, "Elementos en la cola: " + count);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cola vacía");
                    }
                    break;

                case 5: // Salir
                    JOptionPane.showMessageDialog(null, "Gracias");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}

