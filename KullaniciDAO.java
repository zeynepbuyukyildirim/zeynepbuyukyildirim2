package dao;

import util.DBConnection;
import java.sql.Statement;
import entity.Kullanici;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class KullaniciDAO extends DBConnection {

    public void create(Kullanici c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into kullanici(isim) values ('" + c.getIsim() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Kullanici> read(Kullanici c) {
        List<Kullanici> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanici order by id asc");
            while (rs.next()) {
                Kullanici tmp = new Kullanici(rs.getInt("id"), rs.getString("isim"), rs.getString("kullaniciadi"), rs.getString("adres"), rs.getDouble("telno"), rs.getString("eposta"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Kullanici c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update kullanici set isim='" + c.getIsim() + "'where c");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Kullanici c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kullanici where id=" + c.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}