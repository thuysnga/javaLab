package testoracleconnect;

import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class Testoracleconnect {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.118:1521:XE","SYSTEM","123456");
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("select * from USER_LOGIN");
            if (rs == null)
                System.out.println("FAIL");
            while (rs.next())
                System.out.println(rs.getInt("USERLOGIN_ID")+"\t"+rs.getString("USERNAME")+"\t"+rs.getString("PASSWORD")+ "\t"+ rs.getString("ROLE"));
            
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
