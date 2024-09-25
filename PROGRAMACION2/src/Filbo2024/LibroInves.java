/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
public class LibroInves extends libro{
    
    private String Facultad;
    private double descuento;

    public LibroInves( String titulo, String autor, double precio, String Facultad, double descuento) {
        super(titulo, autor, precio);
        this.Facultad = Facultad;
        this.descuento = descuento;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getFacultad() {
        return Facultad;
    }
    
    public void Calculardescuendo(){
        
        descuento = (Precio*0.25);
    }

    public double getDescuento() {
        return descuento;
    }
    
    
    
    
}
