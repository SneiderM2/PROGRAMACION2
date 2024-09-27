/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
class LibroText extends Libro {
    
    private String curso;
    private double descuento;

    public LibroText(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    
    @Override
    public void calcularDescuento() {
        descuento = precio * 0.40;
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Precio con descuento: $" + (precio - descuento);
    }
}
