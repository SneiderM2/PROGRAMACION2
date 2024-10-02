/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion1;

/**
 *
 * @author neiga
 */
public class Cargo {
    
    private String codigoCargo;
    private String nombreCargo;
    private double salario;

    public Cargo(String codigoCargo, String nombreCargo, double salario) {
        this.codigoCargo = codigoCargo;
        this.nombreCargo = nombreCargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public String getCodigoCargo() {
        return codigoCargo;
    }
}
