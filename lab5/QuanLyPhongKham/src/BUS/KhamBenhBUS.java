package BUS;

import DAL.KhamBenhDAL;
import DTO.KhamBenhDTO;

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
}