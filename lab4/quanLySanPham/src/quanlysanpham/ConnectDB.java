package quanlysanpham;
import java.sql.*;
/**
 *
 * @author THUYNGA
 */
public class ConnectDB {
    public Connection conn;
    
    ConnectDB() {};
    
    public Connection createCon(){
	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/qlsp";
            String USER = "root";
            String PASS = "NGA.kiu47";
            conn = DriverManager.getConnection(URL, USER, PASS);
            if (conn == null)
            System.out.println("Kết nối không thành công");
    	    else System.out.println("Kết nối thành công");
    	} 
   	catch(Exception e){
            e.printStackTrace();
        }
    	return conn;
    }
}