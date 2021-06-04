package BUS;

import DAL.BenhNhanDAL;
import DTO.BenhNhanDTO;

/**
 *
 * @author THUYNGA
 */
public class BenhNhanBUS {
    BenhNhanDAL benhnhanDAL = new BenhNhanDAL();
    public int themBN(BenhNhanDTO benhnhanDTO) {
        return benhnhanDAL.themBN(benhnhanDTO);
    }
    public String getTenBN(String maBN) { 
        return benhnhanDAL.getTenBN(maBN);
    }    
}