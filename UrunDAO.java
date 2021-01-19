package dao;

import util.DBConnection;
import java.sql.Statement;
import entity.Urun;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class UrunDAO extends DBConnection {

    public void create(Urun c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into kullanici(isim) values ('" + c.getUrunadi() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Urun> read(Urun c) {
        List<Urun> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanici order by id asc");
            while (rs.next()) {
                Urun tmp = new Urun(rs.getInt("kullanici_id"), rs.getString("urunadi"), rs.getInt("fiyat"), rs.getString("marka"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Urun c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update kullanici set isim='" + c.getUrunadi() + "'where c");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Urun c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kullanici where id=" + c.getKullanici_id());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
