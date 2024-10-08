/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
class Novela extends Libro {
    private String tipoNovela;
    private double descuento;

    public Novela(String titulo, String autor, double precio, String tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    @Override
    public void calcularDescuento() {
        descuento = precio * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de novela: " + tipoNovela + ", Precio con descuento: $" + (precio - descuento);
    }
}