package com.cse.tansik.user.dal;

import com.cse.tansik.dto.*;

public interface UserDAO {
    public boolean is_exist(String username,String password);
    public User getUser(String username,String password);
    public boolean delet_user(User user);
}