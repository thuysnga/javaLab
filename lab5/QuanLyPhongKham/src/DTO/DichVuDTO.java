package DTO;

/**
 *
 * @author THUYNGA
 */
public class DichVuDTO {
    private String maDV;
    private String tenDV;
    private long donGia;

    public String getMaDV() {
        return maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public DichVuDTO() {
    }

    public DichVuDTO(String maDV, String tenDV, int donGia) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.donGia = donGia;
    }
}