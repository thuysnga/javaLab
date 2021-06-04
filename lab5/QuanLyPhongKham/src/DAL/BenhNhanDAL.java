package DAL;

import DBUtils.*;
import DTO.*;
import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class BenhNhanDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private PreparedStatement pres = null;
    private ResultSet rs = null;
    
    public int themBN(BenhNhanDTO benhnhanDTO) {
        int result = 0;
        String sqlInsert = "insert into BENHNHAN values (?,?,?,?,?,?);";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            pres = conn.prepareStatement(sqlInsert);
            pres.setString(1, benhnhanDTO.getMabn());
            pres.setString(2, benhnhanDTO.getTenbn());
            java.sql.Date sqldate = new java.sql.Date(benhnhanDTO.getNgaysinh().getTime());
            pres.setDate(3,sqldate);
            pres.setString(4, benhnhanDTO.getDiachi());
            pres.setString(5, benhnhanDTO.getSdt());
            pres.setBoolean(6, benhnhanDTO.isGioitinh());
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