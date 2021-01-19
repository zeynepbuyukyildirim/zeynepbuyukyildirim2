package controller;

import dao.SatisDAO;
import entity.Satis;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.List;

@Named (value = "urunBean")
@SessionScoped
public class SatisBean implements Serializable {

    private SatisDAO dao;
    private Satis entity;

    public String create() {
        this.getDao().create(entity);
        return "index";
    }

    public List<Satis> getRead() {
        return this.getDao().read(entity);
    }

    public String updateForm(Satis c) {
        this.entity = c;
        return "update";
    }

    public String update() {
        this.getDao().update(entity);
        return "index";
    }
    public void delete(Satis c){
      this.getDao().delete(c);
    }

    public SatisBean() {
    }

    public SatisDAO getDao() {
        if(this.dao==null){
            this.dao=new SatisDAO();
        }
        return dao;
    }

    public void setDao(SatisDAO dao) {
        this.dao = dao;
    }

    public Satis getEntity() {
        if(this.entity==null){
            this.entity=new Satis();
        }
        return entity;
    }

    public void setEntity(Satis entity) {
        this.entity = entity;
    }

}

