package BUS;

import DAL.KhamBenhDAL;
import DTO.KhamBenhDTO;
import java.sql.*;

/**
 *
 * @author THUYNGA
 */
public class KhamBenhBUS {
    private KhamBenhDAL khambenhDAL = new KhamBenhDAL();
    public int themKhamBenh(KhamBenhDTO khambenhDTO) {
        return khambenhDAL.themKhamBenh(khambenhDTO);
    }
    public String layMaKB () {
        return khambenhDAL.layMaKB();
    }
    public KhamBenhDTO getThongTin(String maKB) {
        return khambenhDAL.getThongTin(maKB);
    }
    public String getMaKB (String MaBS, String MaBN, Date NgKham) {
        return khambenhDAL.getMaKB(MaBS, MaBN, NgKham);
    }
    public void capNhatKetLuan(String kl, String makb) {
        khambenhDAL.capNhatKetLuan(kl, makb);
    }
}