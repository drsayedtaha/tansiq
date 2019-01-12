package dal;

import dto.UserDTO;

public interface UserDAL {
   public UserDTO login(String username,String password);  
}
