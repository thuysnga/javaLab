package DAL;
import DBUtils.DBUtils;
import DTO.DichVuDTO;
import DTO.KhamBenhDTO;
import DTO.ThuPhiDTO;
import java.sql.*;
import java.util.ArrayList;

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
    public KhamBenhDTO getThongTinKhamBenh(String maBN, Date ngayKham) {
        KhamBenhDTO khambenhDTO = null;
        String sql = "select * from KHAMBENH where MABN = ? and NGAYKHAM = ?";
        try {
            conn = new DBUtils().createConn();
            pres = conn.prepareStatement(sql);
            pres.setString(1,maBN);
            java.sql.Date sqldate = new java.sql.Date(ngayKham.getTime());
            pres.setDate(2,sqldate);
            rs = pres.executeQuery();
            if (rs.first()) {
                khambenhDTO = new KhamBenhDTO();
                khambenhDTO.setMaKB(rs.getString("MAKB"));
                khambenhDTO.setMaBN(maBN);
                khambenhDTO.setMaBS(rs.getString("MABS"));
                khambenhDTO.setNgayKham(ngayKham);
                khambenhDTO.setYeuCauKham(rs.getString("YEUCAUKHAM"));
                khambenhDTO.setKetLuan(rs.getString("KETLUAN"));
                khambenhDTO.setTHANHTOAN(rs.getBoolean("THANHTOAN"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                conn.close();
                pres.close();
                if (rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return khambenhDTO;
    }
    public void getThongTinThuPhi(ArrayList dichvu, ArrayList thuphi , String maKB, long sum) {
        String sql = "select * from THUPHI,DICHVU where THUPHI.MADV = DICHVU.MADV and MAKB = '" + maKB +"';";
        try {
            conn = new DBUtils().createConn();
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                DichVuDTO dichvuDTO = new DichVuDTO();
                dichvuDTO.setMaDV(rs.getString("madv"));
                dichvuDTO.setTenDV(rs.getString("tendv"));
                ThuPhiDTO thuphiDTO = new ThuPhiDTO();
                thuphiDTO.setSoLuong(rs.getInt("SOLUONG"));
                thuphiDTO.setThanhTien(rs.getLong("THANHTIEN"));
                int sl = rs.getInt("soluong");
                dichvu.add(dichvuDTO);
                thuphi.add(thuphiDTO);
                sum += rs.getLong("THANHTIEN");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
                stat.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}