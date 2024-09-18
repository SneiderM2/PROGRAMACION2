/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salariodocente;

/**
 *
 * @author neiga
 */
abstract class Docente1 {
    
     //atributos generales
    protected String NombreDoc;
    protected String FacultadDoc;
    protected String CadiDoc;

    public Docente1(String NombreDoc, String FacultadDoc, String CadiDoc) {
        this.NombreDoc = NombreDoc;
        this.FacultadDoc = FacultadDoc;
        this.CadiDoc = CadiDoc;
    }

    public void setNombreDoc(String NombreDoc) {
        this.NombreDoc = NombreDoc;
    }

    public void setFacultadDoc(String FacultadDoc) {
        this.FacultadDoc = FacultadDoc;
    }

    public void setCadiDoc(String CadiDoc) {
        this.CadiDoc = CadiDoc;
    }

    public String getNombreDoc() {
        return NombreDoc;
    }

    public String getFacultadDoc() {
        return FacultadDoc;
    }

    public String getCadiDoc() {
        return CadiDoc;
    }
    
    abstract void CalcularSueldo();
    
    
      @Override
    public String toString(){
        return NombreDoc+" "+FacultadDoc+" "+CadiDoc;
    }

    
    
}
