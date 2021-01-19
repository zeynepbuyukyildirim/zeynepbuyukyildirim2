package dao;

import util.DBConnection;
import java.sql.Statement;
import entity.Kategori;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class KategoriDAO extends DBConnection {

    public void create(Kategori c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into kullanici(isim) values ('" + c.getKategoriadi() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Kategori> read(Kategori c) {
        List<Kategori> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanici order by id asc");
            while (rs.next()) {
                Kategori tmp = new Kategori(rs.getInt("urun_id"), rs.getString("kategoriadi"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Kategori c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update kullanici set isim='" + c.getKategoriadi() + "'where c");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Kategori c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kullanici where id=" + c.getUrun_id());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
