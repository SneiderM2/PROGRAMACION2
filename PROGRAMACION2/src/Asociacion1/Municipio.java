/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion1;

/**
 *
 * @author neiga
 */
public class Municipio {
    
    private String cod_Municipio;
    private String nom_Municipio;

    public Municipio(String cod_Municipio, String nom_Municipio) {
        this.cod_Municipio = cod_Municipio;
        this.nom_Municipio = nom_Municipio;
    }

    public String getNom_Municipio() {
        return nom_Municipio;
    }

    public String getCod_Municipio() {
        return cod_Municipio;
    }
    
}
