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
    
    private String codigoMunicipio;
    private String nombreMunicipio;

    public Municipio(String codigoMunicipio, String nombreMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }
    
}
