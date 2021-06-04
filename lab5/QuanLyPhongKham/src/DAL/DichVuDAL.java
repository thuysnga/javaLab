package DAL;

import DBUtils.DBUtils;
import DTO.DichVuDTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class DichVuDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private PreparedStatement pres = null;
    private Statement stat = null;
    private ResultSet rs = null;
    public ArrayList<DichVuDTO> getAllDichVu(){
        ArrayList<DichVuDTO> result = new ArrayList<DichVuDTO>();
        String sqlSelectAll = "select * from DICHVU;";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sqlSelectAll);
            while (rs.next()) {
                DichVuDTO dichvuDTO = new DichVuDTO();
                dichvuDTO.setMaDV(rs.getString("madv"));
                dichvuDTO.setTenDV(rs.getString("tendv"));
                dichvuDTO.setDonGia(rs.getInt("dongia"));
                result.add(dichvuDTO);
            }
        } catch(SQLException e) {
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