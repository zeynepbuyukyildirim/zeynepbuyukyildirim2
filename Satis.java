package entity;

public class Satis {
   private int urun_id;
   private String satici;
   private String alici;
   private String satinalinanesya;

    public Satis(int urun_id, String satici, String alici, String satinalinanesya) {
        this.urun_id = urun_id;
        this.satici = satici;
        this.alici = alici;
        this.satinalinanesya = satinalinanesya;
    }

    public Satis() {
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
    }

    public String getSatici() {
        return satici;
    }

    public void setSatici(String satici) {
        this.satici = satici;
    }

    public String getAlici() {
        return alici;
    }

    public void setAlici(String alici) {
        this.alici = alici;
    }

    public String getSatinalinanesya() {
        return satinalinanesya;
    }

    public void setSatinalinanesya(String satinalinanesya) {
        this.satinalinanesya = satinalinanesya;
    }
   
    
}
