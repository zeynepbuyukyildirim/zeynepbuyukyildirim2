package projebmg;

public class urun {
    private int id;
    private String adi;
    private String marka;
    private String kategoriId;
    private int fiyat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(String kategoriId) {
        this.kategoriId = kategoriId;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "urun{" + "id=" + id + ", adi=" + adi + ", marka=" + marka + ", kategoriId=" + kategoriId + ", fiyat=" + fiyat + '}';
    }
    
}
