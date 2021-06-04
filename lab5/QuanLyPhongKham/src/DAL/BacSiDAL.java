package DAL;
import DBUtils.DBUtils;
import DTO.BacSiDTO;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author THUYNGA
 */
public class BacSiDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private Statement stat = null;
    private ResultSet rs = null;
    
    public ArrayList<String> getTenBS() {
        ArrayList<String> result = new ArrayList<String>();
        String sqlSelectTenBS = "select TenBS from BACSI";
        try {
            dbu =  new DBUtils();
            conn = dbu.createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sqlSelectTenBS);
            while (rs.next()) {
                String ten = new String();
                System.out.println(rs.getString("tenbs"));
                ten = rs.getString("tenbs");
                result.add(ten);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                stat.close();
                rs.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}