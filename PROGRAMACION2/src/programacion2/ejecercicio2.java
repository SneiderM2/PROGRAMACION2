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
public class ejecercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        // TODO code application logic here
         System.out.print("Ingrese la cantidad de números que desea introducir: ");
        int n = keys.nextInt();
        
        
        int[] numeros = new int[n];
        
        // Leer los números ingresados por el usuario
        System.out.println("Ingrese " + n + " números enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = keys.nextInt();
        }
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
    
}
