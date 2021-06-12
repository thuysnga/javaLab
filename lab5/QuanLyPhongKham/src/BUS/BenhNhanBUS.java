package BUS;

import DAL.BenhNhanDAL;
import DTO.BenhNhanDTO;
import DTO.KhamBenhDTO;
import java.util.ArrayList;

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
    public void getMaVaTen(KhamBenhDTO khambenhDTO, ArrayList listMa, ArrayList listTen) {
        benhnhanDAL.getMaVaTen(khambenhDTO, listMa, listTen);
    }
    public boolean isExist(String maBN) {
        return benhnhanDAL.isExist(maBN);
    }
}