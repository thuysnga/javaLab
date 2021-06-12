package BUS;

import DAL.ThuPhiDAL;
import DTO.KhamBenhDTO;
import java.sql.*;
import java.util.ArrayList;
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
    public void getThongTinThuPhi(ArrayList dichvu, ArrayList thuphi, String maKB, long sum) {
        thuphiDAL.getThongTinThuPhi(dichvu, thuphi, maKB, sum);
    }
}