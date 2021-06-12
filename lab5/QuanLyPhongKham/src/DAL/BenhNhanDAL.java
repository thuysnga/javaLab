package DAL;

import DBUtils.*;
import DTO.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class BenhNhanDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private PreparedStatement pres = null;
    private ResultSet rs = null;
    private Statement stat = null;
    
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
    public String getTenBN(String maBN) {
        String sqlSelectTen = "select TENBN from BENHNHAN WHERE MABN = '" + maBN + "'";
        String result = "";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sqlSelectTen);
            while (rs.next()) {
                result = rs.getString("tenbn");
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
    public void getMaVaTen(KhamBenhDTO khambenhDTO, ArrayList listMa, ArrayList listTen) {
        String sqlSeclect = "select KHAMBENH.MABN, TENBN from KHAMBENH,BENHNHAN " +
                            "where KHAMBENH.MABN = BENHNHAN.MABN and MABS = ? and NGAYKHAM = ? " +
                            " and (THANHTOAN = 0 or THANHTOAN is null);";
        try {
            dbu = new DBUtils();
            conn = dbu.createConn();
            pres = conn.prepareStatement(sqlSeclect);
            pres.setString(1, khambenhDTO.getMaBS());
            java.sql.Date sqldate = new java.sql.Date(khambenhDTO.getNgayKham().getTime());
            pres.setDate(2,sqldate);
            rs = pres.executeQuery();
            while (rs.next()) {
                listMa.add(rs.getString("mabn"));
                listTen.add(rs.getString("tenbn"));                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                pres.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean isExist(String maBN) {
        String sql = "Select * from BENHNHAN where MABN = '" + maBN +"';";
        Boolean res = false;
        try {
            conn = new DBUtils().createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            if (rs.first()) 
                res = true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                stat.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return res;
    }
}