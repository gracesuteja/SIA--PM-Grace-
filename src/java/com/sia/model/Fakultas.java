package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Fakultas generated by hbm2java
 */
public class Fakultas  implements java.io.Serializable {


     private int idFakultas;
     private String namaFakultas;
     private Set<Departemen> departemens = new HashSet<Departemen>(0);

    public Fakultas() {
    }

	
    public Fakultas(int idFakultas, String namaFakultas) {
        this.idFakultas = idFakultas;
        this.namaFakultas = namaFakultas;
    }
    public Fakultas(int idFakultas, String namaFakultas, Set<Departemen> departemens) {
       this.idFakultas = idFakultas;
       this.namaFakultas = namaFakultas;
       this.departemens = departemens;
    }
   
    public int getIdFakultas() {
        return this.idFakultas;
    }
    
    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }
    public String getNamaFakultas() {
        return this.namaFakultas;
    }
    
    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }
    public Set<Departemen> getDepartemens() {
        return this.departemens;
    }
    
    public void setDepartemens(Set<Departemen> departemens) {
        this.departemens = departemens;
    }




}


