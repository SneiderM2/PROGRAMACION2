/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
public class Librotext extends libro{
    
    private String Curso;
    private double descuento;

    public Librotext(String titulo, String autor, double precio, String Curso,double descuento) {
        super(titulo, autor, precio);
        this.Curso = Curso;
        this.descuento = descuento;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getCurso() {
        return Curso;
    }
    
    @Override
    public void Calculardescuento(){
        
        descuento = (Precio*0.40);
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    public double getDescuento() {
        return descuento;
    }
    
    
    
}
