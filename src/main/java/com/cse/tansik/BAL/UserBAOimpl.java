package com.cse.tansik.BAL;

import com.cse.tansik.DAL.UserDAO;
import com.cse.tansik.DTO.Request;
import com.cse.tansik.DTO.User;

import java.util.List;

public class UserBAOimpl implements UserBAO {
    public UserBAOimpl() {
        super();
    }

    private User user;
    private UserDAO UserDAO;

    
    @Override
    public String login(String username, String password) {
        if (UserDAO.isExist(username, password)){
            user = UserDAO.getUser(username, password);
            switch (user.getRole()){
            case 0 : return "student_home";
            case 1 : return "admin_home";
            case 2 : return "gm_home";
                }
        }
        else{
            //throw exeption of user not found
        }
        
        return null;
    }

    @Override
    public boolean addRequest(List<Request>requests) {
        // TODO Implement this method
        return false;
    }
}
