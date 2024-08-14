/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2;

import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keys = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = keys.nextInt();
            suma += numeros[i]; 
        }
        // Solicitar un número para verificar cuántas veces se ingresó
        System.out.print("Ingrese el número que desea verificar cuántas veces se ingresó: ");
        int numeroVerificar = keys.nextInt();
        // Contar cuántas veces se ingresó el número
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numeroVerificar) {
                contador++;
            }
        }
        // Calcular el promedio
        double promedio = suma / 10.0;

        System.out.println("El número " + numeroVerificar + " se ingresó " + contador + " veces.");
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
    
}
