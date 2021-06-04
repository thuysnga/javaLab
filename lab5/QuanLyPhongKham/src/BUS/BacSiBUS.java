package BUS;

import DAL.BacSiDAL;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class BacSiBUS {
    private BacSiDAL bacsiDAL = new BacSiDAL();
    public ArrayList<String> getTenBS() {
        return bacsiDAL.getTenBS();
    }
    public ArrayList<String> getMaBS() {
        return bacsiDAL.getMaBS();
    }
}