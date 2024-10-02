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
    
    private String cod_Cargo;
    private String nom_Cargo;
    private double Sueldo;

    public Cargo(String codigoCargo, String nombreCargo, double salario) {
        this.cod_Cargo = codigoCargo;
        this.nom_Cargo = nombreCargo;
        this.Sueldo = salario;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public String getNom_Cargo() {
        return nom_Cargo;
    }

    public String getCodigoCargo() {
        return cod_Cargo;
    }
}
