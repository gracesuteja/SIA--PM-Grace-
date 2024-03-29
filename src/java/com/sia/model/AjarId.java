package com.sia.model;
// Generated Apr 8, 2013 5:27:46 PM by Hibernate Tools 3.2.1.GA



/**
 * AjarId generated by hbm2java
 */
public class AjarId  implements java.io.Serializable {


     private int nikd;
     private int kodeMk;
     private int idPeriodic;

    public AjarId() {
    }

    public AjarId(int nikd, int kodeMk, int idPeriodic) {
       this.nikd = nikd;
       this.kodeMk = kodeMk;
       this.idPeriodic = idPeriodic;
    }
   
    public int getNikd() {
        return this.nikd;
    }
    
    public void setNikd(int nikd) {
        this.nikd = nikd;
    }
    public int getKodeMk() {
        return this.kodeMk;
    }
    
    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
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
		 if ( !(other instanceof AjarId) ) return false;
		 AjarId castOther = ( AjarId ) other; 
         
		 return (this.getNikd()==castOther.getNikd())
 && (this.getKodeMk()==castOther.getKodeMk())
 && (this.getIdPeriodic()==castOther.getIdPeriodic());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getNikd();
         result = 37 * result + this.getKodeMk();
         result = 37 * result + this.getIdPeriodic();
         return result;
   }   


}


