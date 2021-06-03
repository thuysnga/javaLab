package DBUtils;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author THUYNGA
 */
public class DBUtils {
    private Connection conn; 
    public Connection createConn () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/qlkb";
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