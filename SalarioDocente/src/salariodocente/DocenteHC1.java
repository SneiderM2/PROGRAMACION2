/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salariodocente;

/**
 *
 * @author neiga
 */
public class DocenteHC1 extends Docente1{
    
    private int HorasTrab;
    private double Valorhora;
    private double SueldoMesHora;

    public DocenteHC1(String NombreDoc, String FacultadDoc, String CadiDoc, int HorasTrab, double Valorhora, double SueldoMesHora) {
        super(NombreDoc, FacultadDoc, CadiDoc);
        this.HorasTrab = HorasTrab;
        this.Valorhora = Valorhora;
        this.SueldoMesHora = SueldoMesHora;
    }

    public void setHorasTrab(int HorasTrab) {
        this.HorasTrab = HorasTrab;
    }

    public void setValorhora(double Valorhora) {
        this.Valorhora = Valorhora;
    }
    
    @Override
    public void CalcularSueldo(){
        SueldoMesHora = HorasTrab * Valorhora;
    }
    
    public double getSueldoMesHora() {
        return SueldoMesHora;
    }
    
    
}
