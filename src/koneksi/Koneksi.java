package koneksi;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection koneksi;
    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/buku";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Succesfully");
            } catch (SQLException e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main (String args[]) {
        getKoneksi();
    }
}
