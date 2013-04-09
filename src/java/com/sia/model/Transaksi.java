package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Transaksi generated by hbm2java
 */
public class Transaksi  implements java.io.Serializable {


     private TransaksiId id;
     private Matkul matkul;
     private Biaya biaya;
     private Mahasiswa mahasiswa;
     private Periodic periodic;
     private Date tanggalBayar;
     private String statusBayar;

    public Transaksi() {
    }

    public Transaksi(TransaksiId id, Matkul matkul, Biaya biaya, Mahasiswa mahasiswa, Periodic periodic, Date tanggalBayar, String statusBayar) {
       this.id = id;
       this.matkul = matkul;
       this.biaya = biaya;
       this.mahasiswa = mahasiswa;
       this.periodic = periodic;
       this.tanggalBayar = tanggalBayar;
       this.statusBayar = statusBayar;
    }
   
    public TransaksiId getId() {
        return this.id;
    }
    
    public void setId(TransaksiId id) {
        this.id = id;
    }
    public Matkul getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }
    public Biaya getBiaya() {
        return this.biaya;
    }
    
    public void setBiaya(Biaya biaya) {
        this.biaya = biaya;
    }
    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }
    
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public Periodic getPeriodic() {
        return this.periodic;
    }
    
    public void setPeriodic(Periodic periodic) {
        this.periodic = periodic;
    }
    public Date getTanggalBayar() {
        return this.tanggalBayar;
    }
    
    public void setTanggalBayar(Date tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }
    public String getStatusBayar() {
        return this.statusBayar;
    }
    
    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }




}

