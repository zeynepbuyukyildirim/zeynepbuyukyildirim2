package dao;

import util.DBConnection;
import java.sql.Statement;
import entity.Satis;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

public class SatisDAO extends DBConnection {

    public void create(Satis c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("insert into kullanici(isim) values ('" + c.getSatinalinanesya() + "')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Satis> read(Satis c) {
        List<Satis> list = new ArrayList<>();
        try {
            Statement st = this.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from kullanici order by id asc");
            while (rs.next()) {
                Satis tmp = new Satis(rs.getInt("urun_id"), rs.getString("satici "), rs.getString("alici"), rs.getString("satinalinanesya"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void update(Satis c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("update kullanici set isim='" + c.getSatinalinanesya() + "'where c");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Satis c) {
        try {
            Statement st = this.connect().createStatement();
            st.executeUpdate("delete from kullanici where id=" + c.getUrun_id());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
