package DAL;
import DBUtils.DBUtils;
import DTO.ThuPhiDTO;
import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class ThuPhiDAL {
    DBUtils dbu = null;
    Connection conn = null;
    Statement stat = null;
    PreparedStatement pres = null;
    ResultSet rs = null;
    public void themThuPhi(String maKB, String maDV, String soLuong, String thanhTien) {
        String sql = "insert into THUPHI (MAKB,MADV,SOLUONG,THANHTIEN) values (?,?,?,?);";
        try {
            conn = new DBUtils().createConn();
            pres = conn.prepareStatement(sql);
            pres.setString(1,maKB);
            pres.setString(2,maDV);
            pres.setString(3,soLuong);
            pres.setString(4,thanhTien);
            pres.executeUpdate();
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
    }
}