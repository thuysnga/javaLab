package DTO;

/**
 *
 * @author THUYNGA
 */
public class ThuPhiDTO {
    private String maKB;
    private String maDV;
    private int soLuong;
    private long thanhTien;

    public String getMaKB() {
        return maKB;
    }

    public String getMaDV() {
        return maDV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setMaKB(String maKB) {
        this.maKB = maKB;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public ThuPhiDTO() {
    }

    public ThuPhiDTO(String maKB, String maDV, int soLuong, long thanhTien) {
        this.maKB = maKB;
        this.maDV = maDV;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }
}