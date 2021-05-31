package thtailop;
import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class Thtailop {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/sinhvien";
            String USER = "root";
            String PASS = "NGA.kiu47";
            
            Connection con =DriverManager.getConnection(URL, USER, PASS);
            
            Statement stmt=con.createStatement();
            
            ResultSet rs=stmt.executeQuery("SELECT * FROM hocphi");
            while(rs.next())
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+ "\t"+ rs.getInt(4));
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        };
    }
}