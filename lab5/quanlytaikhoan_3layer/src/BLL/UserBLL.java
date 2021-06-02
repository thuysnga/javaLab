package BLL;

import DAL.UserDAL;
import DTO.UserDTO;
import java.util.ArrayList;
// streak 1/6
/**
 *
 * @author THUYNGA
 */
public class UserBLL {
    UserDAL DALUser = new UserDAL();
    public ArrayList<UserDTO> getAllUser() {
        return DALUser.getAllUser();
    } 
    public int insertUser(UserDTO user) {
        int result  = DALUser.insertUser(user);
        return result;
    }
    public int updateUser (UserDTO user) {
        int result = DALUser.updateUser(user);
        return result;
    }
}