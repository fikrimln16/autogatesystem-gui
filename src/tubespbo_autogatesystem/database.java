package tubespbo_autogatesystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection conn;

    public static Connection getConnect(){
        try {
            String url ="jdbc:mysql://localhost/autogatesystem";
            String user="root";
            String pass="1234";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            return conn;
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return null;
    } 
}
