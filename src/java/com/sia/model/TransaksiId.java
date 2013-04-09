package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA



/**
 * TransaksiId generated by hbm2java
 */
public class TransaksiId  implements java.io.Serializable {


     private int nim;
     private int kodeMk;
     private int angkatan;
     private int idPeriodic;

    public TransaksiId() {
    }

    public TransaksiId(int nim, int kodeMk, int angkatan, int idPeriodic) {
       this.nim = nim;
       this.kodeMk = kodeMk;
       this.angkatan = angkatan;
       this.idPeriodic = idPeriodic;
    }
   
    public int getNim() {
        return this.nim;
    }
    
    public void setNim(int nim) {
        this.nim = nim;
    }
    public int getKodeMk() {
        return this.kodeMk;
    }
    
    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
    }
    public int getAngkatan() {
        return this.angkatan;
    }
    
    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    public int getIdPeriodic() {
        return this.idPeriodic;
    }
    
    public void setIdPeriodic(int idPeriodic) {
        this.idPeriodic = idPeriodic;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TransaksiId) ) return false;
		 TransaksiId castOther = ( TransaksiId ) other; 
         
		 return (this.getNim()==castOther.getNim())
 && (this.getKodeMk()==castOther.getKodeMk())
 && (this.getAngkatan()==castOther.getAngkatan())
 && (this.getIdPeriodic()==castOther.getIdPeriodic());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNim();
         result = 37 * result + this.getKodeMk();
         result = 37 * result + this.getAngkatan();
         result = 37 * result + this.getIdPeriodic();
         return result;
   }   


}


