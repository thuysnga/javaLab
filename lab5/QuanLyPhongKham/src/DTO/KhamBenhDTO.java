package DTO;

import java.util.Date;

/**
 *
 * @author THUYNGA
 */
public class KhamBenhDTO {
    private String maKB;
    private String maBN;
    private String maBS;
    private Date ngayKham;
    private String yeuCauKham;
    private String ketLuan;
    private boolean THANHTOAN;

    public KhamBenhDTO(String maKB, String maBN, String maBS, Date ngayKham, String yeuCauKham, String ketLuan, boolean THANHTOAN) {
        this.maKB = maKB;
        this.maBN = maBN;
        this.maBS = maBS;
        this.ngayKham = ngayKham;
        this.yeuCauKham = yeuCauKham;
        this.ketLuan = ketLuan;
        this.THANHTOAN = THANHTOAN;
    }

    public KhamBenhDTO() {
    }

    public void setMaKB(String maKB) {
        this.maKB = maKB;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public void setMaBS(String maBS) {
        this.maBS = maBS;
    }

    public void setNgayKham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }

    public void setYeuCauKham(String yeuCauKham) {
        this.yeuCauKham = yeuCauKham;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public void setTHANHTOAN(boolean THANHTOAN) {
        this.THANHTOAN = THANHTOAN;
    }

    public String getMaKB() {
        return maKB;
    }

    public String getMaBN() {
        return maBN;
    }

    public String getMaBS() {
        return maBS;
    }

    public Date getNgayKham() {
        return ngayKham;
    }

    public String getYeuCauKham() {
        return yeuCauKham;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public boolean isTHANHTOAN() {
        return THANHTOAN;
    }

}