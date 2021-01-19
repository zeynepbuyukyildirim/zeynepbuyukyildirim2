package entity;

public class Urun {
    private int kullanici_id;
    private String urunadi;
    private int fiyat;
    private String marka;

    public Urun() {
    }

    public Urun(int kullanici_id, String urunadi, int fiyat, String marka) {
        this.kullanici_id = kullanici_id;
        this.urunadi = urunadi;
        this.fiyat = fiyat;
        this.marka = marka;
    }

    

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    
}
