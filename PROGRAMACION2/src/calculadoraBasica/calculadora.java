/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraBasica;
/**
 *
 * @author neiga
 */

    public class calculadora {
    private double n1;
    private double n2;

    // Constructor
    public calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método para sumar
    public double sumar() {
        return n1 + n2;
    }

    // Método para restar
    public double restar() {
        return n1 - n2;
    }

    // Método para multiplicar
    public double multiplicar() {
        return n1 * n2;
    }

    // Método para dividir
    public double dividir() {
        if (n2 != 0) {
            return (double) n1 / n2;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
    }
}

