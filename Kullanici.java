/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ASUS
 */
public class Kullanici {
    
    private int id;
    private String isim;
    private String kullaniciadi;
  private String adres;
  private double telno;
  private String eposta;

    public Kullanici() {
    }

    public Kullanici(int id, String isim, String kullaniciadi, String adres, double telno, String eposta) {
        this.id = id;
        this.isim = isim;
        this.kullaniciadi = kullaniciadi;
        this.adres = adres;
        this.telno = telno;
        this.eposta = eposta;
    }
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public double getTelno() {
        return telno;
    }

    public void setTelno(double telno) {
        this.telno = telno;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
  

}