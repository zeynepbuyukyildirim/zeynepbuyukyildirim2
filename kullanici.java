package projebmg;


public class kullanici {
    private int id;
    private String adi;
    private String soyadi;
    private String kullaniciadi;
    private String eposta;
    private int sifre;

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

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "kullanici{" + "id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", kullaniciadi=" + kullaniciadi + ", eposta=" + eposta + ", sifre=" + sifre + '}';
    }

   
    
    
}
