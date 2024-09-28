/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
class LibroInves extends Libro {
    private String facultad;
    private double descuento;

    public LibroInves(String titulo, String autor, double precio, String facultad) {
        super(titulo, autor, precio);
        this.facultad = facultad;
    }

    @Override
    public void calcularDescuento() {
        descuento = precio * 0.25;
    }

    @Override
    public String toString() {
        return super.toString() + ", Facultad: " + facultad + ", Precio con descuento: $" + (precio - descuento);
    }
}

