package projebmg;

public class kategori {
    private int kategoriId;
    private String kategoriAdi;

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    @Override
    public String toString() {
        return "kategori{" + "kategoriId=" + kategoriId + ", kategoriAdi=" + kategoriAdi + '}';
    }
    
}
