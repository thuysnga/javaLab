package DAL;
import DBUtils.DBUtils;
import DTO.KhamBenhDTO;
import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class KhamBenhDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private PreparedStatement pres = null;
    private ResultSet rs = null;
    private Statement stat = null;
    public int themKhamBenh(KhamBenhDTO khambenhDTO) {
        int result = 0;
        String sqlInsert = "insert into KHAMBENH values (?,?,?,?,?,?,0);";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            pres = conn.prepareStatement(sqlInsert);
            pres.setString(1, khambenhDTO.getMaKB());
            pres.setString(2, khambenhDTO.getMaBN());
            pres.setString(3, khambenhDTO.getMaBS());
            java.sql.Date sqldate = new java.sql.Date(khambenhDTO.getNgayKham().getTime());
            pres.setDate(4,sqldate);
            pres.setString(5, khambenhDTO.getYeuCauKham());
            pres.setString(6, khambenhDTO.getKetLuan());
            result = pres.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                pres.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public String layMaKB () {
        String rel = new String();
        String sqlSelect = "select makb from KHAMBENH order by makb DESC";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sqlSelect);
            if (rs.first() == false) {
                rel = "kb0001";
            }
            else {
                String mahientai = rs.getString("makb");
                rel = mahientai.substring(2, 6);
                int mamoi = Integer.parseInt(rel) + 1;
                if (mamoi < 10)
                    rel = "kb000" + mamoi;
                else 
                    if (mamoi < 100)
                        rel = "kb00" + mamoi;
                    else 
                        if (mamoi < 1000)
                            rel = "kb0" + mamoi;
                        else 
                            rel = "kb" + mamoi;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rel;
    }
}