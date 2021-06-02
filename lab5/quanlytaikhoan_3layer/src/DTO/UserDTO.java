package DTO;

/**
 *
 * @author THUYNGA
 */
public class userDTO {
    private int userid;
    private String username;
    private String password;
    private String userrole;

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public userDTO() {
    }

    public userDTO(int userid, String username, String password, String userrole) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userrole = userrole;
    }
}
