package homework;

/**
 *
 * @author THUYNGA
 */
public class Sach {
    private int MaSach, Gia;
    private String TenSach, TacGia, NXB;

    public int getMaSach() {
        return MaSach;
    }

    public int getGia() {
        return Gia;
    }

    public String getTenSach() {
        return TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setMaSach(int MaSach) {
        this.MaSach = MaSach;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public Sach(){
    }
    
    public Sach(int MaSach, String TenSach, String TacGia, String NXB, int Gia) {
        this.MaSach = MaSach;
        this.Gia = Gia;
        this.TenSach = TenSach;
        this.TacGia = TacGia;
        this.NXB = NXB;
    }
}