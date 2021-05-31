package BLL;

import DAL.UserDAL;
import DTO.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author THUYNGA
 */
public class UserBLL {
    UserDAL DALUser = new UserDAL();
    public ArrayList<UserDTO> getAllUser() {
        return DALUser.getAllUser();
    } 
}