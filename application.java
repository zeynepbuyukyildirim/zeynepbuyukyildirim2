 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class application {
     
 
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "5151");
            System.out.println("Bağlantı başarılı");
           String query="select * from kullanici";
Statement st=connection.createStatement();
ResultSet rs=st.executeQuery(query);
while(rs.next()){
System.out.println("ID: "+rs.getInt("id"));
}
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
}