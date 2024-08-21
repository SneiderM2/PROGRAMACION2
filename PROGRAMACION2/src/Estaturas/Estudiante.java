/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Estaturas;

/**
 *
 * @author neiga
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nAlumnos = 25;
        int numAltura = 1;

        // w instancia de la clase Notas
        
        
        Estatura Estatura = new Estatura(nAlumnos, numAltura);

        Estatura.ingresarAlturas();

        // la mayor nota
        double mayorAltura = Estatura.obtenerMayorAltura();
        System.out.println("La mayor Altura es: " + mayorAltura);

        // posición de la menor nota
        int[] posicionMenorAltura = Estatura.obtenerPosicionMenorAltura();
        System.out.println("La menor Altura se encuentra en la posición: Alumno " 
                           + (posicionMenorAltura[0] + 1) + ", Estatura " 
                           + (posicionMenorAltura[1] + 1));
    }
    
}
