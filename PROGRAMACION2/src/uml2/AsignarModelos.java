/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml2;
/**
 *
 * @author neiga
 */
public class AsignarModelos {
    // Atributos privados para contar los estudiantes por modelo
    private int modelo1, modelo2, modelo3, modelo4, modelo5;
    
    // Arreglo que contiene los números de identidad
    private int[] numIdentidad;

    // Constructor que recibe el arreglo de números de identidad
    public AsignarModelos(int[] numIdentidad) {
       
        this.numIdentidad = numIdentidad;
    }

    // Método para calcular el modelo de examen para cada estudiant
    public void SetCalcularMod() {
       for(int id : numIdentidad){
           int ultimoDigito = id % 10;
           switch(ultimoDigito){
                case 1: case 6:
                   modelo1++;
                   break;
                case 2: case 7:
                   modelo2++;
                   break;
                case 3: case 8:
                   modelo3++;
                   break;
                case 4: case 9:
                   modelo4++;
                   break;
                case 5: case 0:
                   modelo5++;
                   break;
                default:
                    System.out.println("Digito no valido para ID: "+ id);
                
                    
           }
       }
    }

    
    // Métodos para obtener la cantidad de estudiantes por cada modelo
    public int getModelo1() {
        return modelo1;
    }

    public int getModelo2() {
        return modelo2;
    }

    public int getModelo3() {
        return modelo3;
    }

    public int getModelo4() {
        return modelo4;
    }

    public int getModelo5() {
        return modelo5;
    }

    public int[] getNumIdentidad() {
        return numIdentidad;
    }
    
    
}
