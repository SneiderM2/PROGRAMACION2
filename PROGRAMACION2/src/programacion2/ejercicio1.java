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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int n,j;
        System.out.println("ingrese el numero quiera su tabla de multiplicar " );
        n = sc.nextInt();   // se toma el dato introducido por teclado
        System.out.println("tabla de multiplicar el numero "+n );
        while(n<0){
            System.out.println("ingrese un numero positivo ");
            n = sc.nextInt();  
        }
        for(int i=1; i<=10; i++){
            j=i*n;
            System.out.println(n+"X"+i+"="+j);
        }
    }
    
}
