package BUS;

import DAL.BenhNhanDAL;
import DTO.BenhNhanDTO;

/**
 *
 * @author THUYNGA
 */
public class BenhNhanBUS {
    BenhNhanDAL benhnhanhDAL = new BenhNhanDAL();
    public int themBN(BenhNhanDTO benhnhanDTO) {
        return benhnhanhDAL.themBN(benhnhanDTO);
    }
}