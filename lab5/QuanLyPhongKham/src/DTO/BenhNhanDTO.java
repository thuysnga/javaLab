package DTO;

import java.util.Date;

/**
 *
 * @author THUYNGA
 */
public class BenhNhanDTO {
    private String mabn, tenbn, diachi, sdt;
    Date ngaysinh;
    boolean gioitinh;

    public String getMabn() {
        return mabn;
    }

    public String getTenbn() {
        return tenbn;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setMabn(String mabn) {
        this.mabn = mabn;
    }

    public void setTenbn(String tenbn) {
        this.tenbn = tenbn;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public BenhNhanDTO() {
    }

    public BenhNhanDTO(String mabn, String tenbn, String diachi, String sdt, Date ngaysinh, boolean gioitinh) {
        this.mabn = mabn;
        this.tenbn = tenbn;
        this.diachi = diachi;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
    }
}