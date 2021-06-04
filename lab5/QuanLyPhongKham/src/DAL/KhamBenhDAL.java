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
        String sqlInsert = "insert into KHAMBENH values (?,?,?,?,?,?,?);";
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
            pres.setBoolean(7, khambenhDTO.isTHANHTOAN());
            result = pres.executeUpdate();
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
}