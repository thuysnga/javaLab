package homework;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author THUYNGA
 */
public class DSSach {
    private List<Sach> ds;
    
    public DSSach() {
        this.ds = new ArrayList<Sach> ();
    }
    public DSSach(List<Sach> ds) {
        this.ds = ds;
    }
    public void ThemSach(Sach s) {
        if (this.TimSach(s.getMaSach()) == -1)
            ds.add(s);
        else 
            JOptionPane.showConfirmDialog(null, "Mã sách bị trùng","OK", JOptionPane.CLOSED_OPTION);
    }
    public int SLSach () {
        return this.ds.size();
    }
    public Sach LayThongTin (int i) {
        return ds.get(i);
    }
    public void xoaKhoiDS(int MaSach) {
        int flag = -1;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSach() == MaSach) {
                flag = i;
                break;
            }
        }
        if (flag == -1) 
            JOptionPane.showConfirmDialog(null, "Không tồn tại sách có mã sách này.","OK", JOptionPane.CLOSED_OPTION);
        else 
            ds.remove(flag);
    }
    public int TimSach (int MaSach) {
        int i = -1;
        for (Sach s : ds) {
            i++;
            if (s.getMaSach() == MaSach)
                return i;
        }
        return -1;
    }
    public void CapNhatThongTin (int MaSach) {
        if (this.TimSach(MaSach) == -1)
            JOptionPane.showConfirmDialog(null, "Không tồn tại sách có mã sách này.","OK", JOptionPane.CLOSED_OPTION);
        else {
            JOptionPane.showConfirmDialog(null, "Sửa","OK", JOptionPane.CLOSED_OPTION);            
        }
    }
}