package DTO;

/**
 *
 * @author THUYNGA
 */
public class BacSiDTO {
    private String maBS;
    private String tenBS;

    public String getMaBS() {
        return maBS;
    }

    public String getTenBS() {
        return tenBS;
    }

    public void setMaBS(String maBS) {
        this.maBS = maBS;
    }

    public void setTenBS(String tenBS) {
        this.tenBS = tenBS;
    }

    public BacSiDTO() {
    }

    public BacSiDTO(String maBS, String tenBS) {
        this.maBS = maBS;
        this.tenBS = tenBS;
    }
    
}