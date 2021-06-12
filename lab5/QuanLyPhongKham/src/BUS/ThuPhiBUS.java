package BUS;

import DAL.ThuPhiDAL;
import DTO.KhamBenhDTO;
import java.sql.*;
/**
 *
 * @author THUYNGA
 */
public class ThuPhiBUS {
    ThuPhiDAL thuphiDAL = new ThuPhiDAL();
    public void themThuPhi(String maKB, String maDV, String soLuong, String thanhTien) {
        thuphiDAL.themThuPhi(maKB, maDV, soLuong, thanhTien);
    }
    public KhamBenhDTO getThongTinKhamBenh(String maBN, Date ngayKham) {
        return thuphiDAL.getThongTinKhamBenh(maBN, ngayKham);
    }
}