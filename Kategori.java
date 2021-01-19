package entity;

public class Kategori {
    private int urun_id;
    private String kategoriadi;

    public Kategori(int urun_id, String kategoriadi) {
        this.urun_id = urun_id;
        this.kategoriadi = kategoriadi;
    }

    public Kategori() {
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
    }

    public String getKategoriadi() {
        return kategoriadi;
    }

    public void setKategoriadi(String kategoriadi) {
        this.kategoriadi = kategoriadi;
    }
    
}
