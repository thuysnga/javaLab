package testoracleconnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author THUYNGA
 */
public class Testoracleconnect {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.118:1521:XE","SYSTEM","123456");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if (con != null)
            System.out.println("THANH CONG");
        else System.out.println("THATBAI");
    }
}
