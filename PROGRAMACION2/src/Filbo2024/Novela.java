/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
public class Novela extends libro{
    
    private String tiponove;
    private double descuento;

    public Novela( String titulo, String autor, double precio, String tiponove, double descuento) {
        super(titulo, autor, precio);
        this.tiponove = tiponove;
        this.descuento = descuento;
    }

    public void setTiponove(String tiponove) {
        this.tiponove = tiponove;
    }

    public String getTiponove() {
        return tiponove;
    }
    
    public void Calculardescuendo(){
        
        descuento = (Precio*0.15);
    }

    public double getDescuento() {
        return descuento;
    }
    
    
}
