package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Mahasiswa generated by hbm2java
 */
public class Mahasiswa  implements java.io.Serializable {


     private int nim;
     private Hakakses hakakses;
     private Departemen departemen;
     private String nama;
     private int angkatan;
     private String idOrtu;
     private String passOrtu;
     private String passMhs;
     private String status;
     private String alumni;
     private Set<Transaksi> transaksis = new HashSet<Transaksi>(0);
     private Set<Ambil> ambils = new HashSet<Ambil>(0);
     private Set<Recordips> recordipses = new HashSet<Recordips>(0);
     private Set<Absensi> absensis = new HashSet<Absensi>(0);

    public Mahasiswa() {
    }

	
    public Mahasiswa(int nim, Hakakses hakakses, Departemen departemen, String nama, int angkatan, String idOrtu, String passOrtu, String passMhs, String status, String alumni) {
        this.nim = nim;
        this.hakakses = hakakses;
        this.departemen = departemen;
        this.nama = nama;
        this.angkatan = angkatan;
        this.idOrtu = idOrtu;
        this.passOrtu = passOrtu;
        this.passMhs = passMhs;
        this.status = status;
        this.alumni = alumni;
    }
    public Mahasiswa(int nim, Hakakses hakakses, Departemen departemen, String nama, int angkatan, String idOrtu, String passOrtu, String passMhs, String status, String alumni, Set<Transaksi> transaksis, Set<Ambil> ambils, Set<Recordips> recordipses, Set<Absensi> absensis) {
       this.nim = nim;
       this.hakakses = hakakses;
       this.departemen = departemen;
       this.nama = nama;
       this.angkatan = angkatan;
       this.idOrtu = idOrtu;
       this.passOrtu = passOrtu;
       this.passMhs = passMhs;
       this.status = status;
       this.alumni = alumni;
       this.transaksis = transaksis;
       this.ambils = ambils;
       this.recordipses = recordipses;
       this.absensis = absensis;
    }
   
    public int getNim() {
        return this.nim;
    }
    
    public void setNim(int nim) {
        this.nim = nim;
    }
    public Hakakses getHakakses() {
        return this.hakakses;
    }
    
    public void setHakakses(Hakakses hakakses) {
        this.hakakses = hakakses;
    }
    public Departemen getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(Departemen departemen) {
        this.departemen = departemen;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getAngkatan() {
        return this.angkatan;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    public String getIdOrtu() {
        return this.idOrtu;
    }
    
    public void setIdOrtu(String idOrtu) {
        this.idOrtu = idOrtu;
    }
    public String getPassOrtu() {
        return this.passOrtu;
    }
    
    public void setPassOrtu(String passOrtu) {
        this.passOrtu = passOrtu;
    }
    public String getPassMhs() {
        return this.passMhs;
    }
    
    public void setPassMhs(String passMhs) {
        this.passMhs = passMhs;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAlumni() {
        return this.alumni;
    }
    
    public void setAlumni(String alumni) {
        this.alumni = alumni;
    }
    public Set<Transaksi> getTransaksis() {
        return this.transaksis;
    }
    
    public void setTransaksis(Set<Transaksi> transaksis) {
        this.transaksis = transaksis;
    }
    public Set<Ambil> getAmbils() {
        return this.ambils;
    }
    
    public void setAmbils(Set<Ambil> ambils) {
        this.ambils = ambils;
    }
    public Set<Recordips> getRecordipses() {
        return this.recordipses;
    }
    
    public void setRecordipses(Set<Recordips> recordipses) {
        this.recordipses = recordipses;
    }
    public Set<Absensi> getAbsensis() {
        return this.absensis;
    }
    
    public void setAbsensis(Set<Absensi> absensis) {
        this.absensis = absensis;
    }




}


