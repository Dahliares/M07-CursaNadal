/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.domain;

/**
 *
 * @author dahliares
 */
public class Corredor {

    private String codi;
    private String dorsal;
    private String nom;
    private String cognoms;
    private String categoria;
    private int edat;
    private int temps;   //en segundos
    private String tempsHHMISS;   //01:23:42

    public String toHHMISS(int segundos) {

        int num, hor, min, seg;
       
        num = segundos;
        hor = num / 3600;
        min = (num - (3600 * hor)) / 60;
        seg = num - ((hor * 3600) + (min * 60));
        
        return hor+":"+min+":"+seg;
    }

    public int fromHHMISS(String tempString) {
        
        int hor,min,seg,hh,mm,total;
        String[] array = new String[3];
        
        array= tempString.split(":");
        
        hor=Integer.parseInt(array[0]);
        
        min=Integer.parseInt(array[1]);
        
        seg=Integer.parseInt(array[2]);
        
        hh = hor*3600;
        mm = min*60;
        total= hh+mm+seg;
       

        return total;
    }

    public Corredor(String codi, String dorsal, String nom, String cognoms, String categoria, int edat) {
        this.codi = codi;
        this.dorsal = dorsal;
        this.nom = nom;
        this.cognoms = cognoms;
        this.categoria = categoria;
        this.edat = edat;
    }
    
    public Corredor(){}
    
    

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public String getTempsHHMISS() {
        return tempsHHMISS;
    }

    public void setTempsHHMISS(String tempsHHMISS) {
        this.tempsHHMISS = tempsHHMISS;
    }
    
    

}
