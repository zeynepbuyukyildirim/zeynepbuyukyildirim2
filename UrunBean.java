package controller;

import dao.UrunDAO;
import entity.Urun;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.List;

@Named (value = "urunBean")
@SessionScoped
public class UrunBean implements Serializable {

    private UrunDAO dao;
    private Urun entity;

    public String create() {
        this.getDao().create(entity);
        return "index";
    }

    public List<Urun> getRead() {
        return this.getDao().read(entity);
    }

    public String updateForm(Urun c) {
        this.entity = c;
        return "update";
    }

    public String update() {
        this.getDao().update(entity);
        return "index";
    }
    public void delete(Urun c){
      this.getDao().delete(c);
    }

    public UrunBean() {
    }

    public UrunDAO getDao() {
        if(this.dao==null){
            this.dao=new UrunDAO();
        }
        return dao;
    }

    public void setDao(UrunDAO dao) {
        this.dao = dao;
    }

    public Urun getEntity() {
        if(this.entity==null){
            this.entity=new Urun();
        }
        return entity;
    }

    public void setEntity(Urun entity) {
        this.entity = entity;
    }

}

