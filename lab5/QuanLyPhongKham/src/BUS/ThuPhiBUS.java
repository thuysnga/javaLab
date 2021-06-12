package BUS;

import DAL.ThuPhiDAL;

/**
 *
 * @author THUYNGA
 */
public class ThuPhiBUS {
    ThuPhiDAL thuphiDAL = new ThuPhiDAL();
    public void themThuPhi(String maKB, String maDV, String soLuong, String thanhTien) {
        thuphiDAL.themThuPhi(maKB, maDV, soLuong, thanhTien);
    }
}