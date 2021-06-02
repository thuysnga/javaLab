package DAL;

import DTO.*;
import Utils.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class UserDAL {
    private DBUtils dbu = null;
    private Connection conn = null;
    private PreparedStatement pres = null;
    private ResultSet rs = null;
    
    public ArrayList<UserDTO> getAllUser ()  {
        ArrayList<UserDTO> result = new ArrayList<UserDTO>();
        String sqlSelectAll = "select * from USER";
        try {
            dbu =  new DBUtils();
            conn = dbu.createCon();
            pres = conn.prepareStatement(sqlSelectAll);
            rs = pres.executeQuery();
            while (rs.next()) {
                UserDTO user = new UserDTO();
                user.setUserid(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setUserrole(rs.getString("userrole"));
                result.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        finally {
            try {
                conn.close();
                pres.close();
                rs.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
