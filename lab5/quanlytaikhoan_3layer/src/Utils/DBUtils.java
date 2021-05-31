package Utils;

/**
 *
 * @author THUYNGA
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
    private Connection conn;

    public DBUtils() {
    }
    
    public Connection createCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/qlsp";
            String USER = "root";
            String PASS = "NGA.kiu47";
            
            conn = DriverManager.getConnection(URL, USER, PASS);
            
            if (conn == null)
                System.out.println("Ket noi khong thanh cong.");
            else
                System.out.println("Ket noi thanh cong.");                
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}