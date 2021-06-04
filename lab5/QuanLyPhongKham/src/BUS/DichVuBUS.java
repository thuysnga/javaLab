package BUS;

import DAL.DichVuDAL;
import DTO.DichVuDTO;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class DichVuBUS {
    private DichVuDAL dichvuDAL = new DichVuDAL();
    public ArrayList<DichVuDTO> getAllDichVu ()  {
        return dichvuDAL.getAllDichVu();
    }
}