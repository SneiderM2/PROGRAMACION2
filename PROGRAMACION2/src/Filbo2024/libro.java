/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filbo2024;

/**
 *
 * @author neiga
 */
abstract class libro {
    
    protected String Titulo;
    protected String Autor;
    protected double Precio;

    public libro(String titulo, String autor, double precio) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Precio = precio;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public double getPrecio() {
        return Precio;
    }
    
    abstract void CalcularDescuento();
    
    
      @Override
    public String toString(){
        return Titulo+" "+Autor+" "+Precio;
    }
    
    
}
