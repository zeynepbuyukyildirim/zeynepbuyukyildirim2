package controller;

import dao.KullaniciDAO;
import entity.Kullanici;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.List;

@Named (value = "kullaniciBean")
@SessionScoped
public class KullaniciBean implements Serializable {

    private KullaniciDAO dao;
    private Kullanici entity;

    public String create() {
        this.getDao().create(entity);
        return "index";
    }

    public List<Kullanici> getRead() {
        return this.getDao().read(entity);
    }

    public String updateForm(Kullanici c) {
        this.entity = c;
        return "update";
    }

    public String update() {
        this.getDao().update(entity);
        return "index";
    }
    public void delete(Kullanici c){
      this.getDao().delete(c);
    }

    public KullaniciBean() {
    }

    public KullaniciDAO getDao() {
        if(this.dao==null){
            this.dao=new KullaniciDAO();
        }
        return dao;
    }

    public void setDao(KullaniciDAO dao) {
        this.dao = dao;
    }

    public Kullanici getEntity() {
        if(this.entity==null){
            this.entity=new Kullanici();
        }
        return entity;
    }

    public void setEntity(Kullanici entity) {
        this.entity = entity;
    }

}