package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA



/**
 * Bahankul generated by hbm2java
 */
public class Bahankul  implements java.io.Serializable {


     private int idBahan;
     private Matkul matkul;
     private String materi;
     private String linkDownload;
     private String size;

    public Bahankul() {
    }

    public Bahankul(int idBahan, Matkul matkul, String materi, String linkDownload, String size) {
       this.idBahan = idBahan;
       this.matkul = matkul;
       this.materi = materi;
       this.linkDownload = linkDownload;
       this.size = size;
    }
   
    public int getIdBahan() {
        return this.idBahan;
    }
    
    public void setIdBahan(int idBahan) {
        this.idBahan = idBahan;
    }
    public Matkul getMatkul() {
        return this.matkul;
    }
    
    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }
    public String getMateri() {
        return this.materi;
    }
    
    public void setMateri(String materi) {
        this.materi = materi;
    }
    public String getLinkDownload() {
        return this.linkDownload;
    }
    
    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }




}


