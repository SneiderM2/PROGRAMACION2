/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2;
import java.util.Scanner;
import java.time.Year;
/**
 *
 * @author neiga
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keys = new Scanner(System.in);
        int anoActual = Year.now().getValue();  // Obtener el año actual
        
        while (true) {
            // Solicitar el año de nacimiento
            System.out.print("Ingrese el año de nacimiento (o -1 para salir): ");
            int anoNacimiento = keys.nextInt();
            
            // Verificar si se ha ingresado el valor centinela
            if (anoNacimiento == -1) {
                break;
            }
            
            // Calcular la edad de la persona
            int edad = anoActual - anoNacimiento;
            
            // Determinar si la persona es apta para votar
            if (edad >= 18) {
                System.out.println("La persona es apta para votar.");
            } else {
                System.out.println("La persona NO es apta para votar.");
            }
        }
    }
    
}
