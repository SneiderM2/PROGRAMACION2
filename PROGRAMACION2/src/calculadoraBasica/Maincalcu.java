/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraBasica;
import java.util.Scanner;

/**
 *
 * @author neiga
 */
public class Maincalcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num = new Scanner(System.in);

        // Solicitar al usuario que ingrese los números
        System.out.print("Ingresa el primer número: ");
        double numero1 = num.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = num.nextDouble();

        // objeto
        calculadora calc = new calculadora(numero1, numero2);

        
        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
    }
}


