/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salariodocente;

/**
 *
 * @author neiga
 */
public class DocenteTC01 extends Docente1 {
    
    private double SueldoMensual;
    private int CanTrabGrado;
    private double ValorHoraAsesor;
    private double AsesoriaDoc;
    private double SueldoBasico;

    public DocenteTC01( String NombreDoc, String FacultadDoc, String CadiDoc, double SueldoMensual, int CanTrabGrado, double ValorHoraAsesor, double AsesoriaDoc, double SueldoBasico) {
        super(NombreDoc, FacultadDoc, CadiDoc);
        this.SueldoMensual = SueldoMensual;
        this.CanTrabGrado = CanTrabGrado;
        this.ValorHoraAsesor = ValorHoraAsesor;
        this.AsesoriaDoc = AsesoriaDoc;
        this.SueldoBasico = SueldoBasico;
    }

    public void setCanTrabGrado(int CanTrabGrado) {
        this.CanTrabGrado = CanTrabGrado;
    }

    public void setValorHoraAsesor(double ValorHoraAsesor) {
        this.ValorHoraAsesor = ValorHoraAsesor;
    }

    public void setSueldoBasico(double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }
    
    @Override
    public void CalcularSueldo(){
         SueldoMensual = SueldoBasico + (CanTrabGrado * ValorHoraAsesor * AsesoriaDoc);
    }

    public double getSueldoMensual() {
        return SueldoMensual;
    }
    
    
}
