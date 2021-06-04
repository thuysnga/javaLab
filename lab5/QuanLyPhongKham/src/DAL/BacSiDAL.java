package DAL;
import DBUtils.DBUtils;
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
    public ArrayList<String> getMaBS() {
        ArrayList<String> result = new ArrayList<String>();
        String sqlSelectTenBS = "select MABS from BACSI";
        try {
            dbu =  new DBUtils();
            conn = dbu.createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sqlSelectTenBS);
            while (rs.next()) {
                String ma = new String();
                ma = rs.getString("mabs");
                result.add(ma);
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