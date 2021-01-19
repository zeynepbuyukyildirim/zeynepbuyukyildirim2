package controller;

import dao.KategoriDAO;
import entity.Kategori;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.List;

@Named (value = "urunBean")
@SessionScoped
public class KategoriBean implements Serializable {

    private KategoriDAO dao;
    private Kategori entity;

    public String create() {
        this.getDao().create(entity);
        return "index";
    }

    public List<Kategori> getRead() {
        return this.getDao().read(entity);
    }

    public String updateForm(Kategori c) {
        this.entity = c;
        return "update";
    }

    public String update() {
        this.getDao().update(entity);
        return "index";
    }
    public void delete(Kategori c){
      this.getDao().delete(c);
    }

    public KategoriBean() {
    }

    public KategoriDAO getDao() {
        if(this.dao==null){
            this.dao=new KategoriDAO();
        }
        return dao;
    }

    public void setDao(KategoriDAO dao) {
        this.dao = dao;
    }

    public Kategori getEntity() {
        if(this.entity==null){
            this.entity=new Kategori();
        }
        return entity;
    }

    public void setEntity(Kategori entity) {
        this.entity = entity;
    }

}

